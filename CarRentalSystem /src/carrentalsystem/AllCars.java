/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author rahaf
 */
public class AllCars {

    /**
     * this method views all storing cars in the system
     */
    private LinkedList<Car> cars = new LinkedList<>();
    Stack<Rental> customerRentals;
    static Scanner in = new Scanner(System.in);

    public AllCars() {
        cars.add(new Car("Toyota", "Camry", "Red", "Sedan", 2021, "TCB123415856", 250, "Available"));
        cars.add(new Car("Hyundai", "Kona", "Black", "Small SUV", 2022, "HKB77567891324", 300, "Available"));
        cars.add(new Car("Ford", "Escape", "White", "Crossover", 2022, "FEC567891324", 250, "Available"));
        cars.add(new Car("Pagani", "RAV4", "Green", "Crossover", 2023, "PAG85672544", 150, "Available"));
        cars.add(new Car("Acura", "Camry", "Red", "Sedan", 2023, "ACU121234556", 250, "Available"));
        cars.add(new Car("Geely", "Geely", "Black", "Small SUV", 2022, "GEE77567123454", 300, "Available"));
        cars.add(new Car("Suzuki", "Suzuki", "White", "Crossover", 2022, "SUZ567891324", 250, "Available"));
        cars.add(new Car("Nissan", "RAV4", "Green", "Crossover", 2023, "NIS8612345544", 150, "Available"));
        cars.add(new Car("Aston Martin", "Aston Martin", "Red", "Sedan", 2021, "AST123415856", 250, "Available"));
        cars.add(new Car("Lexus", "Lexus", "Red", "Small SUV", 2022, "LEX12345678765", 300, "Available"));
        cars.add(new Car("Mitsubishi", "Mitsubishi", "White", "Crossover", 2022, "MIT12345678", 250, "Available"));
        cars.add(new Car("Cadillac", "Cadillac", "Green", "Crossover", 2023, "CAD85672544", 150, "Available"));
        cars.add(new Car("GMC", "GMC", "Red", "Sedan", 2023, "GMC145678956", 250, "Available"));
        cars.add(new Car("Porsche", "Geely", "Black", "Small SUV", 2022, "PRO77567123454", 300, "Available"));
        cars.add(new Car("Saab", "Saab", "Black", "Saab", 2022, "SAA567891324", 250, "Available"));
        cars.add(new Car("Rolls Royce", "Rolls Royce", "Green", "Sedan", 2023, "ROL8612345544", 150, "Available"));
        cars.add(new Car("Fiat", "Fiat", "Red", "Sedan", 2021, "FIT123415856", 250, "Available"));
        cars.add(new Car("Renault", "Renault", "Black", "Small SUV", 2022, "RAS749704780924", 300, "Available"));
        cars.add(new Car("Ford", "Escape", "Red", "Crossover", 2022, "FGF56343534624", 250, "Available"));
        cars.add(new Car("Pagani", "RAV4", "Green", "Crossover", 2023, "LAS85672544", 150, "Available"));
        cars.add(new Car("Acura", "Camry", "Black", "Sedan", 2023, "RTY121234556", 250, "Available"));
        cars.add(new Car("Geely", "Geely", "Blue", "Small SUV", 2022, "WER7757653454", 300, "Available"));
        cars.add(new Car("Suzuki", "Suzuki", "White", "Crossover", 2022, "STR567891324", 250, "Available"));
        cars.add(new Car("Nissan", "RAV4", "Green", "Crossover", 2023, "HUJ8344334544", 150, "Available"));
        cars.add(new Car("Aston Martin", "Aston Martin", "Red", "Sedan", 2021, "ART123415856", 250, "Available"));
        cars.add(new Car("Lexus", "Lexus", "Red", "Small SUV", 2022, "LGH12345678765", 300, "Available"));
        cars.add(new Car("Mitsubishi", "Mitsubishi", "White", "Crossover", 2022, "MKJ12345678", 250, "Available"));
        cars.add(new Car("Cadillac", "Cadillac", "Gray", "Crossover", 2023, "KED85672544", 150, "Available"));
        cars.add(new Car("GMC", "GMC", "Red", "Sedan", 2023, "GUM145678956", 250, "Available"));
        cars.add(new Car("Porsche", "Geely", "Gray", "Small SUV", 2022, "HAT77567123454", 300, "Available"));
        cars.add(new Car("Saab", "Saab", "Black", "Saab", 2022, "HAR5674567444", 250, "Available"));
        cars.add(new Car("Rolls Royce", "Rolls Royce", "Green", "Sedan", 2023, "EAS8612345544", 150, "Available"));
        cars.add(new Car("Toyota", "Camry", "White", "Sedan", 2021, "TRE23415856", 250, "Available"));
        cars.add(new Car("Hyundai", "Kona", "Black", "Small SUV", 2022, "HFG12345691324", 300, "Available"));
        cars.add(new Car("Ford", "Escape", "White", "Crossover", 2022, "FJK563491324", 250, "Available"));
        cars.add(new Car("Pagani", "RAV4", "Green", "Crossover", 2023, "PLK234562544", 150, "Available"));
        cars.add(new Car("Acura", "Camry", "Red", "Sedan", 2023, "ASD4521234556", 250, "Available"));
        cars.add(new Car("Geely", "Geely", "Black", "Small SUV", 2022, "HBE77567123454", 300, "Available"));
        cars.add(new Car("Suzuki", "Suzuki", "White", "Crossover", 2022, "ERT567891324", 250, "Available"));
        cars.add(new Car("Nissan", "RAV4", "Green", "Crossover", 2023, "MNS8612345544", 150, "Available"));
        cars.add(new Car("Aston Martin", "Aston Martin", "Red", "Sedan", 2021, "MKL987654322", 250, "Available"));
        cars.add(new Car("Lexus", "Lexus", "Red", "Small SUV", 2022, "NMX1234568765", 300, "Available"));
        cars.add(new Car("Mitsubishi", "Mitsubishi", "White", "Crossover", 2022, "VBN9654345663", 250, "Available"));
        cars.add(new Car("Cadillac", "Cadillac", "Green", "Crossover", 2023, "ZVB82345667", 150, "Available"));
        cars.add(new Car("GMC", "GMC", "Red", "Sedan", 2023, "MNH8978675532", 250, "Available"));
        cars.add(new Car("Porsche", "Geely", "Black", "Small SUV", 2022, "LOB77567123454", 300, "Available"));
        cars.add(new Car("Saab", "Saab", "Black", "Saab", 2022, "CUS2345676514", 250, "Available"));
        cars.add(new Car("Rolls Royce", "Rolls Royce", "Green", "Sedan", 2023, "BML8687646354", 150, "Available"));
        cars.add(new Car("Fiat", "Fiat", "Red", "Sedan", 2021, "FUL3423415856", 250, "Available"));
        cars.add(new Car("Renault", "Renault", "Black", "Small SUV", 2022, "SIR749704780924", 300, "Available"));
        cars.add(new Car("Ford", "Escape", "Red", "Crossover", 2022, "BFG34567624", 250, "Available"));
        cars.add(new Car("Pagani", "RAV4", "Green", "Crossover", 2023, "LAMA85672544", 150, "Available"));
        cars.add(new Car("Acura", "Camry", "Black", "Sedan", 2023, "RTD347121234556", 250, "Available"));
        cars.add(new Car("Geely", "Geely", "Blue", "Small SUV", 2022, "SWE7757653454", 300, "Available"));
        cars.add(new Car("Suzuki", "Suzuki", "White", "Crossover", 2022, "SUL5645691324", 250, "Available"));
        cars.add(new Car("Nissan", "RAV4", "Green", "Crossover", 2023, "HEL8344334544", 150, "Available"));
        cars.add(new Car("Aston Martin", "Aston Martin", "Red", "Sedan", 2021, "BEE123415856", 250, "Available"));
        cars.add(new Car("Lexus", "Lexus", "Red", "Small SUV", 2022, "LOP2345678765", 300, "Available"));
        cars.add(new Car("Mitsubishi", "Mitsubishi", "White", "Crossover", 2022, "MAK23456678", 250, "Available"));
        cars.add(new Car("Cadillac", "Cadillac", "Gray", "Crossover", 2023, "DOE45673903", 150, "Available"));
        cars.add(new Car("GMC", "GMC", "Red", "Sedan", 2023, "LOV4423586456", 250, "Available"));
        cars.add(new Car("Porsche", "Geely", "Gray", "Small SUV", 2022, "HUN21234567", 300, "Available"));
        cars.add(new Car("Saab", "Saab", "Black", "Saab", 2022, "HEG5674345444", 250, "Available"));
        cars.add(new Car("Rolls Royce", "Rolls Royce", "Green", "Sedan", 2023, "PAR8612345544", 150, "Available"));
        cars.add(new Car("Toyota", "Camry", "White", "Sedan", 2021, "WAY23415856", 250, "Available"));
        cars.add(new Car("Hyundai", "Kona", "Black", "Small SUV", 2022, "CVB12345691324", 300, "Available"));
        cars.add(new Car("Ford", "Escape", "White", "Crossover", 2022, "DOI24561324", 250, "Available"));
        cars.add(new Car("Pagani", "RAV4", "Green", "Crossover", 2023, "MNS234562544", 150, "Available"));
        cars.add(new Car("Acura", "Camry", "Red", "Sedan", 2023, "QWE4521234556", 250, "Available"));
        cars.add(new Car("Geely", "Geely", "Black", "Small SUV", 2022, "HABI77567123454", 300, "Available"));
        cars.add(new Car("Suzuki", "Suzuki", "White", "Crossover", 2022, "SCD567891324", 250, "Available"));
        cars.add(new Car("Nissan", "RAV4", "Green", "Crossover", 2023, "KDD86456744", 150, "Available"));
        cars.add(new Car("Aston Martin", "Aston Martin", "Red", "Sedan", 2021, "LOPX987654322", 250, "Available"));
        cars.add(new Car("Lexus", "Lexus", "Red", "Small SUV", 2022, "FDH2234568765", 300, "Available"));
        cars.add(new Car("Mitsubishi", "Mitsubishi", "White", "Crossover", 2022, "HPO9654345663", 250, "Available"));
        cars.add(new Car("Cadillac", "Cadillac", "Green", "Crossover", 2023, "QTU82345667", 150, "Available"));
        cars.add(new Car("GMC", "GMC", "Red", "Sedan", 2023, "MCQ8978675532", 250, "Available"));
        cars.add(new Car("Porsche", "Geely", "Black", "Small SUV", 2022, "MNA77567123454", 300, "Available"));
        cars.add(new Car("Saab", "Saab", "Black", "Saab", 2022, "COO2345676514", 250, "Available"));
        cars.add(new Car("Rolls Royce", "Rolls Royce", "Green", "Sedan", 2023, "DSF8687646354", 150, "Available"));
        cars.add(new Car("Fiat", "Fiat", "Red", "Sedan", 2021, "IOP3423415856", 250, "Available"));
        cars.add(new Car("Renault", "Renault", "Black", "Small SUV", 2022, "OCL749704780924", 300, "Available"));
        cars.add(new Car("Ford", "Escape", "Red", "Crossover", 2022, "IND0283933020", 250, "Available"));
        cars.add(new Car("Pagani", "RAV4", "Green", "Crossover", 2023, "LOWE85456544", 150, "Available"));
        cars.add(new Car("Acura", "Camry", "Black", "Sedan", 2023, "RED347121234556", 250, "Available"));
        cars.add(new Car("Geely", "Geely", "Blue", "Small SUV", 2022, "BCM7757653454", 300, "Available"));
        cars.add(new Car("Suzuki", "Suzuki", "White", "Crossover", 2022, "OFG5645691324", 250, "Available"));
        cars.add(new Car("Nissan", "RAV4", "Green", "Crossover", 2023, "CSL38344334544", 150, "Available"));
        cars.add(new Car("Aston Martin", "Aston Martin", "Red", "Sedan", 2021, "SAD123415856", 250, "Available"));
        cars.add(new Car("Lexus", "Lexus", "Red", "Small SUV", 2022, "DIA2345678765", 300, "Available"));
        cars.add(new Car("Mitsubishi", "Mitsubishi", "White", "Crossover", 2022, "NBM23456678", 250, "Available"));
        cars.add(new Car("Cadillac", "Cadillac", "Gray", "Crossover", 2023, "DAN45673903", 150, "Available"));
        cars.add(new Car("GMC", "GMC", "Red", "Sedan", 2023, "RIS4423586456", 250, "Available"));
        cars.add(new Car("Porsche", "Geely", "Gray", "Small SUV", 2022, "SCA21234567", 300, "Available"));
        cars.add(new Car("Saab", "Saab", "Black", "Saab", 2022, "FJK5674345444", 250, "Available"));
        cars.add(new Car("Rolls Royce", "Rolls Royce", "Green", "Sedan", 2023, "SUPE4687646354", 150, "Available"));
        cars.add(new Car("Fiat", "Fiat", "Red", "Sedan", 2021, "TUI3423415856", 250, "Available"));
        cars.add(new Car("GMC", "GMC", "Red", "Sedan", 2023, "DVH145678956", 250, "Available"));
        cars.add(new Car("Renault", "Renault", "Black", "Small SUV", 2022, "CHR749704780924", 300, "Available"));
        cars.add(new Car("Rolls Royce", "Rolls Royce", "Green", "Sedan", 2023, "OPP612345544", 150, "Available"));
    }

    /**
     *
     * @return LinkedList of All Cars
     */
    public LinkedList<Car> getCars() {
        return cars;
    }

    /**
     *
     * @param cars
     */
    public void setCars(LinkedList<Car> cars) {
        this.cars = cars;
    }

    public void ViewAllCars() {
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("            CAR INFORMATION               ");
            System.out.println("-----------------------------------------");
            System.out.println("CAR MAKE : " + cars.get(i).getCarMake());
            System.out.println("CAR MODEL : " + cars.get(i).getCarModel());
            System.out.println("CAR COLOUR : " + cars.get(i).getCarColour());
            System.out.println("CAR TYPE : " + cars.get(i).getCarType());
            System.out.println("CAR YEAR : " + cars.get(i).getCarYear());
            System.out.println("CAR REGISTRATION NUMBER : " + cars.get(i).getCarRegNo());
            System.out.println("CAR PRICE PER DAY : " + cars.get(i).getCarPricePerDay());
            System.out.println("CAR STATUS : " + cars.get(i).getStatus());
            System.out.println("-----------------------------------------");
        }
    }

    public void ViewRentCars() {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i) instanceof Rental) {
                System.out.println("            CAR INFORMATION               ");
                System.out.println("-----------------------------------------");
                System.out.println(cars.get(i).toString());
                System.out.println("-----------------------------------------");
            }
        }
    }

    /**
     *
     * @param regNo this method updates car information
     */
    public void UpdateCar(String regNo) {
        for (int i = 0; i < cars.size(); i++) {
            if (regNo.equalsIgnoreCase(cars.get(i).getCarRegNo())) {
                System.out.println("WHAT DO YOU WANT TO UPDATE ? SELECT FROM THE MENU");
                System.out.println("1-CAR MAKE \n2-CAR MODEL\n3-CAR TYPE\n4-CAR COLOUR\n5-CAR YEAR\n6-CAR PRICE PER DAY\n7-CAR STATUS\n8-ALL CAR INFORMATION");
                int selection = in.nextInt();
                switch (selection) {
                    case 1:
                        System.out.println("ENTER THE CAR MAKE: ");
                        String carMake = in.next();
                        cars.get(i).setCarMake(carMake);
                        break;
                    case 2:
                        System.out.println("ENTER THE CAR MODEL: ");
                        String carModel = in.next();
                        cars.get(i).setCarModel(carModel);
                        break;
                    case 3:
                        System.out.println("ENTER THE CAR TYPE: ");
                        String carType = in.next();
                        cars.get(i).setCarType(carType);
                        break;
                    case 4:
                        System.out.println("ENTER THE CAR COLOUR: ");
                        String carColour = in.next();
                        cars.get(i).setCarColour(carColour);
                        break;
                    case 5:
                        System.out.println("ENTER THE CAR YEAR: ");
                        int carYear = in.nextInt();
                        cars.get(i).setCarYear(carYear);
                        break;
                    case 6:
                        System.out.println("ENTER THE CAR PRICE PER DAY: ");
                        double pricePerDay = in.nextDouble();
                        cars.get(i).setCarPricePerDay(pricePerDay);
                        break;
                    case 7:
                        System.out.println("ENTER THE CAR STATUS: ");
                        String carStatus = in.next();
                        cars.get(i).setStatus(carStatus);
                    case 8:
                        System.out.println("ENTER THE CAR MAKE: ");
                        carMake = in.next();
                        System.out.println("ENTER THE CAR MODEL: ");
                        carModel = in.next();
                        System.out.println("ENTER THE CAR TYPE: ");
                        carType = in.next();
                        System.out.println("ENTER THE CAR COLOUR: ");
                        carColour = in.next();
                        System.out.println("ENTER THE CAR YEAR: ");
                        carYear = in.nextInt();
                        System.out.println("ENTER THE CAR PRICE PER DAY: ");
                        pricePerDay = in.nextDouble();
                        break;

                }

            } else {
                System.out.println("WRONG REGISTRATION NUMBER !");
            }
        }
    }

    /**
     *
     * this method register a car to the system
     */
    public void RegisterCar() {
        System.out.println("ENTER CAR INFORMATION: ....");
        System.out.println("ENTER THE CAR MAKE: ");
        String carMake = in.next();
        System.out.println("ENTER THE CAR MODEL: ");
        String carModel = in.next();
        System.out.println("ENTER THE CAR TYPE: ");
        String carType = in.next();
        System.out.println("ENTER THE CAR COLOUR: ");
        String carColour = in.next();
        System.out.println("ENTER THE CAR YEAR: ");
        int carYear = in.nextInt();
        System.out.println("ENTER THE CAR REGUSTATION NUMBER: ");
        String carRegNo = in.next();
        System.out.println("ENTER THE CAR PRICE PER DAY: ");
        double pricePerDay = in.nextDouble();
        cars.add(new Car(carMake, carModel, carColour, carType, carYear, carRegNo, pricePerDay, "Available"));

    }

    /**
     *
     * @param regNo this method deletes a car from the system
     */
    public void DeleteCar(String regNo) {
        for (int i = 0; i < cars.size(); i++) {
            if (regNo.equalsIgnoreCase(cars.get(i).getCarRegNo())) {
                cars.remove(cars.get(i));
            } else {
                System.out.println("WRONG REGISTRATION NUMBER !");
            }
        }
    }

    public Rental rentCar(String regNo, String RentalDateOut, String RentalDateReturn) {
        //edit by asayal for make rental and save it in customer Rentals 
        Rental rental = null;
        for (int i = 0; i < cars.size(); i++) {
            if (regNo.equalsIgnoreCase(cars.get(i).getCarRegNo())) {
                //2 edit by asayal
                rental = new Rental(RentalDateOut, RentalDateReturn, cars.get(i).getCarMake(), cars.get(i).getCarModel(), cars.get(i).getCarColour(), cars.get(i).getCarType(), cars.get(i).getCarYear(), cars.get(i).getCarRegNo(), cars.get(i).getCarPricePerDay(), cars.get(i).getStatus());
                cars.set(i, rental);
                try {
                    // Convert String to Date
                    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
                    Date dateBefore = sdf.parse(RentalDateOut);
                    Date dateAfter = sdf.parse(RentalDateReturn);

                    // Calculate the number of days between dates
                    long timeDiff = Math.abs(dateAfter.getTime() - dateBefore.getTime());
                    long daysDiff = TimeUnit.DAYS.convert(timeDiff, TimeUnit.MILLISECONDS);
                    double totalPrice = daysDiff * cars.get(i).getCarPricePerDay();
                    System.out.println(totalPrice);

                    //3 edit by asayal 
                    rental.setTotalPrice(totalPrice);

                } catch (Exception e) {
                    e.printStackTrace();
                }//catch
                Payment payment = new Payment();
                payment.makePayment();
                //edit by asayal
                rental.setPayment(payment);

            }//if

        }//for loop
        return rental;
    }// met

    public void insertionSort(LinkedList< Car> a) {
        int i, j, k;
        Car temp;
        for (i = 1; i < a.size(); i++) {
            temp = a.get(i);

            for (j = 0; j < i; j++) {
                if (a.get(i).compareTo(temp) > a.get(i).compareTo(a.get(j))) {
                    break;
                }
            }
            for (k = i; k > j; k--) {
                a.set(k, a.get(k - 1));
            }
            a.set(j, temp);

        }
    }

    public void merge(LinkedList<Car> a, LinkedList<Car> tmpArray, int leftPos, int rightPos, int rightEnd) {
        int leftEnd = rightPos - 1;
        int tmpPos = leftPos;
        int numElements = rightEnd - leftPos + 1;
        while (leftPos <= leftEnd && rightPos <= rightEnd) {
            //a.get(leftPos) < a.get(rightPos)
            if (a.get(leftPos).compareTo(a.get(rightPos)) < 0) {
                tmpArray.add(tmpPos++, a.get(leftPos++));
            } else {
                tmpArray.add(tmpPos++, a.get(rightPos++));
            }
        }
        while (leftPos <= leftEnd) {
            tmpArray.add(tmpPos++, a.get(leftPos++));
        }
        while (rightPos <= rightEnd) {
            tmpArray.add(tmpPos++, a.get(rightPos++));
        }
        for (int i = 0; i < numElements; i++, rightEnd--) {
            a.set(rightEnd, tmpArray.get(rightEnd));
        }
    }

    public void mergeSort(LinkedList<Car> a, LinkedList<Car> tmp, int left, int right) {
        if (left < right) {
            int center = (left + right) / 2;
            mergeSort(a, tmp, left, center);
            mergeSort(a, tmp, center + 1, right);
            merge(a, tmp, left, center + 1, right);
        }
    }

    public double linearSumRecursion(int n) {     //Recursion
        if (n == 1) { //base case
            return cars.get(0).getCarPricePerDay();
        } else if (n > 0) {
            return linearSumRecursion(n - 1) + cars.get(n - 1).getCarPricePerDay();
        } else {
            return -1;
        }

    }

}//class
