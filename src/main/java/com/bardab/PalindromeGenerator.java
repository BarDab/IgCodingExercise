package com.bardab;
import java.math.BigInteger;

public class PalindromeGenerator {

    private int iterations;
    private BigInteger palindrome;

    public PalindromeGenerator() {
        this.iterations=0;
        palindrome = new BigInteger("0");
    }

    public PalindromeGenerator(int iterations) {
        this.iterations=iterations;
    }


    public PalindromeGenerator(int iterations, BigInteger palindrome) {
        this.iterations = iterations;
        this.palindrome = palindrome;
    }

    public PalindromeGenerator arriveAtPalindrome(String input){
        int iterations = 0;

        if(!isInteger(input)){return new PalindromeGenerator();}


        try{
        BigInteger palindrome = new BigInteger(input);

        while(!isPalindrome(palindrome.toString())){
            BigInteger reversedNumber = new BigInteger(reverseOrder(palindrome.toString()));
            palindrome = palindrome.add(reversedNumber);
            iterations++;
            if(iterations>=1000){
                return new PalindromeGenerator(iterations);
            }

        }

        return new PalindromeGenerator(iterations,palindrome);
        }
        catch (NumberFormatException e){
            System.out.println("Generated value is bigger than integer capacity");
            return new PalindromeGenerator(iterations);

        }
    }

    public String reverseOrder(String text){
        return new StringBuilder(text).reverse().toString();
    }


    public boolean isPalindrome(String input){

        String[] digits = input.split("");
        for(int i=0;i<digits.length/2;i++){
            if(!digits[i].equals(digits[digits.length-i-1])){
                return false;
            }
        }
        return true;
    }

    public boolean isInteger(String input){
        try{
            Integer.parseInt(input);
            return true;
        }
        catch(NumberFormatException e){
            System.out.println("Value passed is too big or its not an integer");
            return false;
        }
    }


    public int getIterations() {
        return iterations;
    }

    public BigInteger getPalindrome() {
        return palindrome;
    }
}
