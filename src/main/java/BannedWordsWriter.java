
import reader.XLSXReader;
import writer.XMLWriter;

import java.io.InputStream;
import java.util.List;

/**
 * Created by tmaffia on 1/20/16.
 */

public class BannedWordsWriter {

    public static void main (String args[]) throws Exception {

        XLSXReader reader = new XLSXReader();
        XMLWriter writer = new XMLWriter();

        ClassLoader loader = ClassLoader.getSystemClassLoader();
        InputStream inputStream = loader.getResourceAsStream("banned_words_en_uk.xlsx");
        List<String> cellData = reader.getCells(inputStream);

        writer.writeXML(cellData);
    }

}
