import java.util.Scanner;

public class atm {
    private int accountNo;
    private String name;
    private int PIN;
    private float balance;
    private String mobileNo;

    public void setData(int acc, String Name, int pin, float bal, String mob) {
        accountNo = acc;
        name = Name;
        PIN = pin;
        balance = bal;
        mobileNo = mob;
    }

    public int getAccount() {
        return accountNo;
    }

    public String getName() {
        return name;
    }

    public int getPIN() {
        return PIN;
    }

    public float getBalance() {
        return balance;
    }

    public String getMob() {
        return mobileNo;
    }

    public void setMob(String mobPrev, String mobNew) {
        if (mobPrev.equals(mobileNo)) {
            mobileNo = mobNew;
            System.out.println("\n Successfully Updated");
        } else {
            System.out.println("\n Incorrect!!! old mobile no");
        }
    }

    public void cashWithdrawal(int amnt) {
        if (amnt > 0 && amnt < balance) {
            balance -= amnt;
            System.out.println("\n Collect your Cash");
            System.out.println("\n Available Balance: " + balance);
        } else {
            System.out.println("\n Insufficient Balance");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0, enterPIN;
        int enterAcc;
        atm user1 = new atm();
        user1.setData(123456789, "XYZ", 2004, 64000.00f, "9925997360");

        do {
            System.out.println("\n Welcome to ATM");
            System.out.println("\n Enter your account number:");
            enterAcc = scanner.nextInt();
            System.out.println("\n Enter Your PIN: ");
            enterPIN = scanner.nextInt();

            if ((enterAcc == user1.getAccount()) && (enterPIN == user1.getPIN())) {
                do {
                    int amount = 0;
                    String oldMob, newMob;
                    System.out.println("\n***********************");
                    System.out.println("\n Select Options ");
                    System.out.println("\n 1. Check Balance ");
                    System.out.println("\n 2. Cash Withdraw");
                    System.out.println("\n 3. Show User Details");
                    System.out.println("\n 4. Update Mobile no ");
                    System.out.println("\n 5.Exit");
                    choice = scanner.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.println("\n Your Balance is: " + user1.getBalance());
                            break;
                        case 2:
                            System.out.println("\n Enter the amount to be withdrawn: ");
                            amount = scanner.nextInt();
                            user1.cashWithdrawal(amount);
                            break;
                        case 3:
                            System.out.println("\n ****User Details*****");
                            System.out.println("\n Account no: " + user1.getAccount());
                            System.out.println("\n Name: " + user1.getName());
                            System.out.println("\n Balance: " + user1.getBalance());
                            System.out.println("\n Mobile No: " + user1.getMob());
                            break;
                        case 4:
                            System.out.println("\n Enter Old Mobile No.");
                            oldMob = scanner.next();
                            System.out.println("\n Enter New Mobile No.");
                            newMob = scanner.next();
                            user1.setMob(oldMob, newMob);
                            break;
                        case 5:
                            System.exit(0);
                        default:
                            System.out.println("Invalid data");
                    }
                } while (true);
            } else {
                System.out.println("\n User Details are Invalid");
            }
        } while (true);
    }
}


