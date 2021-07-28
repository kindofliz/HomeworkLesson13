import java.util.Locale;
import java.util.Scanner;

public class Homework13 {
    public static void main(String[] args) {

        //HOMEWORK PRACTICE TASK 1
        System.out.println("------------------------HOMEWORK PRACTICE TASK 1---------------------------------");
        System.out.println();

        //Create a String array with following values: “Copenhagen”, “Paris”, “Tokyo”, “Bristol”, “Mumbai”, “Delhi”, “Riga”, “Vienna”, “Warsaw”, "Hamburg", "Cesis";
        String[] citiesArray = {"Copenhagen", "Paris", "Tokyo", "Bristol", "Mumbai", "Delhi", "Riga", "Vienna", "Warsaw", "Hamburg", "Cesis"};



        //1. Find out how many values are starting with ‘C’;
        int counterC = 0;
        for (int i = 0; i < citiesArray.length; i++) {
            if (citiesArray[i].matches("^C.*")) {
                counterC++;
            }
        }
        System.out.println("Number of values starting with 'C': " + counterC);




        //2. Find out how many values are ending with “i”; EXAMPLE 1
        int counterI = 0;
        for (int i = 0; i < citiesArray.length; i++) {
            if (citiesArray[i].matches(".*i")) {
                counterI++;
            }
        }
        System.out.println("Number of values ending with 'i': " + counterI);




        //3. Find out how many values are with length 5
        int counterFive = 0;
        for (int i = 0; i < citiesArray.length; i++) {
            if (citiesArray[i].length() == 5) {
                counterFive++;
            }
        }
        System.out.println("Number of values with the length of 5 letters: " + counterFive);




        //4. Find out how many values holds the character “e”
        int counterE = 0;
        for (int i = 0; i < citiesArray.length; i++) {
            if (citiesArray[i].matches(".*e.*")) {
                counterE++;
            }
        }
        System.out.println("Number of values holding the char 'e': " + counterE);




        //5. Find out is there any element which holds the subString “en”
        int counterEn = 0;
        for (int i = 0; i < citiesArray.length; i++) {
            if (citiesArray[i].matches(".*en.*")) {
                counterEn++;
            }
        }
        System.out.println("Yes, there are " + counterEn + " elements that hold the subString 'en'.");




        //6. *Create numerical array and, using LOOP fill it with corresponding lengths of values from array with city names, like: Copenhagen = 10, Paris = 5...
        System.out.println("----------------------------------THE NUMERICAL ARRAY------------------------------------");

        int[] numCities = {citiesArray[0].length(),citiesArray[1].length(),citiesArray[2].length(),citiesArray[3].length(),citiesArray[4].length(),citiesArray[5].length(),citiesArray[6].length(),citiesArray[7].length(),citiesArray[8].length(),citiesArray[9].length(),citiesArray[10].length()};

        //FILLING/PRINTING THE ARRAY with corresponding numbers, using FOR EACH loop.
        for (int tempVar : numCities)
            System.out.println(tempVar);

//        System.out.println("Numerical array printed out in a string representation: " + Arrays.toString(numCities));









        //CLASS WORK - SEARCH MENU FOR THE ARRAY 28.08 //SECOND PART OF HOMEWORK
        Scanner scanner = new Scanner(System.in);



        //CLASS TASK WITH USER INPUT - THE LAST PART
        System.out.println("Please input the part of the name here: ");
        String userInput = scanner.next();

        for (String city: citiesArray) {
            if (city.matches(".*"+userInput+".*")) {
                System.out.println("This city matches with the RegEx: \"" + userInput + "\" | " + city);
            }
        }



        //CLASS TASK WITH USER INPUT - THE LAST PART
        //CASE INSENSITIVE METHOD with regex
        //WE WILL LOWER THE CASE OF THE USER INPUT AND THE CITY
        System.out.println("Please input the part of the name here: ");
        String userInput2 = scanner.next();

        for (String city: citiesArray) {
            if (city.toLowerCase().matches(".*"+userInput2.toLowerCase()+".*")) {
                System.out.println("This city matches with the RegEx: \"" + userInput + "\" | " + city);
            }
        }


        //CASE INSENSITIVE METHOD without regex - ONLY FOR THE FIRST LETTER (CHAR)
        //WE WILL LOWER THE CASE OF THE USER INOUT AND THE CITY
        System.out.println("Please input the part of the name here: ");
        String userInput3 = scanner.next();

        for (String city: citiesArray) {
            if (city.toLowerCase().charAt(0) == userInput3.toLowerCase().charAt(0)) {
                System.out.println("This city matches with the RegEx: \"" + userInput + "\" | " + city);
            }
        }







        //REGEX EXAMPLES - CLASS
        //A.*s -> starts with a ends with s
        //^Starts with
        //contains only letters a.....z (lower case only) -> [a-z]+
        //lower and upper case letters -> [a-zA-Z]
        //looking for a digit -> \\d (a single digit) SAME AS [0-9]

        //VALIDATE YEAR RANGE: 1900 - 2100 -> [0-9]{4}
        String validInput = "2020";
        String invalidInput = "99999";

        //Good but can be better! Look below!
        //correct input (also works = ("\\d\\d\\d\\d")
        if("2020".matches("[0-9]{4}")){
            System.out.println("Valid input is a valid year!");
        } else {
            System.out.println("Valid input is not a valid year");
        }


        //BETTER WAY TO VALIDATE YEAR RANGE 1900 - 2100
        //but this would also validate year 2999 for example..
        if("2999".matches("[0-2][019][0-9][0-9]")){
            System.out.println("Valid input is a valid year! Enhanced validation rules!");
        } else {
            System.out.println("Valid input is not a valid year");
        }


        //EVEN BETTER WAY TO VALIDATE YEAR RANGE 1900 - 2100
        if("2099".matches("((19|20)\\d\\d|2100)")){
            System.out.println("Valid input is a valid year! Fully working!");
        } else {
            System.out.println("Valid input is not a valid year. Fully working!");
        }










    }
}
