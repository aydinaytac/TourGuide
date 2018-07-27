package com.example.android.tourguide;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {

    // array of images about places
    private int[] image = {
            R.drawable.boyoz,
            R.drawable.kokorec,
            R.drawable.kumru,
            R.drawable.midye_dolma,
            R.drawable.dari,
            R.drawable.bomba};

    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.izmir_list, container, false);

        // Getting resources for creating Izmir objects
        Resources res = getResources();
        final String[] name = res.getStringArray(R.array.name_of_food);
        final String[] description = res.getStringArray(R.array.description_of_food);

        // Create a list of words
        final ArrayList<Izmir> izmir = new ArrayList<Izmir>();

        // Creating new Izmir objects and adding them to izmir ArraList
        for (int i = 0; i < name.length; i++) {

            izmir.add(new Izmir(name[i], description[i], image[i]));
        }

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        IzmirAdapter adapter = new IzmirAdapter(getActivity(), izmir);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // izmir_listt.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
