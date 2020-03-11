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
