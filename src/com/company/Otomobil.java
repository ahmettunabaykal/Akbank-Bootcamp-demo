package com.company;

import java.util.ArrayList;

public class Otomobil extends com.company.Arac {
    private String aracSınıfı;
    public Otomobil (String ownerName , int hgsNo, double bakiye ){
        super(ownerName, hgsNo, bakiye );
        aracSınıfı = "Otomobil";
        System.out.println( "\n Araç Sınıfı : " + aracSınıfı + "\n Araç sahibi : " + ownerName +
                "\n Araca kayıtlı hgs numarası : " + hgsNo +
                "\n Araç hgs bakiyesi : " + bakiye );
    }
    public String getAracSınıfı(){
        return this.aracSınıfı;
    }


}
