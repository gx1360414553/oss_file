import java.io.File;
import java.io.FileInputStream;

public class OssTest {
    public static void main(String[] args) throws Exception {

        File file = new File("C:\\Users\\Administrator\\Desktop\\oss_file\\src\\main\\resources\\123456.jpg");
        FileInputStream inputStream = new FileInputStream(file);
        String image = OSSManageUtil.uploadFile(inputStream, "image", file.getName());
        System.out.println(image);
    }
}
