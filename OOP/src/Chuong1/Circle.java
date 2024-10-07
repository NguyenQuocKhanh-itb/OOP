package Chuong1;

public class Circle {
    private double radius;
    private String color;
    public Circle(){
        radius = 1.0;
        color = "red";

    }
    // xay dung mot the hien voi ban kinh va mau sac
    public Circle(double r) {
        radius = r;
        color = "red";
    }
    // tra ve ban kinh
    public double getRadius(){
        return radius;
    }
    // tra ve dien tich
    public double getArea(){
        return Math.PI * radius * radius;
    }
}


