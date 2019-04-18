import java.io.File;
import java.io.FileInputStream;

public class OssTest {
    public static void main(String[] args) throws Exception {
//上传
        File file = new File("E:\\ideaworkspace2\\oss_file\\src\\main\\resources\\abc.jpg");
        FileInputStream inputStream = new FileInputStream(file);
        String image = OSSManageUtil.uploadFile(inputStream, "image", file.getName());
        System.out.println(image);
//下载
//        OSSManageUtil.downloadFile("image/linayi_1555511473140.jpg","D:/ac.jpg");
        //删除
//        OSSManageUtil.deleteFile("image/linayi_1555511792657.jpg");
    }
}
