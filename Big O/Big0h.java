package big0h;

public class Big0h {

    public static void main(String[] args) {
      long startTime = System.currentTimeMillis();
      stringConcat('a', 1000000);
      // put our algorithm in here.
      long endTime = System.currentTimeMillis();
      long concatElapsed = endTime - startTime;
      
      startTime = System.currentTimeMillis();
      stringBuilder('a', 1000000);
      endTime = System.currentTimeMillis();
      long builderElapsed = endTime - startTime;
      
      System.out.println("String concat elapsed: " + concatElapsed);
      System.out.println("String concat elapsed: " + builderElapsed);
        
      // O(n) -> Linear function
      
      // O(1) -> Constant function
      
      // O(n^2) -> exponential function
      /*
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                5 -> 25 times.
            }
        }
      */
      
      // O(log(n))
      /*
        Prevalent in Binary Trees
        
        32 -> 5
        16 -> 4
        8 -> 3
      */
    }
    
    // stringConcat is an exponential function
    public static String stringConcat(char c, int n){
        //Build a string through concatenating
        String finalString = "";
        for(int i = 0; i < n; i++){
            finalString += c;
        }
        return finalString;
    }
    
    
    public static String stringBuilder(char c, int n){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.append(c);
        }
        return sb.toString();
    }
}
