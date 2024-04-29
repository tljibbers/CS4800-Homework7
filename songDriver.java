
public class songDriver {
 

    public static void main(String[] args) {
    
        SongService song1 = new SongProxy("Mortal Man", "Kendrick Lamar", "To Pimp A Butterfly", 12.08, 0);
        SongService song2 = new SongProxy("Poetic Justice", "Kendrick Lamar", "Good Kid Maad City", 5.01, 1);
        SongService song3 = new SongProxy("Tell Me A Joke", "Quadeca", "I Didn't Mean To Haunt You", 5.06, 2);
        SongService song4 = new SongProxy("John Muir", "ScHoolboy Q", "Blank Face LP", 3.07, 3);
        SongService song5 = new SongProxy("DIRTY!", "JPEGMAFIA", "LP!", 2.02, 4);
        
        song1.searchById(0);
        song2.searchById(1);
        song3.searchById(2);
        song4.searchById(3);
        song5.searchById(4);
        song1.searchByTitle("Mortal Man");
        song2.searchByTitle("Poetic Justice");
        song3.searchByTitle("Tell Me A Joke");
        song4.searchByTitle("John Muir");
        song5.searchByTitle("DIRTY!");
        song1.searchByAlbum("To Pimp A Butterfly");
        song2.searchByAlbum("Good Kid Maad City");
        song3.searchByAlbum("I Didn't Mean To Haunt You");
        song4.searchByAlbum("Blank Face LP");
        song5.searchByAlbum("LP!");

        song1.searchById(0);
        song2.searchById(1);
        song3.searchById(2);
        song4.searchById(3);
        song5.searchById(4);
        song1.searchByTitle("Mortal Man");
        song2.searchByTitle("Poetic Justice");
        song3.searchByTitle("Tell Me A Joke");
        song4.searchByTitle("John Muir");
        song5.searchByTitle("DIRTY!");
        song1.searchByAlbum("To Pimp A Butterfly");
        song2.searchByAlbum("Good Kid Maad City");
        song3.searchByAlbum("I Didn't Mean To Haunt You");
        song4.searchByAlbum("Blank Face LP");
        song5.searchByAlbum("LP!"); 
    }
}
