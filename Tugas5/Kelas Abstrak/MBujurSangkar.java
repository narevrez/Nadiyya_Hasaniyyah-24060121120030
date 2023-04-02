/**
 * File      : MBujurSangkar.java		02/04/23
 * Penulis   : Nadiyya Hasaniyyah 
 * Deskripsi : kels abstrak yang berisi driver dari kelas BujurSangkar
 * 
 */
import java.util.Scanner;

public class MBujurSangkar{
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		BujurSangkar bs = new BujurSangkar();
		System.out.println("Masukkan sisi bujur sangkar: ");
		double sisi =scan.nextDouble();
		scan.close();
		System.out.println("Luas Bujur Sangkar dengan sisi " + sisi + " adalah " +bs.hitungLuas(sisi));
	}	

}