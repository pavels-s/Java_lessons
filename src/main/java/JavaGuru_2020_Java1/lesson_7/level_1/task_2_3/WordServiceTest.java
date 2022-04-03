package main.java.JavaGuru_2020_Java1.lesson_7.level_1.task_2_3;

import java.util.Arrays;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class WordServiceTest {

    public static void main(String[] args) {

        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.testHowManyWordsInString();
        wordServiceTest.testFromStringToArray();
        wordServiceTest.testRepeatingNumberArray();
        wordServiceTest.testFindMostFrequentWord();
        wordServiceTest.mainTest();

    }
        void testHowManyWordsInString () {
            WordService wordService = new WordService();
            String testString = "five words in this string";
            if (wordService.howManyWordsInString(testString) == 5) {
                System.out.println("How many words in string test is OK");
            } else {
                System.out.println("How many words in string test is FAILED");
            }
        }

        void testFromStringToArray() {
            WordService wordService = new WordService();
            String testString = "this is five words array";
            String[] testArray = {"this", "is", "five", "words", "array"};

            if (Arrays.equals(wordService.fromStringToArray(testString), testArray)) {
                System.out.println("From string to array test is OK");
            } else {
                System.out.println("From string to array test is FAILED");
            }
        }

        void testRepeatingNumberArray() {
            WordService wordService = new WordService();
            String testString = "test string with string words for test";
            int[] testArray = {2, 2, 1, 2, 1, 1, 2};
            int[] returnedArray = wordService.repeatingNumberArray(testString);
            boolean areEqual = Arrays.equals(returnedArray, testArray);

            if (areEqual) {
                System.out.println("Number of repeating test is OK");
            } else {
                System.out.println("Number of repeating test is FAILED");
            }

        }

        void testFindMostFrequentWord() {
               WordService wordService = new WordService();
            String testString = "test string with string words for test";

            if (wordService.findMostFrequentWord(testString).equals("test")) {
                System.out.println("Most frequent word test is OK");
            } else {
                System.out.println("Most frequent word test is FAILED");
            }
        }

            void mainTest() {
                WordService wordService = new WordService();

                String text = "my new test string to test this new test";

                if (wordService.findMostFrequentWord(text).equals("test")) {
                    System.out.println("Main test is OK");
                } else {
                    System.out.println("Main test is FAILED");
                }
            }


}
