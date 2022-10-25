package task1;

public class Fridge extends LargeDomesticTechnike implements Volume {
    protected int c;
    protected int d;
    protected int e;
    public Fridge( final int c, final int d, final int e) {
        this.c = c;
        this.d = d;
        this.e = e;
        System.out.println("Constructor of " + getName());
    }

    @Override
    public String getName() {
        return "Fridge";
    }

    @Override
    public int getVolume() {
        return c * d * e;
    }
}


