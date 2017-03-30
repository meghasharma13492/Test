package firstproject.dao;


import java.util.*;  

import org.springframework.orm.hibernate4.HibernateTemplate;  


import org.springframework.transaction.annotation.Transactional;

//import test.Employee;
import firstproject.beans.Activity;

@Transactional(readOnly = false)

public class ActivityDao {
	
//	Using JDBC Template
	
//	JdbcTemplate template;  
//	public void setTemplate(JdbcTemplate template) {  
//	    this.template = template;  
//	}  
//	public List<Emp> getEmployees(){  
//	    return template.query("select * from activities",new RowMapper<Emp>(){  
//	        public Emp mapRow(ResultSet rs, int row) throws SQLException {
//	            Emp e=new Emp();  
//	            e.setId(rs.getInt(1));  
//	            e.setName(rs.getString(2));  
//	            e.setHour(rs.getInt(3));
////	            e.setDate(rs.getDate(4));  
////	            e.setDesignation(rs.getString(4));  
//	            return e;  
//	        }  
//	    });  
//	}
//	public void delete(int id) {
//		String sql = "delete from products where id=" + id +"";
//		template.update(sql);
//	} 
//	public int save(Emp emp) {
//		String sql = "INSERT INTO activities (id,name,hours) VALUES('"+emp.getId()+"','"+emp.getName()+"','"+emp.getHour()+"')";
//		return template.update(sql);
//	} 
//	
//	public Emp getEmpById(int id){
//		String sql = "SELECT * from activities where id=?";
//		 return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Emp>(Emp.class));  
//		
//	}
//	public int update(Emp emp) {
//		// TODO Auto-generated method stub
//		String sql = "UPDATE INTO activities (id,name,hours) VALUES('"+emp.getId()+"','"+emp.getName()+"','"+emp.getHour()+"')";
//		return template.update(sql);
//	} 

	//JDBC TEMPLATE OVER
	
	HibernateTemplate template;
	
	public void setTemplate(HibernateTemplate template) {  
	    this.template = template;  
	}  
	
	public List<Activity> getEmployees(){  
	    List<Activity> list=new ArrayList<Activity>();  
	    list=template.loadAll(Activity.class);  
	    return list;  
	} 
	
	//method to save activity  
	public void save(Activity e){  
	    template.save(e);  
	}  
	//method to update activity  
	public void update(Activity e){  
	    template.update(e);  
	}  
	//method to delete activity  
	public void delete(int id){  
		Activity e=(Activity)template.get(Activity.class,id);  
	    template.delete(e);  
	}  
	//method to return one activity of given id  
	public Activity getById(int id){  
		Activity e=(Activity)template.get(Activity.class,id);  
	    return e;  
	}  

	
	
	
	
	
	
	
	

}
