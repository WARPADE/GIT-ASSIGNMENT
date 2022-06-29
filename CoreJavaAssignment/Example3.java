package com.cg.string;

public class Example3 {
	public static void main(String[] args) {
		
	
	String one="Java String pool refers to collection of Strings which are stored in heap memory";
    System.out.println(one.toLowerCase());
    System.out.println(one.toUpperCase());
    System.out.println(one.replace('a','$'));
    System.out.println(one.contains("collection"));
    String two="java string pool refers to collection of strings which are stored in heap memory";
    System.out.println(one.compareTo(two));
    System.out.println(one.equals(two));

}
}