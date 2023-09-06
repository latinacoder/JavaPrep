// Challenge: Reverse a String
// Write a Java function that takes a string as input and returns the reverse of that string.
// You should not use any built-in reverse or string manipulation functions.
// Instead: implement the reverse logic manually.

// for example: if the input string is "Hello World". the function should return "!dlroW ,olleH".

// Step 1: Input validation:
// before we start reversing a string, we should check if the input it valid. We need to handle cases where the input is null or empty.
// If the input is null or empty, we can simply return it as there is nothing to reverse.

// Step 2: Convert to CharacterArray
// To reverse a string in Java, we typically convert it into a character array. This allows us to work with individual characters and swap them in place. We do this by calling `toCharArray()` on the input string.
// notes: input.toCharArray() is a method provided by the `String` class in Java. when you can it, it returns an array of characters containing the same characters as the string.

//Step 3: Initialize Pointers:
// We use two pointers, one starting from the beginning of the character array (`left`) and the other starting from the end (`right`). These pointers will move towards the center of the array as we swap characters.

//Step 4: Swap Characters:
// we initiate a loop that continues as long as the `left` pointer is less than the `right` pointer.
// Inside the loop, we swap the characters at the `left` and `right` positions.

//Step 5: Convert Back to String
// After the loop completes, we have successfully reversed the characters in the character array. To get the reversed string

// Step 6: Return result
// we return the `reversedString`, which is the reversed form of the input string.
public class ReverseAString1 {

    public static String reverseString (String input){
        // you code here

        //Step 1: Input validation
        if (input == null || input.isEmpty()){
            return input;
        }

        // Step 2: Convert to CharacterArray
        char[] charArray = input.toCharArray();

        // Step 3: Initialize pointers
        int left = 0;
        int right = charArray.length -1;

        //Step 4: Swap characters:
        while (left < right){
            // swap charArray[left] and charArray[right]
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move the pointers towards the center
            left++;
            right--;
        }

        // Convert the reversed character array back to a string
        String reversedString = new String(charArray);

        // Return the reversed string
        return reversedString;
    }

    public static void main (String[]args){
        System.out.println(reverseString("Hello World it's Jess. I know coding challenges are intimidating and there is so much to study for, but we got this!"));
    }
}
