package sol_algorithm;

import java.util.Scanner;

public class al7 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = a + b;
        c = c.replace(" ", "");
        System.out.println(c);
    }

}
