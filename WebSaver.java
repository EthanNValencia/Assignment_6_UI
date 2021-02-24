package WordCounter;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/***
 * Method that is used to read a source page.
 */
public class WebSaver implements CONSTANTS {

    /***
     * Method used to download the specified HTML source page and conduct basic text filtering. Filters text based on individual line contents.
     */
    public static void writePageToFile() {
        try {
            URL url = new URL(websiteURL);
            Scanner scan = new Scanner(url.openStream());
            String reader = "";
            String content = "";
            while (scan.hasNextLine()) {
                reader = scan.nextLine() + "\n";
                    if (reader.contains("<br />") && !reader.contains("<div") && !reader.contains("<span") || reader.contains("<span style=\"margin-left: 20%\">")) // specifies textual markers
                        content = content.concat(reader);
            }
            WriteToFile.writeThisToFile(downloadDirectory, content);
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}
