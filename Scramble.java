import java.util.ArrayList;

public class Scramble {
    public static String scrambleWord(String word){
        String result = "";
        for (int i = 0; i < word.length()-1; i++){
            if((word.charAt(i) == 'A') && (word.charAt(i+1) != 'A')){
                result = result + word.charAt(i+1);
                result = result + word.charAt(i);
                i++;
            }else{
                result = result + word.charAt(i);
            }
        }
        if (result.length() == word.length()-1) {
            result += word.charAt(word.length() - 1);
        }
        return result;
    }

    public static ArrayList<String> scrambleOrRemove(ArrayList<String> E){
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < E.size(); i++){
            if (scrambleWord(E.get(i)).equals(E.get(i))){
                continue;
            }else{
                result.add(scrambleWord(E.get(i)));
            }
        }
        return result;
    }



    public static void main(String[] args){
        ArrayList<String> wordList = new ArrayList<String>();
        wordList.add("TAN");
        wordList.add("ABRACADABRA");
        wordList.add("WHOA");
        wordList.add("APPLE");
        wordList.add("EGGS");

        System.out.print(scrambleOrRemove(wordList));

    }

}