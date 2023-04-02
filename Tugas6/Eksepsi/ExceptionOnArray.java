/**
 * File      : ExceptionOnArray.java		02/04/23
 * Penulis   : Nadiyya Hasaniyyah 
 * Deskripsi : Program untuk pengunaan Eksepsi menggunakan class library java
 * 
 */

public class ExceptionOnArray{
	public static void main (String[] args){
		Integer[] arrayInteger= new Integer[4];
		try{
			arrayInteger[2]=11;
			arrayInteger[4]=10;
		}
		catch(ArrayIndexOutOfBoundsException exception){
			exception.printStackTrace();
		}
		finally{
			System.out.println("clean up code.......");
		}
	}

}
