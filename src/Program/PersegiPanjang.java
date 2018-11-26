package Program;

public class PersegiPanjang implements BangunDatarTest{
    private int p;
    private int l;
    private int luas;
    private int keliling;

    public PersegiPanjang(int p, int l) {
        this.p = p;
        this.l = l;
    }
        
    @Override
    public double luas() {
          return p*l;
    }

    @Override
    public double keliling() {
       return 2*(p+l); 
    }
}

