package Tests.utils;

import java.io.FileReader;

import com.opencsv.CSVReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CSVFileManager {

    public static List<Map<String, String>> reader(String path) {

        List<Map<String, String>> data = new ArrayList<>();

        try {
            CSVReader csvReader = new CSVReader(new FileReader(path));
            Iterator<String[]> iterator = csvReader.iterator();

            String[] headers = iterator.next();

            while (iterator.hasNext()) {
                String[] row = iterator.next();

                Map<String, String> rowMap = new HashMap<>();
                for (int i = 0; i < headers.length; i++) {
                    rowMap.put(headers[i], row[i]);
                }

                data.add(rowMap);
            }
            csvReader.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

}

