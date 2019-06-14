import java.io.*;
import java.util.List;

public class FileManager {

    private static String getCurrenPath(){
        try {
            return new java.io.File( "." ).getCanonicalPath();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }

    }

    public static void saveFile(List<String> lines){
        try {
            PrintWriter save = new PrintWriter(getCurrenPath()+"\\program.py");
            for(String line : lines)
                save.println(line);

            save.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public  static String readFile(){
        FileReader file = null;
        StringBuilder code = new StringBuilder();
        String line = "";

        try {

            file = new FileReader(getCurrenPath()+"\\program.java");
        } catch (FileNotFoundException e) {
            System.out.println("BŁĄD PRZY OTWIERANIU PLIKU!");
            System.exit(1);
        }

        BufferedReader bfr = new BufferedReader(file);
        try {
            while((line = bfr.readLine()) != null){
                code.append(line);
                code.append("\n");
            }
        } catch (IOException e) {
            System.out.println("BŁĄD ODCZYTU Z PLIKU!");
        }

        try {
            file.close();
        } catch (IOException e) {
            System.out.println("BŁĄD PRZY ZAMYKANIU PLIKU!");
        }
        return code.toString();
    }
}
