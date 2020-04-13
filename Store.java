package firsthibernate;


import java.util.Date;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;

public class Store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  /*Employee e1=new Employee();  
		    e1.setId(1);  
		    e1.setFirstName("sai");  
		    e1.setLastName("ram");
		    e1.setJoinedDate(new Date());
		    e1.setDescription("sai description");
		    
		    Vehicle v=new Vehicle();
		    v.setVehicleId(6);
		    v.setVehicleName("car");
		    System.out.println("vehicle object");
		    e1.getVehicles().add(v);
		    
		    Vehicle v2=new Vehicle();
		    v.setVehicleId(1);
		    v.setVehicleName("audi");
		    e1.getVehicles().add(v2);
		    v.setE1(e1);
		    v2.setE1(e1);
		    v.getEmployees().add(e1);
		    v2.getEmployees().add(e1);
		    TwoWheeler bike=new TwoWheeler();
		    bike.setVehicleName("pulsur");
		    bike.setHandle("bike handle");
		    System.out.println("bike");
		    FourWheeler car=new FourWheeler();
		    car.setVehicleName("porsche");
		    car.setSteering("car steering");
		    System.out.println("car");
		    
		    
		    
		    
		    
		    
		    
		    
		    Employee e2=new Employee();
		    e1.setId(2); 
		    e1.setFirstName("haii");  
		    e1.setLastName("ram");
		    e1.setJoinedDate(new Date());
		    e1.setDescription("sai description");
		    
		    Address a=new Address();
		    a.setStreet("street name");
		    a.setCity("rajahmundry");
		    a.setState("ap");
		    e1.getListOfAddress().add(a);
		    
		    Address a2=new Address();
		    a2.setStreet("second street name");
		    a2.setCity("rajah");
		    a2.setState("ap");
		    e1.getListOfAddress().add(a2);*/
		 
	    SessionFactory factory=new Configuration().configure().buildSessionFactory();  
	    Session session=factory.openSession();  
	    session.beginTransaction();   
	    /*String minId="5";*/
	    Query query=session.createQuery("from Student ");
	    Criteria criteria= session.createCriteria(Student.class);
	    criteria
	    		.add(Restrictions.gt("id",4))
	    		.add(Restrictions.between("id", 1, 9));
	    /*query=session.getNamedQuery("Studentdetails.byId");
	    query.setInteger(0, 2);*/
	    
	    List<Student> Students=(List<Student>) criteria.list();
	    
	     /*List Students=((org.hibernate.query.Query) query).list();*/
	   /* query.setFirstResult(4);
	    query.setMaxResults(2);*/
	   /*List<String> Students=(List<String>)((org.hibernate.query.Query) query).list();*/
	    /*session.save(v);
	    session.save(bike);
	    session.save(car);*/
	    /*session.save(e2);*///persisting the object  
	    session.getTransaction().commit(); 
	    session.close();
	    for(Student S:Students)
	    {
	    	System.out.println(S.getName());
	    }
	    
	    System.out.println("size is" + Students.size());
	    /*e1=null;
	    
	    session=factory.openSession();  
	    session.beginTransaction(); 
	    e1=(Employee) session.get(Employee.class, 1);
	    session.close();
	    System.out.println("size is" + e1.getListOfAddress().size());
	      
	    System.out.println("successfully saved"  +e1.getFirstName());*/  
	      
	}

	

	}

