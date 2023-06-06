/**
* File: DAOManager.java
* Nama: Nadiyya Hasaniyyah
* NIM : 24060121120030
*/

public class DAOManager{
	private PersonDAO personDAO;

	public void setPersonDAO(PersonDAO person){
		personDAO =person;
	}

	public PersonDAO getPersonDAO(){
		return personDAO;
	}

}