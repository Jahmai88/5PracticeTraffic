package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter You're color code");
String Pin = sc.next();

System.out.println("Next traffic light is green" + "Enter a color code");
String ValidPin= sc.next();

System.out.println("Try again please type return.");
String Date = sc.next();

System.out.println("Enter your're color code");
String Plot = sc.next();

System.out.println("Next traffic light is red" + "Enter your color code");
String Conflict =  sc.next();

System.out.println("Next traffic light is yellow");
String Blue = sc.next();
    }
}
