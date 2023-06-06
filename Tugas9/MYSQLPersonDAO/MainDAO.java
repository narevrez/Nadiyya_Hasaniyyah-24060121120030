/**
* File: MainDAOjava
* Nama: Nadiyya Hasaniyyah
* NIM : 24060121120030
*/

public class MainDAO{
	public static void main(String args[]){
		Person person = new Person("Indra");
		DAOManager m = new DAOManager();
		m.setPersonDAO(new MySQLPersonDAO());
		try{
			m.getPersonDAO().savePerson(person);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	
	}

}

// Lihat apakah terjadi penambahan record pada tabel ! 
//Ya, pada database pbo dengan tabel Person di MYSQL dari yang sebelumnya adalah empty set,
// terdapat penambahan record yakni Indra dengan id 1 

