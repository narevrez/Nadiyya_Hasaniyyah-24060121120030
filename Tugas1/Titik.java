/**
 * File      : Titik.java	
 * Penulis   : Nadiyya Hasaniyyah
 * Deskripsi : Titik 01/03/23
 *  
 */

class Titik{
	double absis;
	double ordinat;
	static int counterTitik;
	
	Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}  
	
	Titik(double a, double o){
		absis = a;
		ordinat = o;
		counterTitik++;
	}
  
	void setAbsis(double a){
		absis =a;
	}
  
	double getAbsis(){
		return absis;
	}
	
	void setOrdinat(double b){
		ordinat = b;
	}
	
	double getOrdinat(){
		return ordinat;
	}
	
	int getCounterTitik(){
		return counterTitik;
	}
}