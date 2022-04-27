public class NumberGroup {
    int minimum;
    int maximum;

    public NumberGroup(int minimum, int maximum){
        this.minimum = minimum;
        this.maximum = maximum;
    }

    public int getMinimum(){
        return minimum;
    }

    public int getMaximum(){
        return maximum;
    }


    public static void main(String[] args) {
        NumberGroup range1 = new NumberGroup(2, 4);

    }
}
