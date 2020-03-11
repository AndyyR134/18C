public class HighScore {
    private String name;
    private Integer score;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the score
     */
    public Integer getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ")
                .append(this.getName())
                .append(",Score: ")
                .append(this.getScore());
        return sb.toString();
    }
}
