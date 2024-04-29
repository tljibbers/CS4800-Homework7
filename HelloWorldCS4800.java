import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HelloWorldCS4800 {
    
    public static void main(String[] args) throws IOException {
        CharacterFactory f1 = new CharacterFactory();
        CharacterFactory f2 = new CharacterFactory();
        CharacterFactory f3 = new CharacterFactory();
        CharacterFactory f4 = new CharacterFactory();

        Character c1 = f1.getFontColorSize(0);
        Character c2 = f2.getFontColorSize(1);
        Character c3 = f3.getFontColorSize(2);
        Character c4 = f4.getFontColorSize(3);

        FileCreator file = new FileCreator();
        FileWriter writer = new FileWriter("New File");
        BufferedWriter write = new BufferedWriter(writer);
        file.createFile(writer);
        file.editFile(c1, write);
        file.saveFile(writer);
        file.editFile(c2, write);
        file.saveFile(writer);
        file.editFile(c3, write);
        file.saveFile(writer);
        file.editFile(c4, write);
        write.close();

         

        
    }
}
