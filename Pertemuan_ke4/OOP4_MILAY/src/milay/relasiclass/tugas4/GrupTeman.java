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
public class GrupTeman {
    private String nomor;
    private Teman teman;
    
    public GrupTeman(){
    
    }

    public GrupTeman(String nomor) {
        this.nomor = nomor;
    }
    
    
    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public Teman getTeman() {
        return teman;
    }

    public void setTeman(Teman teman) {
        this.teman = teman;
    }
    
    public String info(){
        String info = "";

        if(this.teman != null){
            info += teman.info()+ "\n";
        }
        return info;
    }
}
