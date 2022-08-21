package com.company;

public class Otobus extends com.company.Arac {
    private String aracSınıfı;
    public Otobus (String ownerName , int hgsNo, double bakiye ){
        super(ownerName, hgsNo, bakiye );
        aracSınıfı = "Otobüs";
        System.out.println( "\n Araç Sınıfı : " + aracSınıfı + "\n Araç sahibi : " + ownerName +
                "\n Araca kayıtlı hgs numarası : " + hgsNo +
                "\n Araç hgs bakiyesi : " + bakiye );
    }
    public String getAracSınıfı(){
        return this.aracSınıfı;
    }


}