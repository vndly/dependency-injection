package com.mauriciotogneri.dependencyinjection;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class UserAdapter extends ArrayAdapter<User>
{
    private final LayoutInflater layoutInflater;

    public UserAdapter(Context context)
    {
        super(context, R.layout.row_user);

        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View view = convertView;

        if (view == null)
        {
            view = layoutInflater.inflate(R.layout.row_user, null);
        }

        User user = getItem(position);

        TextView name = (TextView) view.findViewById(R.id.user_name);
        name.setText(user.name());

        TextView age = (TextView) view.findViewById(R.id.user_age);
        age.setText(String.valueOf(user.age()));

        TextView weight = (TextView) view.findViewById(R.id.user_weight);
        weight.setText(String.valueOf(user.weight()));

        return view;
    }
}