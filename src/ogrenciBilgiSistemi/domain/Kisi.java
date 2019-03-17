package ogrenciBilgiSistemi.domain;

public abstract class Kisi {

    private String ad;
    private String soyad;
    private String dogumTarih;
    private long tcNo;
    private String cinsiyet;

    public Kisi() {
    }

    public Kisi(String ad, String soyad, String dogumTarih, long tcNo, String cinsiyet) {
        this.ad = ad;
        this.soyad = soyad;
        this.dogumTarih = dogumTarih;
        this.tcNo = tcNo;
        this.cinsiyet = cinsiyet;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getDogumTarih() {
        return dogumTarih;
    }

    public void setDogumTarih(String dogumTarih) {
        this.dogumTarih = dogumTarih;
    }

    public long getTcNo() {
        return tcNo;
    }

    public void setTcNo(long tcNo) {
        this.tcNo = tcNo;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", dogumTarih='" + dogumTarih + '\'' +
                ", tcNo=" + tcNo +
                ", cinsiyet='" + cinsiyet + '\'' +
                '}';
    }
}
