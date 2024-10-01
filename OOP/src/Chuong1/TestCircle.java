package Chuong1;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Hinh tron co ban kinh la : "+circle.getRadius()+" va dien tich la : "+circle.getArea());

        Circle circle2 = new Circle(2.0);
        System.out.println("Hinh tron co ban kinh la : "+circle2.getRadius()+" va dien tich la : "+circle2.getArea());
    }
}
