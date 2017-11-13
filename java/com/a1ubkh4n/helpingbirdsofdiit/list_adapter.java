package com.a1ubkh4n.helpingbirdsofdiit;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Md.Aiub Khan on 08-Feb-17.
 */

public class list_adapter extends ArrayAdapter<list> {

    private int mColorResourceId;

    public list_adapter(Context context, ArrayList<list> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.items_layout,parent,false);
        }

        list currentWord = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        nameTextView.setText(currentWord.getName());

        TextView mblTextView = (TextView) listItemView.findViewById(R.id.mbl_no);
        mblTextView.setText(currentWord.getmbl());

        TextView batchTextView = (TextView) listItemView.findViewById(R.id.batch);
        batchTextView.setText(currentWord.getBatch());

        TextView residenceTextView = (TextView) listItemView.findViewById(R.id.residence);
        residenceTextView.setText(currentWord.getResidence());

        TextView experienceTextView = (TextView) listItemView.findViewById(R.id.experience);
        experienceTextView.setText(currentWord.getExperience());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentWord.hasImage()) {
            iconView.setImageResource(currentWord.getImageResourceId());
            iconView.setVisibility(View.VISIBLE);
        }
        else {
            iconView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.textcontainer);
        int color = ContextCompat.getColor(getContext(),mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
