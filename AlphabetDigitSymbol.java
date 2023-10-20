import java.util.Scanner;
class AlphabetDigitSymbol {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value");
        char ch=scan.next().charAt(0);
        if((ch>=65 && ch<=90) || (ch>=97 && ch<=122))
        {
            if(ch>=65 && ch<=90)
            {
                System.out.println(ch+32);
            }
            else
            {
                System.out.println(ch-32);
            }
        }
        else if (ch>=48 && ch<=57)
        {
            if((ch+0)%2==0)
            {
                System.out.println(ch/10);
            }
            else
            {
                System.out.println(ch+0);
            }
        }
        else
        {
            if(ch/10%10%3==0)
            System.out.println("Divisible");
            else
            {
                System.out.println("Not Divisible");
            }
        }

    }
}
