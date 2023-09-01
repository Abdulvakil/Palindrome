import java.util.Scanner;

public class Palindromes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Palindrome is a word that reads the same BACKWARDS");
        System.out.println("--------------------------------------------------");
        System.out.println("Please enter a word to check if it is a palindrome: ");
        //getting user input, converting the capitals to lowercase, then removing the spaces between words
        String name = scanner.nextLine().toLowerCase();
        name = name.replace(" ", "");

        String reverse = "";
        for (int i = name.length() - 1; i >= 0; i--){
            reverse += name.charAt(i);
        }

        boolean palindrome = true;
        for (int i = 0; i < name.length(); i++){
            if (name.charAt(i) != reverse.charAt(i)){
                palindrome = false;
            }
        }
        if (palindrome){
            System.out.println("This is a palindrome!");
        }
        else {
            System.out.println("This is NOT a palindrome!");
        }
    }
}
