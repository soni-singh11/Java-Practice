import java.util.Scanner ;
class month{
    public static void main(String[] args) {
        int mno;
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter a month:");
        mno=Sc.nextInt();
        Sc.close();
         switch(mno){
            case 11:
            case 12:
            case 1:
                System.out.println("winter season");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("spring season");
                break;
            case 5:
            case 6:
                System.out.println("summer season");
                break;
            case 7:
            case 8:
                System.out.println("rainy season");
                break;
            case 9:
            case 10:
                System.out.println("autumn seasom");
                break;

                default:
                System.out.println("invalid");
         }
    }

}
