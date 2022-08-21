package com.company;
import java.util.ArrayList;

public abstract class Arac {
    protected String ownerName;
    protected int hgsNo;
    protected double bakiye;
    protected int geçisSayısı;
    protected String aracSınıfı;
    ArrayList<String> date = new ArrayList<String>();

    public Arac(String ownerName, int hgsNo , double bakiye ){
        this.ownerName = ownerName;
        this. hgsNo = hgsNo;
        this.bakiye = bakiye;
        this.geçisSayısı = 0;
        this.aracSınıfı = "";

    }
    public abstract String getAracSınıfı();
}
