package string_sb;

public class StringAndMethods {
	public static void main(String[] args) {
		
		String s = "OneTwoThree";
		
		s.toUpperCase();
		System.out.println("The original string s: " + s);
		System.out.println("After calling s.toUpperCase(): " + s); //string is immutable and can't be changed
		System.out.println();
		
		String s2 = s.toUpperCase();
		System.out.println("s2 = s.touppercase(): " + s2); //using new var to hold the result
		System.out.println();
		
		s = s.toUpperCase();
		System.out.println("Now s is: " + s); //reassigning the var to different value
		System.out.println();
		
		//different references pointing to the same value will share 1 object
		String s3 = "Hello world!";
		String s4 = "Hello world!";
		System.out.println("s3 == s4: " + (s3 == s4)); //same object?
		System.out.println("s3.equals(s4): " + (s3.equals(s4))); //same data?
		System.out.println();
		
		//creating different objects with tha same value using keyword "new"
		String s5 = new String("Same text, different objects.");
		String s6 = new String("Same text, different objects.");
		System.out.println("s5 == s6: " + (s5 == s6)); //same object?
		System.out.println("s5.equals(s6): " + (s5.equals(s6))); //same data?
		System.out.println();
		
		
		System.out.println();
		
		// literal strings are managed in constant pool
		// java compiler and run-time both know about them and keep track of these literals
		// method intern asks if the string already exists in the constant pool
		// if it does, it returns the reference to that string
		// if it does not, the method puts the string to the pool and return the reference to that string
		
		String s7 = "Hello there!";
		String s8 = new String(s7);
		String s9 = new String(s7);
		System.out.println("s7 == s8: " + (s8 == s9)); //same objects?
		System.out.println("s8 == s9: " + (s8 == s9)); 
		// call to intern() will find the original literal and return the address of this string
		// the address will be assigned to s8 and s9 variables resulting in one objects shared by 2 references
		s8 = s8.intern(); 
		s9 = s9.intern();
		System.out.println("s7 == s8 after intern(): " + (s7 == s8));
		System.out.println("s8 == s9 after intern(): " + (s8 == s9));
		System.out.println();
		
		String str = "hello";
		String str1 = new String("hel") + new String("lo");
		System.out.println(str == str1);
		System.out.println("str.equils(str1): " + str1.equals(str1));
		System.out.println();
		
	}

}
