package src;
import java.util.*;

public class A_Majority {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int A[] = new int[N];
        int B[] = new int[N];

        long ans[] = new long[N];

        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
            B[i] = scanner.nextInt();
            ans[i] = A[i] + B[i];
            System.out.println(ans[i]);
        }
        scanner.close();
    }
}

