package com.example.chatting_app;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.chatting_app.R;
import java.util.ArrayList;

public class chatmain extends ArrayAdapter<chat> {

    private static final String LOG_TAG = chatmain.class.getSimpleName();
    public chatmain(Activity context, ArrayList<chat> chats) {
        super(context, 0, chats);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.content, parent, false);
        }

        chat currentchat= getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.text1);
        nameTextView.setText(currentchat.getVersionName());

        TextView numberTextView = (TextView) listItemView.findViewById(R.id.text2);
        numberTextView.setText(currentchat.getVersionNumber());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.profile);
        iconView.setImageResource(currentchat.getImageResourceId());

        return listItemView;
    }
}