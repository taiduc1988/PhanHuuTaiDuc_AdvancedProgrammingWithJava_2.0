package B16_IO_TextFile.ReadCSV;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFileCsv {
    private static final String PATH_FILE = "src/B16_IO_TextFile/ReadCSV/text.csv";

    public static void main(String[] args) {

        try {
            BufferedReader reader = Files.newBufferedReader(Paths.get(PATH_FILE));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] str = line.split(",");
                System.out.println("code: " + str[4] + " country: " + str[5]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
