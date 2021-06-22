package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length - 1);
            int box;
            for (int j = i; j < i + 1; j++) {
                box = data[i];
                data[i] = min;
                data[index] = box;
            }
        }
        return data;
    }
}
