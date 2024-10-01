package Chuong1;

public class TestEmployee {
    public static void main(String[] args) {
        Employee ep = new Employee(10 , "Kanh","Nguyen",2500);
        System.out.println(ep);

        ep.setSalary(999);
        System.out.println(ep);
        System.out.println("ID la : "+ep.getId());
        System.out.println("First Name : "+ep.getFirstName());
        System.out.println("Last Name : "+ep.getLastName());
        System.out.println("Salary : "+ep.getSalary());
        System.out.println("Name la : "+ep.getName());
        System.out.println("Annual salary : "+ep.getAnnualSalary());
        System.out.println(ep.raiseSalary(10));
        System.out.println(ep);

    }
}
