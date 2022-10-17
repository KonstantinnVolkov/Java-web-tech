package tests;

import model.Oven;
import model.searchCriteria.SearchCriteria;
import util.DBLoader;

import java.util.regex.Matcher;
import java.util.stream.Collectors;

public class TestMain {

    public static void main(String[] args) {

        String s = "<power_consumption>1000</power_consumption><weight>10</weight>capacity>32</capacity><depth>60.0</depth>height>45.5</height>width>59.5</width>";
        String s1 = DBLoader.getParameterPattern(SearchCriteria.Oven.power_consumption.name())
                .matcher(s)
                .results()
                .map(matchResult -> matchResult.group(1))
                .collect(Collectors.joining(""));
        System.out.println(s1);

    }

    private static String getApplianceName(Object applianceClass) {
        String className = applianceClass.getClass().getName();
        return className.substring(className.indexOf(".") + 1);
    }
}
