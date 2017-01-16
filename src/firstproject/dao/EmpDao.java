package firstproject.dao;


import java.util.*;  

import org.springframework.orm.hibernate3.HibernateTemplate;  

//import test.Employee;
import firstproject.beans.Emp;

public class EmpDao {
	
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
	
	public List<Emp> getEmployees(){  
	    List<Emp> list=new ArrayList<Emp>();  
	    list=template.loadAll(Emp.class);  
	    return list;  
	} 
	
	//method to save employee  
	public void save(Emp e){  
	    template.save(e);  
	}  
	//method to update employee  
	public void update(Emp e){  
	    template.update(e);  
	}  
	//method to delete employee  
	public void delete(int id){  
		Emp e=(Emp)template.get(Emp.class,id);  
	    template.delete(e);  
	}  
	//method to return one employee of given id  
	public Emp getById(int id){  
	    Emp e=(Emp)template.get(Emp.class,id);  
	    return e;  
	}  

	
	
	
	
	
	
	
	

}
