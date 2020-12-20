package BT3;

public class FizzBuzzTranslate {
    public static String CheckFizzBuzz(int number) {
        if (isFizz(number) && isBuzz(number))return "FizzBuzz";
        if (isFizz(number)) return "Fizz";
        if (isBuzz(number)) return "Buzz";
        return FizzBuzzTranslate(number);
    }

    private static boolean isBuzz(int number) {
        return number % 5 ==0;
    }

    private static boolean isFizz(int number) {
        return number % 3 == 0;
    }

    public static String FizzBuzzTranslate(int number) {
        String result = "";
        if (number < 1 || number > 99) {
            return "Error";
        } else {
            int hundreds = number / 100;
            int tens = number / 10;
            int unit = number % 10;
            if (number >= 100){
                switch (hundreds){
                    case 1: result += "one hundred "; break;
                    case 2: result += "two hundred "; break;
                    case 3: result += "three hundred "; break;
                    case 4: result += "four hundred "; break;
                    case 5: result += "five hundred "; break;
                    case 6: result += "six hundred "; break;
                    case 7: result += "seven hundred "; break;
                    case 8: result += "eight hundred "; break;
                    case 9: result += "nine hundred "; break;
                }
            }
            if (number >= 20){
                switch (tens){
                    case 2: result += "twenty "; break;
                    case 3: result += "thirty "; break;
                    case 4: result += "forty "; break;
                    case 5: result += "fifty "; break;
                    case 6: result += "sixty "; break;
                    case 7: result += "seventy "; break;
                    case 8: result += "eighty "; break;
                    case 9: result += "ninety "; break;
                }
            }
            if (number < 20){
                switch (number){
                    case 10: result += "ten"; break;
                    case 11: result += "eleven"; break;
                    case 12: result += "twelve"; break;
                    case 13: result += "thirteen"; break;
                    case 14: result += "fourteen"; break;
                    case 15: result += "fifteen"; break;
                    case 16: result += "sixteen"; break;
                    case 17: result += "seventeen"; break;
                    case 18: result += "eighteen"; break;
                    case 19: result += "nineteen"; break;
                }
            }
            if (number > 20 || number <10){
                switch (unit){
                    case 1: result += "one"; break;
                    case 2: result += "two"; break;
                    case 3: result += "three"; break;
                    case 4: result += "four"; break;
                    case 5: result += "five"; break;
                    case 6: result += "six"; break;
                    case 7: result += "seven"; break;
                    case 8: result += "eight"; break;
                    case 9: result += "nine"; break;
                }
            }
            return result;
        }
    }

}
