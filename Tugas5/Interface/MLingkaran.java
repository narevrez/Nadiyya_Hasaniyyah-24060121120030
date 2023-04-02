/**
 * File      : MLingkaran.java		02/04/23
 * Penulis   : Nadiyya Hasaniyyah 
 * Deskripsi : implementasi menghitung luas lingkaran
 * 
 */
import java.util.Scanner;

public class MLingkaran{
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukkan jejari lingkaran: ");
		double r=scan.nextDouble();
		scan.close();
		Lingkaran l = new Lingkaran(r);
		System.out.println("Luas Lingkaran dengan jejari " + r + " adalah " +l.hitungLuas());
	}
}