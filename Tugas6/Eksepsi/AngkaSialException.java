/**
 * File      : AngkaSialException.java		02/04/23
 * Penulis   : Nadiyya Hasaniyyah 
 * Deskripsi : Eksepsi uatan sendiri, menolak masukan angka 13 
 * 
 */

public class AngkaSialException extends Exception{
	public AngkaSialException(){
		super("jangan masukkan angka 13 karena angka sial");
	}

}
