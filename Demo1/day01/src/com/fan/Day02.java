package com.fan;

public class Day02 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6, 7};
        double mediansortedArrays = findMediansortedArrays(arr1, arr2);
        System.out.println("-------------");
        System.out.println(mediansortedArrays);
        System.out.println("----------");
    }

    public static double findMediansortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        int index = (nums1.length + nums2.length) / 2 + 1;

        for (int i = 0, j = 0; (i + j) < (nums1.length + nums2.length) && index > i + j; ) {
            if (i < nums1.length && j < nums2.length) {
                if (nums1[i] > nums2[j]) {
                    nums[i + j] = nums2[j];
                    j++;
                } else {
                    nums[i + j] = nums1[i];
                    i++;
                }
            } else {
                if (i == nums1.length) {
                    nums[i + j] = nums2[j];
                    j++;
                } else {
                    nums[i + j] = nums1[i];
                    i++;
                }
            }
        }

        if ((nums1.length + nums2.length) % 2 == 1) {
            return nums[(nums1.length + nums2.length) / 2];
        } else {
            return (nums[(nums1.length + nums2.length) / 2 - 1] + nums[(nums1.length + nums2.length) / 2]) / 2.0;
        }

    }


}
