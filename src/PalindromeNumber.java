/**
 * Created by changuito on 2/18/16.
 */
public class PalindromeNumber {

    public static void main(String[] args) {

        for (int i = 999; i > 0; i--) {
            String stringNum = (Integer.toString(i));
            char[] firstHalf = stringNum.toCharArray();
            char[] secondHalf = reverseCharacters(firstHalf);
            String secondHalfString = String.copyValueOf(secondHalf);
            String palindromicString = stringNum + secondHalfString;
            int palindromicNum = Integer.parseInt(palindromicString);
            System.out.println("The current palindromic number is: " + palindromicNum);
            for (int j = 999; j > 0; j--) {
                if (palindromicNum % j == 0 && palindromicNum/j < 1000) {
                    System.out.println(" The largest palindrome number found is: " + palindromicNum + " and its factros are: " + j + " , " + palindromicNum / j);
                    return;
                }
            }
        }
    }

    private static char[] reverseCharacters(char[] origArray) {
        char[] reversedCharacterArray = new char[3];
        for (int i = origArray.length - 1; i >= 0; i--) {
            reversedCharacterArray[origArray.length - (i + 1)] = origArray[i];
        }
        return reversedCharacterArray;
    }
}