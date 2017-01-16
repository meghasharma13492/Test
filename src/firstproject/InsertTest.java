package firstproject;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  

import firstproject.beans.Emp;
import firstproject.dao.EmpDao;
  
public class InsertTest {  
public static void main(String[] args) {  
      
    Resource r=new ClassPathResource("applicationContext.xml");  
    BeanFactory factory=new XmlBeanFactory(r);  
      
    EmpDao dao=(EmpDao)factory.getBean("d");  
      
    ArrayList<Emp> e=new ArrayList<Emp>();  
//    e.setId(114);  
//    e.setName("varun"); 
    dao.getEmployees();
//    e.setSalary(5000);  
      
//    dao.saveEmployee(e);  
      
}  
}  
