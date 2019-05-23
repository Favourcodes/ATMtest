package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner in;
    private static float balance = 0; // initial balance to 0 for everyone
    private static int anotherTransaction;
    private static int pin;
    private static String network, MTN, Airtel;

    public static void main(String args[]){
        in = new Scanner(System.in);

        Pin();
    }




    private static void transaction(){
        // here is where most of the work is

        int choice;

        System.out.println("Please select an option");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Balance");
        System.out.println("4. Cash transfer");
        System.out.println("5. Change pin");
        System.out.println("6. Buy airtime");



        choice = in.nextInt();

        switch(choice){
            case 1:
                float amount;
                System.out.println("Please enter amount to withdraw: ");
                amount = in.nextFloat();
                if(amount > balance || amount == 0){
                    System.out.println("You have insufficient funds\n\n");
                    anotherTransaction(); // ask if they want another transaction
                } else {
                    // they have some cash
                    // update balance
                    balance = balance - amount;
                    System.out.println("You have withdrawn "+amount+" and your new balance is "+balance+"\n");
                    anotherTransaction();
                }
                break;

            case 2:
                // option number 2 is depositing
                float deposit;
                System.out.println("Please enter amount you would wish to deposit: ");
                deposit = in.nextFloat();
                // update balance
                balance = deposit + balance;
                System.out.println("You have deposited "+deposit+" new balance is "+balance+"\n");
                anotherTransaction();
                break;

            case 3:
                // this option is to check balance
                System.out.println("Your balance is "+balance+"\n");
                anotherTransaction();
                break;

            case 4:
                //this is to transfer cash
                int accNo;
                String bankName;
                System.out.println("enter the amount you want to transfer");
                amount = in.nextFloat();
                System.out.println("Enter the recipient's account number\n bank name");
                accNo = in.nextInt();
                bankName = in.nextLine();
                anotherTransaction();
                break;

            case 5:
                //this is to change pin
                int newPin;
                System.out.println("input your current pin\n");
                pin = in.nextInt();
                System.out.println("Input the pin of your choice\n");
                newPin = in.nextInt();
                System.out.println("Confirm your new pin\n");
                newPin = in.nextInt();
                System.out.println("Congratulations your pin change was successful!!\n\n");
                anotherTransaction();
                break;

            case 6:
                //to buy airtime
                int phoneNo;
                String MTN, Airtel;
                String network;
                System.out.println("Kindly enter the amount of airtime you want to buy\n");
                amount = in.nextFloat();
                System.out.println("Input the network you would like to buy from\n");
                Network();
                System.out.println("Enter the recipient's phone number to be recharged\n ");
                PhoneNumber();
                System.out.println("Airtime purchase successful, you'll receive a confirmation message shortly\n\n");
                anotherTransaction();
                break;


            default:
                System.out.println("Invalid option:\n\n");
                anotherTransaction();
                break;
        }

    }

    private static void anotherTransaction(){
        System.out.println("Do you want another transaction?\n\nPress 1 for another transaction\n2 To exit");
        anotherTransaction = in.nextInt();
        if(anotherTransaction == 1){
            transaction(); // call transaction method
        } else if(anotherTransaction == 2){
            System.out.println("Thanks for choosing us. Good Bye!");
        } else {
            System.out.println("Invalid choice\n\n");
            anotherTransaction();
        }
    }

    private static void Pin(){
        int pin;
        System.out.println("Please enter your pin");
        pin = in.nextInt();
        //to input pin by the user
        if(pin==12334){
            System.out.println("successful\n");
        }
               /* else if(pin!==12334) {
                    System.out.println("please input the correct pin");
                }*/else {
            System.out.println("Your card has been blocked\n");
        }
        transaction();
    }
    private static void Network(){
        String MTN, Airtel, Glo, Etisalat, network;
        //System.out.println("Please Enter your preferred network");
        network = in.next();
        if (network == network){
            System.out.println("successful\n");
        }else {
            System.out.println(" The network is not available, \nPlease check your network selection\n");
        }

    }
    private static void PhoneNumber(){
       String number =  "08068758613";
       String phone ;
        System.out.println("Please Enter your phone number");
        String newNumber = in.next();
     /*  if (newNumber.equals(number) ){
            System.out.println("successful\n");
        }else {
            System.out.println("Number ERROR, \nPlease check your PHONE NUMBER\n");
        }*/
    }

    private static void Numbers(){

    }
}