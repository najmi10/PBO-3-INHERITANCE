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
public class TrukGunung extends Truk{
    public int seatHeight;
    public TrukGunung(int startHeight, int startCadence, int startGigi, int startKecepatan){
        super(startCadence, startKecepatan, startGigi);
        seatHeight = startHeight;
    }
    public void setHeight(int newValue){
        seatHeight = newValue;
    }
    public static void main(String[] args) {
        System.out.println("Mulai Berjalan");
        TrukGunung kepo = new TrukGunung(0,0,0,0);
        System.out.println("Gigi= " + kepo.gigi);
        System.out.println("Kecepatan= " + kepo.kecepatan);
        kepo.setGigi(2);
        kepo.kecepatannaik(4);
        System.out.println("Gigi= " + kepo.gigi);
        System.out.println("Kecepatan= " + kepo.kecepatan);
        kepo.kecepatannaik(4);
        System.out.println("Gigi= " + kepo.gigi);
        System.out.println("Kecepatan= " + kepo.kecepatan);
        
        
    }
    
}
