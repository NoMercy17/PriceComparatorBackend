import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<List<String>> records = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Antonio\\OneDrive\\Desktop\\PriceComparatorBackend\\examples\\profi_2025-05-08.csv"))){
            String line;
            while ((line = br.readLine()) != null) {
                String[] data  = line.split(";");
                records.add(Arrays.asList(data));
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        for(List<String> record: records){
            System.out.print(record.get(1) +" "); // luam a 2 coloana
        }
    }
}
