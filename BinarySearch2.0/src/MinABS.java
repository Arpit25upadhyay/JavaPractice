import java.util.Arrays;

//1818. Minimum Absolute Sum Difference
public class MinABS {
    public static void main(String[] args) {
        int[] nums1 = {56,51,39,1,12,14,58,82,18,41,70,64,18,7,44,90,55,23,11,79,59,76,67,92,60,80,57,11,66,32,76,73,35,65,55,37,38,26,4,7,64,84,98,61,78,1,80,33,5,66,32,30,52,29,41,2,21,83,30,35,21,30,13,26,36,93,81,41,98,23,20,19,45,52,25,51,52,24,2,45,21,97,11,92,28,37,58,29,5,18,98,94,86,65,88,8,75,12,9,66};
        int[] nums2 = {64,32,98,65,67,40,71,93,74,24,49,80,98,35,86,52,99,65,15,92,83,84,80,71,46,11,26,70,80,2,81,57,97,12,68,10,49,80,24,18,45,72,33,94,60,5,94,99,14,41,25,83,77,67,49,70,94,83,55,17,61,44,50,62,3,36,67,10,2,39,53,62,44,72,66,7,3,6,80,38,43,100,17,25,24,78,8,4,36,86,9,68,99,64,65,15,42,59,79,66};
        int n = nums1.length;
        int[] nums1Sorted = nums1.clone();
        int sol;
        Arrays.sort(nums1Sorted);
        int asd = asd(nums1, nums2);
        sol = asd;
        for(int i = 0; i<nums2.length; i++){
            int replaceIdx= replacement(nums1Sorted,nums2[i]);
            if(replaceIdx>=100){
                System.out.println(replaceIdx);
            }
            int asdModify = asd - Math.abs(nums1[i]-nums2[i]) + ( Math.abs(nums1Sorted[replaceIdx]-nums2[i]));


            sol = Math.min(sol, asdModify);
        }
        System.out.println(sol);
    }

    public static int asd(int[] nums1, int[] nums2){
        int n = nums1.length;
        int sum = 0;
        for(int i = 0; i<n; i++){
            sum+= Math.abs(nums1[i]-nums2[i]);
        }
        return sum;
    }

    public static int replacement(int[] a, int x){
        int start = 0;
        int end = a.length-1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if(a[mid] == x){
                return mid;
            }
            if (a[mid] < x) {
                start = mid + 1;
            } else {
                end = mid-1;
            }
        }
        if(end<0){
            return start;
        }else if(start>= a.length){
            return end;
        }else{
            if(Math.abs(x-a[start]) < Math.abs(x-a[end])){
                return start;
            }
            return end;
        }
    }
}