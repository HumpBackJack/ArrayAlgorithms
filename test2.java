public class test2 {
    public static void main(String[]args){
        String [] thingies = {"kevin","kevioooo","kevinn"};
        System.out.println(findTarget(thingies, "kevin"));
    }
    public static int findTarget(String [] arr, String target){
        int count = 0;
    for(String ar:arr){
        if(ar.substring(0,target.length()).equals(target)){
            count ++;
    }
    }
    return count;
    }
    
}
