import java.util.Scanner;
class Power {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter base value");
        int base= scan.nextInt();
        System.out.println("Enter power value");
        int exp= scan.nextInt();
        int res=1;
        while(exp!=0)
        {
            res=res*base;
            exp--;
        }
        System.out.println(res);
    }
}
