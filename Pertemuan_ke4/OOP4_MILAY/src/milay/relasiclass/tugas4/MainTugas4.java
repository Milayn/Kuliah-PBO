/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package milay.relasiclass.tugas4;

/**
 *
 * @author VivoBook
 */
public class MainTugas4 {
    public static void main(String[] args) {
       
        Goblin gbln = new Goblin("Shinbi", "Hijau", "Laki-Laki", 102);
        BolaMakhluk bm = new BolaMakhluk("X-21","Hijau");
        TokohUtama tokoh = new TokohUtama( 5, gbln, bm);
        tokoh.setNama("Koo Hari");
        tokoh.setJenisKelamin("Perempuan");
        
        Teman tmn = new Teman("Lee Gaeun", "Perempuan");
        tokoh.setTeman(tmn,1);
        
        Anjing anj = new Anjing("Leo", "Korgi Pembroke Wales");
        Teman tmn2 = new Teman("Kim Hyun-Woo", "Laki-Laki", anj);
        tokoh.setTeman(tmn2,2);
        
        Teman tmn3 = new Teman("Choi Kang-Lim", "Laki-Laki");
        tokoh.setTeman(tmn3,3);
        
        Teman tmn4 = new Teman("Ian", "Laki-Laki");
        tokoh.setTeman(tmn4,4);
        
        Teman tmn5 = new Teman("Leon Raymond", "Laki-Laki");
        tokoh.setTeman(tmn5,5);
        
        System.out.println(tokoh.info2());
        
        System.out.println("--------------------------");
        
        BolaMakhluk bm2 = new BolaMakhluk("X-21","Hijau Kekuningan");
        TokohUtama tokoh2 = new TokohUtama(1, gbln, bm2);
        tokoh2.setNama("Koo Doori");
        tokoh2.setJenisKelamin("Laki-laki");
        
        System.out.println(tokoh2.info2());
        
        System.out.println("=====ORANG TUA TOKOH=====");
        OrangTua ortu = new OrangTua("Yoo Jimi","Perempuan");
        OrangTua ortu2 = new OrangTua("Koo Innam","Laki-Laki");
        System.out.println(ortu.info());
        System.out.println(ortu2.info());
        
        
        
    }
}
