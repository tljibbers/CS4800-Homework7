
public class Character {
    public String font;
    public String size;
    public String color;
    
    public String setFont(int sel)
    {
        String selection;
        switch (sel) {
            case 0:
                selection = "Helvetica";
                return selection;
            case 1:
                selection = "Times New Roman";
                return selection;
            case 2:
                selection = "Futura";
                return selection;
            case 3:
                selection = "Calibri";
                return selection;   
        }
        return null;
    }

    public String setSize(int sel)
    {
        String selection;
        switch (sel) {
            case 0:
                selection = "Ten";
                return selection;
            case 1:
                selection = "Eleven";
                return selection;
            case 2:
                selection = "Twelve";
                return selection;
            case 3:
                selection = "Thirteen";
                return selection;
        }
        return null;
    }

    public String setColor(int sel)
    {
        String selection;
        switch (sel) {
            case 0:
                selection = "Blue";
                return selection;
            case 1:
                selection = "Green";
                return selection;
            case 2:
                selection = "Purple";
                return selection;
            case 3:
                selection = "Red";
                return selection;
        }
        return null;
    }

    

    



}
