import java.util.Scanner;

class Sumloop {
    int i = 1, sum = 0, num, n;
    Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.println("How many numbers do you want to enter?");
        n = sc.nextInt();
    }

    public void cal() {
        while (i <= n) {
            System.out.println("Enter number " + i + ":");
            num = sc.nextInt();

            sum = sum + num;
            i++;
        }
    }

    public void display() {
        System.out.println("Sum = " + sum);
        sc.close();
    }

    public static void main(String[] args) {
        Sumloop S = new Sumloop();
        S.input();
        S.cal();
        S.display();
    }
}