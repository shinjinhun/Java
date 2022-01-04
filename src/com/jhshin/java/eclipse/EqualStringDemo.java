package com.jhshin.java.eclipse;

public class EqualStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hello world";
        String b = new String("Hello world");
        System.out.println(a == b);
        System.out.println(a.equals(b));
	}

}
