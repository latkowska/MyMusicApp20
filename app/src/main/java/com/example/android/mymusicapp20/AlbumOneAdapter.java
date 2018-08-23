package com.example.android.mymusicapp20;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class AlbumOneAdapter extends ArrayAdapter<AlbumOne> {

    public AlbumOneAdapter(Context context, ArrayList<AlbumOne> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view

        ViewHolder holder;

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_ao, parent, false);
            holder = new ViewHolder();
            holder.songTiteTextView = (TextView) convertView.findViewById(R.id.song_title);
            holder.trackNumberTextView = (TextView) convertView.findViewById(R.id.track_number);
            convertView.setTag(holder);

        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        // Get the object located at this position in the list
        AlbumOne currentSong = getItem(position);

        holder.songTiteTextView.setText(currentSong.getTitle());
        holder.trackNumberTextView.setText(currentSong.getTrack());

        return convertView;
    }

    static class ViewHolder {
        private TextView songTiteTextView;
        private TextView trackNumberTextView;
    }
}

