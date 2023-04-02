/**
 * File      : Asersi2.java		02/04/23
 * Penulis   : Nadiyya Hasaniyyah 
 * Deskripsi : Program untuk menunjukkan aserssi
 * 
 */

//class lingkaran
class Lingkaran{
	private double jariJari;
	public Lingkaran(double  jariJari){
		this.jariJari= jariJari;
	}
	public double hitungKeliling(){
		double keliling= 2*Math.PI*jariJari;
		return keliling;
	}
}


//class asersi2
public class Asersi2{
	public static void main (String[] args) {
		double jariJari=-5;
		assert(jariJari>0):"jariJari tidak boleh 0";
		Lingkaran l = new Lingkaran(jariJari);
		double KelilingLingkaran=l.hitungKeliling();
		System.out.println("Keliling Lingkaran= " + KelilingLingkaran);
	}

}

//PERTANYAAN: secara konsep, ada yang kurang tepat pada program asersi di atas
//JAWABAN: seharusnya pesan pada asersi lebih baik diganti dengan "jarijari harus diatas nilai 0" karena (jariJari>0) selain tidak boleh bernilai 0 jariJari tidak boleh juga bernilai dibawah 0. Jika hanya pesan "jariJari tidak boleh 0" maka pesan kurang disampaikan denggan baik