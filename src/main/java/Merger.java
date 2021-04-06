import Objects.PohybObyvatelObce;
import Objects.Poskytovatel;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Merger {

    private static String poskytovateleInput = "Narodni_registr_poskytovatelu_zdravotnich_sluzeb.csv";
    private static String pohybObyvatelInput = "Pohyb_obyvatel_za_CR_2019.csv";

    private static List<Poskytovatel> poskytovatele = new ArrayList<>();
    private static List<PohybObyvatelObce> pohybObyvatel = new ArrayList<>();

    private static HashMap<String, HashMap<String, Integer>> okresy = new HashMap<>();
    private static HashMap<String, String> stredniPocetObyvatel = new HashMap<>();
    private static HashMap<String, String> okresKodToOkres = new HashMap<>();

    public static void main(String[] args) {
        deserializeInputs();
        mergeData();
        System.out.println("");
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
    }

    private static void mergeData() {
        // STREDNY STAV
        for (PohybObyvatelObce pohyb : pohybObyvatel) {
            if ("DEM0004".equals(pohyb.getVuk())) { // "DEM0004","Střední stav obyvatel","2406","43"
                stredniPocetObyvatel.put(pohyb.getVuzemi_txt(), pohyb.getHodnota());
            }
        }

        for (Poskytovatel poskytovatel : poskytovatele) {

            String[] formy = poskytovatel.getFormaPece().split(", ");
            if ("".equals(poskytovatel.getFormaPece())) {
                //System.out.println(""); nothing to to do there, just for debug
            }

            // OKRESY & forma pece
            String okresCode = poskytovatel.getOkresCode();
            okresKodToOkres.put(okresCode, poskytovatel.getOkres());
            if (okresy.containsKey(okresCode)) {
                HashMap<String, Integer> formyPece = okresy.get(okresCode) == null ? new HashMap<>() : okresy.get(okresCode);
                for (String forma : formy) {
                    if (formyPece.containsKey(forma)) {
                        Integer i = formyPece.get(forma) + 1;
                        formyPece.put(forma, i);
                    } else {
                        formyPece.put(forma, 1);
                    }
                }
            } else {
                for (String forma : formy) {
                    HashMap<String, Integer> formyPece = new HashMap<>();
                    formyPece.put(forma, 1);
                    okresy.put(okresCode, formyPece);
                }
            }

        }


//        for (Map.Entry<String, HashMap<String, Integer>> okres : okresy.entrySet()) {
//
//            String kodOkresu = okres.getKey();
//            HashMap<String, Integer> formaPece = okres.getValue();
//
//            Map obj = new HashMap();
//            JsonArray array = Json.createArrayBuilder().build();
//            obj.put("okres", kodOkresu);
//            String nazovOkresu = okresKodToOkres.get(kodOkresu);
//            obj.put("stredni_stav_obyvatel", stredniPocetObyvatel.get(nazovOkresu));
//
//            for (Map.Entry<String, Integer> forma : formaPece.entrySet()) {
//
//            }
//        }
    }
}
