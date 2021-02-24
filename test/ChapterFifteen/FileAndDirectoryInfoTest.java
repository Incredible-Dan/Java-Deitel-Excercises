package ChapterFifteen;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.*;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class FileAndDirectoryInfoTest {
    String filePath;

    @BeforeEach
    void setUp() {

      StringBuilder pathBuilder = new StringBuilder("C:");
      pathBuilder.append(File.separator);
        pathBuilder.append("Semicolon");
        pathBuilder.append(File.separator);
        pathBuilder.append("Pentax.txt");
        filePath = pathBuilder.toString();
    }

    @AfterEach
    void tearDown() {
        fileAndDirectoryInfo = null;
    }
    @Test
    public void isValidWithNullPath(){
        assertThrows(FileNotFoundException.class,
                ()->FileAndDirectoryInfo.isValidPath(null)
        );
    }

    @Test
    void isValidPath(){
        try {
            boolean result = FileAndDirectoryInfo.isValidPath(filePath);
            assertTrue(result);
        }catch(FileNotFoundException ex){
                System.err.println(ex.getMessage());
                ex.printStackTrace();

            }
        }
        @Test
        public void isValidWithInValidPath(){
        filePath = "C:\\java practice\\pentax.txt";
            assertThrows(FileNotFoundException.class,()->FileAndDirectoryInfo.isValidPath(filePath));
    }
    @Test
    void PlayWithFileSystem(){
        FileSystem defaultFileSystem = FileSystems.getDefault();
        assertNotNull(defaultFileSystem);
        Iterable<Path> rootDirectories = defaultFileSystem.getRootDirectories();
        Iterator<Path> directories = rootDirectories.iterator();
        while(directories.hasNext()){
            System.out.println();
    }

    }
    @Test
    void createFile(){
        Formatter output = new Formatter("client");
        assertNotNull(filePath);
        assertTrue(Files.exists(Path.of(filePath)));
        output.format("%s,These are wimps!!!");
        output.format("%d %s %s %.2f%n",1,"Johnson",);
        output.format("%d %s %s %.2f%n",1,"Johnson",);
        output.format("%d %s %s %.2f%n",1,"Johnson",);
        output.format("%d %s %s %.2f%n",1,"Johnson",);
    }
    @Test
    void readFile() throws IOException {
        String fileName = "C:/java practice/client.txt";
        Path filePath = Paths.get(fileName);
        assertNotNull(filePath);
        assertTrue(Files.exists(filePath));
        try(Scanner input = new Scanner(filePath)){
            System.out.printf();

        }

    }
}
