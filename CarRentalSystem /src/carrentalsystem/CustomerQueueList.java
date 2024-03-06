/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrentalsystem;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author amal , asayel 
 */
public class CustomerQueueList {

    Queue<Customer> customerQueue = new LinkedList<Customer>();

    public CustomerQueueList() {
        customerQueue.add(new Customer("Ali Mohammed", "123456", "City Street, Riyadh, Saudi Arabia", "0555555555"));
        customerQueue.add(new Customer("Fatima Ahmed", "234567", "Tahlia Street, Jeddah, Saudi Arabia", "0555555555"));
        customerQueue.add(new Customer("Mohammed Abdullah", "345678", "Sheikh Zayed Road, Dubai, United Arab Emirates", "0555555555"));
        customerQueue.add(new Customer("Samira Ali", "456789", "Champs-Élysées, Paris, France", "0123456789"));
        customerQueue.add(new Customer("Khalid Mustafa", "567890", "Emerald Street, Cairo, Egypt", "01111111111"));
        customerQueue.add(new Customer("Nour ElDin Mahmoud", "678901", "Hamra Street, Tripoli, Libya", "0922222222"));
        customerQueue.add(new Customer("Reem Abdullah", "789012", "University Street, Riyadh, Saudi Arabia", "0555555555"));
        customerQueue.add(new Customer("Ahmed Hussein", "890123", "King Faisal Street, Dammam, Saudi Arabia", "0505555555"));
        customerQueue.add(new Customer("Zainab Ali", "901234", "Sheikh Rashid Street, Abu Dhabi, United Arab Emirates", "0555555555"));
        customerQueue.add(new Customer("Mariam Ammar", "1234567", "Gulf Street, Doha, Qatar", "0978965432"));
        customerQueue.add(new Customer("Saud Mohammed", "2345678", "Sea Street, Jeddah, Saudi Arabia", "0505555555"));
        customerQueue.add(new Customer("Lama Abdullah", "3456789", "Prince Sultan Street, Riyadh, Saudi Arabia", "0555555555"));
        customerQueue.add(new Customer("Omar Hussein", "4567890", "Nile Street, Khartoum, Sudan", "0912345678"));
        customerQueue.add(new Customer("Fatima Mahmoud", "5678901", "Al-Mashtal Street, Amman, Jordan", "0791234567"));
        customerQueue.add(new Customer("Hassan Ali", "6789012", "Al-Hashemi Street, Baghdad, Iraq", "0799999999"));
        customerQueue.add(new Customer("Laila Ahmed", "7890123", "Khalid Bin Waleed Avenue, Manama, Bahrain", "033333333"));
        customerQueue.add(new Customer("Youssef Ibrahim", "8901234", "Andalus Street, Muscat, Oman", "95888888"));
        customerQueue.add(new Customer("Aisha Abdullah", "9012345", "Salam Street, Sana'a, Yemen", "014444444"));
        customerQueue.add(new Customer("Sara Mohammed", "1234567", "Square Street, Riyadh, Saudi Arabia", "0555555555"));
        customerQueue.add(new Customer("Abdullah Mohammed", "2345678", "King Abdulaziz Road, Jeddah, Saudi Arabia", "0505555555"));
        customerQueue.add(new Customer("Mariam Ali", "3456789", "Specialized Street, Riyadh, Saudi Arabia", "0555555555"));
    }

    public void viewAllCustomer() {
        // Print out the customer queue
        System.out.println("******************************************");
        System.out.println("All Customers");
        for (Customer customer : customerQueue) {
            System.out.println(customer);
            System.out.println("Total Rental Price: " + calculateTotalRentalPrice(customer));
        }
    }

    public void sortCustomerByName() {
        // Sort the customer queue alphabetically
        customerQueue.stream().sorted().forEach(System.out::println);
    }

    // Recursion to calculate the total rental price for a customer's rentals
    public double calculateTotalRentalPrice(Customer customer) {
        double total = 0.0;
        for (Rental rental : customer.getRentals()) {
            total += rental.getTotalPrice();
        }
        return total;
    }

    public void addRentalToCustomer(String customerLicenseNo, Rental rental) {
        for (Customer customer : customerQueue) {
            if (customer.getLicenseNo().equals(customerLicenseNo)) {
                customer.getRentals().add(rental);
                System.out.println("Rental added to " + customer.getName() + "'s rental history.");
                return;
            }
        }
        System.out.println("Customer not found.");
    }

}
