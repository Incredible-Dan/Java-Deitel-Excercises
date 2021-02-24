package ChapterFifteen;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileAndDirectoryInfo {
    private static Path thePath;
    public static boolean isValidPath(String filePath) throws  FileNotFoundException{
        boolean result = true;
        String empty = "";
        if(filePath == null || filePath.equalsIgnoreCase(empty)){
            throw new FileNotFoundException("Please provide a file Path");
        }

        Path thePath = Paths.get(filePath);
        if(!Files.exists(thePath)){
            throw new FileSystemNotFoundException("Cannot find the Path");

        }

        return true;
    }
    public static String getFileName(String fileName) throws FileSystemNotFoundException{
        String name = "";

        if(isValidPath(fileName)){
            thePath = Paths.get(fileName);
        }

        return name;
    }
}
