/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasJS3_milay;

/**
 *
 * @author VivoBook
 */
public class EncapTest {
    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        encap.setName("James");
        encap.setAge(35);
        
        System.out.println("Name : " + encap.getName());
        System.out.println("Age  : "+encap.getAge());
        
        System.out.println("");
        
        EncapDemo encap2 = new EncapDemo();
        encap2.setName("Rose");
        encap2.setAge(17);
        
        System.out.println("Name : " + encap2.getName());
        System.out.println("Age  : "+encap2.getAge());
         
        System.out.println("");
        
        EncapDemo encap3 = new EncapDemo();
        encap3.setName("Mila");
        encap3.setAge(19);
        
        System.out.println("Name : " + encap3.getName());
        System.out.println("Age  : "+encap3.getAge());
        
        System.out.println("");
        
        EncapDemo encap4 = new EncapDemo();
        encap4.setName("Yuni");
        encap4.setAge(25);
        
        System.out.println("Name : " + encap4.getName());
        System.out.println("Age  : "+encap4.getAge());
    }
}
