package poi;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by zhangsm on 2017/6/15.
 */
public class PoiDemo {
    @Test
    public void Demo1() throws Exception {
        InputStream is = new FileInputStream("d:\\test2.xlsx");
        POIFSFileSystem poifsFileSystem = new POIFSFileSystem(is);
        HSSFWorkbook  wb = new HSSFWorkbook(poifsFileSystem);
        Sheet sheet =wb.getSheetAt(0);

    }
    @Test
    public  void Demo2() {
        try{
            System.out.print("try");
        }catch (Exception e){
            System.out.print("catch");
        }finally {
            System.out.print("finally");
        }
    }
}
