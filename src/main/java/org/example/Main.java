package org.example;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {


    // Palindrom kontrolü
    public static boolean checkForPalindrome(String input) {
        if (input == null) return false;

        StringBuilder cleaned = new StringBuilder();


        for (char c : input.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }

        String s = cleaned.toString();
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // 🔹 Convert Decimal Numbers To Binary
    public static String convertDecimalToBinary(int number) {
        if (number == 0) {
            return "0";
        }

        Deque<Integer> stack = new ArrayDeque<>();
        int n = number;

        while (n > 0) {
            int remainder = n % 2;
            stack.push(remainder);
            n /= 2;
        }

        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }

        return binary.toString();
    }

    public static void main(String[] args) {
        // İstersen elinle test etmek için:
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("Racecar"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));

        System.out.println(convertDecimalToBinary(5));
        System.out.println(convertDecimalToBinary(6));
        System.out.println(convertDecimalToBinary(13));
    }
}
