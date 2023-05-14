import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileTricks {
    public static long copyFile(File in, File out) throws IOException {
        try (InputStream is = new FileInputStream(in); OutputStream os = new FileOutputStream(out)) {
            return is.transferTo(os);
        }
    }

    public static void copyFilesByExp(File folderIn, File folderOut, String expansion) throws IOException {
        File[] files = folderIn.listFiles();
        int fileCopy = 0;
        for (int i = 0; i < files.length; i++) {
            if (files[i].getName().endsWith(expansion)) {
                File fileCopyAdress = new File(folderOut, files[i].getName());
                copyFile(files[i], fileCopyAdress);
                fileCopy += 1;
            }

        }
        if(fileCopy==0){
            System.out.println("there is no file with such expansion");
        }

    }
}
