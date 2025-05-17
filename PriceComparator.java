import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PriceComparator {
    public static void main(String[] args) {
        List<List<String>> records = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Antonio\\OneDrive\\Desktop\\PriceComparatorBackend\\prices\\profi_2025-05-08.csv"))){
            String line = br.readLine(); // skip the first line
            while ((line = br.readLine()) != null) {
                String[] data  = line.split(";");
                records.add(Arrays.asList(data));
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        for(List<String> record: records){
            System.out.print(record +" "); // luam a 2 coloana
        }
    }
}
