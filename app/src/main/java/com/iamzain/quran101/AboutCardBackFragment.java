package com.iamzain.quran101;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * A fragment representing the back of the card.
 */
public class AboutCardBackFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_about_card_back, container, false);

        // Animation which makes the text scroll up
/*        Animation animation = AnimationUtils.loadAnimation(getActivity(), R.anim.text_scroll);
        LinearLayout textBlock = (LinearLayout) rootView.findViewById(R.id.text);
        textBlock.startAnimation(animation);*/

        return rootView;
    }
}