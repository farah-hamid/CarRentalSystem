
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package carrentalsystem;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author rahaf
 */
public class CarRentalSystem {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        Employees emp = new Employees("farah", "rahaf", "user1", "1234");
        CustomerQueueList customerQueueList = new CustomerQueueList();
        AllCars car = new AllCars();
        double totalProfit;

        ArrayList data = new ArrayList<String>(); // to store the data in it 
        ArrayList<Employees> emOb = new ArrayList<>(); // ARRAY OBJECT EMPLOYEE
        ArrayList<Employees> temp = new ArrayList<>();// for merge sort 

        LinkedList<Car> tmp = new LinkedList<>(); // for merge sort 

        BufferedReader reader = new BufferedReader(new FileReader("dataemfile.txt"));
        String str;
        while ((str = reader.readLine()) != null) {
            // System.out.println(str);
            data.add(str);
        }

        for (int i = 0; i < data.size(); i++) { // loop for reading the file content stored in data arraylist to get th value and store it in variabls to meke the Emplooyee object

            String fname = (String) data.get(i);
            i++;

            String lname = (String) data.get(i);
            i++;

            String user = (String) data.get(i);
            i++;

            String pass = (String) data.get(i);

            //Employees(String fName, String lName, String employeeUsername, String employeePassword) 
            emOb.add(new Employees(fname, lname, user, pass));
        }

        Scanner in = new Scanner(System.in);
        int option;

        SERVCIES:
        do {
            System.out.println("------------------------RENTAL CAR APP---------------------------");
            System.out.println("───█▒▒███\n" +
"───███████\n" +
"───████████\n" +
"─███████████\n" +
"██───████████\n" +
"█─▄█▄─████████\n" +
"█─▀█▀─█████████\n" +
"██───███████████\n" +
"─█████████▓▓▓▓██\n" +
"───███████▓▓▓▓██\n" +
"───█▀▀▀▀▀███████\n" +
"───███████▓▓▓▓██\n" +
"───███████▓▓▓▓██\n" +
"───███████▓▓▓▓██\n" +
"───███████▓▓▓▓█\n" +
"───███████▓▓▄▀\n" +
"───███████▄▀\n" +
"───███████\n" +
"─█████████\n" +
"██───█████\n" +
"█─▄█▄─████\n" +
"█─▀█▀─████\n" +
"██───████▀\n" +
"─███████▀\n" +
"───█▒▒█▀");
            System.out.println("                                                     _________________________   \n" +
"                    /\\\\      _____          _____       |   |     |     |    | |  \\  \n" +
"     ,-----,       /  \\\\____/__|__\\_    ___/__|__\\___   |___|_____|_____|____|_|___\\ \n" +
"  ,--'---:---`--, /  |  _     |     `| |      |      `| |                    | |    \\\n" +
" ==(o)-----(o)==J    `(o)-------(o)=   `(o)------(o)'   `--(o)(o)--------------(o)--'  \n" +
"`````````````````````````````````````````````````````````````````````````````````````");
            System.out.println("1-LOG IN AS AN EMPLOYEE      2-REGISTER AS A CUSTOMER      3-EXIT");
            option = in.nextInt();
            switch (option) {
                case 1:
                    System.out.println("ENTER YOUR USERNAME: ");
                    String username = in.next();
                    System.out.println("ENTER YOUR PASSWORD: ");
                    String password = in.next();

                    for (int i = 0; i < 2; i++) {
                        if (emp.login(username, password) == false) {
                            System.out.println("SOMTHING WENT WRONG !!");
                            System.out.println("ENTER YOUR USERNAME: ");
                            username = in.next();
                            System.out.println("ENTER YOUR PASSWORD: ");
                            password = in.next();
                            continue SERVCIES;
                        }// if password or username are wrong

                    } // end of for loop

                    int cho_em = 0;
                    boolean run = true;
                    do {
                        if (emp.login(username, password)) {
                            System.out.println("--------------------------WELLCOME " + emp.getfName().toUpperCase() + "-------------------------------");
                            System.out.println("1-VIEW CARS   2-UPDATE CAR STATUS   3- VIEW AND SORT EMPLOYEES  4- VIEW AND SORT CARS    5-VIEW POTENTIAL PROFIT    6-EXIT");
                            cho_em = in.nextInt();
                            switch (cho_em) {
                                case 1:
                                    emp.viewCars();
                                    break;
                                case 2:
                                    System.out.println("ENTER THE CAR REGISTRATION NUMBER :");
                                    String reg = in.next();
                                    int index = emp.searchForCar(reg);
                                    System.out.println("ENTER THE CAR STATUS :");
                                    String status = in.next();
                                    emp.updateCarStatus(car.getCars().get(index), status);
                                    break;
                                case 3:
                                    run = true;
                                    while (run) {
                                        Scanner input = new Scanner(System.in);
                                        System.out.println("PLEAASE CHOOSE THE PREFERRED ALGROTHIM TO SORT THE NAMES");
                                        System.out.println("1- MERGE SORT ALGROTHIM   2- INSERT SORT ALGROTHIM     3-EXIT");
                                        int choice = input.nextInt();
                                        switch (choice) {
                                            case 1:
                                                long start = System.nanoTime();

                                                emp.mergeSort(emOb, temp, 0, emOb.size() - 1);

                                                for (int i = 0; i < emOb.size(); i++) {
                                                    System.out.println(emOb.get(i).getfName());
                                                }

                                                long end = System.nanoTime();
                                                System.out.println("the execution time= " + (end - start)); // to calculate time 
                                                break;

                                            case 2:
                                                long start2 = System.nanoTime(); // to calculate time 
                                                emp.insertionSort(emOb);

                                                for (int i = 0; i < emOb.size(); i++) {
                                                    System.out.println(emOb.get(i).getfName());
                                                }
                                                long end2 = System.nanoTime();
                                                System.out.println("the execution time= " + (end2 - start2)); // to calculate time 
                                                break;

                                            case 3:
                                                run = false;

                                        }//switch

                                    }//while
                                    break;
                                case 4:
                                    run = true;
                                    while (run) {
                                        Scanner input = new Scanner(System.in);
                                        System.out.println("PLEAASE CHOOSE THE PREFERRED ALGROTHIM TO SORT THE CAR MAKE");
                                        System.out.println("1- MERGE SORT ALGROTHIM   2- INSERT SORT ALGROTHIM     3-EXIT");
                                        int choice = input.nextInt();
                                        switch (choice) {
                                            case 1:
                                                long start = System.nanoTime();

                                                car.mergeSort(car.getCars(), tmp, 0, car.getCars().size() - 1);
                                                for (int i = 0; i < car.getCars().size(); i++) {
                                                    System.out.println(car.getCars().get(i).CarMake);
                                                }

                                                long end = System.nanoTime();
                                                System.out.println("the execution time= " + (end - start)); // to calculate time 
                                                break;

                                            case 2:
                                                long start2 = System.nanoTime(); // to calculate time 

                                                car.insertionSort(car.getCars());

                                                for (int i = 0; i < car.getCars().size(); i++) {
                                                    System.out.println(car.getCars().get(i).CarMake);
                                                }
                                                long end2 = System.nanoTime();
                                                System.out.println("the execution time= " + (end2 - start2)); // to calculate time 
                                                break;

                                            case 3:
                                                run = false;

                                        }//switch

                                    }//while
                                    break;

                                case 5:
                                    System.out.println(" WHAT DO YOU WANNA VIEW...     1-DAILY PROFIT      2-MONTHLY PROFIT      3-ANNUAL PROFIT");
                                    int choice = in.nextInt();

                                    if (choice == 1) {

                                        long start = System.nanoTime();

                                        totalProfit = car.linearSumRecursion(100);
                                        System.out.println("Expected DAILY profit : " + totalProfit + "SR");

                                        long end = System.nanoTime();

                                        System.out.println("the execution time fot the linearSum Recursion Algorithm= " + (end - start)); // to calculate time 
                                    } else if (choice == 2) {

                                        totalProfit = car.linearSumRecursion(100);

                                        System.out.println("Expected MONTHLY profit : " + totalProfit * 30 + "SR");

                                    } else {

                                        totalProfit = car.linearSumRecursion(100);

                                        System.out.println("Expected ANNUAL profit : " + totalProfit * 365 + "SR");

                                    }
                                    break;
                                case 6:
                                    continue SERVCIES;

                            }//end of emp switch

                        }//end of if statment

                    }//do loop
                    while (cho_em >= 1 && cho_em <= 6);// employee

                    int cho_cus;
                case 2:
                    do {
                        System.out.println("1-VIEW CARS  2-VIEW CUSTOMERS 3-SORT CUSTOMERS BY NAME 4-RENT A CAR     5-EXIT");
                        cho_cus = in.nextInt();

                        switch (cho_cus) {
                            case 1:
                                car.ViewAllCars();
                                break;
                            case 2:
                                customerQueueList.viewAllCustomer();
                                break;
                            case 3:
                                customerQueueList.sortCustomerByName();
                                break;
                            case 4:
                                System.out.println("Enter the customer license number that you want to Rent");
                                String licenseNo = in.next();
                                System.out.println("ENTER THE REGISTRATION NUMBER OF THE CAR YOU WANT TO RENT");
                                String regNo = in.next();
                                System.out.println("ENTER THE RENTAL DATE IN THIS FORMMAT MM/DD/YYYY");
                                String rentalDateOut = in.next();
                                System.out.println("ENTER THE RETURN DATE IN THIS FORMMAT MM/DD/YYYY");
                                String rentalDateReturn = in.next();
                                customerQueueList.addRentalToCustomer(licenseNo, car.rentCar(regNo, rentalDateOut, rentalDateReturn));

                                break;
                            case 5:
                                continue SERVCIES;

                        }

                    }//end of do customer
                    while (cho_cus >= 1 && cho_cus <= 5); //while customer 
                    break;

                case 3:// FROM THE WHOLE PROGRAM
                    System.exit(0);

            }// end of switch case
        }// end do 
        while (option >= 1 && option <= 3);

    }//main 

}// class
