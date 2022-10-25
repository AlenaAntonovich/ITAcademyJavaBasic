package task2;

public class FixedDeposit extends Saving{
    @Override
    public void deposit(float amount) {
        super.deposit(amount);
    }

    public FixedDeposit(int acctNum, String name) {
                super(acctNum, name);

            this.interestRate = 4.0f;
        }
    }

