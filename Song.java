
public class Song {

    private String title;
    private String artist;
    private String album;
    private double duration;
    public int id;
    

    public Song(String title, String artist, String album, double duration, int id)
    {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
        this.id = id;
        

    }

    public String getTitle()
    {
        return this.title;
    }

    public String getArtist()
    {
        return this.artist;
    }

    public String getAlbum()
    {
        return this.album;
    }

    public double getDuration()
    {
        return this.duration;
    }

  


}
