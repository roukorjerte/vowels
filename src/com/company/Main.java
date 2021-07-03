package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter your word please: ");
        Scanner word = new Scanner(System.in);
        String newWord = word.nextLine();
        int vowelCount = 0;

        for (int i=0 ; i<newWord.length(); i++){
            char character = newWord.charAt(i);
            if(character == 'a'|| character == 'e'|| character == 'i' ||character == 'o' ||character == 'u'){
                vowelCount ++;
            }
        }
        System.out.println("Number of vowels in the word is "+vowelCount);

    }
}
