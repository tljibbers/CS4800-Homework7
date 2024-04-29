import java.util.HashMap;

public class CharacterFactory {
    private HashMap<Integer, Character> characters = new HashMap<>();

    public Character getFontColorSize(int sel)
    {
        if(characters.containsKey(sel))
        {
            return characters.get(sel);
        }
        else {
            
            Character c = new Character();
            c.font = c.setFont(sel);
            c.color = c.setColor(sel);
            c.size = c.setSize(sel);
            characters.put(sel, c);

            return c;
            
        }
    }
}
