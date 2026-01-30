public class test {
   public static void main(String[]args){
    int [] arr = {1,2,3,0,4,5};
    System.out.println(locateMinimum(arr));
    System.out.println(findAverage(arr));
   } 
   public static int locateMinimum(int [] arr){
        int min = arr[0];
        int loc = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
                loc = i;
            }
        }
        return loc;
    }
    public static double findAverage(int [] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }
        
}
