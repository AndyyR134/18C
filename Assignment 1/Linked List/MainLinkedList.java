import java.util.Scanner;

public class MainLinkedList {
    public static void main(String[] args) {
        HighScoreLinkedList highScoresArray = new HighScoreLinkedList();
        //Add a high score
        int counter = 0;
        boolean done =false;

        Scanner input = new Scanner(System.in);
        while(!done){
            System.out.println("Please choose from the following menu.");
            System.out.println("1. Print high score");
            System.out.println("2. Add a high score");
            System.out.println("3. Remove highscore by index");
            System.out.println("4. Search a highscore");
            System.out.println("5. Exit the program");
            System.out.println("Please choose one");
            Integer choice = Integer.parseInt(input.nextLine());

            switch (choice){
                case 1:
                    System.out.println(highScoresArray);
                    break;
                case 2:
                    //prompt the user for a high score
                    System.out.println("Please enter a name and a highschore");
                    String name_score = input.nextLine();
                    String name  = name_score.split(" ")[0];
                    Integer score = Integer.parseInt(name_score.split(" ")[1]);
                    HighScore thisScore = new HighScore();
                    thisScore.setName(name);;
                    thisScore.setScore(score);
                    //add the high score
                    highScoresArray.add(thisScore);
                    break;
                case 3:
                    //remove
                    System.out.println("Enter a high score to remove.");
                    Integer itemToRemove = Integer.parseInt(input.nextLine());
                    //prompt the user to remove
                    //remove the highscore
                    highScoresArray.remove(itemToRemove);
                    break;
                case 4:
                    //search
                    //prompt the user to search
                    System.out.println("Enter a name to be searched.");
                    //display the search
                    String nameToSearch = input.nextLine();
                    HighScore foundScore = highScoresArray.search(nameToSearch);
                    if(foundScore == null){
                        System.out.println("Sorry, name was not found");
                    }else{
                        System.out.println(foundScore);
                    }
                    break;
                case 5:
                    done = true;
            }
        }
        //Remove a highscore
        //Search a highscore
    }
}
