package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by buchh on 10/11/2017.
 */

public class WordAdapter extends ArrayAdapter<Word>  {

    private final int mBackgroundColorId;

    public WordAdapter(Activity context, ArrayList<Word> words, int backgroundColorId) {
        super(context, 0, words);
        mBackgroundColorId = backgroundColorId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Word currentWord = getItem(position);

        listItemView.setBackgroundResource(mBackgroundColorId);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokWord());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultWord());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        // Set ImageView to image resource if word has image
        if (!currentWord.hasImage()) {
            imageView.setVisibility(View.GONE);
        } else {
            imageView.setImageResource(currentWord.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }

        return listItemView;
    }
}
