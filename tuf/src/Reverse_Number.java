import java.util.Scanner;

public class Reverse_Number {
    static  int reverse_num(int n){
        //int num = n;
        int digit;
        int reverse = 0;
        while (n!=0)
        {
            digit = n%10;
            reverse = reverse*10 + digit;
            n = n/10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The reverse number of "+n+" is "+reverse_num(n));
    }
}
