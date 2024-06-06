import java.util.Scanner;

class ATM {
    
    float Balance;
    int PIN ;
    String acname;
    public void checkpin(){
        System.out.println("Enter your pin: ");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if (enteredpin==PIN){
            menu();
        }
        else{
            System.out.println("Enter a valid pin");
        }}
        void menu(){
                // System.out.println("user1: ");
                // System.out.println("user2: ");
                System.out.println("Enter your choice: ");
                System.out.println("1.Check A/C Balance");
                System.out.println("2.Withdraw Money");
                System.out.println("3.Deposite Money");
                System.out.println("4.Account Holder Name");
                System.out.println("5.change the pin");
                System.out.println("6.Exit");
                Scanner sc = new Scanner(System.in);
                int opt = sc.nextInt();
                
                switch (opt) {
                        case 1:
                            checkBalance();
                            break;
                        case 2:
                            WithdrawMoney();
                            break;
                        case 3:
                            DepositeMoney();
                            break;
                        case 4:
                            ACholdername();
                            break;
                        case 5:
                            changepin();
                            break;
                        case 6:
                            checkpin();
                        default:
                            System.out.println("Enter a valid choice");
                            break;
                }


            }
            public void checkBalance(){
                System.out.println("Balance: " + Balance);
                menu();
            }
            public void WithdrawMoney(){
                System.out.println("Enter Amount of withdraw: ");
                Scanner sc = new Scanner(System.in);
                float amount = sc.nextFloat();
                if(amount>Balance){
                    System.out.println("Insufficient Balance");
                }
                else{
                    Balance = Balance - amount;
                    System.out.println("Money Withdrawn successfully ");
                }
                menu();
            }
            public void DepositeMoney(){
                System.out.println("Enter the Amount: ");
                Scanner sc = new Scanner(System.in);
                float amount = sc.nextFloat();
                Balance = Balance + amount;
                System.out.println("Money Deposited Successfully");
            }
                public void ACholdername(){
                System.out.println("AC Holder Name: " + acname);
                menu();
            }
            public void changepin(){
                System.out.println("Enter the new pin: ");
                Scanner sc = new Scanner(System.in);
                int newpin = sc.nextInt();
                PIN=newpin;
                checkpin();
                
            }
            
            
        

    }
    public class ATMMachine {
        public static void main(String[] args){
            ATM user1 = new ATM();
            user1.Balance=15000;
            user1.PIN=1234;
            user1.acname="Sukanto";
            ATM user2=new ATM();
            user2.PIN=4567;
            user2.Balance=500;
            user2.acname="Pavel Anderson";
            user1.checkpin();
            user2.checkpin();
        }
    }