public class ArrayTask3 {
    public static void main(String[] args) {
        int[] data = {1,2,3,4,1,1,1,1,1,2,2,3,3,3,4,2,1,13,3,2};

        int maxCount = 0;
        int maxNumber = 0;
        for (int mainNumber : data) {
            int localCounter = 0;
            for (int secondNumber : data) {
                if(mainNumber == secondNumber){
                    localCounter++;
                }
            }
            if(localCounter > maxCount){
                maxCount = localCounter;
                maxNumber = mainNumber;
            }
        }
        System.out.println(maxCount);
    }
}
