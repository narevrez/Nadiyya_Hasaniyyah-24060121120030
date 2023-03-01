/**
 * File      : MOperasiTitik.java	
 * Penulis   : Nadiyya Hasaniyyah
 * Deskripsi : Main OperasiTitik 01/03/23
 *  
 */


class MOperasiTitik{
	public static void main(String[]args){
		Titik t1 = new Titik(1.0, 2.0);
		OperasiTitik op = new OperasiTitik();
		System.out.println("t1 ("+ t1.getAbsis() + "," + t1.getOrdinat() + ")");

		op.refleksiX(t1);
		System.out.println("\n Refleksi  terhadap sumbu X");
		System.out.println("t1 ("+ t1.getAbsis() + "," + t1.getOrdinat() + ")");

		op.refleksiY(t1);
		System.out.println("\n Refleksi  terhadap sumbu Y");
		System.out.println("t1 ("+ t1.getAbsis() + "," + t1.getOrdinat() + ")");
 
}
}