//
// Anthony Capo 
//

package lab5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab5 {

    public static void main(String[] args) {
        
        char[] cBuffer = new char[2048];
        byte[] bBuffer = new byte[2048];
        int count;

        File in = new File("UnixDBAEssentials.pdf");
        File sOut = new File("StreamTest.pdf");
        File fOut = new File("FileTest.pdf");

        System.out.println("in Exists? " + in.exists());
        System.out.println("Can we read it? " + in.canRead());

        try {
            FileReader fr = new FileReader(in);
            FileWriter fw = new FileWriter(fOut);

            while ((count = fr.read(cBuffer)) != -1) {
                fw.write(cBuffer, 0, count);
            }//end while
            fr.close();
            fw.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lab5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lab5.class.getName()).log(Level.SEVERE, null, ex);
        }

        try (FileInputStream fis = new FileInputStream(in);
                FileOutputStream fos = new FileOutputStream(sOut)) {
            while ((count = fis.read(bBuffer)) != -1) {
                System.out.println(count);
                fos.write(bBuffer, 0, count);
            }//end stream copy
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lab5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lab5.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
} 


//FileTest.pdf is 170817 bytes
//StreamTest.pdf is 100867 bytes
//UnixDBAEssentials.pdf is 100867 bytes
//UnixDBAEssentials.pdf and StreamTest.pdf are the same size while FileTest.pdf is larger because it requires more bytes to operate
//FileTest.pdf is the only test that would not open. Since it is a test file, it has to be opened from a file system, while the other 2 files were imported into the project