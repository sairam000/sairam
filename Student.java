package firsthibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
/*import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
@Entity
@NamedQuery(name="Studentdetails.byId",query="from Students where id= ?")
@NamedNativeQuery(name="Studentdetails.byName",query="select* from Student where Name = ?",resultClass=Student.class)
*/
@Entity
public class Student {
	@Id
	private int id;
	private String Name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	

}
