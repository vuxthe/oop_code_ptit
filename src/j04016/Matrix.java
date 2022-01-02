package j04016;

import java.util.Scanner;

public class Matrix {
    private int a[][];

    public Matrix(int n, int m) {
        this.a = new int[n][m];
    }
    public Matrix(int[][] c) {
        this.a = new int[c.length][c[0].length];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                this.a[i][j] = c[i][j];
            }
        }
    }
    public void nextMatrix(Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    public Matrix mul(Matrix b) {
        int[][] c = new int[a.length][b.a[0].length];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = 0;
                for (int k = 0; k < b.a.length; k++) {
                    c[i][j] += a[i][k] * b.a[k][j];
                }
            }
        }
        Matrix res = new Matrix(c);
        return res;
    }

    @Override
    public String toString() {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        return "";
    }

    public Matrix trans() {
        int[][] c = new int[a[0].length][a.length];
        for (int i = 0; i<a.length; i++)
            for (int j = 0; j < a[i].length; j++) {
                c[j][i] = a[i][j];
            }

        Matrix res = new Matrix(c);
        return res;
    }
}
