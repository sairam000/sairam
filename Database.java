package database;

import java.util.HashMap;
import java.util.Map;

import model.Message;
import model.Profile;


public class Database {
	Database b=new Database();
	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<String,Profile> profiles = new HashMap<>();
	public static Map<Long, Message> getMessages() {
		return messages;
	}
	public static Map<String, Profile> getProfiles() {
		return profiles;
	}
	
	
}
