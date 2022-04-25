package main.java.student_pavel_sharkel.lesson_7.level_1.task_2_3;

import main.java.teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
class WordService {



    public int howManyWordsInString(String text) {
        return text.split(" ").length;
    }

    public String[] fromStringToArray(String text) {
        @CodeReviewComment(teacher = "Зачем тут создавать инстанцию WordService?")
    	WordService wordService = new WordService();
        String[] wordsArray = new String[wordService.howManyWordsInString(text)];

        int wordsTotalNumber = 0;
        for (String retVal : text.split(" ")) {
            wordsArray[wordsTotalNumber] = (retVal);
            wordsTotalNumber++;
        }
        return wordsArray;
    }

    public int[] repeatingNumberArray(String text) {
		@CodeReviewComment(teacher = "Зачем тут создавать инстанцию WordService?")
        WordService wordService = new WordService();
        int wordsTotalNumber = wordService.howManyWordsInString(text);
        int[] wordsArrayPosition = new int[wordsTotalNumber];

        for (int j = 0; j < wordsTotalNumber; j++) {
            for (int n = 0; n < wordsTotalNumber; n++) {
                if (fromStringToArray(text)[j].equals(fromStringToArray(text)[n])) {
                    wordsArrayPosition[n]++;
                }
            }
        }
        return wordsArrayPosition;
    }

    public String findMostFrequentWord(String text) {
		@CodeReviewComment(teacher = "Зачем тут создавать инстанцию WordService?")
        WordService wordService = new WordService();
        int wordsTotalNumber = wordService.howManyWordsInString(text);
        int maxRepeat = 0;
        int[] frequentArray = wordService.repeatingNumberArray(text);
        String[] wordsArray = wordService.fromStringToArray(text);
        String bestWord = null;
        for (int i = 0; i < wordsTotalNumber; i++) {
            //System.out.println(frequentArray[i]);
            if (maxRepeat < frequentArray[i]) {
               bestWord = wordsArray[i];
            }
        }

        return bestWord;
    }

}