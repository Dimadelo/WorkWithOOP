package info.sjd;

import info.sjd.model.Circle;

public class ApplicationRunner {



    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.radius = 15.0;

        Circle circle2 = new Circle();
        circle2.radius = 20.0;

        Circle circle3 = new Circle();
        circle3.radius = 10.0;

        System.out.println("Radius of circle1 is " + circle1.radius);
        System.out.println("Radius of circle2 is " + circle2.radius);
        System.out.println("Radius of circle3 is " + circle3.radius);


    }











}