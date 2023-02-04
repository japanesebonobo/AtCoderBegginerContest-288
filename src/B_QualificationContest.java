package src;
import java.util.*;

public class B_QualificationContest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        String S[] = new String[N];
        for (int i = 0; i < S.length; i++) {
            S[i] = scanner.next();
        }
        scanner.close();
        
        String[] ans = new String[K];
        for (int i = 0; i < K; i++) {
            ans[i] = S[i];
        }

        Arrays.sort(ans);

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}

