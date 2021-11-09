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
public class Singa extends Binatang implements IKarnivora{
    private String suara;
    private String warnaBulu;
    
    public Singa(String nama, int jmlKaki, String suara, String warnaBulu){
        super.nama= nama;
        super.jmlKaki = jmlKaki;
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }
    
    @Override
    public void displayBinatang() {
        System.out.println("Aku adalah Singa.");
    }

    @Override
    public void displayMakan() {
        System.out.println("Singa merupakan hewan pemakan daging(karnivora)");
    }
    
    public void displayData(){
        System.out.println("Namaku "+ super.getNama()+".");
        System.out.println("Aku memiliki kaki yang berjumlah "+ super.getKaki()+".");
        System.out.println("Suaraku "+ this.suara+".");
        System.out.println( this.warnaBulu + " adalah warna buluku.");
    }
    
}
