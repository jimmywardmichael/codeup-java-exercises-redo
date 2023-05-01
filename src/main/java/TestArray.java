public class TestArray {
    public static void main(String[] args) {
        int[] intArray = new int[7];
        //array will always stay 7 integers and cannot be changed
        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 55;
        intArray[4] = 1;
        intArray[5] = -22;
        intArray[6] = 7;

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);

        }
    }
}
