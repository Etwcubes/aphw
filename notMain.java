import java.util.HashMap;
import java.util.Scanner;


public class notMain {
//    public static void main(String[] args) {
//        Group1.Contains(5);
//    }
//
//    public Boolean Contains(int num){
//
//        int[] tempArr = new int[5];
//        for (int i = 0; i < tempArr.length; i++){
//            if (tempArr[i] == num){
//                return true;
//            }
//
//        } return false;
//    }











    public static HiddenWord puzzle = new HiddenWord("HARPS");

    public static void main(String[] args) {
        int maxTries = 5;
        boolean UwU = false;

        for (int i = 0; i < maxTries; i++){
            if (UwU == true){
                System.out.print("You are winner!");
                break;
            }
            System.out.print("Im thinking of a 5 letter word, will you guess it?");
            Scanner number = new Scanner(System.in);
            String cc = number.nextLine();

            if (cc.equals(puzzle.getWord())){
                UwU = true;
            }else{
                System.out.print(getHint(cc) + " Nice try bozo" + "\r\n");
            }


        }
        System.out.print("You suck hahahaha lol git gut skill issue + l + ratio");

    }


    public static String getHint(String word){

        HashMap<Character, Character> ericWMap = new HashMap<Character, Character>();
        char[] test = puzzle.getWord().toCharArray();
        char[] playerWord = word.toCharArray();
        String result = "";
        for (int i = 0; i < test.length; i++){
            if(!ericWMap.containsKey(test[i])) {
                ericWMap.put(test[i], test[i]);
            } else{
                continue;
            }
        }

        for (int i = 0; i < test.length; i++){
            if (playerWord[i] == test[i]){
                result += playerWord[i];
            }

            else if (ericWMap.containsKey(playerWord[i])){
                result += "+";
            }

            else if (!ericWMap.containsKey(playerWord[i])){
                result += "*";
            }

        }

        return result;
    }


}
