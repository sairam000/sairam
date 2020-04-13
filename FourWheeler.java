package firsthibernate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("car")
public class FourWheeler extends Vehicle{
	private String Steering;

	public String getSteering() {
		return Steering;
	}

	public void setSteering(String steering) {
		Steering = steering;
	}
	

}
