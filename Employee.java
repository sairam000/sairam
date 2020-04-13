package firsthibernate;



import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
/*import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;*/
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
public class Employee {
	@Id/*@Id @GeneratedValue(strategy = GenerationType.AUTO)*/
	private int id;  
	/*@Column (name="nickName")*/
	private String firstName;
	@Transient
	private String lastName; 
	@Temporal (TemporalType.DATE)
	private Date joinedDate;
	@Lob
	private String description;
	/*@OneToMany*/
	@ManyToMany
	private Collection<Vehicle> vehicles=new ArrayList<>();
	
	public Collection<Vehicle> getVehicles() {
		return vehicles;
	}
	public void setVehicles(Collection<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
	/*@OneToOne
	private Vehicle vehicle;
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}*/
	/*@Embedded
	@AttributeOverrides({
	@AttributeOverride (name="street", column=@Column(name="Home_streetName")),
	@AttributeOverride (name="street", column=@Column(name="Home_streetName")),
	@AttributeOverride (name="street", column=@Column(name="Home_streetName"))})
	private Address HomeAddress;
	@Embedded
	private Address OfficeAddress;
	@Lob
	private String description;
	
	
	  
	
	public Address getHomeAddress() {
		return HomeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		HomeAddress = homeAddress;
	}
	public Address getOfficeAddress() {
		return OfficeAddress;
	}
	public void setOfficeAddress(Address officeAddress) {
		OfficeAddress = officeAddress;
	}
	
*/	
/*	@ElementCollection(fetch=FetchType.EAGER)
	@JoinTable(name="Employee_Address",
				joinColumns= @JoinColumn(name="EmployeeId")
)
	private Collection<Address> ListOfAddress = new ArrayList<>();
	
	public Collection<Address> getListOfAddress() {
		return ListOfAddress;
	}
	public void setListOfAddress(Collection<Address> listOfAddress) {
		ListOfAddress = listOfAddress;
	}*/
	public Date getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getId() {  
	    return id;  
	}  
	public void setId(int id) {  
	    this.id = id;  
	}  
	public String getFirstName() {  
	    return firstName;  
	}  
	public void setFirstName(String firstName) {  
	    this.firstName = firstName;  
	}  
	public String getLastName() {  
	    return lastName;  
	}  
	public void setLastName(String lastName) {  
	    this.lastName = lastName;  
	}
	
	  
	  
	  
	}  

