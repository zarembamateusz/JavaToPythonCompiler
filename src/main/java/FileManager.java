import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class FileManager {

    public static void saveFile(List<String> lines){
        try {
            PrintWriter save = new PrintWriter("main.py");
            for(String line : lines)
                save.println(line);

            save.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
