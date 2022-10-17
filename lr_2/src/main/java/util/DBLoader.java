package util;

import model.Oven;
import model.searchCriteria.SearchCriteria;

import java.io.*;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class DBLoader {

    //    private static final String DB_FILEPATH = "/home/konstantin/Work/Labs/WT/lr_2/src/main/resources/appliances_db.xml";
    private static final String DB_FILEPATH = "D:\\My_projects\\Labs\\5 sem\\WebTech\\Java-web-tech\\lr_2\\src\\main\\resources\\appliances_db.xml";
    private static final Path path = Paths.get(DB_FILEPATH);

    public static ArrayList<Object> loadAllFromDB(){
        ArrayList<Object> allAppliances = new ArrayList<>();
        String dbData = getAllDbData();   //read xml DB to String
        convertToList(dbData);
        System.out.println(1);
        convertToList(dbData);



        return allAppliances;
    }

    private static String getAllDbData(){
        StringBuilder dbDataString = new StringBuilder();
        try(BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.equals("")){
                    continue;
                }
                dbDataString.append(line.trim());
            }
            return new String(dbDataString);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static HashMap<String, Object> convertToList(String dbString){
        HashMap<String, Object> appliancesList = new HashMap<>();

        //get all ovens
        List<String> OvenFieldsList = getAppliancePattern(new Oven()).matcher(dbString)
                .results()
                .map(matchResult -> matchResult.group(1))
                .toList();
        OvenFieldsList.forEach(s -> {
            Oven newOven = Oven.builder()
                    .powerConsumption(
                            Integer.parseInt(
                                    getParameterPattern(SearchCriteria.Oven.power_consumption.name())
                                            .matcher(s)
                                            .results()
                                            .map(matchResult -> matchResult.group(1))
                                            .collect(Collectors.joining(""))
                            )
                    )
                    .build();
            List<Field> fields = List.of(SearchCriteria.Oven.class.getFields());

            appliancesList.put("Oven", newOven);
        });




        return appliancesList;
    }

    private static ArrayList<Oven> loadAllOvensFromDb(List<String> dbData){
        ArrayList<Oven> ovensList = new ArrayList<>();

       dbData.forEach(s -> {
           if (s.startsWith("Oven")){
                final List<String> fieldsData = getAppliancePattern(new Oven()).matcher(s)
                        .results()
                        .map(matchResult -> matchResult.group(1))
                        .toList();
               Oven newOven = Oven.builder()
                       .powerConsumption(Integer.parseInt(fieldsData.get(0)))
                       .weight(Double.parseDouble(fieldsData.get(1)))
                       .capacity(Integer.parseInt(fieldsData.get(2)))
                       .depth(Double.parseDouble(fieldsData.get(3)))
                       .height(Double.parseDouble(fieldsData.get(4)))
                       .width(Double.parseDouble(fieldsData.get(5)))
                       .build();
               ovensList.add(newOven);
           }
       });
       return ovensList;
    }

    private static Pattern getAppliancePattern(Object applianceClass) {
        String fullClassName = applianceClass.getClass().getName();
        String className = fullClassName.substring(fullClassName.indexOf(".") + 1);
        return Pattern.compile("<" + className + ">(.*?)</" + className + ">");
    }

    public static Pattern getParameterPattern(String parameterName) {
        return Pattern.compile("<%s>(.*?)</%s>".formatted(parameterName, parameterName));
    }
}
