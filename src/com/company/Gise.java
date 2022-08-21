package com.company;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

public class Gise {
    private int gecisSayısı;
    final private double otomobilGecisUcreti = 10;
    final private double minibusGecisUcreti = 20;
    final private double otobusGecisUcreti = 30;
    private double kazanc;
    private ArrayList<Arac> aracList = new ArrayList<Arac>();
    public Gise(){
        this.gecisSayısı = 0;
        this.kazanc = 0;
    }

    public void aracGecis (Arac arac){
        String gecisZamanı = "";

        // 1 saniye bekleme süresi - araçların aynı anda geçmemesi için
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){};


        if ( arac instanceof Otomobil){
            arac.bakiye = arac.bakiye - otomobilGecisUcreti;
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            gecisZamanı = formatter.format(date);
            arac.date.add(gecisZamanı);
            gecisSayısı++;
            kazanc = kazanc + otomobilGecisUcreti;
        }
        else if ( arac instanceof Minibus){
            arac.bakiye = arac.bakiye - minibusGecisUcreti;
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            gecisZamanı = formatter.format(date);
            arac.date.add(gecisZamanı);
            gecisSayısı++;
            kazanc = kazanc + minibusGecisUcreti;
        }
        else{
            arac.bakiye = arac.bakiye - otobusGecisUcreti;
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            gecisZamanı = formatter.format(date);
            arac.date.add(gecisZamanı);
            gecisSayısı++;
            kazanc = kazanc + otobusGecisUcreti;
        }
        System.out.println("\n\n ---- GEÇİŞ YAPAN ARACIN BİLGİLERİ ------\n\n");
        System.out.println("Araç Sahibi : " + arac.ownerName + "\n Araç HGS no : " + arac.hgsNo +" \n Kalan bakiye :" + arac.bakiye
                + "\nGeciş zamani :" + gecisZamanı + "\nAracın Sınıfı : " + arac.getAracSınıfı());
            aracList.add(arac);
    }

        public double getKazancGise(){
        return kazanc;
        }

        public ArrayList<Arac> getAracList() {
            return aracList;
        }
}
