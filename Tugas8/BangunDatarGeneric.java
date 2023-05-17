/**
* File: BangunDatarGeneric.java
* Nama: Nadiyya Hasaniyyah
* NIM : 24060121120030
*/

public class BangunDatarGeneric<T extends BangunDatar>{
	private T bangunDatar;
	
	public void set(T tipeBangunDatar){
		bangunDatar= tipeBangunDatar;
	}

	public T get(){
		return bangunDatar;
	}

	
	public double hitungKeliling(){
		return bangunDatar.hitungKeliling();
	}


}