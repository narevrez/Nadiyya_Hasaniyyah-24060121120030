/**
* File: MapTest.java
* Nama: Nadiyya Hasaniyyah
* NIM : 24060121120030
*/

import java.util.*;

public class MapTest {
	public static void main(String[] args) {
		Map<String,String> Mahasiswa = new HashMap<>();
		Mahasiswa.put("Nadiyya Hasaniyyah", "24060121120030");
		Mahasiswa.forEach((NAMAmhs, NIM)->System.out.println("Nama Mahasiswa: " + NAMAmhs + "\nNIM: " + NIM));
	}
}