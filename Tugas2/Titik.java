/**
 * File      : Titik.java	
 * Penulis   : Nadiyya Hasaniyyah
 * Deskripsi : Titik (data hiding) 01/03/23
 *  
 */
 
class Titik{
	private double absis;
	private double ordinat;
	private static int counterTitik;
	
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
  
	public void setAbsis(double a){
		absis =a;
	}
  
	public double getAbsis(){
		return absis;
	}
	
	public void setOrdinat(double b){
		ordinat = b;
	}
	
	public double getOrdinat(){
		return ordinat;
	}
	
	public int getCounterTitik(){
		return counterTitik;
	}
}