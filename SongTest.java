import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SongTest {
    Song song = new Song("Test", "Test", "Test", 0, 0);
    Songs songs = new Songs();
    SongProxy songproxy = new SongProxy("Test", "Test", "Test", 0, 0);
    List<Song> songList = new ArrayList<Song>();
    SongService songService= new SongProxy("Test", "Test", "Test", 0, 0);

    @Test
    public void testSearchByID()
    {
        songService.searchById(0);
        songproxy.searchById(0);
    }

    @Test
    public void testSearchByAlbum()
    {
        songService.searchByAlbum("Test");
        songproxy.searchByAlbum("Test");
    }

    @Test
    public void testSearchByTitle()
    {
        songService.searchByTitle("Test");
        songproxy.searchByTitle("Test");
    }





}
