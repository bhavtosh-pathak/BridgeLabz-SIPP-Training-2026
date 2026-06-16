public class MatrixOperations {

    static int[][] createMatrix(
            int rows, int cols) {

        int[][] matrix =
                new int[rows][cols];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                matrix[i][j] =
                        (int)(Math.random() * 10);
            }
        }

        return matrix;
    }

    static int[][] add(
            int[][] a,
            int[][] b) {

        int[][] result =
                new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[0].length; j++) {

                result[i][j] =
                        a[i][j] + b[i][j];
            }
        }

        return result;
    }

    static int[][] subtract(
            int[][] a,
            int[][] b) {

        int[][] result =
                new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[0].length; j++) {

                result[i][j] =
                        a[i][j] - b[i][j];
            }
        }

        return result;
    }

    static int[][] multiply(
            int[][] a,
            int[][] b) {

        int[][] result =
                new int[a.length][b[0].length];

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < b[0].length; j++) {

                for (int k = 0; k < b.length; k++) {

                    result[i][j] +=
                            a[i][k] * b[k][j];
                }
            }
        }

        return result;
    }

    static void print(int[][] arr) {

        for (int[] row : arr) {

            for (int x : row)
                System.out.print(x + " ");

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] A = createMatrix(3,3);
        int[][] B = createMatrix(3,3);

        System.out.println("Matrix A");
        print(A);

        System.out.println("Matrix B");
        print(B);

        System.out.println("Addition");
        print(add(A,B));

        System.out.println("Subtraction");
        print(subtract(A,B));

        System.out.println("Multiplication");
        print(multiply(A,B));
    }
}