import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File folderIn = new File("D:\\test");
        folderIn.mkdirs();

        File folderOut = new File("D:\\testCopyNew");
        folderOut.mkdirs();

        File file1 = new File("D:\\test\\jpg.txt");
        File file2 = new File("D:\\test\\DOC.jpg");
        File file3 = new File("D:\\test\\voice.mp3");

        try{
            file3.createNewFile();
        }catch (IOException e){
            e.printStackTrace();
        }


        try{
            FileTricks.copyFilesByExp(folderIn,folderOut,"jpg");
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}