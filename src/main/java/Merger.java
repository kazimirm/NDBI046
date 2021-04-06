import Objects.PohybObyvatelObce;
import Objects.Poskytovatel;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Merger {

    private static String poskytovateleInput = "Narodni_registr_poskytovatelu_zdravotnich_sluzeb.csv";
    private static String pohybObyvatelInput = "Pohyb_obyvatel_za_CR_2019.csv";

    private static List<Poskytovatel> poskytovatele = new ArrayList<>();
    private static List<PohybObyvatelObce> pohybObyvatel = new ArrayList<>();

    public static void main (String[] args){
        deserializeInputs();
    }

    private static void deserializeInputs() {

        // POSKYTOVATELE
        try (
                InputStream inputStream = Merger.class.getResourceAsStream(poskytovateleInput);
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                Reader reader = new BufferedReader(inputStreamReader);
                CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();
        ) {
            String[] nextRecord;
            while ((nextRecord = csvReader.readNext()) != null) {
                Poskytovatel p = new Poskytovatel(nextRecord);
                poskytovatele.add(p);
            }

        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }

        // POHYB OBYVATEL OBCE
        try (
                InputStream inputStream = Merger.class.getResourceAsStream(pohybObyvatelInput);
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                Reader reader = new BufferedReader(inputStreamReader);
                CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();
        ) {
            String[] nextRecord;
            while ((nextRecord = csvReader.readNext()) != null) {
                PohybObyvatelObce p = new PohybObyvatelObce(nextRecord);
                pohybObyvatel.add(p);
            }

        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }

        System.out.println("");
    }



    private static StringReader getFileFromResourceAsStream(String fileName) {

        String input = new Scanner(Merger.class.getResourceAsStream(fileName), "UTF-8").useDelimiter("\\A").next();
        StringReader stringReader = new StringReader(input);

        return stringReader;

    }
}
