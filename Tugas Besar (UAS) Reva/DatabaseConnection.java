import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//kelas DatabaseConnection berfungsi untuk membuat koneksi ke database MySQL.
public class DatabaseConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/db_pelatihan_karyawan"; // URL database yang mengacu pada host, port, dan nama database.
    private static final String USER = "root";  // Username untuk mengakses database.
    private static final String PASSWORD = "";  // password untuk mengakses database.

    // Metode static untuk membuat koneksi ke database.
    public static Connection getConnection() {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Koneksi berhasil");
            return conn;
        } catch (SQLException e) {
            System.out.println("Gagal membuat koneksi ke database: " + e.getMessage());
            return null;
        }
    }
}
