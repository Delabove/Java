package com.codewithdelayne;
import java.awt.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

//        Primitive -simple values
//        -value will be stored in that memory location

        byte myAge = 30;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible= false;

//        Reference -complex objects
//        have to allocate memory by creating new instance
//        -stores reference to an object in memory

        Date now = new Date();
        System.out.println(now);

        Point point1 =new Point(1,1);
        Point point2 = new Point(2,2);

    }
}
