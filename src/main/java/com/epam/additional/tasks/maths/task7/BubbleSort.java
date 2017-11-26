package com.epam.additional.tasks.maths.task7;

public class BubbleSort {
    public static int[] swapped;
    public  void bubbleIntSort(int[] data) {
        for (int j = 0; j < data.length - 1; j++) {
            boolean flag = false;

            for (int i = 0; i < data.length - 1; i++) {
                if (data[i] > data[i + 1]) {
//                    swap(data[i],data[i + 1]);
                    int tmp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = tmp;
                    flag = true;
                }
            }
            if (!flag) break;
        }
    }

    private static void swap(int max, int min) {
        int tmp = max;
        max = min;
        min = tmp;
        swapped = new int[]{min, max};
    }

}
