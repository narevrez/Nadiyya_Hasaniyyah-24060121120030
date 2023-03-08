/**
 * File      : MPoligon.java		08/03/23
 * Penulis   : Nadiyya Hasaniyyah 
 * Deskripsi : driver class untuk poligon dan persegi panjang
 * 
 */

package org.main;

import org.bangundatar.*;

public class MPoligon{
	public static void main(String[] args){
		PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
		persegi.printInfo();
		System.out.println("Luas persegi panjang " + persegi.hitungLuas());		
		Segitiga Segitiga1 = new Segitiga(10, 10, 3);
		Segitiga1.printInfo();
		System.out.println("Luas persegi panjang " + Segitiga1.hitungLuas());	
	}
}