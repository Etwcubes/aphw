import java.util.List;

public interface Number {

        public boolean ContainsStuff(int num);

}

    class range implements Number{
        int minimum;
        int maximum;

        public range(int minimum, int maximum){
            this.minimum = minimum;
            this.maximum = maximum;
        }

        public int getMinimum(){
            return minimum;
        }

        public int getMaximum(){
            return maximum;
        }
        public void getRange(int minimum, int maximum){
            int start = minimum;
            int end = maximum;
            for (int i = 0; i < Math.abs(minimum-maximum); i++){
                if (start == end){
                    break;
                }
                System.out.print(start);
                start++;
            }
        }

        public boolean ContainsStuff(int num) {
            if ((num >= minimum) && (num <= maximum)){
                return true;
            } return false;
        }
    }

    class MultipleGroups implements Number{
        int minimum;
        int maximum;

        public MultipleGroups(int minimum, int maximum){
            this.minimum = minimum;
            this.maximum = maximum;
        }

        public int getMinimum(){
            return minimum;
        }

        public int getMaximum(){
            return maximum;
        }

        private List<NumberGroup> groupList;
        @Override
        public boolean ContainsStuff(int num) {
            for (int i = 0; i < groupList.size(); i++){
                if ((num <= groupList.get(i).getMaximum()) && (num >= groupList.get(i).getMinimum())){
                    return true;
                }
            } return false;
        }
    }



    class EricW implements Number{
        int my_nums[] = new int[5];
        public EricW(int[] input){
            my_nums = input;
        }
        public boolean ContainsStuff(int num){

           
            for (int i = 0; i < my_nums.length; i++){
                if (my_nums[i] == num){
                    return true;
                }

            } return false;
        }

}
class Main{
    public static void main(String[] args) {
        int[] input = new int[]{1,2,3,4};
        EricW test = new EricW(input);


        System.out.println(test.ContainsStuff(2));


    }

}
