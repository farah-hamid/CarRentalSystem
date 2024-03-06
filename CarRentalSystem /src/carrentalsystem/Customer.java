/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Asayel
 */
// save rental of customer 
public class Customer implements Comparable<Customer> {

    private String Name, LicenseNo, Address, PhoneNo;
    private LinkedList<Rental> rentals;

    public Customer() {
    }

    public Customer(String Name, String LicenseNo, String Address, String PhoneNo) {
        this.Name = Name;
        this.LicenseNo = LicenseNo;
        this.Address = Address;
        this.PhoneNo = PhoneNo;
        rentals = new LinkedList<>();
    }

    public LinkedList<Rental> getRentals() {
        return rentals;
    }

    public void setRentals(LinkedList<Rental> rentals) {
        this.rentals = rentals;
    }
//    public void displayInfo() {
//        System.out.println("Name: \t" + this.Name);
//        System.out.println("Address: \t" + this.Address);
//        System.out.println("Phone Number: \t" + this.PhoneNo);
//        System.out.println("driving license:\t" + this.LicenseNo);
//        System.out.println("driving license:\t" + this.LicenseNo);
//
//    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getLicenseNo() {
        return LicenseNo;
    }

    public void setLicenseNo(String LicenseNo) {
        this.LicenseNo = LicenseNo;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String PhoneNo) {
        this.PhoneNo = PhoneNo;
    }

    @Override
    public String toString() {
        return "Name: " + this.Name + ", License Number: " + LicenseNo + ", Address: " + Address + ", Phone Number: " + PhoneNo;
    }

    @Override
    public int compareTo(Customer other) {
        return this.Name.compareTo(other.getName());
    }

}
