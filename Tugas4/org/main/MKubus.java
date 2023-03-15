/**
 * File      : MKubus.java		15/03/23
 * Penulis   : Nadiyya Hasaniyyah 
 * Deskripsi : driver class untuk Kubus
 * 
 */

package org.main;

import org.bangunruang.*;
import org.bangundatar.*;

public class MKubus{
	public static void main(String[] args){
		BujurSangkar BS = new BujurSangkar(10);
		Kubus Kubuss = new Kubus(BS);
		System.out.println("Luas Alas " + Kubuss.hitungLuasAlas());	
		System.out.println("Volume Kubus " + Kubuss.hitungVolume());	
	}
}