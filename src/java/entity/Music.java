
package entity;

/**
 *
 * @author abc
 */
public class Music {
    
    private String mname;
    private String mImg;
    private String desc;
    private String song;
    private String mtype;
    private String category;
    private String artist;

    public Music() {
    }

    public Music(String mname, String mImg, String song) {
        this.mname = mname;
        this.mImg = mImg;
        this.song = song;
    }

    public Music(String mname, String mImg, String song, String artist) {
        this.mname = mname;
        this.mImg = mImg;
        this.song = song;
        this.artist = artist;
    }

    public Music(String mname, String mImg, String desc, String song, String mtype, String category, String artist) {
        this.mname = mname;
        this.mImg = mImg;
        this.desc = desc;
        this.song = song;
        this.mtype = mtype;
        this.category = category;
        this.artist = artist;
    }

    public String getMname() {
        return mname;
    }

    public String getmImg() {
        return mImg;
    }

    public String getDesc() {
        return desc;
    }

    public String getSong() {
        return song;
    }

    public String getMtype() {
        return mtype;
    }

    public String getCategory() {
        return category;
    }

    public String getArtist() {
        return artist;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public void setmImg(String mImg) {
        this.mImg = mImg;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public void setMtype(String mtype) {
        this.mtype = mtype;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
    
    
    
}
