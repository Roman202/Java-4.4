package com.company;

public class BubbleSortDemo {

    public static void main(String[] args) {
        int nums[] = {99, -10, 23, 123972, 17, -654, 46, 87, -9};

        System.out.print("Вхідний порядок масива: ");
        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + " ");

        System.out.println();
        BubbleSort.sort(nums);

        System.out.print("Новий порядок: ");
        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + " ");

        System.out.println();
    }
}
