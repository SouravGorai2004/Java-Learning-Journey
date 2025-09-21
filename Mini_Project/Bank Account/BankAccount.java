import java.util.Scanner;
import java.util.HashMap;
import java.util.stream.Stream;

class Menu {
    void displayMenu() {
        System.out.println("------------------------------");
        System.out.println("WELCOME TO XYZ BANK");
        System.out.println("------------------------------");
        System.out.println("1.Create a new account");
        System.out.println("2.Log in to existing account");
        System.out.println("3.Exit");
        System.out.printf("Please select an option : ");
    }

    void displayUserMenu(String name) {
        System.out.println("Welcome " + name);
        System.out.println("A.Withdraw");
        System.out.println("B.Deposit");
        System.out.println("C.Check Balance");
        System.out.println("D.Back to main menu");
        System.out.println("E.Exit");
        System.out.printf("Please select an option : ");

    }
}

class Account {
    private String name;
    private int acno;
    private String address;
    private String phno;
    private double balance;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void setAdd(String add) {
        this.address = add;
    }

    void setPhno(String phno) {
        this.phno = phno;
    }

    void setAccountNumber(int acno) {
        this.acno = acno;
    }

    void getBasicDetails() {
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Hello " + this.name + "! Welcome to XYZ Bank.");
        System.out.println("Your Details Are : ");
        System.out.println("Your Bank Account No is : " + this.acno);
        System.out.println("Name : " + this.name + " |  Address : " + this.address + " |  Phone No : " + this.phno);
        System.out.println("Initial Balance : " + this.balance);
        System.out.println("-------------------------------------------------------------------------------");

    }

    void setBalance(double ammount) {
        this.balance = ammount;
    }

    double getBalance() {
        return this.balance;
    }

}

class CreateAccount extends Account {
    Scanner sc = new Scanner(System.in);
    Account ac;
    private static int counter = 10000;

    void accountCreation() {
        ac = new Account();
        System.out.printf("Enter Your name : ");
        ac.setName(sc.nextLine());
        System.out.printf("Enter Your Address : ");
        ac.setAdd(sc.nextLine());
        System.out.printf("Enter Your Phone No. : ");
        ac.setPhno(sc.nextLine());
        System.out.printf("Enter your Initial Balance : ");
        ac.setBalance(sc.nextDouble());
        sc.nextLine();
    }

    Account check() {
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Check The Details :[If Correcr Press 1. Else Press 0] ");
        ac.getBasicDetails();
        System.out.println("Enter : ");
        int v = sc.nextInt();
        sc.nextLine();
        if (v == 1)
            return ac;
        else {
            System.out.println("Please try again...");
        }
        return null;
    }

    public static int generateAccountNumber() {
        return counter++;
    }

}

class Operations extends Account {
    Scanner sc = new Scanner(System.in);

    void Withdraw(Account acc) {
        System.out.printf("Enter the amount for withdraw : ");
        double amount = sc.nextDouble();
        sc.nextLine();
        if (amount > acc.getBalance()) {
            System.out.println("Insufficient Balance...");
            return;
        } else {
            acc.setBalance(acc.getBalance() - amount);
            System.out.println("Withdrawl of amount RS. " + amount + " is successfull..");
        }

    }

    void deposit(Account acc) {
        System.out.printf("Enter the amount for Deposit : ");
        double amount = sc.nextDouble();
        sc.nextLine();
        if (amount < 0) {
            System.out.println("Amount should not be less than 0....");
            return;
        } else {
            acc.setBalance(acc.getBalance() + amount);
            System.out.println("Amount of RS. " + amount + " deposited successfully...");
        }

    }
}

class BankAccount {
    public static void main(String argv[]) {
        HashMap<Integer, Account> customers = new HashMap<>();

        Menu menu = new Menu();
        CreateAccount account = new CreateAccount();
        Scanner sc = new Scanner(System.in);
        boolean ch = true;
        while (ch) {
            menu.displayMenu();
            int s = sc.nextInt();
            switch (s) {
                case 1:
                    account.accountCreation();
                    Account a = account.check();
                    if (a != null) {
                        int accountNumber = CreateAccount.generateAccountNumber();
                        a.setAccountNumber(accountNumber);
                        customers.put(accountNumber, a);
                        System.out.println("Account Created Successfully! Your Account number is : " + accountNumber);
                    }
                    break;
                case 2:
                    System.out.println("Enter Your Account Number : ");
                    int acc = sc.nextInt();
                    sc.nextLine();
                    Account acount = customers.get(acc);

                    if (acount == null) {
                        System.out.println("No account found with this number.");
                        break;
                    }

                    Operations operation = new Operations();
                    boolean usermenu = true;
                    while (usermenu) {
                        menu.displayUserMenu(acount.getName());
                        char uc = sc.next().toUpperCase().charAt(0);
                        sc.nextLine();

                        switch (uc) {
                            case 'A':
                                operation.Withdraw(acount);
                                break;
                            case 'B':
                                operation.deposit(acount);
                                break;
                            case 'C':
                                System.out.println("Your Account Balance is : " + acount.getBalance());
                                break;
                            case 'D':
                                usermenu = false;
                                break;
                            case 'E':
                                System.out.println("Thank you for visiting XYZ bank..");
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Invalid option. Try again.");
                        }
                    }
                    break; 

                case 3:
                    System.out.println("Thank you for visiting XYZ bank..");
                    System.exit(0);

            }
        }
    }

}
