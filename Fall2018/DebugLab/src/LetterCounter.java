/*
    Counts the number of letters in a word. Word supplied via argument.
    CNA337
    Zachary Rubin zrubin@rtc.edu
 */

class LetterCounter {
  public static void main (String[] args) {
    int LetterCount = 0;
    String check_word = args[0];
    String single_letter = "";
    int i;
    for (i = 0; i< check_word.length(); i++) {
      single_letter = check_word.substring(1, 1);
      if (single_letter.equals("g")) {
        LetterCount++;
      }
    }
    System.out.println("G was found " + LetterCount + " times in the word " + check_word);
  }
}