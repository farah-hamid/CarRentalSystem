/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

import java.util.*;

/** 
 * This class is used to store the rented cars, and contains information for the dates and car state.
 * @author miccr
 */
public class Rental extends Car {
    private String RentalDateOut;
    private String RentalDateReturn;
    private double TotalPrice;
    private Payment payment;
    
    //private Boolean RentalCarStatus;

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
    

   public Rental(String RentalDateOut, String RentalDateReturn,String CarMake, String CarModel, String CarColour, String CarType, int CarYear, String CarRegNo, double CarPricePerDay, String status){  
       super(CarMake, CarModel, CarColour, CarType, CarYear, CarRegNo, CarPricePerDay, status);
       this.RentalDateOut = RentalDateOut;
       this.RentalDateReturn = RentalDateReturn;
    }
   
   
   public void setRentalDateOut(String RentalDateOut) {
        this.RentalDateOut = RentalDateOut;
    }
   

   public void setRentalDateReturn(String RentalDateReturn) {
        this.RentalDateReturn = RentalDateReturn;
    }
   
  /* public void SetRentalCarStatus(Boolean RentalCarStatus){
       this.RentalCarStatus = RentalCarStatus;
   } */
   
  
   public void getRentalDateOut() {
        System.out.println(RentalDateOut);
    }
   
 
   public void getRentalDateReturn() {
        System.out.println(RentalDateReturn);
    }

    public double getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(double TotalPrice) {
        this.TotalPrice = TotalPrice;
    }
   

  /* public Boolean getRentalCarStatus(Boolean RentalCarStatus){
       return this.RentalCarStatus;
   } */

  /*  public void view_Dates_and_CarState(){
        System.out.println("Rental{" + "RentalDateOut=" + RentalDateOut + ", RentalDateReturn=" + RentalDateReturn + ", RentalCarStatus=" + RentalCarStatus + '}');
    } */
   
    @Override
    public String toString() {
        return "            CAR INFORMATION               " +"\n-----------------------------------------"+"\nCAR MAKE : " + CarMake +"\nCAR MODEL : " + CarModel+"\nCAR COLOUR : " +CarColour+"\nCAR TYPE : " + CarType+"\nCAR YEAR : " + CarYear+"\nCAR REGISTRATION NUMBER : " + CarRegNo+"\nCAR PRICE PER DAY : " + CarPricePerDay+"\nCAR STATUS : " 
                + status+"\nCAR RENTAL DATE OUT : "+RentalDateOut+"\nCAR RENTAL DATE RETURN : "+RentalDateReturn+"\n-----------------------------------------";
    }
   



   
   
   
}//class