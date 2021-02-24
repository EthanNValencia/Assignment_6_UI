package WordCounter;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/***
 * This class is used to count post-normalized text from a specified .txt directory.
 */
public class WordCounter implements CONSTANTS{

    /***
     * This method counts the word occurrences in a pre-normalized text file. It saves the occurence count in an ArrayList
     * and it sorts the occurrences from most frequent to least frequent. The method concludes with writing the ArrayList to
     * a text file.
     */
    public static void countTheWords(){
        ArrayList<Word> wordList = new ArrayList<Word>();
        File file = new File(normalizedDirectory);
        try(Scanner scan = new Scanner(new FileInputStream(file))){
            int count=0;
            while(scan.hasNext()){
                Word nextWord = new Word(scan.next());
                if(wordList.contains(nextWord)) {
                    wordList.get(wordList.indexOf(nextWord)).addWordCount();
                } else {
                    nextWord.addWordCount();
                    wordList.add(nextWord);
                }
                count++;
            }
            System.out.println("Number of words: " + count);
            Collections.sort(wordList, new Comparator<Word>() {
                @Override
                public int compare(Word o1, Word o2) {
                    return Integer.valueOf(o2.getWordCount()).compareTo(o1.getWordCount());
                }
            });
            WriteToFile.writeThisToFile(wordReportDirectory, wordList.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
