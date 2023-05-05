/**
 * File      : Programmer.java		03/05/23
 * Penulis   : Nadiyya Hasaniyyah 
 * Deskripsi : Program pengunaan polimorfisme inclusion
 */

public class Programmer extends Pegawai{
	private int bonus = 450000;
	Programmer(String nama){
		setNama(nama);
	};
	
	@Override 
	public void tampilData(){
		super.tampilData();
		System.out.printf("\nBonus: %d \n", bonus);
	}
}
