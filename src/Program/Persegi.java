/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Program;

/**
 *
 * @author LENOVO
 */
public class Persegi implements BangunDatarTest{
    private int s;

    public Persegi(int s) {
        this.s = s;
    }
    
   @Override
   public double luas(){
       return s*s;
   }
   
   @Override
   public double keliling(){
       return 4*s;
   }
}


