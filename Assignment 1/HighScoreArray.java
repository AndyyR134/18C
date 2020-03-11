class HighScoreArray {
    private HighScore[] highScores;
    private int counter = 0;
    
    public HighScoreArray(){
        this.highScores = new HighScore[5];
    }
    
    public void add(HighScore newScore){
        if(counter > this.highScores.length)
        {
            // expand array
            // Create a new array with a bigger size
            HighScore[] temp = new HighScore[(int)(Math.round(this.highScores.length * 1.25))];
            // copy over all the memory
            for(int i = 0; i < this.highScores.length; i++){
                temp[i] = this.highScores[i];
            }
            this.highScores = temp;
        }
            // Otherwise, just add to the next position
            this.highScores[counter] = newScore;
            // increment counter
            counter++;
    }
    
    public void remove(int index){
        // Starting at index + 1
        // Shift every it back by 1
        for(int i = index + 1; i < counter; i++){
            this.highScores[i - 1] = this.highScores[i];
        }
        // Decrement the counter
        counter--;
    }
    
    public Integer getSize(){
        return counter;
    }
    
    public HighScore search(String name){
        //start at the beginning
        HighScore found = null;
        for(int i = 0; (i < counter && found == null); i++){
            if(this.highScores[i].getName().equals(name)){
                found = this.highScores[i];
            }
        }
        //Search until we get to counter
        // if no item found, return null;
        return found;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < counter; i++){
            sb.append(this.highScores[i].toString()).append("\n");
        }
        return sb.toString();
    }
}
