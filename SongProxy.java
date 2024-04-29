import java.util.ArrayList;
import java.util.List;

public class SongProxy implements SongService{
    List<Song> songList2 = new ArrayList<Song>();
    Songs songs;
    Song song;
    private String title;
    private String artist;
    private String album;
    private double duration;
    public int id;

    public SongProxy(String title, String artist, String album, double duration, int id)
    {   
        song = new Song(title, artist, album, duration, id);       
    }

    @Override
    public Song searchById(Integer songID) {
       if(songs == null)
       {
        songs = new Songs();
        songs.song = song;
       }
       songs.song = song;
       return songs.searchById(songID);
    }

    @Override
    public List<Song> searchByTitle(String title) {
        if(songs == null)
        {
            songs = new Songs();
            songs.song = song;
            songList2.add(song);
            songs.songList = songList2;
        }
        songs.song = song;
        songList2.add(song);
        songs.songList = songList2;
        return songs.searchByTitle(title);
    }

    @Override
    public List<Song> searchByAlbum(String album) {
       if(songs == null)
       {
            songs = new Songs();
            songs.song = song;
            songList2.add(song);
       }
       songs.song = song;
       songList2.add(song); 
       songs.songList = songList2;
       return songs.searchByAlbum(album);
    }

    
}
