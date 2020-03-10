import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainArray {
    public static void main(String[] args) {
        int hiScore = 0, i = 0;
        String userName = "", choice = " ";

        HighScore newHiScore = new HighScore();
        ArrayList<HighScore> scores = new ArrayList<>();

        System.out.println("Please input 5 names, and high scores.");
        for (i = 0; i < 5; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Name:");
            userName = input.nextLine();

            System.out.println("HiScore: ");
            try {
                hiScore = input.nextInt();
            }catch(InputMismatchException e){
                System.out.println("Please enter a number value.");
            }
            scores.add(new HighScore(userName, hiScore));
        }

        int j, tempScore;
        String tempName;
        boolean swapped;
        for (i = 0; i < scores.size() - 1; i++)
        {
            swapped = false;
            for (j = 0; j < scores.size() - i - 1; j++)
            {
                if (scores.get(j).getHighScore() < scores.get(j + 1).getHighScore())
                {
                    // swap arr[j] and arr[j+1]
                    tempScore = scores.get(j).getHighScore();
                    tempName = scores.get(j).getName();
                    scores.get(j).setHighScore(scores.get(j + 1).getHighScore());
                    scores.get(j).setName(scores.get(j + 1).getName());
                    scores.get(j+1).setHighScore(tempScore);
                    scores.get(j+1).setName(tempName);
                    swapped = true;
                }
            }

            // IF no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }

        System.out.println("Printing Array\n");
        for (i = 0; i < scores.size(); i++) {
            System.out.println(scores.get(i));
        }

        System.out.println("Would you like to search for a high score (1), delete one (2) or exit (3)?");

        while(choice != "3") {
            Scanner keyboard = new Scanner(System.in);
                choice = keyboard.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("Please enter the name of the high score holder");
                    choice = keyboard.nextLine();
                    for(i = 0; i < scores.size(); i++) {
                        //System.out.println(scores.get(i).getName());
                        if(choice.equals(scores.get(i).getName())) {
                            System.out.println("Printing name: " + scores.get(i).getName());
                        } else if(!choice.equals(scores.get(i).getName())){
                            System.out.println("Name could not be found.");
                        }
                    }
                    System.out.println("Reprinting Array");
                    for (i = 0; i < scores.size(); i++) {
                        System.out.println(scores.get(i));
                    }
                    break;
                case "2":
                    System.out.println("Please type the persons name");
                    choice = keyboard.nextLine();
                    for(i = 0; i < scores.size(); i++) {
                        //System.out.println(scores.get(i).getName());
                        if(choice.equals(scores.get(i).getName())) {
                            System.out.println("Deleting...");
                            scores.remove(i);
                        } else if(!choice.equals(scores.get(i).getName())) {
                            System.out.println("Name could not be found or has already been deleted.");
                        }
                    }
                    System.out.println("Reprinting Array");
                    for (i = 0; i < scores.size(); i++) {
                        System.out.println(scores.get(i));
                    }
                    break;
                case "3":
                    System.exit(0);
                default:
                    System.out.println("Oops, something went wrong.");
            }
        }
    }

    // An optimized version of Bubble Sort
    static void bubbleSort(HighScore arr, int size)
    {

    }
}

