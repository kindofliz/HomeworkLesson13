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




        //2. Find out how many values are ending with “i”; EXAMPE 1
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







    }
}
