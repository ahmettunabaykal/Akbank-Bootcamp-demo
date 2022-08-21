package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Her araç sınıfından 2'şer tane oluşturulmuştur
        // Araçlar oluşturulurken bilgileri ekrana yazdırılıcaktır.
        System.out.println("\nOluşturulan her araç için aşağıda araç bilgisi yer almaktadır.");
        Arac otomobil1 = new Otomobil("Ahmet Tuna Baykal" , 1 , 100);
        Arac otomobil2 = new Otomobil("Zeynep Baykal" , 2 , 150);

        Arac minibüs1 = new Minibus("Ömer Topal" , 11 , 100);
        Arac minibüs2 = new Minibus("Ayberk Acar" , 12 , 150);

        Arac otobüs1 = new Otobus("Gökçe Çizmeci" , 21 , 200);
        Arac otobüs2 = new Otobus("Yiğit Avcı" , 22 , 500);

        // Bir adet gişe objesi oluşturulmuştur.
        Gise hgsGise = new Gise();

        // bir adet yönetim sınıfına erişebilmek için yönetim objesi oluşturulmuştur
        Yonetim rapor = new Yonetim(hgsGise);

        // bir adet araç arraylisti oluşturuldu ki bundan sonraki adımları loop içerisinde yapabileyim.
        ArrayList<Arac> araclist = new ArrayList<>();
        araclist.add(otomobil1);
        araclist.add(otomobil2);
        araclist.add(minibüs1);
        araclist.add(minibüs2);
        araclist.add(otobüs1);
        araclist.add(otobüs2);


        System.out.println("\n--------- BU KISIM ARAÇ GEÇİŞLERİ BİLGİSİDİR --------\n");
        // yukardaki arrayliste atılan araçların hgs'den geçiş fonksiyonu
        araclist.forEach((n) -> hgsGise.aracGecis(n) );

        // yönetim sınıfı'dan rapor fonksiyonu - sırası ile geçen tüm araçların bilgisi
        System.out.println("\n--------- BU KISIM YÖNETİM RAPORU BİLGİSİDİR --------\n");
        rapor.Rapor();

        System.out.println();
        // yönetim sınıfı fonksiyonu o ana kadarki gişenin tüm kazancı
        System.out.println("\n--------- BU KISIM TOPLAM KAZANÇ KISMIDIR --------\n");
        rapor.getKazanc();

    }
}
