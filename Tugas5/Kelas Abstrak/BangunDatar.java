/**
 * File      : BangunDatar.java		02/04/23
 * Penulis   : Nadiyya Hasaniyyah 
 * Deskripsi : kels abstrak, berisi abstraksi bangun datar
 * 
 */

public abstract class BangunDatar{
	protected double luas;
	
	public abstract double hitungLuas(double sisi);

	public void setLuas(double Luas){
		this.luas=Luas;
	}

	public double getLuas(){
		return luas;
	}

}