package WordCounter;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/***
 * Class for normalizing text.
 */
public class StringCleaner implements CONSTANTS{

    /***
     * Method that reads from a text file. Deletes specified html tags and punctuation. Concludes by setting text to upper case.
     *
     */
    public static void cleanTheString(){
        File file = new File(downloadDirectory);
        try (Scanner scan = new Scanner(new FileInputStream(file))) {
            String reader = "";
            String content = "";

            while (scan.hasNextLine()) {
                reader = scan.nextLine() + "\n";
                for (int i = 0; i <stringArray.length; i++){
                    if (reader.contains(stringArray[i])){
                        reader = reader.replaceAll(stringArray[i], " ");
                    }
                }
                for (int i = 0; i < charArray.length; i++){
                    reader = reader.replace(charArray[i], ' ');
                }
                reader = reader.replaceAll("\\s+", " "); // deletes spaces
                reader = reader + "\n"; // ensures that the reader continues to the next line
                reader = reader.toUpperCase(); // converts all to upper case
                content = content.concat(reader); // saves all the changes to the content string
            }
            WriteToFile.writeThisToFile(normalizedDirectory, content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
