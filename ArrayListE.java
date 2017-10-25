package arr;
import java.util.ArrayList;
import java.util.*;
public class ArrayListE {
	//public : members which can access as public,public members are visible to all other classes.
		//class : is a context of java that are used to create objects and to define object data types and methods.
		//classes are the basics of opps(object oriented programming)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Public is a keyword that is used as an access modifier for methods and variables.
		//static used to prepare a field,method or inner classes as a class field.
		//void: it is void if the method does not return a value.
	//main:it is a function name When a program starts running, it has to start execution from somewhere.
		//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.
		ArrayList <Integer> studentMarks =new  ArrayList<Integer>(); //here I'm creating an array list of student marks of type integer 
		
		 studentMarks.add (15); //creating the list objects and initializing the variables  in it 
		 studentMarks.add (25);
		 studentMarks.add (35);
		 studentMarks.add (45);
		 studentMarks.add (55);
		 
		System.out.println( "The elements present in the arraylist are :  "+studentMarks); //it prints the list of student marks
		
		// here I'm showing the number of elements present in the ArrayList
		int size = studentMarks.size();  //creating the size of the ArrayList  
		System.out.println("Size of the arraylist is :  "+size);   //it shows the size of the number of elements present in it 
		
		//here I'm displaying whether the element is found or not in the ArrayList objects
		System.out.println("Checking  whether the element is present or not : ");
		
		if(studentMarks.contains(533)) { //by using if loop taking the condition as if studentMarks contains the value it prints  
			System.out.println("The element is found"); //the value is found
			
		}
		else{
			System.out.println("The element is  not found"); //else it displays value not found 
			
		}
         
		//here I'm converting the ArrayList into Array
		Integer marks[] = studentMarks.toArray (new Integer[studentMarks.size()]); //creating a method to convert into Array by passing the arguments of studentMarks.size 
		
		System.out.println("Converting the elements of arraylist to an array"); 
		
		for(Integer student : marks){  //using for each  loop traversing the elements of the ArrayList to Array
           System.out.println(student);  
       }  
		
		//here I'm displaying  how the element is replaced by an other value
		System.out.println("ArrayList before replacing the element: " + studentMarks);  // by using  studentMarks.set(index,element)method we can replace the value
		studentMarks.set(2, 45);                                                      //here I'm replacing the third element 53 which of Array index 2 by the value 40
		System.out.println("ArrayList after replacing the element: " + studentMarks);  //it displays the list after replacing the value

		
	}

}
