/**
 * Created by changuito on 2/18/16.
 */
public class PalindromeNumber {

    public static void main (String[] args) {

        for (int i = 999; i > 0 ; i--) {
            PalindromeNumber num = null;
            for (int j = i; j > 0; j--) {
                num = new PalindromeNumber(i, j);
                num.checkIfPalindrome();
                if (num.isPalindrome)
                    return;
            }
            if (num.isPalindrome)
                return;
        }

    }

    private int value = 0;
    private int firstFactor = 0;
    private int secondFactor = 0;
    private boolean isPalindrome = false;

    public PalindromeNumber (int firsNum, int secondNum) {
        this.value = firsNum * secondNum;
        this.firstFactor = firsNum;
        this.secondFactor = secondNum;
        this.isPalindrome = false;
    }

    private void checkIfPalindrome () {
        int length = String.valueOf(this.value).length();
        String valueString = String.valueOf(this.value);
        for (int i = 0; i < (length / 2) ; i++) {
            char a_char = valueString.charAt(i);
            char b_char = valueString.charAt(length-(i+1));
            if (a_char != b_char) {
                return;
            } else {
                if (i == (length/2 -1)) {
                    this.isPalindrome = true;
                    System.out.println("This is a Palindrome and its value is: " + this.value + " and the two factors are: " + this.firstFactor + " , " + this.secondFactor);
                }
            }
        }
    }

    @Override
    public String toString () {
        return "The value of Palindrome is " + this.value + " and its two factors are " + this.firstFactor + " , " + this.secondFactor;
    }
}
