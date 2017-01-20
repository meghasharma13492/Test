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
