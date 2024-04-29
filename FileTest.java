import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

public class FileTest {
    Character c = new Character();
    CharacterFactory cf = new CharacterFactory();
    FileCreator fc = new FileCreator();
    
    
    @Test
    public void testSetFont()
    {
        c.setFont(0);
        c.setFont(1);
        c.setFont(2);
        c.setFont(3);
    }

    @Test
    public void testSetSize()
    {
        c.setSize(0);
        c.setSize(1);
        c.setSize(2);
        c.setSize(3);
    }

    @Test
    public void testSetColor()
    {
        c.setColor(0);
        c.setColor(1);
        c.setColor(2);
        c.setColor(3);
    }

    @Test
    public void testgetFontColorSize()
    {
        cf.getFontColorSize(0);
        cf.getFontColorSize(1);
        cf.getFontColorSize(2);
        cf.getFontColorSize(3);
    }

    @Test
    public void testCreateFile() throws IOException
    {
        FileWriter fw = new FileWriter("Test File");
        fc.createFile(fw);
    }

    @Test
    public void testEditFile() throws IOException
    {
        FileWriter fw = new FileWriter("Test File");
        BufferedWriter bw = new BufferedWriter(fw);
        c = cf.getFontColorSize(0);
        fc.editFile(c, bw);
    }

    @Test
    public void testSaveFile() throws IOException
    {
         FileWriter fw = new FileWriter("Test File");
         fc.saveFile(fw);
    }
}
