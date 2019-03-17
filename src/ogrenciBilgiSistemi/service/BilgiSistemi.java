package ogrenciBilgiSistemi.service;

import ogrenciBilgiSistemi.dersler.Ders;
import ogrenciBilgiSistemi.domain.Ogrenci;

import java.util.ArrayList;

public class BilgiSistemi implements BilgiSistemiArayuz {

    private ArrayList<Ogrenci> ogrenciListesi;
    private ArrayList<Ders> dersListesi;

    public BilgiSistemi() {
        ogrenciListesi = new ArrayList<>();
        dersListesi = new ArrayList<>();
    }

    @Override
    public double notHesapla(Ogrenci ogrenci) {
        double toplamNot = 0;
        double notOrtalamasi = 0;
        double toplamKatsayisi = 0;
        if (ogrenci != null) {
            ArrayList<Ders> dersListesi = ogrenci.getDersListesi();
            if (dersListesi != null && dersListesi.size() > 0) {
                for (Ders ders : dersListesi) {
                    toplamKatsayisi += ders.getKatSayisi();
                    toplamNot += ders.getPuan() * ders.getKatSayisi();
                }
                notOrtalamasi = toplamNot / (ogrenci.getDersSayisi() + toplamKatsayisi);
            }
        }
        return notOrtalamasi;
    }

    public String gectiMi(Ogrenci ogrenci) {
        if (ogrenci != null) {
            if (ogrenci.getNotOrtalamasi() >= 35) {
                return "Geçti";
            } else {
                return "Kaldı";
            }
        } else {
            return "Notlara ulaşılamadı";
        }

    }

    @Override
    public void ogrenciKaydet(Ogrenci ogrenci) {
        if (ogrenci != null) {
            ogrenciListesi.add(ogrenci);
        }

    }

    @Override
    public void dersKaydet(Ders ders) {
        if (ders != null) {
            dersListesi.add(ders);
        }

    }

    @Override
    public ArrayList<Ogrenci> ogrenciListesiGetir() {
        return this.ogrenciListesi;
    }

    @Override
    public ArrayList<Ders> dersListesiGetir() {
        return this.dersListesi;
    }

    @Override
    public void ogrenciListesiYaz(ArrayList<Ogrenci> ogrenciListesi) {
        if (ogrenciListesi != null && ogrenciListesi.size() > 0) {
            for (Ogrenci ogrenci : ogrenciListesi) {
                System.out.println(ogrenci);
            }
        }
    }

    @Override
    public void dersListesiYaz(ArrayList<Ders> dersListesi) {
        if (dersListesi != null && dersListesi.size() > 0) {
            for (Ders ders : dersListesi) {
                System.out.println(ders);
            }
        }
    }
}
