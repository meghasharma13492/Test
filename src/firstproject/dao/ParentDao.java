package firstproject.dao;

import org.springframework.jdbc.core.JdbcTemplate;


public class ParentDao {
	JdbcTemplate template;  
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	} 

}
