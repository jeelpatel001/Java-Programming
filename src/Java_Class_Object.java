/* ---- What is Class ---- *
* Class is derived datatype, it combines members of different datatypes into one.
Defines new datatype (primitive ones are not enough).
For Example : Car, College, Bus etc..
This new datatype can be used to create objects.
A class is a template for an object .
*
* ---- What is Object ---- *
* An Object is a key to understand Object Oriented Technology.
An entity that has state and behavior is known as an object. e.g., Mobile, Car, Door, Laptop etc 
Each and every object posses
Identity
State
Behavior */


// Create Class for Car Details or Info
class carsDetails{
    String cName = "Mercedes-Benz";
    int cQuantity = 23;
    int cModel = 2023;
}

public class Java_Class_Object {
    public static void main(String[] args) {
        // Create object obj instance of carDetails class
        carsDetails obj = new carsDetails();

        System.out.println("Car Name : " + obj.cName);
        System.out.println("Car MFG Year : " + obj.cModel);
        System.out.println("Car Total Quantity : " + obj.cQuantity);
    }
}

// Created by Bhensadadiya Jeel