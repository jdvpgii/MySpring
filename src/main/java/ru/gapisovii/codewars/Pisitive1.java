package ru.gapisovii.codewars;

public class Pisitive1 {
    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            if (x < 0) {
                arr[i] = 0;
            }
            sum += arr[i];
        }
        return sum;
    }

//    public static int sum(int[] arr){
//        return Arrays.stream(arr).filter(v -> v > 0).sum();
//    }
}
