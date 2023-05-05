/**
 * File      : Manager.java		03/05/23
 * Penulis   : Nadiyya Hasaniyyah 
 * Deskripsi : Program pengunaan polimorfisme inclusion
 */

public class Manager extends Pegawai{
	private int tunjangan = 700000;
	Manager(String nama){
		setNama(nama);
	};
	
	@Override 
	public void tampilData(){
		super.tampilData();
		System.out.printf("\nTunjangan: %d \n", tunjangan);
	}
}
