/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_Praktikum;

/**
 *
 * @author ica
 */
public class Guru extends Halokes{
    private String Matpel;
    
    //Konstruktor
    public Guru(String Matpel,String nama, int usia){
        super(nama,usia);
        this.Matpel= Matpel;
    }
    //Metode
    public void info(){
        System.out.println("=== NAMA GURU DI SMK TELKOM MALANG ===");
        System.out.println("Mata Pelajaran : " + this.Matpel);
        super.info();
        
        
    }  
    
}
