package firsthibernate;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("bike")
public class TwoWheeler extends Vehicle {
	private String Handle;

	public String getHandle() {
		return Handle;
	}

	public void setHandle(String handle) {
		Handle = handle;
	}
	

}
