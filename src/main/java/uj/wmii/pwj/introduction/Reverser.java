package uj.wmii.pwj.introduction;

public class Reverser {

    public String reverse(String input) {
        if(input == null) return input;
        input = input.trim();
        input = new StringBuilder(input).reverse().toString();
        return input;
    }

    public String reverseWords(String input) {
        if(input == null) return input;
        input = input.trim();
        String[] words = input.split(" ");
        StringBuilder reversedWords = new StringBuilder();
        for (String word : words)
        {
            reversedWords.append(reverse(word));
            reversedWords.append(" ");
        }
        return reverse(reversedWords.toString());
    }

}
