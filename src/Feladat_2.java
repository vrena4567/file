
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Feladat_2 {
    public static void main(String[] args) {
        File file = new File("szamok.txt");
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
        int sum = 0;
        for (var actual : lines) {
            for ( var actualNumber : actual.split(" ")) {   // a split metódus a szóközök mentén szétválasztja a stringeket
                sum += Integer.parseInt(actualNumber);
            }
        }
        System.out.println(lines);
      System.out.println(sum);
    }
}

// Írj egy osztályt mely tartalmaz egy fájlból olvasó satitikus metódust ami bemeneti paraméterként vár egy file pathot
// a metódus térjen vissza egy String listával aminek elemei a fájl sorai legyenek
// hívd meg a metódusod szamok.txt re és irasd ki az eredményt
// az eredményed számokat tartalmaz szóközökkel elválasztva írasd ki a számok összegét
