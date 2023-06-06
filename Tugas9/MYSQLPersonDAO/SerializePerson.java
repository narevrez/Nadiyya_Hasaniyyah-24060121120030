/**
* File: SerializePerson.java
* Nama: Nadiyya Hasaniyyah
* NIM : 24060121120030
*/

import java.io.*;
//class Person

class Person implements Serializable{
	private String name;
	public Person(String n){
		name=n;
	}
	public String getName(){
		return name;
	}
}

//class SerializePerson
public class SerializePerson{
	public static void main(String[] args){
		Person person = new Person("Panji");
	try{
		FileOutputStream f = new FileOutputStream("person.ser");
		ObjectOutputStream s = new ObjectOutputStream(f);
		s.writeObject(person);
		System.out.println("selesai menulis object person");
		s.close();
	}

	catch(IOException e){
		e.printstackTrace();
		}

	}

}

