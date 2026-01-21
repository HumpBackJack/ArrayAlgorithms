// Jack G 1/21/26
public class ExampleOne{
    public static void main(String[]args){
        int [] nums = {-2,0,5,7,9};
        //iterate the array with a for loop
        for(int i = 0; i < nums.length; i++){
            System.out.println(i);
        }
        for(int num : nums){
            System.out.println(num);
        }
    }
}