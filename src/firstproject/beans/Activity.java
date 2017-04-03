package firstproject.beans;

import java.util.Date;
import javax.persistence.*;
import firstproject.beans.Employee;

@Entity
@Table(name="activities")
public class Activity {
	
	@Id  
	@GeneratedValue(strategy=GenerationType.AUTO) 
	@Column(name="id")
	
	private int id;  
	
	@Column(name="name")
	private String name;
	
	@Column(name="hours")
	private int hours;
	
	@Column(name="employee_id")
	private int employee_id;
	
//	private Employee employee;
//	private Date date; 
//	private static final AtomicInteger count = new AtomicInteger(0); 
	  
//	public Employee getEmployee() {  
//	    return employee;  
//	}  
//	public void setEmployee(Employee employee) {  
//	    this.employee = employee;  
//	}
	
	public Activity() {}  
	  
	public Activity(String name, int hours) {  
	    super();  
//	    this.id = id;  
	    this.name = name;  
	    this.hours = hours;  
//	    this.date = date;  
	}  
	  
	public int getId() {  
	    return id;  
	}  
	public void setId(int id) {  
	    this.id = id;  
	}  
	public String getName() {  
	    return name;  
	}  
	public void setName(String name) {  
	    this.name = name;  
	}  
	public int getHours() {  
	    return hours;  
	}  
	public void setHours(int hours) {  
	    this.hours = hours;  
	}  
	public int getEmployeeId() {  
	    return employee_id;  
	}  
	public void setEmployeeId(int employee_id) {  
	    this.employee_id = employee_id;  
	} 
//	public Date getDate() {  
//	    return date;  
//	}  
//	public void setDate(Date date) {  
//	    this.date = date;  
//	}  

}
