package com.bardab;

public class CreditCardNumberValidator {


    public boolean validateCreditCardNumberUsingLuhnChecksum(String creditCardNumber){

        int sumOfDigits = 0;
        boolean toBeDoubled = false;

        if(validateIfNotNullOrEmpty(creditCardNumber)==false){
            return false;
        }

        try {
            String[] creditCardNumberDigits = creditCardNumber.split("");
            for(int d =creditCardNumberDigits.length-1;d>=0;d--){
                int digit = Integer.parseInt(creditCardNumberDigits[d]);
                if(toBeDoubled){
                    if(digit*2>9){
                        sumOfDigits+=digit*2-9;
                    }
                    else sumOfDigits+=digit*2;
                    toBeDoubled = false;
                }

                else {
                    sumOfDigits+=digit;
                    toBeDoubled = true;
                }
            }
            if(sumOfDigits%10==0){
                return true;
            }
            else return false;
        }

        catch (NumberFormatException e){
            e.printStackTrace();
            System.out.println("Credit card number should consists of digits only");
            return false;
        }


    }


    public static boolean validateIfNotNullOrEmpty(String input){

        return !(input==null||input.isEmpty());
    }

}
