import java.util.Scanner ;
public class evenodd{

    int num;
    public void input(){
         Scanner sc= new Scanner (System.in);
        System.out.println("enter a number:");
        num = sc.nextInt();

        sc.close();
    }
    public void checkevenodd(){
        if(num%2==0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
    public static void main(String[] args) {
        evenodd e= new evenodd();
        e.input();
        e.checkevenodd();
    }
}