/**
 * File      : Pegawai.java		03/05/23
 * Penulis   : Nadiyya Hasaniyyah 
 * Deskripsi : Program pengunaan polimorfisme inclusion
 */

public class Pegawai {
	private String nama;
	private int gajiPokok= 5000000;
	void setNama(String nama){
		this.nama=nama;
	}
	void tampilData(){
		System.out.printf("Nama: %s, Gaji Pokok: %d", nama, gajiPokok);
	}
}

