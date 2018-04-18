/**
 * Created by Sumit on 5/19/2017.
 */
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        double height = calcFeetAndInchesToCentimeters(5,11);
        System.out.println("My height is: " + height);

        double length = calcFeetAndInchesToCentimeters(123);
        System.out.println("Height: " + length);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        double centimeters = -1.0;
        if(feet >= 0 || (inches >=0 && inches <=12))
            centimeters = (((feet * 12) + inches) * 2.54);
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        double feet = -1.0;
        if(inches >=0){
            feet = inches / 12;
            inches = inches % 12;
        }

        return calcFeetAndInchesToCentimeters(feet,inches);
    }
}
