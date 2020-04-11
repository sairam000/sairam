package service;

import java.util.ArrayList;
import java.util.List;

import model.Message;
import model.Profile;

public class ProfileService {
	public List<Profile> getallprofiles()
	{
		Profile p1=new Profile(1l,"sairam00","sairam","mullapudi");
		Profile  p2=new Profile(2l,"kishore21","kishore","rock");
		List <Profile> l1=new ArrayList<>();
		l1.add(p1);
		l1.add(p2);
		
		return l1;
			}


}
