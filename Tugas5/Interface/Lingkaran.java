/**
 * File      : Lingkaran.java		02/04/23
 * Penulis   : Nadiyya Hasaniyyah 
 * Deskripsi : kelas implementasi IArea berupa menghitung lingkaran
 * 
 */

import static java.lang.Math.PI;

class Lingkaran implements IArea{
	private double jejari;
	public Lingkaran(double r){
		jejari=r;
	}
	public double hitungLuas(){
		return PI*jejari*jejari;
	}
}