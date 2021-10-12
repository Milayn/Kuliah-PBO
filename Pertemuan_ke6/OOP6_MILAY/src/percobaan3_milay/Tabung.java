/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan3_milay;

/**
 *
 * @author VivoBook
 */
public class Tabung extends Bangun{
    protected int t;

    public void setSuperPhi(double phi) {
        this.phi = phi;
    }

    public void setSuperR(int r) {
        this.r = r;
    }
    
    public void setT(int t) {
        this.t = t;
    }
    
    public void volume(){
        System.out.println("Volume Tabung adalah: "+(super.phi*super.r*super.r*this.t));
    }
}
