package ogrenciBilgiSistemi;

import ogrenciBilgiSistemi.dersler.Ders;
import ogrenciBilgiSistemi.dersler.Fizik;
import ogrenciBilgiSistemi.dersler.Matematik;
import ogrenciBilgiSistemi.domain.Ogrenci;
import ogrenciBilgiSistemi.service.BilgiSistemi;
import ogrenciBilgiSistemi.service.BilgiSistemiArayuz;

import java.util.ArrayList;

public class StartApp {

    public static void main(String[] args) {
        BilgiSistemiArayuz bilgiSistemi = new BilgiSistemi();

        Ders matematik = new Matematik();
        matematik.setAd("Matematik");
        matematik.setKatSayisi(3.0);
        matematik.setPuan(45.0);

        Ders fizik = new Fizik();
        fizik.setAd("Fizik");
        fizik.setKatSayisi(2.0);
        fizik.setPuan(60.0);

        bilgiSistemi.dersKaydet(matematik);
        bilgiSistemi.dersKaydet(fizik);

        Ogrenci ogrenci = new Ogrenci();
        ogrenci.setAd("Mahmut");
        ogrenci.setSoyad("Tuncer");
        ogrenci.setCinsiyet("Erkek");
        ogrenci.setTcNo(12345678910L);
        ogrenci.setDogumTarih("06/08/1191");
        ogrenci.setDersSayisi(2);
        ogrenci.setOkulNumarasi(123L);
        ArrayList<Ders> aldigiDersler = bilgiSistemi.dersListesiGetir();
        ogrenci.setDersListesi(aldigiDersler);

        double notOrtalamasi = bilgiSistemi.notHesapla(ogrenci);
        ogrenci.setNotOrtalamasi(notOrtalamasi);
        //System.out.println("Ogrencinin not ortalamasi: " + ogrenci.getNotOrtalamasi());

        String durum = bilgiSistemi.gectiMi(ogrenci);
        ogrenci.setDersDurumu(durum);
        //System.out.println("Ogrenci sınıfı: " + ogrenci.getDersDurumu());

        bilgiSistemi.ogrenciKaydet(ogrenci);

        //System.out.println(ogrenci.toString());
        ArrayList<Ogrenci> ogrenciListesi = bilgiSistemi.ogrenciListesiGetir();
        ArrayList<Ders> dersListesi = bilgiSistemi.dersListesiGetir();

        System.out.println("Öğrenci bilgileri: ");
        bilgiSistemi.ogrenciListesiYaz(ogrenciListesi);
        System.out.println(" ");
        System.out.println("Öğrencinin ders listesi: ");
        bilgiSistemi.dersListesiYaz(dersListesi);

    }

}
