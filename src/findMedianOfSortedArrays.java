public class findMedianOfSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLen = nums1.length + nums2.length;
        boolean isEven = totalLen % 2 == 0;
        int medLen = totalLen/2;
        int stop = medLen;
        int mid1 = 0;
        int mid2 = 0;
        int a = 0;
        int b = 0;
        double result = 0.0;
        if(nums1.length == 0){
            mid1 = nums2[medLen];
            if(isEven){
                mid2 = nums2[medLen - 1];
            }
            result = isEven ? (double) (mid1 + mid2)/2 : (double) mid1;
            return result;
        }
        if(nums2.length == 0){
            mid1 = nums1[medLen];
            if(isEven){
                mid2 = nums1[medLen - 1];
            }
            result = isEven ? (double) (mid1 + mid2)/2 : (double) mid1;
            return result;
        }

        for(int i = 0; i <= stop; i++){
            if(a <= nums1.length -1 && nums1[a] < nums2[b]){
                if(isEven && i == stop -1){
                    mid2 = nums1[a];
                    a++;
                }
                else{
                    mid1 = nums1[a];
                    a++;
                }
            }
            else{
                if(isEven && i == stop -1){
                    mid2 = nums2[b];
                    if(b < nums2.length-1){
                        b++;
                    }

                }
                else{
                    mid1 = nums2[b];
                    if(b < nums2.length-1){
                        b++;
                    }
                }
            }

        }
        result = isEven ? (double) (mid1 + mid2)/2 : (double) mid1;
        return result;
    }

    public static void main(String[] args) {
        int[] num1 = {1,2};
        int[] num2 = {3,4};
        System.out.println(findMedianSortedArrays(num1, num2));
    }
}
