package task2;

public class Saving extends Account{
    @Override
    public float interestPerYear() {
        return super.interestPerYear();
    }

    public Saving(int acctNum, String name) {
        super(acctNum, name);
        this.interestRate = 2.0f;

    }
}
