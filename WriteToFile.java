package WordCounter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/***
 * Class definition used to write a string to a text file.
 */
public class WriteToFile {

    /***
     * Method that receives a string and writes that string to a text file at the specified directory.
     * @param directory Requires the path directory for the file to be written to.
     * @param content Requires the string of content that is to be written to the file.
     * @throws IOException Throws an input output exception, which is a critical failure.
     */
    public static void writeThisToFile(String directory, String content) throws IOException {
        FileWriter fw = new FileWriter(directory);
        PrintWriter writer = new PrintWriter(directory); // this will erase the file
        writer.print("");
        writer.close();
        fw.write(content);
        fw.close();
    }
}
