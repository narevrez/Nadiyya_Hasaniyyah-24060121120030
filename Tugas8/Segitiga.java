/**
* File: Segitiga.java
* Nama: Nadiyya Hasaniyyah
* NIM : 24060121120030
*/

public class Segitiga extends BangunDatar{
	private double s1, s2, s3;

	public Segitiga(double s1, double s2,  double s3){
	this.s1 = s1;
	this.s2 = s2;
	this.s3 = s3;
	}
	public double hitungKeliling(){
		return s1+s2+s3;
	}
}
