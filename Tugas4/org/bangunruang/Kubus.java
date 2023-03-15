/**
 * File      : Kubus.java
 * Penulis   : Nadiyya Hasaniyyah 
 * Deskripsi : representasi dari objek Kubus, turunan kelas poligon
 * 
 */

package org.bangunruang;
import org.bangundatar.BujurSangkar;

public class Kubus{

	
	private BujurSangkar permukaan;
	
	public Kubus(BujurSangkar permukaan){
		this.permukaan = permukaan;
	}
	
	public double hitungLuasAlas(){
		return this.permukaan.hitungLuas();
	}

	public double hitungVolume(){
		return this.hitungLuasAlas() * this.permukaan.getPanjangSisi();
	}

}