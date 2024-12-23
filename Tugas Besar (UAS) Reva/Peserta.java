

public class Peserta {
    private int id_peserta;
    private String nama_peserta;
    private String email_peserta;
    private String nomor_telepon_peserta;
    private String alamat_peserta;

    // Constructor
    public Peserta(int id_peserta, String nama_peserta, String email_peserta, String nomor_telepon_peserta, String alamat_peserta) {
        this.id_peserta = id_peserta;
        this.nama_peserta = nama_peserta;
        this.email_peserta = email_peserta;
        this.nomor_telepon_peserta = nomor_telepon_peserta;
        this.alamat_peserta = alamat_peserta;
    }

    // Getters & Setters
    public int getId() { return id_peserta; }
    public void setId(int id_peserta) { this.id_peserta = id_peserta; }

    public String getNama() { return nama_peserta; }
    public void setNama(String nama_peserta) { this.nama_peserta = nama_peserta; }

    public String getEmail() { return email_peserta; }
    public void setEmail(String email_peserta) { this.email_peserta = email_peserta; }

    public String getNomorTelepon() { return nomor_telepon_peserta; }
    public void setNomorTelepon(String nomor_telepon_peserta) { this.nomor_telepon_peserta = nomor_telepon_peserta; }

    public String getAlamat() { return alamat_peserta; }
    public void setAlamat(String alamat_peserta) { this.alamat_peserta = alamat_peserta; }

    @Override
    public String toString() {
        return "ID: " + id_peserta + ", Nama: " + nama_peserta + ", Email: " + email_peserta + ", No Telepon: " + nomor_telepon_peserta + ", Alamat: " + alamat_peserta;
    }
}
