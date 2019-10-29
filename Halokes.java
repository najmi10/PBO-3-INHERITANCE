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
public class Halokes {
    private String nama;
    private int usia;
    
    public Halokes(String nama, int usia){
        this.nama = nama;
        this.usia = usia;
        
    }
    public void info(){
        System.out.println("Nama Guru      : " + this.nama);
        System.out.println("Usia Guru      : " + this.usia);
    }


}

