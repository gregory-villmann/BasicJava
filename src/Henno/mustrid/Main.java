package Henno.mustrid;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        factory();
        System.out.println("----------------------------");
        singleton();
    }

    public static void factory() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the shape (RECTANGLE/CIRCLE): ");
        String userInput = reader.next();
        Shape shape1 = shapeFactory.getShape(userInput);
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

    }

    public static void singleton() {
        //Singleton eiEksisteeri = new Singleton();
        // Kuna konstruktor on 'private' ei ole võimalik singletoni nii luua

        Singleton esimene = Singleton.getInstance();

        Singleton teine = Singleton.getInstance();

        System.out.println(esimene == teine ? "ON SAMAD" : "EI OLE SAMAD!");
        // Logib "ON SAMAD"
    }
}
