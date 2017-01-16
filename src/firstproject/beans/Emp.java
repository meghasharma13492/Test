package firstproject.beans;

import java.util.Date;

public class Emp {
	
	private int id;  
	private String name;  
	private int hours;  
	private Date date; 
//	private static final AtomicInteger count = new AtomicInteger(0); 
	  
	public Emp() {}  
	  
	public Emp(String name, int hours) {  
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
	public Date getDate() {  
	    return date;  
	}  
	public void setDate(Date date) {  
	    this.date = date;  
	}  

}
