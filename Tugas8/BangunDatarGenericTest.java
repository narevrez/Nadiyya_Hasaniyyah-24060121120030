/**
* File: BangunDatar.java
* Nama: Nadiyya Hasaniyyah
* NIM : 24060121120030
*/

public class BangunDatarGenericTest{
	public static void main(String[] args){
	Lingkaran l = new Lingkaran(2);
	BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>(); 
	bdg.set(l);
	System.out.println("keliling lingkaran: " + bdg.hitungKeliling());
	System.out.println("tipe generic: " + bdg.get().getClass().getName());
	
	Segitiga s = new Segitiga(1,2,3);
	BangunDatarGeneric<Segitiga> bds = new BangunDatarGeneric<Segitiga>(); 
	bds.set(s);
	System.out.println("keliling segitiga: " + bds.hitungKeliling());
	System.out.println("tipe generic: " + bds.get().getClass().getName());
	}
}