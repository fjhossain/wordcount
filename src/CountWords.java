import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) throws Exception {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
          File file = new File("words.txt");
        Scanner txtFile = new Scanner(file);
        while (txtFile.hasNext()){
            String word = txtFile.next();
            if (map.containsKey(word)){
                int count = map.get(word)+1;
                map.put(word, count);
            } else{
                map.put(word, 1);
            }
        } txtFile.close();
        for (Map.Entry<String, Integer> entry: map.entrySet()){
              System.out.println(entry);
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write("entry");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
