import java.util.Scanner;

class Employee {
    private String name;
    private int employeeId;
    private double salary;

    Employee(String empName, int empId, double empSalary) {
        this.name = empName;
        this.employeeId = empId;
        this.salary = empSalary;
    }

    public void calculateSalary(double performanceRating) {
        if (performanceRating >= 0.0 && performanceRating <= 1.2) {
            this.salary = this.salary * performanceRating;
        } else {
            System.out.println("Gecersiz performans puani girdiniz!");
        }
    }

    public double getSalary() {
        return this.salary;
    }

}

public class Main {

    // Çalışana air bir class tanımlayınız içerisinde adını Id bilgisini ve maaş
    // bilgisini tutunuz
    // Çalısanın performans değerlendirmesini bulan bir fonksiyonu class içerisinde
    // tanımlayınız minumum 0 maksimum 1.2 katsayısıyla maasını göre tekrar
    // hesaplayınız
    public static void main(String[] args) {
        String empName;
        int empId;
        double empSalary, performanceRating;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Calisanin adini giriniz: ");
        empName = scanner.nextLine();

        System.out.print("Calisanin Id numarasini giriniz: ");
        empId = scanner.nextInt();

        System.out.print("Calisanin maasini giriniz: ");
        empSalary = scanner.nextDouble();

        Employee employee = new Employee(empName, empId, empSalary);

        System.out.println("Calisanimizin baslangic maasi: " + empSalary);

        System.out.print("Lutfen performans puanini giriniz: ");
        performanceRating = scanner.nextDouble();
        employee.calculateSalary(performanceRating);

        System.out.println("Guncellenmis maas(Performansa gore): " + employee.getSalary());

        scanner.close();
    }

}