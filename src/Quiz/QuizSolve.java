package Quiz;

import java.util.Scanner;

public class QuizSolve {

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

		for(int r=0;r<N;r++)
		{
			for(int c=0;c<N;c++)
			{
				System.out.print(arr[r][c]+"\t");
			}
			System.out.println();
		}
        System.out.println();

        boolean found = true;
        for (int r = 0; r < N && found; r++) {
            for (int c = 0; c < N && found; c++) {
                if (arr[r][c] == 1) {
                    if (c - 1 > 0 && arr[r][c - 1] == 1) {
                        found = false;
                        System.out.println("\tUNSAFE");
                        break;
                    } else if (c + 1 < N && arr[r][c + 1] == 1) {
                        found = false;
                        System.out.println("\tUNSAFE");
                        break;
                    } else if (r - 1 > 0 && arr[r - 1][c] == 1) {
                        found = false;
                        System.out.println("\tUNSAFE");
                        break;
                    } else if (r + 1 < N && arr[r + 1][c] == 1) {
                        found = false;
                        System.out.println("\tUNSAFE");
                        break;
                    }
                }
            }
        }
        if (found) {
            System.out.println("\tSAFE");
        }
    }

}