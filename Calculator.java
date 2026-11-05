import java.util.Scanner ;
public class Calculator {

    int a,b,sum,subtract,multiply;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        a= sc.nextInt();
        b= sc.nextInt();
        sc.close();

    }
    public void add(){
        sum=a+b;
        System.out.println("sum= "+sum);

    }
    public void subtract(){
        subtract=a-b;
        System.out.println("subtract= "+subtract);
    }
    public void multiply(){
        multiply=a*b;
        System.out.println("multiply= "+multiply);
    }
    public static void main(String[] args) {
       Calculator c = new Calculator();
    c.input();
    c.add();
    c.subtract();
    c.multiply();

    }

}

