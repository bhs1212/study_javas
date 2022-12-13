package cases;

public class Vehicles extends Object {
     // Constructor
     Vehicles(){
        
     }
 
     public int speed(int kms, int hours){
         int result = kms / hours;
         return result;
     }
 
     public int weight(int height, int width, int depth){
         int result = height * width * depth;
         return result;
     }
}
