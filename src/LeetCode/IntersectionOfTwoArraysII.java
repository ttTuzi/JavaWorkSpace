package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年12月13日 3:52 PM
 */
public class IntersectionOfTwoArraysII {
    public static void main(String[] args) {
       int[] nums1 = {4,9,5};
       int[] nums2 = {9,4,9,8,4};
       int[] i = intersect1(nums1,nums2);
       int[] j = intersect2(nums1,nums2);
        System.out.println(Arrays.toString(i));
        System.out.println(Arrays.toString(j));

    }

    //first solution
    public static int[] intersect1(int[] nums1, int[] nums2) {
        int l = 0, r = 0;
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while (l < nums1.length && r < nums2.length) {
            if (nums1[l] == nums2[r]) {
                list.add(nums1[l]);
                l++;
                r++;
            } else if (nums1[l] < nums2[r]) {
                l++;
            } else {
                r++;
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
    //solution2
    public static int[] intersect2(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            list.add(nums1[i]);
        }
        for(int i=0;i< nums2.length;i++){
            if(list.size()>0) {
                if (list.contains(nums2[i])) {
                    list2.add(nums2[i]);
                    list.remove(Integer.valueOf(nums2[i]));
                }
            }else {
                break;
            }
        }
        int[] arr = new int[list2.size()];
        for (int i = 0; i < list2.size(); i++) {
            arr[i] = list2.get(i);
        }
        return arr;
    }
}
