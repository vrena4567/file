import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pelda {
    public static void main(String[] args) {
        System.out.println(FileInputHandler.getLinesOfTextFileWithScanner("peldaStrings.txt"));
    }
}

// Ez az osztály felel azért hogy lekezeljük a bejövő fájlt
class FileInputHandler{

    public static List<String> getLinesOfTextFileWithScanner(String filePath){
        List<String> stringList = new ArrayList<>();

        File file = new File(filePath);
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                stringList.add(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return stringList;
    }


    // Ez a metódus egy fájl elérési útvonalat vár és vissza adja soronként (a lista minden eleme egy sor)
    public static List<String> getLinesOfTextFile(String filePath) {
        // Ezt a listát töltjük fel a sorokkal
        List<String> stringList = new ArrayList<>();


        try {
            FileReader fileReader = new FileReader(filePath); // IOExceptiont dob ha nem található a file a megadott útvonalon
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // itt végig megyünk a sorokon és hozzá adjuk a listához
            for (String line; (line = bufferedReader.readLine()) != null; ) {
                stringList.add(line);
            }


        } catch (IOException e) {
            System.out.println("Error: wrong path!\n" + e.getMessage());
        }

        return stringList;
    }
}
