import java.util.Scanner;;
public class Square{
    int num,sq;

    void display(){
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter a number");
        num=Sc.nextInt();
        Sc.close();
    }
    void calculate(){
        sq=num*num;
        System.out.println("sq="+sq);

    }
    public static void main(String[] args) {
        Square S = new Square();
        S.display();
        S.calculate();
    
    }
};
