package ogrenciBilgiSistemi.service;

import ogrenciBilgiSistemi.dersler.Ders;
import ogrenciBilgiSistemi.domain.Ogrenci;

import java.util.ArrayList;

public interface BaseBilgiSistemiArayuz {

    ArrayList<Ogrenci> ogrenciListesiGetir();

    ArrayList<Ders> dersListesiGetir();

    void ogrenciListesiYaz(ArrayList<Ogrenci> ogrenciListesi);

    void dersListesiYaz(ArrayList<Ders> dersListesi);

}
