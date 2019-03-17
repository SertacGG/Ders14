package ogrenciBilgiSistemi.dersler;

public abstract class Ders {

    private String ad;
    private Double katSayisi;
    private Double puan;

    public Ders() {
    }

    public Ders(String ad, Double katSayisi, Double puan) {
        this.ad = ad;
        this.katSayisi = katSayisi;
        this.puan = puan;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public Double getKatSayisi() {
        return katSayisi;
    }

    public void setKatSayisi(Double katSayisi) {
        this.katSayisi = katSayisi;
    }

    public Double getPuan() {
        return puan;
    }

    public void setPuan(Double puan) {
        this.puan = puan;
    }

    @Override
    public String toString() {
        return "Ders{" +
                "ad='" + ad + '\'' +
                ", katSayisi=" + katSayisi +
                ", puan=" + puan +
                '}';
    }
}
