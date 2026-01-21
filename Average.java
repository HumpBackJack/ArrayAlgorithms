public class Average {
    public static void main(String[]args){
        int [] nums = {-2,0,5,7,9};
        int sum = 0;
        int count = 0;
        double avrg = 0.0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            count++;
        }
        avrg = (double) sum /(double) count;
        System.out.println(avrg);
    }
}
