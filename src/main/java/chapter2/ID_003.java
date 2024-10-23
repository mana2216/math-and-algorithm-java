package chapter2;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ID_003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int ans = IntStream.of(A).sum();
        System.out.println(ans);
    }
}
