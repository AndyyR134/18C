import java.util.Scanner;

public class MainArray {
    public static void main(String[] args) {
        
        
        // Remove a high score from any location
        // Search a high score by name
        boolean done = false;
        int SIZE = 5;

        HighScoreArray newHighScores = new HighScoreArray();
        
        Scanner input = new Scanner(System.in);
        while(!done){
            System.out.println("Please choose from the following menu:");
            System.out.println("1. Print high scores");
            System.out.println("2. Add a high scores");
            System.out.println("3. Remove a high score");
            System.out.println("4. Search for a high score");
            System.out.println("5. Exit program");
            System.out.println("Enter a selection");
            Integer number = Integer.parseInt(input.nextLine());
            switch (number){
                case 1:
                    System.out.println(newHighScores);
                    break;
                case 2:
                    // prompt the user for high score
                    System.out.println("Enter a name and a high score");
                    String name_score = input.nextLine();
                    String name = name_score.split(" ")[0];
                    Integer score = Integer.parseInt(name_score.split(" ")[1]);
                    HighScore thisScore = new HighScore();
                    thisScore.setName(name);
                    thisScore.setScore(score);
                    // add the high score
                    newHighScores.add(thisScore);
                    break;
                case 3:
                    //remove
                    System.out.println("Enter a high score index to remove");
                    Integer itemToRemove = Integer.parseInt(input.nextLine());
                    newHighScores.remove(itemToRemove);
                    break;
                case 4:
                    System.out.println("Enter a name to search for in the high scores array");
                    String nameToSearch = input.nextLine();
                    HighScore foundScore = newHighScores.search(nameToSearch);
                    if(foundScore == null){
                        System.out.println("Could not find that name");
                    } else{
                        System.out.println(foundScore);
                    }
                    break;
                case 5:
                    done = true;
                default:
                    break;
                    
            }
        }
    }
}   