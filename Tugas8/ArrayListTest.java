/**
* File: ArrayListTest.java
*
*/

import java.util.ArrayList;
public class ArrayListTest{
	public static void main(String[] agrs){
		ArrayList<String> strings = new ArrayList<String>();
		//menambah elemen
		strings.add("Praktikum");
		strings.add("Collections");
		strings.add("dan generics");
		
		//menghapus elemen
		strings.remove("Praktikum");
		
		//iterasi kesseluuruhan
		for(String s : strings){
		System.out.print(s+" ");
		}
	}

}