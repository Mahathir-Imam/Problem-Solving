import java.util.Scanner;

public class Count_Digits_2 {
    static int count_digits(int n)
    {
        String n2 = Integer.toString(n);
        return n2.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Number of digits "+n+" is "+count_digits(n));
    }
}
