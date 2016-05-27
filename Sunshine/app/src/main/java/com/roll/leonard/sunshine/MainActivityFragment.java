package com.roll.leonard.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] forecastArray = {
                "Today - Sunny - 72/63",
                "Tomorrow - Rainy - 45/75",
                "Wednesday - Sunny - 75/34",
                "Thursday - Sunny - 75/34",
                "Friday - Rainy - 45/32",
                "Saturday - Sunny - 78/45",
                "Sunday - Rainy but you'll be LIT - 48/26"
        };
        List<String> forecast = new ArrayList<String>(Arrays.asList(forecastArray));
        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}
