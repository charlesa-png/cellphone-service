package com.pluralsight;

public class CellPhone {
    private int serialNumber = 0;
    private String model = "";
    private String carrier = "";
    private String phoneNumber = "";
    private String owner = "";

    public CellPhone(int serialNumber, String model, String carrier, String phoneNumber, String owner) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }
   public int getSerialNumber(){
        return serialNumber;
   }
   public String getModel(){
        return model;
   }
   public String getCarrier(){
        return carrier;
   }
   public String getPhoneNumber(){
        return phoneNumber;
   }
   public String getOwner(){
        return owner;
   }
   public void setSerialNumber(int newSerialNumber){
        this.serialNumber = newSerialNumber;
   }
   public void setModel(String newModel){
        this.model = newModel;
   }

    public void setCarrier(String newCarrier) {
        this.carrier = newCarrier;
    }
    public void setPhoneNumber(String newPhoneNumber){
        this.phoneNumber = newPhoneNumber;
    }
    public void setOwner(String ownerName){
        this.owner = ownerName;
    }
}

