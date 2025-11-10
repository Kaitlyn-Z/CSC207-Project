package entity;

/**
 * An entity representing a playlist
 */
public class Playlist {
    private String name;
    private final String playlistId;
    private final String userId;
    private int songNumber;
    private boolean selected;

    public Playlist(String playlistId, String userId, String name, int songNumber) {
        this.playlistId = playlistId;
        this.userId = userId;
        this.name = name;
        this.songNumber = songNumber;
        this.selected = false; // default: unselected
    }

    // getter 和 setter
    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }


}