/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

/**
 *
 * @author amal
 */
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;


public class Payment {

    private String paymentCreditCardNo;
    private double paymentAmount;
    private String paymentDate;
    private String paymentCreditCardType;
    private String paymentNameOnCredit;
    Scanner input = new Scanner(System.in);

    public Payment(String paymentCreditCardNo, double paymentAmount, String paymentCreditCardType, String paymentNameOnCredit) {
        this.paymentCreditCardNo = paymentCreditCardNo;
        this.paymentAmount = paymentAmount;
        this.paymentCreditCardType = paymentCreditCardType;
        this.paymentNameOnCredit = paymentNameOnCredit;
    }

    Payment() {
      
    }

    public void viewPayment() {
        System.out.println("Payment CreditCard No: \t" + this.paymentCreditCardNo);
        System.out.println("Payment CreditCard Type: \t" + this.paymentCreditCardType);
        System.out.println("Payment Name OnCredit Card: \t" + this.paymentNameOnCredit);
        System.out.println("Payment Amount:\t" + this.paymentAmount);
        System.out.println("Payment Date:\t" + this.paymentDate);

    }

    public void makePayment() {
        System.out.println("CARD NUMBER: ");
        this.paymentCreditCardNo = input.next();
        System.out.println("CARDHOLDER NAME: ");
        this.paymentNameOnCredit = input.next();

    }

    public String getPaymentCreditCardNo() {
        return paymentCreditCardNo;
    }

    public void setPaymentCreditCardNo(String paymentCreditCardNo) {
        this.paymentCreditCardNo = paymentCreditCardNo;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentCreditCardType() {
        return paymentCreditCardType;
    }

    public void setPaymentCreditCardType(String paymentCreditCardType) {
        this.paymentCreditCardType = paymentCreditCardType;
    }

    public String getPaymentNameOnCredit() {
        return paymentNameOnCredit;
    }

    public void setPaymentNameOnCredit(String paymentNameOnCredit) {
        this.paymentNameOnCredit = paymentNameOnCredit;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

}