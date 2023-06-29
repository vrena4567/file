import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fealadat_1 {
    public static void main(String[] args) {
        File file = new File("peldaStrings.txt");
        List<String> lines = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("A file nem található");
        }
        System.out.println(lines);
    }
}

// Írj egy osztályt mely tartalmaz egy fájlból olvasó statitikus metódust ami bemeneti paraméterként vár egy file pathot
// a metódus térjen vissza egy String listával aminek elemei a fájl sorai legyenek
// hívd meg a metódusod peldaString.txt re és irasd ki az eredményt
