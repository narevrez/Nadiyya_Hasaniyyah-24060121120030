/**
 * File      : PegawaiDanGaji.java		03/05/23
 * Penulis   : Nadiyya Hasaniyyah 
 * Deskripsi : Program pengunaan polimorfisme inclusion
 */


public class PegawaiDanGaji{
	public static void main(String[] args){
		Pegawai pegawai = new Programmer("Mira");
		Pegawai pegawai2 = new Manager("Joko");
		Pegawai pegawai3 = new Manager("Argo");

		Payroll payroll = new Payroll();
		payroll.cetakGaji(pegawai);
		payroll.cetakGaji(pegawai2);
		payroll.cetakGaji(pegawai3);

	}
}