import java.util.Scanner;

public class greatestnum {
    int a,b,c;

public void input(){
    Scanner Sc= new Scanner(System.in);
    System.out.println("enter three numbers:");
    a =Sc.nextInt();
    b =Sc.nextInt();
    c =Sc.nextInt();

    Sc.close();
}
public void checkgreatestnumber(){
    if(a>=b && a>=c)
        System.out.println("a is greatest number:");
    else if(b>=a && b>=c)
        System.out.println("b is greatest number:");
    else 
        System.out.println("c is greatest number:"); 
}
public static void main(String[] args) {
    greatestnum g = new greatestnum();
    g.input();
    g.checkgreatestnumber();
}
}
