package prac;
import java.util.*;

import java.util.Scanner;

public class example {

	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		System.out.println("number");
		int n=d.nextInt();
		System.out.println("text");
		String t=d.next();
		d.nextLine();
		System.out.println("line");
		String line=d.nextLine();
		System.out.println(n);
		System.out.println(t);
		System.out.println(line);
	}

}
