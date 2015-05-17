package com.iamzain.quran101;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
    private ArrayList<Fragment> mFragments;

    public ScreenSlidePagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mFragments = loadJSONFromAsset(context);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    private ArrayList<Fragment> loadJSONFromAsset(Context context)
    {
        ArrayList<Fragment> words = new ArrayList<Fragment>();
        String json = null;
        try {
            // Get the data in the json file
            InputStream is = context.getAssets().open("dictionary.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");

            // We have the data now parse it
            JSONObject jObject = new JSONObject(json);
            JSONArray jArray = jObject.getJSONArray("words");

            for (int i=0; i < jArray.length(); i++)
            {
                try {
                    JSONObject oneObject = jArray.getJSONObject(i);
                    // Pulling items from the array
                    String jsonNo = oneObject.getString("no");
                    String jsonArabic = oneObject.getString("arabic");
                    String jsonTranslation = oneObject.getString("translation");
                    String jsonTransliteration = oneObject.getString("transliteration");
                    String jsonRootWord = oneObject.getString("root_word");
                    String jsonFrequency = oneObject.getString("frequency");

                    // Putting the words from the pulled json to objects and then into the arraylist called 'words'
                    WordFragment word = new WordFragment();
                    word.setWordNumber(jsonNo);
                    word.setWordArabic(jsonArabic);
                    word.setTranslation(jsonTranslation);
                    word.setTransliteration(jsonTransliteration);
                    word.setRootWord(jsonRootWord);
                    word.setFrequency(jsonFrequency);
                    words.add(word);

                } catch (JSONException e) {
                    // Oops
                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return words;

    }
}
