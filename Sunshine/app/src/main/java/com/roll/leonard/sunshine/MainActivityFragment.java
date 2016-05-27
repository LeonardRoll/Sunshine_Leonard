package com.roll.leonard.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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
        View rootView = inflater.inflate(R.layout.fragment_main,container,false);
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
        //Adapter
        ArrayAdapter<String> mForecastAdapter = new ArrayAdapter<String>(getActivity(), R.layout.list_item_forecast, R.id.list_item_forecast_textview, forecast);
        ListView List = (ListView) rootView.findViewById(R.id.listView_forecast);
        List.setAdapter(mForecastAdapter);
        return rootView;
    }
}
