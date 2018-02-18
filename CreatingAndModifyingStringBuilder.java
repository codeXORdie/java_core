package stringbuilder;

public class CreatingAndModifyingStringBuilder {
	public static void main(String[] args) {
		
		//StringBuilder Constructors
		StringBuilder sbString = new StringBuilder("String argument.");
		StringBuilder sbChar = new StringBuilder('c');
		StringBuilder sbInt = new StringBuilder(34);
		StringBuilder empty = new StringBuilder(); //default 16
		
		//appending boolean
		System.out.println("APPEND BOOLEAN");
		boolean b = true;
		StringBuilder sb = new StringBuilder("b is ");
		sb.append(b);
		System.out.println("sb with appenden boolean: " + sb);
		System.out.println();
		
		//append text from and to particular index
		System.out.println("APPEND WITH OFFSET");
		StringBuilder sb1 = new StringBuilder("Hello");
		StringBuilder sb2 = new StringBuilder("this is the world calling.");
		System.out.println("sb1 before append: " + sb1);
		System.out.println("sb2 before append: " + sb2);
		sb1.append(sb2, 11, 17);
		System.out.println("sb1 after append: " + sb1);
		System.out.println();
		
		//deleting from to particular index
		System.out.println("DELETE WITH OFFSET");
		StringBuilder sb3 = new StringBuilder("This is not good.");
		System.out.println("sb3 before dalete: " + sb3);
		sb3.delete(8, 12);
		System.out.println("sb3 after detete: " + sb3);
		System.out.println();
		
		//inserting text
		StringBuilder sb4 = new StringBuilder("This is good!");
		System.out.println("sb4 before insert: " + sb4);
		sb4.insert(8, "very ");
		System.out.println("sb4 after insert: " + sb4);
		System.out.println();
		
		//replacing
		StringBuilder sb5 = new StringBuilder("This is not good.");
		System.out.println("sb5 before replace: " + sb5);
		sb5.replace(8, 11, "very");
		System.out.println("sb5 after replace: " + sb5);
		System.out.println();
		
		//reversing the order
		StringBuilder sb6 = new StringBuilder("reversed");
		sb6.reverse();
		System.out.println("sb6 has: " + sb6);
		System.out.println();
		
		//change a single char 
		StringBuilder sb7 = new StringBuilder("See");
		System.out.println("sb7 before setCharAt(): " + sb7);
		sb7.setCharAt(2, 'a');
		System.out.println("sb7 after setcharAt(): " + sb7);
		System.out.println();
		
		//seting text's length
		StringBuilder sb8 = new StringBuilder("This text is very very very very very long.");
		System.out.println("sb8 before setLength(): " + sb8);
		sb8.setLength(9);
		System.out.println("sb8 after setLength(): " + sb8);
		
	}

}
