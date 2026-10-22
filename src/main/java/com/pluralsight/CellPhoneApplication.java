package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

    //imports
    CellPhone myPhone = new CellPhone(0,"", "","", "");
    Scanner myScanner = new Scanner(System.in);

    CellPhone olderPhone = new CellPhone(120052512, "iPhone 13", "TMobile", "302-223-3393", "Ama");
    CellPhone oldPhone = new CellPhone(1203240047, "iPhone 16", "TMobile", "302-339-2233", "Amanda" );
    //inputs
    System.out.println("What is the serial number?");
    int mySerialNumber = myScanner.nextInt();
        myScanner.nextLine();
    System.out.println("What model is the phone?");
    String myModel = myScanner.nextLine();
    System.out.println("What is the carrier?");
    String myCarrier = myScanner.nextLine();
    System.out.println("What is the phone number?");
    String myPhoneNumber = myScanner.nextLine();
    System.out.println("Who is the owner of the phone?");
    String name = myScanner.nextLine().trim();

    //Setters
    myPhone.setSerialNumber(mySerialNumber);
    myPhone.setModel(myModel);
    myPhone.setCarrier(myCarrier);
    myPhone.setPhoneNumber(myPhoneNumber);
    myPhone.setOwner(name);

    //getters

        display(oldPhone);

        display(olderPhone);

        oldPhone.dial(olderPhone.getPhoneNumber());
    }

    public static void display(CellPhone phone){
        System.out.println("Serial number: "+ phone.getSerialNumber());
        System.out.println("Model: "+ phone.getModel());
        System.out.println("Carrier: "+ phone.getCarrier());
        System.out.println("Phone number: "+ phone.getPhoneNumber());
        System.out.println("Owner name: "+ phone.getOwner());
    }
}
