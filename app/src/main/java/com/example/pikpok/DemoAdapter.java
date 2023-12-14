package com.example.pikpok;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DemoAdapter extends RecyclerView.Adapter<DemoAdapter.DemoViewHolder> {

    List<MediaObject> videoList;

    public DemoAdapter(List<MediaObject> videoList) {
        this.videoList = videoList;
    }

    @NonNull
    @Override
    public DemoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_main,parent,false);
        return new DemoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DemoViewHolder holder, int position) {
        holder.setVideoData(videoList.get(position));
    }

    @Override
    public int getItemCount() {
        return videoList.size();
    }

    public class DemoViewHolder extends RecyclerView.ViewHolder{
        VideoView url;
        TextView title,desc;
        public DemoViewHolder(@NonNull View itemView) {
            super(itemView);
            url=itemView.findViewById(R.id.videoView);
            title=itemView.findViewById(R.id.textView3);
            desc=itemView.findViewById(R.id.textView2);
        }

    void setVideoData(MediaObject obj)
    {
        url.setVideoPath(obj.getVideoUrl());
        title.setText(obj.getTitle());
        desc.setText(obj.getDesc());

        url.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.start();
            }
        });
        url.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.start();
            }
        });
    }

    }
}