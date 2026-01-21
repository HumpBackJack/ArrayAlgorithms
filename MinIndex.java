public class MinIndex {
    public static void main(String[]args){
        int [] nums = {2,0,5,7,9};
        int min = nums[0];
        int e = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
                e = i;
            }
        } 
        System.out.println(e); 
    }
}
