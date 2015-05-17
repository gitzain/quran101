package com.iamzain.quran101;

import android.app.Fragment;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A fragment representing the front of the card.
 */
public class AboutCardFrontFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_about_card_front, container, false);

        TextView aboutScreenTextField = (TextView) rootView.findViewById(R.id.about_app_name);
        Typeface tf = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Lobster.otf");
        aboutScreenTextField.setTypeface(tf);

        return rootView;
    }
}