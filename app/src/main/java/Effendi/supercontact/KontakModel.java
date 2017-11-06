package Effendi.supercontact;

/**
 * Created by Dimas on 11/6/2017.
 */

public class KontakModel {
    private String nama, email, nomor;

    public KontakModel(String nama, String email, String nomor) {
        this.nama = nama;
        this.email = email;
        this.nomor = nomor;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public String getNomor() {
        return nomor;
    }
}
