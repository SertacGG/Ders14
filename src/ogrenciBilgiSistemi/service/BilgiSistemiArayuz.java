package ogrenciBilgiSistemi.service;

import ogrenciBilgiSistemi.dersler.Ders;
import ogrenciBilgiSistemi.domain.Ogrenci;

public interface BilgiSistemiArayuz extends BaseBilgiSistemiArayuz {

    double notHesapla(Ogrenci ogrenci);

    String gectiMi(Ogrenci ogrenci);

    void ogrenciKaydet(Ogrenci ogrenci);

    void dersKaydet(Ders ders);
}
