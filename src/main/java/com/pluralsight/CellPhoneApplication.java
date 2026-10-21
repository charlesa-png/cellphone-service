package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

    //imports
    CellPhone myPhone = new CellPhone(0,"", "","", "");
    Scanner myScanner = new Scanner(System.in);

    CellPhone oldPhone = new CellPhone(1203240047, "iPhone 13", "TMobile", "302-223-3393", "Amanda");
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

    }

    public static void display(CellPhone cellPhone){
        System.out.println("Serial number: "+ cellPhone.getSerialNumber());
        System.out.println("Model: "+ cellPhone.getModel());
        System.out.println("Carrier: "+ cellPhone.getCarrier());
        System.out.println("Phone number: "+ cellPhone.getPhoneNumber());
        System.out.println("Owner name: "+ cellPhone.getOwner());
    }

    display(myPhone);

    display(oldPhone);

}
