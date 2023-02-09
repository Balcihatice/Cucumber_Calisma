package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties properties;

    static {
        String dosyaYolu = "configuration.properties";
        //data cekmek istedigimiz dosyanin path`i
        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
            //fis dosyayolunu tanimladigimiz configuration properties dosyasini okudu
            properties = new Properties();
            properties.load(fis);//fisin okudugu bilgileri propertiese yukledi


            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        /*
        test methodundan yolladigimiz string key degerini alip Properties clasindan getProperty()
        methodunu kullanarak  bu key`e ait value yu bize getirdi
         */
        return properties.getProperty(key);
    }
}
