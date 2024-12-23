// Interface CRUDOperations<T> menyediakan metode umum untuk operasi CRUD (Create, Read, Update, Delete) yang bisa diterapkan pada berbagai tipe data.
import java.util.List;

public interface CRUDOperations<T> {
    void create(T t);           // Metode untuk membuat entitas baru.
    T read(int id);             // Metode untuk membaca entitas berdasarkan ID.
    void update(T t);           // Metode untuk memperbarui entitas yang ada.
    void delete(int id);        // Metode untuk menghapus entitas berdasarkan ID.
    List<T> readAll();          // Metode untuk membaca semua entitas dari data sumber.
}
