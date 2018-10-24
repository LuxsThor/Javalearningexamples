package Themexamples;

public class StaticFInalCircle {
    public static final double pi = 3.14;
    public static int numberofCircles = 0;
    public static double area;
    private double radius;

    public StaticFInalCircle(){
        radius = 1;
        area = pi * radius;
    }

    public StaticFInalCircle(int radius) {
        radius = radius;
        area = pi * radius;
    }

    public double getRadius(){
        return radius;
    }

    public static void main(String[] args) {
        System.out.println(StaticFInalCircle.pi);
        System.out.println(StaticFInalCircle.area);
        StaticFInalCircle somecircle = new StaticFInalCircle(5);
        System.out.println(somecircle.area);
        System.out.println(StaticFInalCircle.area);
    }


}
