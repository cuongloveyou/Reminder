package com.example.reminder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvListReminder;

    private List<Reminder> listReminder = new ArrayList<Reminder>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvListReminder = (ListView) findViewById(R.id.lvListReminder);

        Reminder r1 = new Reminder("hi","bs", true);
        Reminder r2 = new Reminder("h12i","b1ads");
        Reminder r3 = new Reminder("hwdi","b13s");
        listReminder.add(r1);
        listReminder.add(r2);
        listReminder.add(r3);
        lvListReminder.setAdapter(new ListReminderAdapter(this, listReminder));

    }
}
