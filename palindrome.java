import java.util.Scanner;
public class palindrome {
int num,bnum,rev=0,d;
    
public void input(){
Scanner sc = new Scanner(System.in);
System.out.println("enter a number");
num=sc.nextInt();
bnum=num;
sc.close();
}
public void calculate(){
    while (num>0) {
        d=num%10;
        rev=rev*10+d;
        num=num/10;
        
        
    }
}
public void display(){
    if(bnum==rev)
        System.out.println("palindrome");
    else
        System.out.println("not palindrome");
}
public static void main(String[] args) {
    palindrome p=new palindrome();
    p.input();
    p.calculate();
    p.display();
}

};