package VolumeOfCylinderApp;

import java.util.Scanner;
public class VolumeOfCylinderApp {

    public static void main(String ... args) {
        
        float radius;
        float length;
        float area;
        float volume;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius and length of a cylinder: ");
        radius = input.nextFloat();
        length = input.nextFloat(); 

        area = (float)Math.PI * radius * radius;
        volume = area * length;

        System.out.printf("The area is %.4f%n", area);
        System.out.printf("The volume is: %.1f%n", volume);
    }
}
