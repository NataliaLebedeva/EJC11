package com.epam.homeworks.JavaFundamentals.task5;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int N = 6;
        int map[][] = new int[N][N];

        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                if (i == j || (N-1) == (j + i)){
                    map[i][j] = 1;
                }
                else map[i][j] = 0;
            }
        }
        printMap(map);
    }

    public static void printMap(int[][] map) {
        for (int i = 0; i < map.length; i ++){
            for (int j = 0; j < map.length; j ++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }

}
