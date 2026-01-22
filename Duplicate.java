public class Duplicate {
    public static boolean dupes(String [] arr){
        int count = 0;
        while(count <= arr.length){
            for(int i = count + 1; i < arr.length; i++){
                if(arr[count].equals(arr[i])){
                    return true;
                }
            }
            count++;
        }
        return false;
    }
    public static void main(String[]args){
        String [] classes = {"Algebra II", "Biology", "Biology", "History", "Lunch", "Computer Science", "Spanish", "English", "Study Hall"};
        System.out.println(dupes(classes));
    }
}

