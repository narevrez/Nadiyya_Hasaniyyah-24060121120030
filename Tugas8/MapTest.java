/**
* File: MapTest.java
* Nama: Nadiyya Hasaniyyah
* NIM : 24060121120030
*/

import java.util.*;

public class MapTest{
	public static void main(String[] agrs){
		Map<Integer, String> map = new HashMap <Integer, String>();
		
		//menambah elemen
		map.put(1, "satu");
		map.put(2, "dua");

		//mengambil elemen
		System.out.println(map.get(1));
		System.out.println(map.get(2));

		//iterasi kesseluuruhan
		Set<Integer> key = map.keySet();
		}
	}
