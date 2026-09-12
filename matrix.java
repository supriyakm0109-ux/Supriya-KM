public class matrix {
    public static void main(String[] args) {

        int[][] A = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] B = {
            {1, 2},
            {3, 4},
            {5, 6}
        };

        int[][] result = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {

                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Result:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
    
