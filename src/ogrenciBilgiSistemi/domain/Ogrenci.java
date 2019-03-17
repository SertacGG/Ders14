package ogrenciBilgiSistemi.domain;

import ogrenciBilgiSistemi.dersler.Ders;

import java.util.ArrayList;

public class Ogrenci extends Kisi {

    private Long okulNumarasi;
    private Double notOrtalamasi;
    private Integer dersSayisi;
    private ArrayList<Ders> dersListesi;
    private String dersDurumu;

    public Ogrenci() {
    }

    public Ogrenci(Long okulNumarasi, Double notOrtalamasi, Integer dersSayisi) {
        this.okulNumarasi = okulNumarasi;
        this.notOrtalamasi = notOrtalamasi;
        this.dersSayisi = dersSayisi;
    }

    public Long getOkulNumarasi() {
        return okulNumarasi;
    }

    public void setOkulNumarasi(Long okulNumarasi) {
        this.okulNumarasi = okulNumarasi;
    }

    public Double getNotOrtalamasi() {
        return notOrtalamasi;
    }

    public void setNotOrtalamasi(Double notOrtalamasi) {
        this.notOrtalamasi = notOrtalamasi;
    }

    public Integer getDersSayisi() {
        return dersSayisi;
    }

    public void setDersSayisi(Integer dersSayisi) {
        this.dersSayisi = dersSayisi;
    }

    public ArrayList<Ders> getDersListesi() {
        return dersListesi;
    }

    public void setDersListesi(ArrayList<Ders> dersListesi) {
        this.dersListesi = dersListesi;
    }

    public String getDersDurumu() {
        return dersDurumu;
    }

    public void setDersDurumu(String dersDurumu) {
        this.dersDurumu = dersDurumu;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "okulNumarasi=" + okulNumarasi +
                ", notOrtalamasi=" + notOrtalamasi +
                ", dersSayisi=" + dersSayisi +
                ", dersListesi=" + dersListesi +
                ", dersDurumu='" + dersDurumu + '\'' +
                "} " + super.toString();
    }
}
