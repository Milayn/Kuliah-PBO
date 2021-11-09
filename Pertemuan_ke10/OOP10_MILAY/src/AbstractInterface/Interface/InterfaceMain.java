/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractInterface.Interface;

/**
 *
 * @author VivoBook
 */
public class InterfaceMain {
    public static void main(String[] args) {
        Direktur direktur = new Direktur();
        
        Mahasiswa mhs = new Mahasiswa("Charlie");
        Sarjana scmd = new Sarjana("Dini");
        PascaSarjana pcmd = new PascaSarjana("Elok");
        
//          direktur.beriSertifikatCumlaude(mhs);
          direktur.beriSertifikatCumlaude(scmd);
          direktur.beriSertifikatCumlaude(pcmd);
  
}
}
