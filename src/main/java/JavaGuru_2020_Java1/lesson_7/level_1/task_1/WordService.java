package main.java.JavaGuru_2020_Java1.lesson_7.level_1.task_1;

class WordService {


    public String findMostFrequentWord(String text) {

        int blockCount = text.split(" ").length;
        String[] wordsArray = new String[blockCount];

        int wordsTotalNumber = 0;

        for (String retval : text.split(" ")) {
            //System.out.println(retval);
            wordsArray[wordsTotalNumber] = (retval);
            wordsTotalNumber++;
        }

        int[] wordsArrayPosition = new int[wordsTotalNumber];

        for (int j = 0; j < wordsTotalNumber; j++ ) {
            for (int n = 0; n < wordsTotalNumber; n++) {
                if (wordsArray[j].equals(wordsArray[n])) {
                    wordsArrayPosition[n] = wordsArrayPosition[n] + 1;
                }
            }
        }

        int maxRepeat = 0;
        String bestWord = null;
        for (int i = 0; i < wordsTotalNumber; i++) {
            if (maxRepeat < wordsArrayPosition[i]) {
               bestWord = wordsArray[i];
            }
        }

        return bestWord;
    }

}