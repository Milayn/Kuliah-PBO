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
public class TokohUtama extends OrangTua{
    private Goblin goblin;
    private BolaMakhluk bolaMakhluk;
    private GrupTeman[] arrayTeman;
    
    public TokohUtama(){
    
    }
    
    public TokohUtama(int jmlTeman, Goblin goblin, BolaMakhluk bolaMakhluk){
        this.bolaMakhluk=bolaMakhluk;
        this.arrayTeman= new GrupTeman[jmlTeman];
        this.goblin= goblin;
        initTeman();
    }
    
    public void initTeman(){
        for(int i = 0; i < arrayTeman.length; i++){
            this.arrayTeman[i] = new GrupTeman(String.valueOf(i + 1));
        }
    }

    public Goblin getGoblin() {
        return goblin;
    }

    public void setGoblin(Goblin goblin) {
        this.goblin = goblin;
    }

    public BolaMakhluk getBolaMakhluk() {
        return bolaMakhluk;
    }

    public void setBolaMakhluk(BolaMakhluk bolaMakhluk) {
        this.bolaMakhluk = bolaMakhluk;
    }
    
    public GrupTeman[] getArrrayTeman(){
        return arrayTeman;
    }
    
    public void setTeman(Teman teman, int indeks){
      if(this.arrayTeman[indeks - 1].getTeman() == null){
            this.arrayTeman[indeks - 1].setTeman(teman);
        }  
    }
    
     public String info2(){
        String info = "";
        info += "========== TOKOH ============\n";
        info += "Nama Tokoh   : " + super.getNama() + "\n";
        info += "Gender Tokoh : " + super.getJenisKelamin() + "\n\n";
        info += "===Bola Makhluk=== \n" + this.bolaMakhluk.info() +"\n";
        info += "===Teman(Goblin)=== \n" + this.goblin.info() +"\n";
        
        if(arrayTeman[0].getTeman() != null){
        info += "====== TEMAN ======\n";
        for(GrupTeman teman : arrayTeman){
            info += teman.info();
        }
        }
       
        return info;
    }
}
