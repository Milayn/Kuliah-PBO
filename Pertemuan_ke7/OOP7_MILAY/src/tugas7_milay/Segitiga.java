/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas7_milay;

/**
 *
 * @author VivoBook
 */
public class Segitiga {
    private int sudut;
    
    public int totalSudut(int sudutA){
        sudut = 180 - sudutA;
        return sudut;
    }
    
    public int totalSudut(int sudutA, int sudutB){
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }
    
    public int keliling(int sisiA, int sisiB, int sisiC){
        int keliling  = sisiA + sisiB + sisiC;
        return keliling;
    }
    
    public double keliling(int sisiA, int sisiB){ 
        double c = Math.sqrt((sisiA*sisiA)+(sisiB*sisiB));
        double keliling  =  c + sisiA + sisiB;
        return keliling;
    }
}
