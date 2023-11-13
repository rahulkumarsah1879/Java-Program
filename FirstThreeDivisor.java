import java.util.Scanner;
class FirstThreeDivisor {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scan.nextInt();
        int count=3;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.println(i);
                count--;
            }
            if(count==0)
                break;
        }
    }
}
