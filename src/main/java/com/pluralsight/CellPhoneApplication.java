package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
    CellPhone myPhone = new CellPhone(0,"", "","", "");
    Scanner myScanner = new Scanner(System.in);

    System.out.println("What is the serial number?");
    int mySerialNumber = myScanner.nextInt();
        myScanner.nextLine();
    System.out.println("What model is the phone?");
    String myModel = myScanner.nextLine();
        myScanner.nextLine().trim();
    System.out.println("What is the carrier?");
    String myCarrier = myScanner.nextLine();
        myScanner.nextLine().trim();
    System.out.println("What is the phone number?");
    String myPhoneNumber = myScanner.nextLine();
        myScanner.nextLine().trim();
    System.out.println("Who is the owner of the phone?");
    String name = myScanner.nextLine().trim();

    myPhone.setSerialNumber(mySerialNumber);
    myPhone.setModel(myModel);
    myPhone.setCarrier(myCarrier);
    myPhone.
    }


}
