package firstproject.dao;
import java.util.*;  

import javax.transaction.Transactional;

import org.springframework.orm.hibernate4.HibernateTemplate;  

import firstproject.beans.Employee;

public class EmployeeDao {

	HibernateTemplate template;
	
	public void setTemplate(HibernateTemplate template) {  
	    this.template = template;  
	}  
	
	public List<Employee> getEmployees(){  
	    List<Employee> list=new ArrayList<Employee>();  
	    list=template.loadAll(Employee.class);  
	    return list;  
	} 
	
	public Employee findByNamedParam(String name){  
		System.out.println("nameeeeeeeeeeeeeeee0"+name);
	String query = "from Employee where firstName =:firstName";
	@SuppressWarnings("unchecked")
	List<Employee> list = (List<Employee>) template.findByNamedParam(query, "firstName", name);
    Employee user = new Employee();  
    if(!list.isEmpty()){
//    	System.out.println(l.next().getId()+"METHEHHHHHHHHHHHHHHHHHHHHHHH");
    	System.out.println(list.get(0).getId());
    	user = list.get(0);
    }
	return user;
	}
	
	//method to save employee  
	public void save(Employee e){  
	    template.save(e);  
	}  
	@Transactional
	//method to update employee  
	public void update(Employee e){  
	    template.update(e);  
	}  
	//method to delete employee  
	public void delete(int id){  
		Employee e=(Employee)template.get(Employee.class,id);  
	    template.delete(e);  
	}  
	//method to return one employee of given id  
	public Employee getById(int id){  
	    Employee e=(Employee)template.get(Employee.class,id);  
	    return e;  
	}  
}
