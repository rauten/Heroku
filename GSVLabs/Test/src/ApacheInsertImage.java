/**
 * Created by rileyauten on 5/23/16.
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.BreakType;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class ApacheInsertImage {
    public static void main(String[] args) throws Exception
    {
        XWPFDocument doc = new XWPFDocument();
        XWPFParagraph p = doc.createParagraph();

        String imgFile = "RA.jpg";
        XWPFRun r = p.createRun();

        int format = XWPFDocument.PICTURE_TYPE_JPEG;
        r.setText(imgFile);
        r.addBreak();
        r.addPicture(new FileInputStream(imgFile), format, imgFile, Units.toEMU(200), Units.toEMU(200)); // 200x200 pixels
        r.addBreak(BreakType.PAGE);

        FileOutputStream out = new FileOutputStream("Apache_ImagesInDoc.docx");
        doc.write(out);
        out.close();

        System.out.println("Process Completed Successfully");
    }


}
