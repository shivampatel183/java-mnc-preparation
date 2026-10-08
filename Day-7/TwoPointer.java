public class TwoPointer{

    public static void main(String[] args){
        int[] arr = new int[]{1,77,-99,52,12,24,-37};
        TwoPointer.reverseArray(arr);

        System.out.println(TwoPointer.reverseArray(arr));
        
    }

    public static int reverseArray(int[] arr){
        int ele=arr[0];
        int maxsum=arr[0];
        for(int i = 1; i<arr.length; i++){
            int temp = arr[i];
            ele = Math.max(ele+arr[i], arr[i]);
            maxsum = Math.max(maxsum, ele);

        }
        return maxsum;
    }
}