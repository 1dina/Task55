import java.util.ArrayList;
import java.util.Scanner;

public class Main  {
    public enum Shape {
        CIRCLE,RECTANGLE
    }
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("which shape do you want to get its area ?\n1:Circle\n2:rectangle");
        String shape = in.next();
        shape=shape.toUpperCase();


        getArea obj;
        obj =new getArea() {

            @Override
            public void Area(int radius) {

                double Area = pi * radius * radius;
                System.out.println("The area of circles =" + Area);

            }

            @Override
            public void Area(int width, int length) {
                double Area = width * length;
                System.out.println("The area of rectangular = " + Area);
            }

        };
        if (shape.equals(Shape.CIRCLE.toString())){
            System.out.println("please enter how many circles ?");
            int length = in.nextInt();
            ArrayList<Integer> list = new ArrayList();
            System.out.println("Please enter the raduis :");
            for (int i = 0; i < length; i++) {
                int radius = in.nextInt();
                list.add(radius);}
            for (int i = 0; i < length; i++) {
                obj.Area(list.get(i));


        }}else {System.out.println("Please enter the width :");
                int width = in.nextInt();
                System.out.println("Please enter the length :");
                int length = in.nextInt();
                obj.Area(width, length);}





    }


    //1-Abstraction
    //2-Compilation
    //3-At compile time
    //4-Encapsulation
    //5-True
}
