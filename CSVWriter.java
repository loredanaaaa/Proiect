import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVWriter{

    public CSVWriter(FileWriter outputfile) {

    }
    public static void writeDataAtOnce(String filePath)
    {

        // specified by filepath
        File file = new File("C:\\Users\\hp\\Downloads\\CSVnote.csv");

        try {
            FileWriter outputfile = new FileWriter("CSVnote.csv");

            CSVWriter writer = new CSVWriter(outputfile);

            // create a List which contains String array
            List<String[]> data = new ArrayList<String[]>();

            data.add(new String[] { "Anita", "aita@email.com", "California" });
            data.add(new String[] { "Aron", "aron.bla@email.com", "California" });

            data.add(new String[] { "Cosmin", "kox@bla.com", "Giurgiu" });
            data.add(new String[] { "Crina", "ggl@test.com", "Letcani" });

            data.add(new String[] { "Bogdan", "vox@example.com", "Resita" });
            writer.writeAll(data);

            // closing writer connection
            writer.close();
    }
    catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
}

    private void close() {
    }

    private void writeAll(List<String[]> data) {

    }
}