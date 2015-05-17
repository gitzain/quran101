package com.iamzain.quran101;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 *
 */
public class WordFragment extends Fragment {
    private String wordNumber;
    private String wordArabic;
    private String translation;
    private String transliteration;
    private String wordRoot;
    private String frequency;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_word, container, false);

        if (wordNumber != null) {
            TextView textView = (TextView) view.findViewById(R.id.word_number);
            textView.setText(wordNumber);
            textView = (TextView) view.findViewById(R.id.word_arabic);
            textView.setText(wordArabic);
            textView = (TextView) view.findViewById(R.id.translation);
            textView.setText(translation);
            textView = (TextView) view.findViewById(R.id.transliteration);
            textView.setText(transliteration);
            textView = (TextView) view.findViewById(R.id.word_root);
            textView.setText(wordRoot);
            textView = (TextView) view.findViewById(R.id.frequency);
            textView.setText(frequency);
        }

        return view;

    }

    public void setWordNumber(String wordNumber)
    {
        this.wordNumber = wordNumber;
    }

    public void setWordArabic(String wordArabic)
    {
        this.wordArabic = wordArabic;
    }

    public void setTranslation(String translation)
    {
        this.translation = translation;
    }

    public void setTransliteration(String transliteration)
    {
        this.transliteration = transliteration;
    }

    public void setRootWord(String wordRoot)
    {
        this.wordRoot = wordRoot;
    }

    public void setFrequency(String frequency)
    {
        this.frequency = frequency;
    }



}
