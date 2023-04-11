package com.sachin;
import java.util.*;
class staff{
    int StaffID,salary;
    String name;
    long phno;
     public void accept(){
         Scanner sc= new Scanner(System.in);
        System.out.println("enter Staffid:");
        StaffID= sc.nextInt();
        System.out.println("Enter the name:");
        name= sc.next();
        System.out.println("Enter the salary:");
        salary= sc.nextInt();
        System.out.println("Enter the phoneno:");
        phno= sc.nextLong();
    }
     public void display(){
        System.out.println("StaffID:"+StaffID);
         System.out.println("Name:"+name);
         System.out.println("Salary:"+salary);
         System.out.println("Phone:"+phno);
    }
}
class Teaching extends staff{
    int n;
    String Domain;
    Scanner sc= new Scanner(System.in);
    public void accept(){
        super.accept();
        System.out.println("enter the publications:");
        n= sc.nextInt();
        System.out.println("enter the Domain:");
        Domain=sc.next();
    }
    public void display(){
        super.display();
        System.out.println("Publications:"+n);
        System.out.println("Domain:"+Domain);
    }

}
class technical extends staff{
    String skill;
    public void accept(){
        super.accept();
        System.out.println("Enter the skill:");
        Scanner sc= new Scanner(System.in);
        skill= sc.next();
    }
   public  void display(){
        super.display();
        System.out.println("Skill:"+skill);
    }
}
class Contract extends staff{
    int experience;
    public void accept(){
        Scanner sc= new Scanner(System.in);
        super.accept();
        System.out.println("Enter the experience:");
        experience= sc.nextInt();
    }
    public void display(){
        super.display();
        System.out.println("Experience:"+experience);
    }
}
 class staff_details {
    public static void main(String[] args) {
        Teaching ob1= new Teaching();
        System.out.println("Enter the details of teaching staff:");
        ob1.accept();
        technical ob2= new technical();
        System.out.println("Enter the details of technical staff:");
        ob2.accept();
        Contract ob3= new Contract();
        System.out.println("Enter the details of the contract staff:");
        ob3.accept();
        System.out.println("The details of the teaching staff is:");
        ob1.display();
        System.out.println("The details of the technical staff is:");
        ob2.display();
        System.out.println("The details of the contract staff is:");
        ob3.display();
    }
}
