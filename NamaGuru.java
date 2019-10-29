
package Tugas_Praktikum;

public class NamaGuru {
     public static void main(String[] args) {
        Guru kepo = new Guru("Sistem Komputer", "Muhammad Bagus Arifin" , 22);
        kepo.info();
        System.out.println();
        
        Guru hm = new Guru("Fisika", "Diaur Rahman" , 31);
        hm.info();
        System.out.println();
        
        
        Guru apa = new Guru("Bimbingan Konseling", "Emil Bakhtiar Zulkarnain" , 36);
        apa.info();
        System.out.println();
        
        Guru uwu = new Guru("Pendidikan Kewarganegaraan", "Ria Cahya Kurnia Rahma" , 28);
        uwu.info();
     }
}
