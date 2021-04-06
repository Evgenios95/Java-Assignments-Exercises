import java.util.ArrayList;
    
    class IntClass {
        private int myValue;

        public IntClass(int myValue) {
            this.myValue = myValue;
        }

        public int getMyValue() {
            return myValue;
        }

        public void setMyValue(int myValue) {
            this.myValue = myValue;
        }

    }
//unboxing is taking something from a class and converting it back to a primitive type
//Autoboxing is the opposite!
public class AutoboxingUnboxing {
    public static void main(String[] args) {


        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(55));
        
        System.out.println("==========================");

        ArrayList<Integer> intArrayList2 = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            //take th evalue of i as a primitive type and converts into an integer class
            intArrayList2.add(Integer.valueOf(i));
        }
        for (int i = 0; i <= 10; i++) {
            //convert it back from an Integer to a primitive type
            System.out.println(i + " ---> " + intArrayList2.get(i).intValue());
        }

        Integer myIntValue = 56; //when it compiles it's compiled to Integer.valueOf(56); So java does it for you.
        int myInt = myIntValue; // java puts myintValue.intValue(); and it does it for us automatically again.



        System.out.println("==========================");
        ArrayList<Double> myDoubleArr = new ArrayList<>();
        for (double db = 0d; db < 10d; db+=0.7) {
            //autoboxing. we are converting the double value db into the Double wrapper.
            myDoubleArr.add(Double.valueOf(db));
        }

        for (int i = 0; i < myDoubleArr.size() ; i++) {
            //unboxing: we use the doubleValue and we convert it from the object back to the primitive type.
            double value = myDoubleArr.get(i).doubleValue();
            System.out.println(i + " ---> " + value);
        }


    }

    

}
