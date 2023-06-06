/**
* File: MySQLPersonDAO.java
* Nama: Nadiyya Hasaniyyah
* NIM : 24060121120030
*/
import java.sql.*;

public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception {
        String name = person.getName();

        // Membuat koneksi
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/pbo", "root", "PasswordDisembunyikan");

        // Kerjakan query MySQL
        String query = "INSERT INTO person(name) VALUES(?)";
        PreparedStatement statement = con.prepareStatement(query);
        statement.setString(1, name);
        System.out.println(query);
        statement.executeUpdate();

        // Tutup koneksi database
        statement.close();
        con.close();
    }
}
