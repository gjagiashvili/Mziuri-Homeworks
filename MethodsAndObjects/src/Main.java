import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Car
        Car car1 = new Car("ტოიოტა", "პრიუსი", 2000, "123-123");
        Car car2 = new Car("რეინჯ როვერი", "ველარი", 2025, "ABC-CBA");

        car1.printInfo();
        car2.printInfo();


        //K Divise Sum

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("შეიყვანეთ a რიცხვი: ");
        int a = scanner.nextInt();
        System.out.print("შეიყვანეთ b რიცხვი: ");
        int b = scanner.nextInt();
        System.out.print("შეიყვანეთ k რიცხვი: ");
        int k = scanner.nextInt();

        KNumberSum multiplesSum = new KNumberSum(a, b, k);
        int result = multiplesSum.calculateSum();

        System.out.println("k-ს ჯერადების ჯამი " + a + "-დან " + b + "-ს ჩათვლით არის " + result);

        //Sum
        System.out.print("შეიყვანეთ n: ");
        int n = scanner.nextInt();

        Sum Sum = new Sum(n);
        int SumResult = Sum.calculateSum();

        System.out.println("1-დან " + n + "-მდე რიცხვების ჯამი არის " + SumResult);

        //Power
        System.out.print("შეიყვანეთ f (ფუძე): ");
        int f = scanner.nextInt();
        System.out.print("შეიყვანეთ d (ხარისხი): ");
        int d = scanner.nextInt();

        Power power = new Power(f, d);
        int powerResult = power.getResult();

        System.out.println(f + "-ის " + d + "-ე ხარისხი: " + powerResult);

        //Zeros
        System.out.print("შეიყვანეთ რიცხვი (ნულის დათვლა): ");
        int numberZero = scanner.nextInt();

        Zeros countZeros = new Zeros(numberZero);
        countZeros.evenOdd();



    }
}
