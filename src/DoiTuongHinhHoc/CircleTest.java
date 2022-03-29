package DoiTuongHinhHoc;

import comparable.ComparableCircle;

import java.util.Arrays;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println("Dien Tich Hinh Tron co ban kinh la " + circle.getRadius() + " bang " + circle.getArea());

        circle = new Circle("indigo", false, 3.5);
        System.out.println(circle);

        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle("indigo", false, 3.5);

        System.out.println("Pre-sorted: ");
        for (ComparableCircle circle1 : circles ){
            System.out.println(circle1);
        }

        Arrays.sort(circles);

        System.out.println("Affter-sorted");
        for (ComparableCircle circle1 : circles){
            System.out.println(circle1);
        }

    }
}
