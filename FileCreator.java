import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;




public class FileCreator {
   
    public FileWriter createFile(FileWriter f) throws IOException
    {
        return new FileWriter("New File");
    }

    public void editFile(Character c, BufferedWriter write) throws IOException
    {
        
        write.write("Fonts: ");
        write.write(c.font);
        write.write(" Color: ");
        write.write(c.color);
        write.write(" Size: ");
        write.write(c.size);
        write.newLine();
        
    }

    public FileWriter saveFile(FileWriter f) throws IOException
    {
        return new FileWriter("New File", true);
    }

    
}
