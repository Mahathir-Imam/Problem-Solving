import java.util.Scanner;

public class ReverseNumber_Recursion {
    public static void reverse_number(int number)
    {
        if (number<10){
            System.out.print(number);
            return;
        }
        else {
            System.out.print(number%10);
            reverse_number(number/10);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("The reverse number is :");
        reverse_number(n);
    }
}
