import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {

    private final static Properties properties;
    static {
        properties = new Properties();
        InputStream in = PropertiesUtil.class.getClassLoader().getResourceAsStream("/system.properties");
        // 使用properties对象加载输入流
        try {
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static String get(String key){
        //获取key对应的value值
        return  properties.getProperty(key);
    }
}
