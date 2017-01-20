package firstproject.controllers;
import java.util.*;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.security.core.userdetails.User;

import firstproject.beans.Emp;
import firstproject.beans.Employee;
import firstproject.dao.EmployeeDao;
@Controller  
@RequestMapping("/employees")
public class EmployeeController {

	
//  @RequestMapping("/viewemp")  
	@Autowired  
    EmployeeDao empDao;
//  @RequestMapping(method = RequestMethod.GET)
//  public ModelAndView viewemp(){
//	  List<Employee> list=empDao.getEmployees();
//	 return new ModelAndView("listEmployees","list",list);  
//  }  
  
//	@RequestMapping("/empform")  
	@RequestMapping(value="/new", method = RequestMethod.GET)
    public ModelAndView showform(){  
        return new ModelAndView("empform","command",new Employee());  
    }  
    @RequestMapping(value="/createEmployee",method = RequestMethod.POST)  
    public ModelAndView save(@ModelAttribute("Employee") Employee Employee){
        empDao.save(Employee);
        return new ModelAndView("redirect:/employees");//will redirect to viewemp request mapping  
    }
    
    @RequestMapping(value = "/{Id}/edit", method = RequestMethod.GET)
    public ModelAndView getForId(@PathVariable int Id) {
    	System.out.println("hi its coming"+Id);
    	Employee employee =empDao.getById(Id);
        System.out.println(employee.getfirstName()+" "+employee.getlastName());
        return new ModelAndView("viewemp","employee",employee);  
    }
    
    @RequestMapping(value = "/{Id}/update", method = RequestMethod.POST)
    public ModelAndView update(@ModelAttribute("Employee") Employee Employee,@PathVariable int Id){
    	System.out.println("comingi n update===>" +Id);
    	Employee teamToUpdate = empDao.getById(Id);
        teamToUpdate.setfirstName(Employee.getfirstName());
        teamToUpdate.setlastName(Employee.getlastName());
        empDao.update(teamToUpdate);
//        empDao.update(Employee);
        return new ModelAndView("redirect:/employees");//will redirect to viewemp request mapping  
    }
    
    @RequestMapping(value = "/activities", method = RequestMethod.GET)
    public ModelAndView activitiesId() {
    	 User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
         String name = user.getUsername();
//         int id = user.getUserId();
    	System.out.println(name+"name==========>");
    	int Id = 4;
    	System.out.println("hi its coming"+Id);
    	Employee employee =empDao.getById(Id);
    	List<Emp> list=employee.getActivities();
	    Iterator<Emp> l= list.iterator();
	    while(l.hasNext()){
	    	System.out.println(l.next().getName());
	    	System.out.println(l.next().getHours());
	    }
        System.out.println(employee.getfirstName()+" "+employee.getlastName());
        return new ModelAndView("listEmployees","list",list);  
    }
    
//    @RequestMapping(value="delete/{Id}",method=RequestMethod.GET)
//    public ModelAndView deleteRecord(@PathVariable int Id){
//      empDao.delete(Id);    	
//      return new ModelAndView("redirect:/employees");
//    }

	
}
