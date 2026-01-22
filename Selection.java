public class Selection {
    public static void main(String[]args){
        String [] classes = {"Algebra II", "Biology", "Biology", "History", "Lunch", "Computer Science", "Spanish", "English", "Study Hall"};
        // length - 1 to avoid out of bound index error
        for(int i = 0; i < classes.length - 1; i++){
            System.out.println(classes[i] + ", " + classes[i+1]);
        }
    }
}
