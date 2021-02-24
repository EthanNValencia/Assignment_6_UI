package WordCounter;

/***
 * Constants interface that is used to provide easy of use for changing the web page URL and directory locations.
 * Contains the stringArray and charArray, these arrays are used to specify text deletion.
 * If the user is experience I/O exceptions, modifying the directories is a viable troubleshooting technique.
 */

public interface CONSTANTS {
    /***
     * This is the directory path where the downloaded text will be saved.
     */
    String downloadDirectory = "./EthanJNephewMod2SDLCDownloadedPage.txt";
    /***
     * This is the directory path where the normalized text will be saved.
     */
    String normalizedDirectory = "./EthanJNephewMod2SDLCNormalizedPage.txt";
    /***
     * This is the directory path where the word report text will be saved.
     */
    String wordReportDirectory = "./EthanJNephewMod2SDLCWordReport.txt";
    /***
     *  This is the URL path of the website that the program will process.
     */
    String websiteURL = "https://www.gutenberg.org/files/1065/1065-h/1065-h.htm";
    /***
     *  This is the array of strings that the program will delete during the text normalization process.
     */
    String[] stringArray = new String[]{"<br />", "<I>", "&mdash;", "</i>", "<i>", "</span>", "<span style=\"margin-left: 20%\">"};
    /***
     * This is the array of chars that the program will delete during the text normalization process.
     */
    char[] charArray = {'”', ',', '.', '\'', ';', '\"', '!', '?', '“'};
}
