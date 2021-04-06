public class Arrays1 {
    public static void main(String[] args) {
        //0
        //10 spots array
        // int[] myVar = new int[10];
        // myVar[5] = 50;
        // System.out.println(myVar[5]);
        // System.out.println(myVar[8]);

        //1
        // int[] myVar1 = {1,2,3,4,5,6,7,8,9,10};
        // System.out.println(myVar1[5]);

        //2
        int[] myVar2 = new int[23];
        for (int i = 0; i < myVar2.length; i++) {
         myVar2[i] = i * 7 ;
        }
        printArr(myVar2);
        // for (int i = 0; i < myVar2.length; i++) {
        //     System.out.println("Element " +i+ " value is " +myVar2[i]);
        // }
    }
    
    public static void printArr(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " +i+ " value is " +array[i]);
        }
    }
}
