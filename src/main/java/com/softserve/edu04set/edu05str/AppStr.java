package com.softserve.edu04set.edu05str;

public class AppStr {
    public static void main(String[] args) {
		/*-
		char[] chA = { 'A', 'B', 'C', 'D', 'E', 'F', 'H' };
		System.out.println("array lenght = "+ chA.length);
		String strThird = new String(chA);
		System.out.println("strThird = " + strThird);
		String strFourth = new String(chA, 2, 4); // CDEF
		System.out.println("strFourth = " + strFourth);
		*/
		/*-
		String str = "I study Java Kava language abc";
		//int n = str.indexOf("ava"); // 9
		int n = str.lastIndexOf("ava"); // 14
		System.out.println("ava n = " + n);
		char c = str.charAt(8); // str[8] not working
		System.out.println("c = " + c);
		n = -1;
		while ((n = str.indexOf("ava", n + 1)) >=0 ) {
			System.out.println("n = " + n);
		}
		//
		String str1 = str.substring(13);     // Kava language abc
		System.out.println("str1 = " + str1);
		str1 = str1.toUpperCase();
		System.out.println("new str1 = " + str1);
		String str2 = str.substring(8, 13);
		System.out.println("str2 = " + str2);
		*/
		/*-
		String str = "\t\t   Tabulated  String\t  \n\n\r";
		System.out.println(str);
		str = str.trim();
		System.out.println(str);
		*/
		/*-
		String str = "abracadabra abba";
		System.out.println(str);
		str = str.replace("a", "--");
		//str = str.replaceAll("a\\b", "--"); // \b word boundary
		//str = str.replaceAll("\\Ba\\B", "--"); // \B no word boundary
		//str = str.replaceFirst("\\Ba", "--");
		//str = str.replaceFirst("\\Bab", "--");
		System.out.println(str);
		str = ""; // null
		System.out.println("str.isEmpty() = " + str.isEmpty());
		*/
        /*-
        String a = "a"; // What will be the results?
        String A = "A";
        String b = "a";
        System.out.println("a.equals(A) =  " + a.equals(A)); // false
        System.out.println("a.equals(b) = " + a.equals(b)); // true
        System.out.println("a.equalsIgnoreCase(A) = " + a.equalsIgnoreCase(A)); // true
        System.out.println("a.compareTo(A) = " + a.compareTo(A)); // 32
        System.out.println("a.compareToIgnoreCase(A) = " + a.compareToIgnoreCase(A)); // 0
        //
        String s = "";
        s = s + 'a' + "bcd";
        System.out.println("res = " + s);
        */
		/*-
		String a0 = new String("Java").intern(); // "Java"; // equals new String("Java");
		String a1 = "Java"; // set reference
		String a2 = new String("Java"); // create new object
		//
		System.out.println("(a0 == a1) =  " + (a0 == a1)); // true
		System.out.println("(a0 == a2) =  " + (a0 == a2)); // false
		//
		System.out.println("a0.equals(a1) =  " + a0.equals(a1)); // true
		System.out.println("a0.equals(a2) =  " + a0.equals(a2)); // true
		//
		System.out.println("a0.compareTo(a1) =  " + a0.compareTo(a1)); // 0
		System.out.println("a0.compareTo(a2) =  " + a0.compareTo(a2)); // 0
		//
		System.out.println("a0.hashCode() =  " + a0.hashCode());
		System.out.println("a1.hashCode() =  " + a1.hashCode());
		System.out.println("a2.hashCode() =  " + a2.hashCode());
		*/
		/*
		String str = "JAVA-SE,8      First.Second";
		str = str.replaceAll(" +", " ");
		System.out.println("str = " + str);
		String[] arr = str.split("-|\\.|,| ");
		for (String w : arr) {
			System.out.println(w);   // JAVA SE 8
		}
		*/
 		/*-
		final double PI = 3.1415926;
		String formatStr = "%S is =%06.2f\n";
		System.out.println("formatStr = " + formatStr);
		System.out.println("const PI = " + PI);
		String s = String.format(formatStr, "pi", PI);
		System.out.println(s);
		System.out.printf(formatStr, "pi", PI);
		System.out.printf("hashcode =%h", 640);
		*/
		// /*-
		String s1 = new String("Hello");
		String s2 = " And Goodbye";
		String str = s1 + s2;
		// str = s1.concat(s2);
		System.out.println("str = " + str);
		//
		StringBuilder sb = new StringBuilder(s1);
		sb.append(s2);
		// str = sb.toString();
		System.out.println(" sb = " + sb); // toString()
		System.out.println(" sb.length() = " + sb.length());
		System.out.println(" sb.capacity() = " + sb.capacity());
		sb.append("1234");
		System.out.println("new sb.length() = " + sb.length());
		System.out.println("new sb.capacity() = " + sb.capacity());
		System.out.println("Reverse sb = " + sb.reverse());
		//
		sb.reverse().delete(1,3);
		System.out.println("after delete sb = " + sb);
		// */
    }
}