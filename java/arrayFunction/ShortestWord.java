package arrayFunction;
//
public class ShortestWord {
//    public String getShortestWord(String sentence){
//        if(sentence == null || sentence.trim().isEmpty()){
//            throw new IllegalArgumentException("Sentence cannot be null or empty");
//        }
//        sentence = sentence.trim();
//        String[] words = sentence.split("\\s+");
//        String shortestWords = words[0];
//        for(String word : words){
//           if(word.length() < shortestWords.length()){
//               shortestWords = word;
//           }
//
//            }
//        return shortestWords;
//        }
//    }
//

public static String getShortestWord(String sentence) {
    String shortest = "";
    String word = "";

    for (int index = 0; index < sentence.length(); index++) {
        char character = sentence.charAt(index);

        if (character != ' ' && character != '.') {
            word += character;
        } else {
            if (!word.isEmpty()) {
                if (shortest.isEmpty() || word.length() < shortest.length()) {
                    shortest = word;
                }
                word = "";
            }
        }
    }
    if (!word.isEmpty()) {
        if (shortest.isEmpty() || word.length() < shortest.length()) {
            shortest = word;
        }
    }
    return shortest;
}}
