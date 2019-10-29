/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lat_5;

/**
 *
 * @author ica
 */
public class Truk {
    public int cadence;
    public int gigi;
    public int kecepatan;
    
    public Truk(int startCadence, int startKecepatan, int startGigi ){
        gigi = startGigi;
        cadence = startCadence;
        kecepatan = startKecepatan;
    }
    // truk mempunyai 4 method
    public void setGigi(int newValue){
        gigi = newValue;
    }
    public void applybreak(int decrement){
        kecepatan = decrement;
    }
    public void kecepatannaik(int increment){
        kecepatan = increment;
    }
    
}
