package com.example.pikpok;

public class MediaObject {

        private String videoUrl,title,desc;

           public MediaObject(String videoUrl, String title, String desc) {
            this.videoUrl = videoUrl;
            this.title = title;
            this.desc = desc;
        }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
