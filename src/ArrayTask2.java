public class ArrayTask2 {
    public static void main(String[] args) {
        int[] exampleArray = {6,2,4,142,1,5,213,24,123,124,123,213};

        int min = exampleArray[0];

        for (int i : exampleArray) {
            if(i < min){
                min  = i;
            }
        }

        System.out.println(min);
    }
}
