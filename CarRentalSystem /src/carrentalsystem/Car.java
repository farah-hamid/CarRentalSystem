/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

import java.util.*;

/**
 *
 * @author rahaf
 */
public class Car implements Comparable<Car>{

 
protected String CarMake ,CarModel ,CarType ,CarColour,CarRegNo, status;
protected int CarYear ;
protected double CarPricePerDay;


    

/**
     *
     * @param CarMake
     * @param CarModel
     * @param CarType
     * @param CarColour
     * @param CarRegNo
     * @param status
     * @param CarYear
     * @param CarPricePerDay
     */
    
    public Car(String CarMake, String CarModel, String CarColour, String CarType, int CarYear, String CarRegNo, double CarPricePerDay, String status) {
        this.CarMake = CarMake;
        this.CarModel = CarModel;
        this.CarColour = CarColour;
        this.CarType = CarType;
        this.CarYear = CarYear;
        this.CarRegNo = CarRegNo;
        this.CarPricePerDay = CarPricePerDay;
        this.status = status;
    }

    Car() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    

    /**
     *
     * @return String of Car Make
     */
   
    public String getCarMake() {
        return CarMake;
    }

     /**
     *
     * @param CarMake
     */ 
    public void setCarMake(String CarMake) {
        this.CarMake = CarMake;
    }
     /**
     *
     * @return String of Car Model
     */   
    
    public String getCarModel() {
        return CarModel;
    }
    /**
     *
     * @param CarModel
     */ 
    public void setCarModel(String CarModel) {
        this.CarModel = CarModel;
    }
    /**
     *
     * @return String of Car Colour
     */   
    
    public String getCarColour() {
        return CarColour;
    }
    /**
     *
     * @param CarColour
     */ 
    public void setCarColour(String CarColour) {
        this.CarColour = CarColour;
    }
    /**
     *
     * @return String of Car Type
     */   
    
    public String getCarType() {
        return CarType;
    }
    /**
     *
     * @param CarType
     */ 
    public void setCarType(String CarType) {
        this.CarType = CarType;
    }
    /**
     *
     * @return int of Car year
     */   
    
    public int getCarYear() {
        return CarYear;
    }
    /**
     *
     * @param CarYear
     */ 
    public void setCarYear(int CarYear) {
        this.CarYear = CarYear;
    }
    /**
     *
     * @return String of Car Registration number
     */   
    
    public String getCarRegNo() {
        return CarRegNo;
    }
    /**
     *
     * @param CarRegNo
     */ 
    public void setCarRegNo(String CarRegNo) {
        this.CarRegNo = CarRegNo;
    }
    /**
     *
     * @return double of Car price per day 
     */  
    public double getCarPricePerDay() {
        return CarPricePerDay;
    }
    /**
     *
     * @param CarPricePerDay
     */ 
    public void setCarPricePerDay(double CarPricePerDay) {
        this.CarPricePerDay = CarPricePerDay;
    }
    /**
     *
     * @return String of Car status 
     */ 
    public String getStatus() {
        return status;
    }
    /**
     *
     * @param status
     */ 
    public void setStatus(String status) {
        this.status = status;
    }


    
    @Override
    public int compareTo(Car o) {
       if (this.CarMake.compareToIgnoreCase(o.CarMake)>0){
            // if current object is greater,then return 1
            return 1;
        }
        else if (this.CarMake.compareToIgnoreCase(o.CarMake)<0) {
            // if current object is greater,then return -1
            return -1;
        }
        else {
            // if current object is equal to o,then return 0
            return 0;
        }
    }
    
}