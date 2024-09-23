/*Q2: Define a class Student with attributes: name, age, and grade. 
 Write a parameterized constructor to initialize these attributes.
 Create an object of the class and call a method showDetails() to display the student's information.*/
package hellojava;

public class Student { 
	String name,grade;
	int age;
	public Student() {
		
	}
	public Student(String n,String g,int a)
	{
		name=n;
		grade=g;
		age=a;
	}
public void showDetail()
{
	System.out.println("Name: "+name+" Age: "+age+"Grade: "+grade);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Student obj= new Student("Bishal","A",20);
 obj.showDetail();
	}

}
