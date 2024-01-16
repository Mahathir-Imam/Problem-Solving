import java.util.Scanner;

public class Palindrome_Or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverse = 0;
        while(num != 0)
        {
            int digit = num%10;
            reverse = reverse*10 + digit;
            num = num/10;
        }
        if (reverse == num)
        {
            System.out.println("Palindrome");
        }
        else System.out.println("Not Palindrome");
    }
}
