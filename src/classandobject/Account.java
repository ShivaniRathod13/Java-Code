package classandobject;

public class Account {

        int acc_num;
        String name;
        String email;
        float amount;


        //object by inliz method
        void create(int a, String n, String e, float amt) {

            acc_num = a;
            name = n;
            email=e;
            amount = amt;
        }

        //deposit method
        void deposit(float amt) {
            amount = amount + amt;
            System.out.println(amt + " deposited");
        }

        //withdraw method
        void withdraw(float amt) {
            if (amount < amt) {
                System.out.println("Insufficient Balance");
            } else {
                amount = amount - amt;
                System.out.println(amt + " withdrawn");
            }
        }
        //method  check the balance
        void checkBalance(){System.out.println("Balance is: "+amount);}

        public static void main(String[] args) {
            classandobject.Account acc= new classandobject.Account();
            acc.create(123456,"rothi","rohit@gmail.com",10000);
            System.out.println(acc.acc_num+" "+acc.name+" "+acc.email+" "+ acc.amount);
            acc.deposit(675);
            acc.checkBalance();
            acc.withdraw(1000);
            acc.checkBalance();

        }
    }





