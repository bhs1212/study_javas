public class ExtendsCalculations extends Calculations {
    // Constructor
    ExtendsCalculations(){
        System.out.println("ExtendsCalculations - constructor");
    }

    //multiply
    public int multiplications(int first, int second){
        int result = first * second;
        return result;
    }

    // Public Methods subtraction
    public int subtraction(int first, int second){
        // int result = first - second;
        int result = second-first;
        return result;
    }
}
