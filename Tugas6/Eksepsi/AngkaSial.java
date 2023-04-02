/**
 * File      : AngkaSialException.java		02/04/23
 * Penulis   : Nadiyya Hasaniyyah 
 * Deskripsi : Program pengunaan exception buatan sendiri 
 * 		   Pengenalan klausa 'throw' dan 'throws'
 */

public class AngkaSial{
	public void cobaAngka(int angka) throws AngkaSialException{
		if (angka==13){
			throw new AngkaSialException();}
		System.out.println(angka + " bukan angka sial");
	}

	public static void main(String[] args){
		AngkaSial as = new AngkaSial();
		try{
			as.cobaAngka(10);
			as.cobaAngka(13);
			as.cobaAngka(12);}
		catch(AngkaSialException ase){
			System.out.println(ase.getMessage());
			System.out.println("hati-hati memsukkan angka!!!");
		}
	}
}

//PERTANYAAN:
//1. Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
//2. Apakah baris 21 pada AngkaSial.java di atas dieksekusi? 

//JAWABAN:
//1. tidak, karena baris ke 12 adalah kondisi ketika tidak ada eksepsi 
//2. ya, karena ada angka 13 yang merupakan eksepsi
