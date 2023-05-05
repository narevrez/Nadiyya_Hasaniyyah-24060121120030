/**
 * File      : Vehicle.java		03/05/23
 * Penulis   : Nadiyya Hasaniyyah 
 * Deskripsi : Program pengunaan polimorfisme inclusion
 */

public class Vehicle {
	void calRent(int distance, float price){
		float fare=distance* price;
		System.out.println("vehicle price = " + fare);
	}
}

