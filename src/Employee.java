public class Employee {
    double salary = 250000.50;
}
class Programmer extends Employee{
    double bonus = 45000;
    public static void main(String[] args) {
        Programmer p= new Programmer();
        System.out.println("Programmer Salary : " +p.salary);
        System.out.println("Programmer bonus : " + p.bonus);
        System.out.println("Programmer income :" + (p.bonus + p.salary));
    }
}
