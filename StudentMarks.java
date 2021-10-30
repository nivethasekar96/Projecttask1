package org.avg;

import java.util.Scanner;

public class StudentMarks {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String name = sc.next();
System.out.println("STUDENT NAME:" + name);

int mark1 = sc.nextInt();
System.out.println("MARK1:" + mark1);

int mark2 = sc.nextInt();
System.out.println("MARK2:" + mark2);

double avg = (mark1 + mark2)/2;
System.out.println("AVERAGE:" + avg);

}
}
