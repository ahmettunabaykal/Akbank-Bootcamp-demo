package com.company;

import java.util.ArrayList;

public class Yonetim {
    private double toplamKazanc;
    private Gise gise;
    private ArrayList<Arac> arac;

    public Yonetim(Gise gise){
        this.gise = gise;
        arac = gise.getAracList();
    }

    public void getKazanc( ){
        System.out.println( "Gişenin kazancı : " + gise.getKazancGise());
    }

    public void Rapor(){
        System.out.println("\n\nGeçiş yapan araclar\n\n ");
        arac.forEach((n) -> System.out.println("Araç Sahibi : " + n.ownerName +
                "\nAraç hgs numarası : " + n.hgsNo  + "\n Arac geçiş saati : " + n.date +"\nAracın sınıfı : " + n.getAracSınıfı()
                +"\n\n <<<!!!-----------!!!>>> \n\n" ));
    }
}
