import java.util.Scanner;
class Ascii {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the character");
        char ch=scan.next().charAt(0);
        if((ch>=65 && ch<=90) || (ch>=97 && ch<=122) || (ch>=48 && ch<=57)){
            System.out.println("ASCII Value of "+ch+" is = "+(ch+0));
        }
        else{
            System.out.println("Invalid character");
        }
    }
}
