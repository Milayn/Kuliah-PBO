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
public class MultipleInterfaceMul {
    public static void main(String[] args) {
        Direktur direktur = new Direktur();
        
        Sarjana sarjanaCum = new Sarjana("Dini");
        PascaSarjana masterCum = new PascaSarjana("Elok");
        
//        direktur.beriSertifikatMawapres(sarjanaCum);
        direktur.beriSertifikatMawapres(masterCum);
    
    }
}
