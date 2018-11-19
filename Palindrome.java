//25 вариант

public class Palindrome {
    public static boolean checkForPalindrome(String word){

        if(word.length() == 0 ){
            System.out.println("Пустое значение недопустимо!");
            return false;
        }

        char f = word.charAt(0);
        char l = word.charAt(word.length() - 1);
        String nextPart = word.substring(1, word.length() - 1);
        if (f != l){
            System.out.println("NO");
            return false;
        }
        else if (nextPart.length() <= 1){
            System.out.println("YES");
            return true;
        }
        else{
            return checkForPalindrome(nextPart);
        }
    }

    public static void main(String[] args) {
        checkForPalindrome("aam");
        checkForPalindrome("");
        checkForPalindrome("aba");
        checkForPalindrome("bl");
    }
}
