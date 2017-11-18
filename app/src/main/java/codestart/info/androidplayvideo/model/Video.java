package codestart.info.androidplayvideo.model;

/**
 * Created by ronnykibet on 11/18/17.
 */

public class Video {

    private String videoUrl;

    public Video(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
}
