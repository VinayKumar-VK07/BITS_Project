package day6.Management;

public class Student {

    public String name = "Student1";
    private String subject = "Java";
    protected double amount = 50000;
    String department = "CSE";

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Subject: " + subject);
        System.out.println("Amount: " + amount);
        System.out.println("Department: " + department);
    }
        
}
