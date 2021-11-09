/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasOOP10_milay;

/**
 *
 * @author VivoBook
 */
public class Gorilla extends Binatang implements IKarnivora, IHerbivora{
    private String suara;
    private String warnaBulu;
    
    public Gorilla(String nama, int jmlKaki, String suara, String warnaBulu){
        super.nama = nama;
        super.jmlKaki = jmlKaki;
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }
    
    @Override
    public void displayBinatang() {
        System.out.println("Aku adalah Gorilla.");
    }

    @Override
    public void displayMakan() {
        System.out.println("Gorilla merupakan hewan omnivora.");
        System.out.println("Omnivora adalah pemakan daging(karnivora) sekaligus pemakan tumbuhan(herbivora).");
    }
    
    public void displayData(){
        System.out.println("Namaku "+ super.getNama()+".");
        System.out.println("Aku memiliki kaki yang berjumlah "+ super.getKaki()+".");
        System.out.println("Suaraku "+ this.suara+".");
        System.out.println( this.warnaBulu + " adalah warna buluku.");
    
    }
    
}
