package com.example.chatting_app;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.chatting_app.R;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<chat> chats = new ArrayList<chat>();
        chats.add(new chat("Madara", "Fuck You", R.drawable.madara));
        chats.add(new chat("Pain", "Fuck You", R.drawable.pain));
        chats.add(new chat("Tobi", "Fuck You", R.drawable.tobi));
        chats.add(new chat("Itachi", "Fuck You", R.drawable.itachi));
        chats.add(new chat("Hidan", "Fuck You", R.drawable.hidan));
        chats.add(new chat("Konan", "Fuck You", R.drawable.konan));
        chats.add(new chat("Kakuzu", "Fuck You", R.drawable.kakuzu));
        chats.add(new chat("Kisame", "Fuck You", R.drawable.kisamee));
        chats.add(new chat("Sasori", "Fuck You", R.drawable.sasuri));
        chats.add(new chat("Diedara", "Fuck You", R.drawable.diedara));
        chatmain Adapter = new chatmain(this, chats);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);
    }
}