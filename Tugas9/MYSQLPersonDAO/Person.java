/**
* File: PersonDAO.java
* Nama: Nadiyya Hasaniyyah
* NIM : 24060121120030
*/

public class Person{
	private int id;
	private String name;

	public Person(String n){
		name=n;
	}

	public Person(int i, String n){
		id=i;
		name=n;
	}

	public int getID(){
		return id;
	}
	
	public String getName(){
		return name;
	}

}