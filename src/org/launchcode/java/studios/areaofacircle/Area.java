package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Area {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String radius;
        Double dRadius;
        double area;
        String regex = "\\D";
        char[] chars;
        Matcher matcher;

        do {
            System.out.println("Enter the radius of your circle: ");
            radius = input.nextLine();
            Pattern pattern = Pattern.compile(regex);
            matcher = pattern.matcher(radius);
            chars = radius.toCharArray();
        } while (radius.length() == 0 || matcher.find());

        dRadius = Double.parseDouble(radius);
        input.close();
        area = Circle.getArea(dRadius);
        System.out.println("The area of your circle is " + area + ".");
    }
}
