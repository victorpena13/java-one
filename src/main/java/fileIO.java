import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class fileIO {

    public static void main(String[] args) throws IOException {
        String directory = "data";
        String filename = "groceries.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        if(Files.notExists(dataDirectory)) {
            Files.createDirectories(dataDirectory);
        }

        if(! Files.exists(dataFile)) {
            Files.createFile(dataFile);
        }

        List<String> groceryList = Arrays.asList("coffee", "milk", "sugar");
        Path filepath = Paths.get("data", "groceries.txt");

        Files.write(filepath, groceryList);

    }


}