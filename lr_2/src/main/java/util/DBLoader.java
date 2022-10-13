package util;

import model.Appliance;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class DBLoader {

    private static final String DB_FILEPATH = "/home/konstantin/Work/Labs/WT/lr_2/src/main/resources/appliances_db.txt";
    private static final Path path = Paths.get(DB_FILEPATH);

    public static ArrayList<Appliance> loadAllFromDB(){
        ArrayList<Appliance> allAppliances = new ArrayList<>();
        final String dbData = getDbDataInString();
        System.out.println(dbData);
        return allAppliances;
    }

    private static String getDbDataInString(){
        StringBuilder dbDataString = new StringBuilder();
        try(BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while ((line = br.readLine()) != null) {
                dbDataString.append(line).append("\n");
            }
            return new String(dbDataString);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
