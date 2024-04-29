import java.util.ArrayList;
import java.util.List;

public class Songs implements SongService{

    Song song;
    List<Song> songList = new ArrayList<Song>();

    public Song searchById(Integer songID)
    {
        if(songID == song.id)
        {
            System.out.println(song.getArtist());
            System.out.println(song.getAlbum());
            System.out.println(song.getTitle());
            return song;
        }
        return null;
    }

    public List<Song> searchByTitle(String title)
    {
        for(int i = 0; i < songList.size(); i++)
        {
            if(title == song.getAlbum())
            {
                System.out.println(songList.get(i));
                return songList;
            }
        }
        return null;
    }

    public List<Song> searchByAlbum(String album)
    {
        for(int i = 0; i < songList.size(); i++)
        {
            if(album == song.getAlbum())
            {
                System.out.println(songList.get(i));
                return songList;
            }
        }
        return null;
    }
    
}
