package Strings;

public class StringFunctions {
    public static void main(String[] args) {
        String str = "Hello World!";
        
        // length() - returns the length of the string
        int length = str.length();
        System.out.println("Length: " + length);
        
        // charAt() - returns the character at the specified index
        char firstChar = str.charAt(0);
        System.out.println("First character: " + firstChar);
        
        // substring() - returns a substring of the original string
        String substring = str.substring(7);
        System.out.println("Substring from index 7: " + substring);
        
        // indexOf() - returns the index of the first occurrence of a specified character or substring
        int index = str.indexOf("World");
        System.out.println("Index of 'World': " + index);
        
        // toLowerCase() - converts the string to lowercase
        String lowercase = str.toLowerCase();
        System.out.println("Lowercase: " + lowercase);
        
        // toUpperCase() - converts the string to uppercase
        String uppercase = str.toUpperCase();
        System.out.println("Uppercase: " + uppercase);
        
        // replace() - replaces all occurrences of a specified character or substring with another character or substring
        String replaced = str.replace("Hello", "Hi");
        System.out.println("Replaced string: " + replaced);
        
        // trim() - removes leading and trailing whitespace from the string
        String trimmed = "   Hello, World!   ".trim();
        System.out.println("Trimmed string: " + trimmed);
        
        // split() - splits the string into an array of substrings based on a specified delimiter
        String[] splitArray = str.split(" ");
        System.out.println("Split array: ");
        for (String s : splitArray) {
            System.out.println(s);
        }
    }
}
