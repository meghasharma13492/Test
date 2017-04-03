package firstproject.controllers;
import java.util.ArrayList;  
import java.util.Iterator;
import java.util.List;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.ModelAttribute;  
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.servlet.ModelAndView;  

import firstproject.beans.Activity;
import firstproject.dao.ActivityDao;
import firstproject.beans.Employee;
import firstproject.dao.EmployeeDao;
@Controller  
@RequestMapping("/activities")
public class ActivityController {

	
//  @RequestMapping("/viewemp")  
	@Autowired  
    ActivityDao dao;
	
	@Autowired 
	EmployeeDao empDao;
	
  @RequestMapping(method = RequestMethod.GET)
  public ModelAndView viewemp(){
//	  List<Emp> list=dao.getEmployees();
//	  System.out.println("comfuinf un ");
//	 return new ModelAndView("listEmployees","list",list);  
  	 User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	 String name = user.getUsername();
     Employee employee = empDao.findByNamedParam(name);
	List<Activity> list=employee.getActivities();
    Iterator<Activity> l= list.iterator();
    while(l.hasNext()){
    	System.out.println(l.next().getName());
    	System.out.println(l.next().getHours());
    }
    System.out.println(employee.getfirstName()+" "+employee.getlastName());
    return new ModelAndView("listActivities","list",list);  
  }  
  
//	@RequestMapping("/empform")  
	@RequestMapping(value="/new", method = RequestMethod.GET)
    public ModelAndView showform(){  
		Activity activity = new Activity();
		activity.setEmployeeId(4);
        return new ModelAndView("activityForm","command",activity);  
    }  
    @RequestMapping(value="/createActivity",method = RequestMethod.POST)  
    public ModelAndView save(@ModelAttribute("emp") Activity emp){
        dao.save(emp);
        return new ModelAndView("redirect:/activities");//will redirect to viewemp request mapping  
    }
    
    @RequestMapping(value = "/{Id}/edit", method = RequestMethod.GET)
    public ModelAndView getForId(@PathVariable int Id) {
    	System.out.println("hi its coming"+Id);
    	Activity activity =dao.getById(Id);
        System.out.println(activity.getName()+" "+activity.getHours());
        return new ModelAndView("viewactivity","activity",activity);  
    }
    
    @RequestMapping(value = "/{Id}/update", method = RequestMethod.POST)
    public ModelAndView update(@ModelAttribute("emp") Activity emp,@PathVariable int Id){
    	System.out.println("comingi n update===>" +Id);
    	Activity teamToUpdate = dao.getById(Id);
        teamToUpdate.setHours(emp.getHours());
        teamToUpdate.setName(emp.getName());
        dao.update(teamToUpdate);
//        dao.update(emp);
        return new ModelAndView("redirect:/activities");//will redirect to viewemp request mapping  
    }
    
    @RequestMapping(value="delete/{Id}",method=RequestMethod.GET)
    public ModelAndView deleteRecord(@PathVariable int Id){
      dao.delete(Id);    	
      return new ModelAndView("redirect:/activities");
    }

	
}
