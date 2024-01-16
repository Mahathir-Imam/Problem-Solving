import java.util.Scanner;

public class ReverseNumber_3 {
    static StringBuilder reverse_number(int number)
    {
        String num = Integer.toString(number);
        return new StringBuilder(new StringBuilder(num).reverse().toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverse_number(n));

    }
}
