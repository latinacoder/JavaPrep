public static boolean hasSharedDigit(int number1, int number2) {
    // Check if both numbers are within the range of 10 (inclusive) to 99 (inclusive).
    if ((number1 < 10 || number1 > 99) || (number2 < 10 || number2 > 99)) {
        return false; // Return false if either number is out of range.
    }

    // Create variables to store the digits of each number.
    int digit1;
    int digit2;

    int tempNumber1 = number1; // Create temporary variables to preserve original values.
    int tempNumber2 = number2;

    while (tempNumber1 > 0) {
        digit1 = tempNumber1 % 10; // Get the rightmost digit of number1.
        tempNumber2 = number2; // Reset tempNumber2 for each iteration.

        while (tempNumber2 > 0) {
            digit2 = tempNumber2 % 10; // Get the rightmost digit of number2.

            if (digit1 == digit2) {
                return true; // Found a shared digit, return true.
            }

            tempNumber2 /= 10; // Remove the rightmost digit from tempNumber2.
        }

        tempNumber1 /= 10; // Remove the rightmost digit from tempNumber1.
    }

    // If no shared digit was found in the loop, return false.
    return false;
}





// 1. **Input Validation**: The method starts by checking if both `number1` and `number2` are within the range of 10 to 99 (inclusive). If either number is outside this range, the method returns `false` as per the problem statement.

// 2. **Initialization**: The code then creates temporary variables (`tempNumber1` and `tempNumber2`) to preserve the original values of `number1` and `number2`.

// 3. **Outer `while` Loop (Extracting Digits from `number1`)**:
//    - The outer `while` loop iterates through the digits of `number1`. It continues until `tempNumber1` becomes 0, which means all digits have been processed.
//    - Inside this loop, `digit1` is calculated by taking the remainder (`%`) of `tempNumber1` divided by 10. This extracts the rightmost digit of `number1`.
//    - `tempNumber2` is reset to `number2` at the beginning of each outer loop iteration to ensure that we compare `digit1` with all digits of `number2`.

// 4. **Inner `while` Loop (Comparing Digits with `number2`)**:
//    - The inner `while` loop iterates through the digits of `number2`. Similar to the outer loop, it continues until `tempNumber2` becomes 0.
//    - Inside this loop, `digit2` is calculated by taking the remainder (`%`) of `tempNumber2` divided by 10. This extracts the rightmost digit of `number2`.
//    - The code then checks if `digit1` is equal to `digit2`. If they are equal, it means a shared digit has been found, and the method returns `true`.

// 5. **Updating `tempNumber1` and `tempNumber2`**:
//    - After each iteration of the inner loop, `tempNumber2` is divided by 10 to remove its rightmost digit. This allows us to compare `digit1` with the next digit of `number2` in the next iteration.
//    - Similarly, after each iteration of the outer loop, `tempNumber1` is divided by 10 to move on to the next digit of `number1`.

// 6. **Completion and Return**: If no shared digit is found in the nested loops, the method returns `false`.

// In summary, this implementation uses nested `while` loops to compare each digit of `number1` with all digits of `number2`. If any pair of digits match, the method returns `true`, indicating the presence of a shared digit. If no match is found after examining all digit pairs, it returns `false`. This approach ensures that every digit in both numbers is considered for comparison.
