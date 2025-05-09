public class WordCounter {

    public static int countWords(String line) {
        if (line == null || line.isEmpty()) {
            return 0;
        }
        return line.trim().split("\\s+").length;
    }
}