/*Q1: Create a class Car with attributes: make, model, and year. Write a constructor to
initialize these attributes and a method displayDetails() to print the car's details.*/
package hellojav;

public class Car {
	String make,model;
	int year;
public Car() {
	make="America";
	model="BMW 400";
	year=2023;
	System.out.println("The car is manufacture in "+make+" and modal is "+model+" in year "+year);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Car obj= new  Car ();
	}

}
