package com.company;

public class Minibus extends com.company.Arac {
    private String aracSınıfı;
    public Minibus (String ownerName , int hgsNo, double bakiye ){
        super(ownerName, hgsNo, bakiye );
        aracSınıfı = "Minibüs";
        System.out.println( "\n Araç Sınıfı : " + aracSınıfı + "\n Araç sahibi : " + ownerName +
                "\n Araca kayıtlı hgs numarası : " + hgsNo +
                "\n Araç hgs bakiyesi : " + bakiye );
    }
    public String getAracSınıfı(){
        return this.aracSınıfı;
    }


}