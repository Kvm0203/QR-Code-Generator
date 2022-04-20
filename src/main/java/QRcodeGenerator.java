import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

import java.io.IOException;
import java.nio.file.Paths;

public class QRcodeGenerator
{
    public static void main(String[] args) throws WriterException, IOException {

        String Data="IMG_9611";
        String path="/Users/Venu madhav/OneDrive/Desktop/appMaster/my.jpg";

        BitMatrix matrix=new MultiFormatWriter().encode(Data, BarcodeFormat.QR_CODE,500,500);

        MatrixToImageWriter.writeToPath(matrix,"jpg", Paths.get(path));




    }

}
