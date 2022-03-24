package javacodestopractice;

import java.util.ArrayList;
import java.util.List;


public class Phonebook {
	
	private List<AironeContact> phoneBook = new ArrayList<AironeContact>();
	public void addContact(AironeContact contactObj) {
		phoneBook.add(contactObj);
	}
	public List<AironeContact> viewAllContacts() {
		return phoneBook;
	}
	public AironeContact viewContactGivenPhone(long phoneNumber) {
		AironeContact c=null;
		for(int i=0;i<phoneBook.size();i++) {
			if(phoneBook.get(i).getPhoneNumber()==phoneNumber) {
				c=phoneBook.get(i);
				
			}
		}
		return c;
	}
	public boolean removeContact(long phoneNumber) {
		boolean f=false;
		for(int i=0;i<phoneBook.size();i++) {
			if(phoneBook.get(i).getPhoneNumber()==phoneNumber) {
				phoneBook.remove(phoneBook.get(i));
				f=true;
				
			}
			else {
				f=false;
			}
		}
		return f;
		
	}
}
