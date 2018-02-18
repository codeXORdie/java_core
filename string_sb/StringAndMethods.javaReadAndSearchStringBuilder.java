// These methods do not change the text in the StringBuilder!!

package stringbuilder;

public class ReadAndSearchStringBuilder {
	
	public static void main(String[] args) {
		
		//substring from given index to the end
		StringBuilder sb = new StringBuilder("This is a cut part.");
		String result = sb.substring(9);
		System.out.println("sb is: " + sb);
		System.out.println("substring from sb: " + result);
		System.out.println();
		
		//substring from and to the given indexes
		StringBuilder sb1 = new StringBuilder("Java is fun!");
		String result1 = sb1.substring(8, 11);
		System.out.println("sb1 is: " + sb1);
		System.out.println("substring feom sb1: " + result1);
		System.out.println();
		
		//extracting a char
		StringBuilder sb2 = new StringBuilder("0123456789");
		char ch = sb2.charAt(3);
		System.out.println("sb2 is: " + sb2);
		System.out.println("extracted char: " + ch);
		System.out.println();
		
		//extract several chars
		char[] charArr = new char[20];
		for(int x=0; x<charArr.length; x++) {
			charArr[x] = '+';
		}
		System.out.println("charArr before getChars(): " + new String(charArr));
		sb2.getChars(3, 7, charArr, 5);
		System.out.println("charArr after getChars(): " + new String(charArr));
		System.out.println();
		
		//searching starting index of a word
		StringBuilder sb3 = new StringBuilder("Here, There, Everywhere");
		int pos = sb3.indexOf("here");
		System.out.println("there was found at the position " + pos);
		int lastPos = sb3.lastIndexOf("here");
		System.out.println("lastIndexOf(here): " + lastPos);
		System.out.println();
		
		//length
		System.out.println("sb3 length is: " + sb3.length());
		System.out.println();
		
		//capacity
		StringBuilder sb4 = new StringBuilder();
		System.out.println("sb4 capacity is: " + sb4.capacity());
		while(sb4.capacity() < 16384) {
			int cap = sb4.capacity();
			sb4.ensureCapacity(cap + 1);
			System.out.println("sb4.capacity() now is: " + sb4.capacity());
		}
		System.out.println();
		
		//trim to size
		StringBuilder sb5 = new StringBuilder();
		System.out.println("sb5 initial capasity is: " + sb5.capacity());
		System.out.println("sb5 initial length is: " + sb5.length());
		sb5.append("01234567890123456789");
		System.out.println("sb5 capacity now is: " + sb5.capacity());
		System.out.println("sb5 length now is: " + sb5.length());
		sb5.trimToSize();
		System.out.println("sb5 capasity after trimming to size: " + sb5.capacity());
	}

}
