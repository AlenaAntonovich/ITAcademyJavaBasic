package task2;

public class Account {
    String name;
    int acctNum;
    float balance;
    float interestRate;
            public Account(int acctNum, String name) {
            this.acctNum = acctNum;
            this.name = name;
            this.balance = 10.0f;
            this.interestRate = 20.0f;
        }

        public float interestPerYear() {
            return balance * interestRate;
        }

        public void deposit(float amount) {
                System.out.println(interestPerYear());
            }

            }



