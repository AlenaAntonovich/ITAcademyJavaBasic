package task1;

public class LargeDomesticTechnike extends DomesticTechnike implements VolumeImpl {
        protected int r;
        protected int b;
        protected int a;
    public LargeDomesticTechnike( final int r, final int b, final int a){
            this.r = r;
            this.b = b;
            this.a = a;
            System.out.println("Constructor of " + getName());

        }

        @Override
        public String getName () {
            return "LargeDomesticTechnike";
        }

        @Override
        public int getVolume () {
            return a * b * r;
        }
    }




