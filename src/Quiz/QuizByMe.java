package Quiz;

import java.util.Scanner;

public class QuizByMe {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Dimension N : ");
        int N = sc.nextInt();
        int[][] arr = new int[N][N];
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                System.out.print("Enter the Bed arrangements of [" + r + "][" + c + "] = ");
                arr[r][c] = sc.nextInt();
            }
        }
    int count = 0;
        for (int r = 0; r < N; r++) {
        for (int c = 0; c < N; c++) {
            if (arr[r][c] == 1 && (c != (N - 1))) {
                if (arr[r][c + 1] == 1) {
                    count = 1;
                    break;
                }
            }
            if (arr[r][c] == 1 && (r != (N- 1))) {
                if (arr[r + 1][c] == 1) {
                    count = 1;
                    break;
                }
            }
        }
        if (count == 1) {
            break;
        }
    }
        if (count == 1) {
        System.out.println("\tUNSAFE");
    }
        else {
        System.out.println("\tSAFE");
    }
}
}
