
import java.util.Scanner ;
public class vote {
     int age;

     public void input(){
        Scanner sc= new Scanner (System.in);
        System.out.println("enter a age:");
        age=sc.nextInt();  

        sc.close();
     }
     public void checkeligibility(){
        if (age>=18)
            System.out.println("eligible:");
        else
            System.out.println("not elihible:");
     }
     public static void main(String[] args) {
        vote v = new vote();
        v.input();
        v.checkeligibility();
     }
}