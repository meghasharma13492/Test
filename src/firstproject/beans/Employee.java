package firstproject.beans;

import java.util.List;

import javax.persistence.*;


import firstproject.beans.Activity;

@Entity
@Table(name="employees")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	@Column(name="id")
	private int id;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;
	
//	@OneToMany(targetEntity=Emp.class, mappedBy="employee", fetch=FetchType.EAGER)
//	private List<Emp> activities;
//	
//	 @OneToMany(cascade=CascadeType.ALL)
//	 @JoinColumn(name="employee_id")
//	private List<Emp> activities;  
	
//	@Access(AccessType.PROPERTY)
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="employee_id")
	private List<Activity> activities;
	
	public int getId() {  
	    return id;  
	}  
	public void setId(int id) {  
	    this.id = id;  
	}  
	public String getfirstName() {  
	    return firstName;  
	}  
	public void setfirstName(String firstName) {  
	    this.firstName = firstName;  
	}  
	public String getlastName() {  
	    return firstName;  
	}  
	public void setlastName(String lastName) {  
	    this.lastName = lastName;  
	}
	public void setActivities(List<Activity> activities) {  
	    this.activities = activities;  
	}  
	public List<Activity> getActivities() {  
	    return activities;  
	}  
}
