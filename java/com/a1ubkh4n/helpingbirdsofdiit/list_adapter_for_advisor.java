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

public class list_adapter_for_advisor extends ArrayAdapter<list_for_advisor> {

    private int mColorResourceId2;

    public list_adapter_for_advisor(Context context, ArrayList<list_for_advisor> words2, int colorResourceId2) {
        super(context, 0, words2);
        mColorResourceId2 = colorResourceId2;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.items_layout_for_advisor,parent,false);
        }

        list_for_advisor currentWord = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name2);
        nameTextView.setText(currentWord.getName2());

        TextView mblTextView = (TextView) listItemView.findViewById(R.id.mbl_no2);
        mblTextView.setText(currentWord.getmbl2());

        TextView batchTextView = (TextView) listItemView.findViewById(R.id.batch2);
        batchTextView.setText(currentWord.getBatch2());

        TextView residenceTextView = (TextView) listItemView.findViewById(R.id.residence2);
        residenceTextView.setText(currentWord.getResidence2());

        TextView experienceTextView = (TextView) listItemView.findViewById(R.id.experience2);
        experienceTextView.setText(currentWord.getExperience2());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image2);
        if (currentWord.hasImage2()) {
            iconView.setImageResource(currentWord.getImageResourceId2());
            iconView.setVisibility(View.VISIBLE);
        }
        else {
            iconView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.textcontainer2);
        int color = ContextCompat.getColor(getContext(),mColorResourceId2);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
