package firsthibernate;


import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Employee e1=new Employee();  
		    e1.setId(1);  
		    e1.setFirstName("sai");  
		    e1.setLastName("ram");
		    e1.setJoinedDate(new Date());
		    e1.setDescription("sai description");
		    
		    Vehicle v=new Vehicle();
		    v.setVehicleId(4);
		    v.setVehicleName("benz");
		    e1.getVehicles().add(v);
		    
		    Vehicle v2=new Vehicle();
		    v.setVehicleId(1);
		    v.setVehicleName("audi");
		    e1.getVehicles().add(v2);
		    /*v.setE1(e1);
		    v2.setE1(e1);*/
		    v.getEmployees().add(e1);
		    v2.getEmployees().add(e1);
		    
		    
		    
		    
		    
		    
		    
		    
		    /*Employee e2=new Employee();
		    e1.setId(2); 
		    e1.setFirstName("haii");  
		    e1.setLastName("ram");
		    e1.setJoinedDate(new Date());
		    e1.setDescription("sai description");*/
		    
		   /* Address a=new Address();
		    a.setStreet("street name");
		    a.setCity("rajahmundry");
		    a.setState("ap");
		    e1.getListOfAddress().add(a);*/
		    
		    /*Address a2=new Address();
		    a2.setStreet("second street name");
		    a2.setCity("rajah");
		    a2.setState("ap");
		    e1.getListOfAddress().add(a2);*/
		 
	    SessionFactory factory=new Configuration().configure().buildSessionFactory();  
	      
	     
	    Session session=factory.openSession();  
	    session.beginTransaction();   
	      
	    session.save(e1);
	    session.save(v);
	    session.save(v2);
	    /*session.save(e2);*///persisting the object  
	    session.getTransaction().commit(); 
	    session.close();
	    
	    /*e1=null;
	    
	    session=factory.openSession();  
	    session.beginTransaction(); 
	    e1=(Employee) session.get(Employee.class, 1);
	    session.close();
	    System.out.println("size is" + e1.getListOfAddress().size());*/
	      
	    System.out.println("successfully saved"  +e1.getFirstName());  
	      
	}  

	}

