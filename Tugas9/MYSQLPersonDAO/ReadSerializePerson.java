/**
* File: ReadSerializePerson.java
* Nama: Nadiyya Hasaniyyah
* NIM : 24060121120030
*/

public class ReadSerializePerson{
	public static void main(String[] agrs){
		Person person= null;
		try{
			FileOutputStream f = new FileOutputStream("person.ser");
			ObjectOutputStream s = new ObjectOutputStream(f);
			person = (Person)s.readObject();
			s.close();
			System.out.println("serialized person name" +person.getName());

		}

		catch(IOException ioe){
			ioe.printstackTrace();
		}

	}

}