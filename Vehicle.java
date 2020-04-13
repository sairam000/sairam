package firsthibernate;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
/*import javax.persistence.GeneratedValue;*/
/*import javax.persistence.GeneratedValue;*/
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity

public class Vehicle {
	
	@Id /*@GeneratedValue*/
	private int VehicleId;
	private String VehicleName;
	@ManyToMany
	private Collection<Employee> Employees=new ArrayList<>();
	public Collection<Employee> getEmployees() {
		return Employees;
	}
	public void setEmployees(Collection<Employee> employees) {
		Employees = employees;
	}
	/*public Employee getE1() {
		return e1;
	}
	public void setE1(Employee e1) {
		this.e1 = e1;
	}*/
	public int getVehicleId() {
		return VehicleId;
	}
	public void setVehicleId(int vehicleId) {
		VehicleId = vehicleId;
	}
	public String getVehicleName() {
		return VehicleName;
	}
	public void setVehicleName(String vehicleName) {
		VehicleName = vehicleName;
	}
	
	

}
