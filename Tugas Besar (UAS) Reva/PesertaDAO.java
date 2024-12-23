import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PesertaDAO implements CRUDOperations<Peserta> {

    @Override
    public void create(Peserta peserta) {
        String query = "INSERT INTO peserta (nama, email, no_telepon, alamat) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, peserta.getNama());
            stmt.setString(2, peserta.getEmail());
            stmt.setString(3, peserta.getNomorTelepon());
            stmt.setString(4, peserta.getAlamat());
            stmt.executeUpdate();
            System.out.println("Peserta berhasil ditambahkan!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Peserta read(int id) {
        String query = "SELECT * FROM peserta WHERE id_peserta = ?";
        Peserta peserta = null;
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                peserta = new Peserta(
                    rs.getInt("id_peserta"),
                    rs.getString("nama_peserta"),
                    rs.getString("email_peserta"),
                    rs.getString("no_telepon_peserta"),
                    rs.getString("alamat_peserta")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return peserta;
    }

    @Override
    public void update(Peserta peserta) {
        String query = "UPDATE peserta SET nama_peserta = ?, email_peserta = ?, no_telepon_peserta = ?, alamat_peserta = ? WHERE id_peserta = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, peserta.getNama());
            stmt.setString(2, peserta.getEmail());
            stmt.setString(3, peserta.getNomorTelepon());
            stmt.setString(4, peserta.getAlamat());
            stmt.setInt(5, peserta.getId());
            stmt.executeUpdate();
            System.out.println("Peserta berhasil diperbarui!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id_peserta) {
        String query = "DELETE FROM peserta WHERE id_peserta = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, id_peserta);
            stmt.executeUpdate();
            System.out.println("Peserta berhasil dihapus!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Peserta> readAll() {
        String query = "SELECT * FROM peserta";
        List<Peserta> pesertaList = new ArrayList<>();
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Peserta peserta = new Peserta(
                    rs.getInt("id_peserta"),
                    rs.getString("nama_peserta"),
                    rs.getString("email_peserta"),
                    rs.getString("no_telepon_peserta"),
                    rs.getString("alamat_peserta")
                );
                pesertaList.add(peserta);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pesertaList;
    }
}
