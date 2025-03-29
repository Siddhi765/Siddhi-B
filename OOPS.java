//______________________CLASS, OBJECT, CONSTRUCTOR________________________________//
//Object Oriented Programming Language in Java
//Let consider class Lecture24 -> pen
//blue print of class pen 
// class Lecture24 {
//     String color;
//     String type; //ballpoint,gel

//     //Function of class -> action
//     public void write(){
//         System.out.println("Writing Someting in Gel pen ");
//     }
//     public void write1(){
//         System.out.println("Writing Someting in Ballpoint pen ");
//     }
//     // this -> keyword -> kis object ne call kiya he
//     public void printColorandType(){
//         System.out.println(this.color); 
//         System.out.println(this.type);
//     }
// }

// class Student{
//     String Name;
//     int RollCall;
//     public void printNameAndAge(){
//         System.out.println("Name: "+this.Name);
//         System.out.println("Roll Number: "+RollCall);
//     }
//     //Default Constructor
//     Student(){
//         System.out.println("Constructor called");
//     }
//     //Parametrized Constructor
//     Student(String Name, int RollCall){
//         //this.Name -> object ka name
//         //Name -> constructor mein call kiya hua argument
//         this.Name = Name;
//         this.RollCall = RollCall;
//     }
//     //Copy Constructor
//     //user-defined
//     //Student 3 ki info ko copy karake apni current obj mein dal raha hain
//     Student(Student S3){
//         this.Name = S3.Name;
//         this.RollCall = S3.RollCall;
//     }
// }

// public class OOPS{
//     public static void main(String args[]){
//         //create obj -> class obj = new class();
//         //new -> keyword -> To allocate memory
//         //class(); -> constructor -> to define/construct object -> same as class nasme -> dont return,no return type -> ek obj create call constructor at once 
//         Lecture24 pen1 = new Lecture24();
//         pen1.color = "Blue";
//         pen1.type = "Gel";

//         Lecture24 pen2 = new Lecture24();
//         pen2.color = "Black";
//         pen2.type = "Ballpoint";

//         pen1.printColorandType();
//         pen2.printColorandType();

//         pen1.write();
//         pen2.write1();

//         //By using Default constructor
//         Student S1 = new Student();
//         S1.Name = "Siddhi Bedge";
//         S1.RollCall = 6;
//         S1.printNameAndAge();

//         //By using parameterized constructor
//         Student S2 = new Student( "Trupti Patil",10);
//         S2.printNameAndAge();

//         //By using Copy constructor -> We copy the info from obj S1
//         //Assign the properties of S1 to S3
//         Student S3 = new Student(S1);
//         S3.printNameAndAge();
//     }
// }

//____________________________POLYMORPHISM_______________________________//
//Function overloading(Compile time), Function overriding(Run time) 
//Same function for different work -> polymorphism -> function overloading(Compile time)
// class Student{
//     String name;
//     int age;
//     double phn;

//     public void printInfo(String name){
//         System.out.println("Name: "+name);
//     }

//     public void printInfo(int age){
//         System.out.println("Age: "+age);
//     }

//     public void printInfo(String name, int age){
//         System.out.println("Name and Age is: "+name + "," + age);
//     }
// }
// public class OOPS{
//     public static void main(String args[]){
//         Student S1 = new Student();
//         S1.name = "Siddhi";
//         S1.age = 19;

//         S1.printInfo(S1.name);
//         S1.printInfo(S1.age);
//         S1.printInfo(S1.name,S1.age);
//     }
// }
//class overrides the method of the parent class -> Run time Polymorphism
// class Shape{
//     public void area(){
//         System.out.println("Display area of shape");
//     }
// }
// class Triangle extends Shape{
//     public void area(float b , float h){
//         System.out.println((1/2)*b*h);
//     }
// }
// class Circle extends Shape{
//     public void area(double r){
//         System.out.println((3.14)*r*r);
//     }
// }
// public class OOPS{
//     public static void main(String args[]){
//         Circle obj = new Circle();
//         obj.area(); 
//         obj.area(2);  
//     }
// }
//__________________________INHERITANCE________________________//
//object acquires all the properties and behaviors of its parent object automatically.
//In such a way, you can reuse, extend or modify the attributes
//____________________________Single Inheritance____________________________//
// class Shape{
//    public void area(){
//     System.out.println("Display area");
//    }
// }
// //class derived_class extends base_class
// class Triangle extends Shape{
//     public void area(int b,int h){
//         System.out.println((1/2)*b*h);
//     }
// }
// public class OOPS{
//     public static void main(String args[]){
//         Triangle obj = new Triangle();
//         obj.area(2,2);
//     }
// }
// ____________________________Multilevel Inheritance____________________________//
// class Shape{
//     public void area(){
//      System.out.println("Display area");
//     }
//  }
// //class derived_class extends base_class
// class Circle extends Shape{
//     public void area(int r){
//         System.out.println(3.14*r*r);
//     }
//     public void color(String col){
//         System.out.println(col);
//     }
// }
// class Circle1 extends Circle{
//     public void area(int r){
//         System.out.println(3.14*r*r);
//     }
//     public void color(String col){
//         System.out.println(col);
//     }
// }
// public class OOPS{
//     public static void main(String args[]){
//         Circle1 obj = new Circle1();
//         obj.area(3);
//         obj.color("Blue"); //Circle 1
//         obj.color("Red");  //Circle
//     }
// }
// ____________________________Hierachical Inheritance____________________________//
// class Shape{
//     public void area(){
//         System.out.println("Display color and area ");
//     }
// }
// class Circle extends Shape{
//     public void area(int r){
//         System.out.println(3.14*r*r);
//     }
//     public void color(String col){
//         System.out.println(col);
//     }
// }
// class Circle1 extends Shape{
//     public void area(int r){
//         System.out.println(3.14*r*r);
//     }
//     public void color(String col){
//         System.out.println(col);
//     }
// }
// public class OOPS{
//     public static void main(String args[]){
//         Circle1 obj = new Circle1();
//         obj.area();
//         obj.area(3);
//         obj.color("Blue"); //Circle 1
//         obj.color("Red");  //Circle
//     }
// }
// _______________________________PACKAGES_____________________________//
// Built-in packages - java, util, io etc.
// import java.util.Scanner;
// import java.io.IOException;
// Code is in the another file
// import java.util.*;
// import bank;
// class Shape{
//     public void area(){
//         System.out.println("Display color and area ");
//     }
// }
// class Circle extends Shape{
//     public void area(int r){
//         System.out.println(3.14*r*r);
//     }
//     public void color(String col){
//         System.out.println(col);
//     }
// }
// class Circle1 extends Shape{
//     public void area(int r){
//         System.out.println(3.14*r*r);
//     }
//     public void color(String col){
//         System.out.println(col);
//     }
// }
// public class OOPS{
//     public static void main(String args[]){
//         bank.Account account1 = new bank.Account();
//         account1.name = "Customer1";
//     }
// }
//_______________________ACCESS MODIFIRES______________________//
//Private,default,protected,Default
// class Account {
//     public String name;
//     protected String email;
//     private String password;

//     //getters & setters
//     public String getPassword(){
//         //setPassword(randomPassword);
//         return this.password;
//     }
//     public void setPassword(String pass){
//         this.password = pass;
//     }
//     //Only within the class Account
//     // int roll;
//     // private int RoomNo;
//     // public static void main(String[] args) {
//     //     Account account = new Account();
//     //     account.RoomNo = 3;
//     //     account.roll = 35;
//     // }
// }
// public class OOPS{
//     public static void main(String[] args) {
//         Account account1 = new Account();
//         account1.name = "Apana clg";
//         account1.email = "apanacollege@gmail.com";
//         System.out.println(account1.name+ " and " +account1.email);
//         account1.setPassword("abcd");
//         System.out.println(account1.getPassword());
//     }
// }
//________________________ENCAPSULATIONS___________________________//
//Process of combining data and functions into a single unit called class
//Data hiding: To restrict access to members of an object -> sensetive data don't show

//________________________ABSTRACTION___________________________//
//Show -> important details to users and do not showing non-important details to users
//Data binding: Process of binding the application UI and business logic
//1.Abstract class 2.Iterface
//===========>>>> 1.Abstract class(keyword)
// abstract class Animal{ 
//     //This class is inrelevant dont need to create an object of this class
//     abstract public void walk(); //Exists hoga but not useful
//     //We also create a constructor and static and final method 
//     Animal(){
//         System.out.println("You can create a new animal");
//     }
//     public void eat(){
//         System.out.println("Animal eats");
//     }
// }
// class Horse extends Animal{
//     Horse(){
//         System.out.println("Crated horse");
//     }
//     public void walk(){
//         System.out.println("Walks on 4 legs");
//     }
// }
// class Chicken extends Animal{
//     public void walk(){
//         System.out.println("Walks on 2 legs");
//     }
// }
// public class OOPS{
//     public static void main(String[] args) {
//         Horse horse = new Horse();
//         horse.walk();
//         horse.eat(); //Horse class inherit all properties of class Animal
//         Chicken chick = new Chicken();
//         chick.walk();
//         chick.eat();
//         //cannot instantiated becz of abstract keyword
//         //Runtime error shows -> abstract 
//         // Animal a = new Animal(); 
//         // a.walk();
//     }
// }
//===========>>>> 1.Iterface 
// interface Animal{
//     //int eyes = 2; //Fixed properties -> fix value -> static -> public for all
//     public void walk(); //Abstract function
//     //cannot make constructor in interface
//     //cannot make non-abstract or implementation function 
//     //define variables are by default public,static and final
// }
// interface Herbivore{
//     void eat(); // It is abstract or public even we dont write a keyword abstract or modifier public But in the class we must have to specify the abstdact or public 
// }
// //In java we cannot extends interfaces we implemants interfaces
// class Horse implements Animal,Herbivore{
//     public void walk(){
//         System.out.println("Walks on four legs");
//     }
//     public void eat(){
//         System.out.println("It is harbivorous animal");
//     }
// }
// public class OOPS{
//     public static void main(String[] args) {
//         Horse H1 = new Horse();
//         H1.walk();
//         H1.eat(); 
//     }
// }
//___________________________STATIC________________________//
//acessible for all -> common for that class not like public 
class Students{
    String name;
    static String school;
    //school name for all student will be same so we wuse "satic" keyword here
    public static void changeSch(){
        school = "newSchool";
    }
}
public class OOPS{
    public static void main(String[] args) {
        Students S1 = new Students();
        S1.name = "Siddhi";
        Students S2 = new Students();
        S2.name = "Trupti";
        Students.school = "JPNV"; //we can use classname.attribute becz it is accessible for all(static) with class also
        System.out.println("Student name is \'"+S1.name+"\'" + " and " +"School name is \'"+Students.school+"\'");
        System.out.println("Student name is \'"+S2.name+"\'" + " and " +"School name is \'"+Students.school+"\'");
    }
}
