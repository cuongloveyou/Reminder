package com.example.reminder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.List;

public class ListReminderAdapter extends BaseAdapter {
    private List<Reminder> listReminder;
    private LayoutInflater inflater;

    public ListReminderAdapter(Context context, List<Reminder> listReminder) {
        this.inflater = LayoutInflater.from(context);
        this.listReminder = listReminder;
    }

    @Override
    public int getCount() {
        return listReminder.size();
    }

    @Override
    public Object getItem(int position) {
        return listReminder.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null){
            convertView = inflater.inflate(R.layout.list_reminder, null);
            holder = new ViewHolder();
            holder.tvTitle = (TextView) convertView.findViewById(R.id.tvTitle);
            holder.tvInfor = (TextView) convertView.findViewById(R.id.tvInfor);
            holder.cbDone = (CheckBox) convertView.findViewById(R.id.cbDone);
            convertView.setTag(holder);
        } else holder = (ViewHolder) convertView.getTag();

        Reminder reminder = listReminder.get(position);
        holder.tvTitle.setText(reminder.getTitle());
        holder.tvInfor.setText(reminder.getInfor());
        holder.cbDone.setChecked(reminder.isDone());

        return convertView;
    }
    class ViewHolder{
        TextView tvTitle;
        TextView tvInfor;
        CheckBox cbDone;
    }
}
