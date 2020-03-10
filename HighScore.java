public class HighScore{

    private int highScore = 0;
    private String name = "";

    //Default constructor for HighScore
    public HighScore(){

    }

    public HighScore(String name, int highScore){
        this.name = name;
        this.highScore = highScore;
    }

    public int getHighScore() {
        return highScore;
    }

    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "Name: " + name + " HiScore: " + highScore;
    }
}
