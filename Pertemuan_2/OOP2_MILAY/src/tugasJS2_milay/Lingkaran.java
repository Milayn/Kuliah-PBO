/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasJS2_milay;

/**
 *
 * @author VivoBook
 */
public class Lingkaran {
    public double r;
    
    public double hitungLuas(double r){
        if(r%7==0){
            return r*(r/7)*22;
        }else{
            return 3.14*r*r;
        }
    }
    
    public double hitungKeliling(double r){
        if(r%7==0){
            return r/7*2*22;
        }else{
            return 2*3.14*r;
        }
    }
    
    public String getPhi(double r){
        if(r%7==0){
            return "22/7";
        }else{
            return "3.14";
        }
    }
    
    public void tampilData(){
        System.out.println("Jari-Jari: "+r);
        System.out.println("Phi      : "+getPhi(r));
        System.out.println("Luas     : "+hitungLuas(r));
        System.out.println("Keliling : "+hitungKeliling(r));
    }
}
