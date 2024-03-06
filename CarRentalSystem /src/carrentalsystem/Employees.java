/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

/**
 *
 * @author rahaf
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author farah
 */
public class Employees implements Comparable<Employees> {
    
    
    
    private AllCars car = new AllCars();
    private String fName;
    private String lName;
    private String employeeUsername;
    private String employeePassword;

    private ArrayList <Employees> emp = new ArrayList<>();

    
    public Employees() {

    }

    /**
     *
     * @param fName
     * @param lName
     * @param employeeUsername
     * @param employeePassword
     */
    public Employees(String fName, String lName, String employeeUsername, String employeePassword) {
        this.fName = fName;
        this.lName = lName;
        this.employeeUsername = employeeUsername;
        this.employeePassword = employeePassword;
    }


  
    /**
     *
     * @return String of first name
     */
    public String getfName() {
        return fName;
    }

    /**
     *
     * @param fName
     */
    public void setfName(String fName) {
        this.fName = fName;
    }

    /**
     *
     * @return String of last name
     */
    public String getlName() {
        return lName;
    }

    /**
     *
     * @param lName
     */
    public void setlName(String lName) {
        this.lName = lName;
    }

    /**
     *
     * @return String employee's username
     */
    public String getEmployeeUsername() {
        return employeeUsername;
    }
    
    /**
     *
     * @param employeeUsername
     */
    public void setEmployeeUsername(String employeeUsername) {
        this.employeeUsername = employeeUsername;
    }
    
    /**
     *
     * @return String employee's password
     */
    public String getEmployeePassword() {
        return employeePassword;
    }
    
    /**
     * 
     * @param employeePassword
     */
    public void setEmployeePassword(String employeePassword) {
        this.employeePassword = employeePassword;
    }

    public ArrayList<Employees> getEmp() {
        return emp;
    }

    public void setEmp(ArrayList<Employees> emp) {
        this.emp = emp;
    }
    
    


    /**
     *
     * @param car
     * @param status
     * @return Boolean to check if the method is done correctly 
     * this method updates car status 
     */
    public boolean updateCarStatus(Car car ,String status){
        if(status.equalsIgnoreCase("available")){
            car.setStatus(status); 
            return true;
        }
        else if (status.equalsIgnoreCase("not available")){
            car.setStatus(status); 
            return true;
        }
        else
            return false;
    }
    
    /**
     *this method used to fill car condition form :)
     */
    public void fillCarConditionForm(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter car status ");
        car.getCars().get(1).setStatus(in.next()); // كيف يحدد ايت سيارة ؟؟ 
        System.out.println("Enter car regriation number");
        car.getCars().get(1).setCarRegNo(in.next()); 
    }

    /**
     *
     * @param user
     * @param pass
     * @return true if the entered username and password are correct 
     */
    public boolean login(String user, String pass){
        return (user.equals(this.employeeUsername) && pass.equals(this.employeePassword));
    }

    /**
     * this method print out all the cars that are registered to the employee
     */
    public void viewCars(){
        this.car.ViewAllCars();
    }
    
    /**
     *
     * @param searchKey
     * @return index of the wanted car 
     */
    public int searchForCar(String searchKey){
        for(int i = 0 ; i < this.car.getCars().size() ; i++)
            if (car.getCars().get(i).getCarRegNo().equals(searchKey))
                return i;
        
      
        return -1;
    }


//    public static void insertionSort1( Employees employee[]) {
//        int i, j, k;
//        Employees temp;
//        for (i = 1; i < employee.length; i++){
//            temp = employee[i];
//
//            for (j = 0; j < i; j++)
//                if (employee[i].compareTo(temp) > employee[i].compareTo(employee[j]))  
//                    break;           
//
//            for (k = i; k > j; k--)
//                employee[k]=employee[k-1];
//
//            employee[j]=temp;
//        }
//
//    }  
    
    
    
    
    public  void merge(ArrayList <Employees> a, ArrayList <Employees>tmpArray, int leftPos, int rightPos, int rightEnd){
        int leftEnd = rightPos - 1;
        int tmpPos = leftPos;
        int numElements = rightEnd - leftPos + 1;
        while(leftPos <= leftEnd && rightPos <= rightEnd){
                //a.get(leftPos) < a.get(rightPos)
            if(a.get(leftPos).compareTo(a.get(rightPos))<0)
                tmpArray.add(tmpPos++, a.get(leftPos++));
            else
                tmpArray.add(tmpPos++,a.get(rightPos++));
        }
        while(leftPos <= leftEnd)
            tmpArray.add(tmpPos++ , a.get(leftPos++));
        while(rightPos <= rightEnd)
            tmpArray.add(tmpPos++, a.get(rightPos++));
        for(int i = 0; i < numElements; i++, rightEnd--)
            a.set(rightEnd, tmpArray.get(rightEnd));
    }
    
    public  void mergeSort(ArrayList <Employees> a, ArrayList <Employees> tmp, int left, int right){
        if(left < right){
            int center = (left + right)/2;
            mergeSort(a, tmp, left, center);
            mergeSort(a, tmp, center + 1, right);
            merge(a, tmp, left, center + 1, right);
        }
    }
    
    public  void insertionSort( ArrayList < Employees> a ){
        int i, j, k;
        Employees temp;
        for (i = 1; i < a.size(); i++){
            temp = a.get(i);

         for (j = 0; j < i; j++) {
             if (a.get(i).compareTo(temp) > a.get(i).compareTo(a.get(j))) {
                 break;
         }
             }
         for (k = i; k > j; k--) {
             a.set(k, a.get(k-1));
             }
         a.set(j,temp);

       }
    }

    @Override
    public int compareTo(Employees o) {
       if (this.fName.compareToIgnoreCase(o.fName)>0){
            // if current object is greater,then return 1
            return 1;
        }
        else if (this.fName.compareToIgnoreCase(o.fName)<0) {
            // if current object is greater,then return -1
            return -1;
        }
        else {
            // if current object is equal to o,then return 0
            return 0;
        }
    }

  
    
    
    
    
}
    
    

//  
//        /**
//     *
//     * @parm car
//     * @param Carstatus 
//     * @return Boolean to check if the method is done corectly 
//     * this method updates car status 
//     */
//    public boolean updateCarStatus(Car car , boolean Carstatus){
//        car.status = Carstatus;
//        if(car.status == Carstatus)
//            return true;
//        else 
//            return false;
//    }