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

public class Lingkaran implements BangunDatarTest{
    private int r;
    int phi=(int) 3.14;
    private int luas;
    private int keliling;

    public Lingkaran(int r, int phi) {
        this.r = r;
        this.phi = phi;
    }

    Lingkaran(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    @Override
    public double luas() {
        return phi*r;
    }

    @Override
    public double keliling() {
        return 2*phi*r;
    }
        
    
}

