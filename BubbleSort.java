package com.company;

public class BubbleSort {

    static void sort(int nums[]) {
        int t; // допоміжна змінна

        for (int a = 1; a < nums.length; a++) {
            // повтор для кожного елементу масива
            for (int b = nums.length - 1; b >= a; b--) {
                // повтор для перевірки підрядка сосідніх елементів
                if (nums[b - 1] > nums[b]) {
                    // перестановка елементів
                    t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }
            }
        }
    }
}
