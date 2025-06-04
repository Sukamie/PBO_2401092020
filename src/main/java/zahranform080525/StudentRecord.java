/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zahranform080525;

/**
 *
 * @author Suga
 */
public class StudentRecord {
    
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double indoGrade;
    private double scienceGrade;
    private double average;

    private static int studentCount;

    public StudentRecord() {
        //area inisialisasi kode; 
        this("Ali");
        studentCount++;
    }

    public StudentRecord(String temp) {
        studentCount++;
        this.name = temp;
    }

    public StudentRecord(String name, String address) {
        studentCount++;
        this.name = name;
        this.address = address;
    }

    public StudentRecord(double mGrade, double iGrade, double sGrade) {
        studentCount++;
        mathGrade = mGrade;
        indoGrade = iGrade;
        scienceGrade = sGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String temp) {
        address = temp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(double temp) {
        mathGrade = temp;
    }

    public double getIndoGrade() {
        return indoGrade;
    }

    public void setIndoGrade(double temp) {
        indoGrade = temp;
    }

    public double getScienceGrade() {
        return scienceGrade;
    }

    public void setScienceGrade(double temp) {
        scienceGrade = temp;
    }

    public double getAverage() {
        average = (mathGrade + indoGrade + scienceGrade) / 3;
        return average;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public void print(String temp) {
        System.out.println("Temp:" + temp);
        System.out.println("Name:" + name);
        System.out.println("Address:" + address);
        System.out.println("Age:" + age);
    }

    public void print(int temp) {
        System.out.println("Temp:" + temp);
        System.out.println("Name:" + name);
        System.out.println("Address:" + address);
        System.out.println("Age:" + age);
    }

    public void print(double iGrade, double mGrade, double sGrade) {
        System.out.println("Name:" + name);
        System.out.println("Math Grade:" + mGrade);
        System.out.println("English Grade:" + iGrade);
        System.out.println("Science Grade:" + sGrade);
    }
}
