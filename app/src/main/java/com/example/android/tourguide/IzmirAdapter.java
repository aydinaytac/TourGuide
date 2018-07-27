/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.tourguide;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * {@link IzmirAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Izmir} objects.
 */
public class IzmirAdapter extends ArrayAdapter<Izmir> {

    /**
     * Create a new {@link IzmirAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param izmir is the list of {@link Izmir}s to be displayed.
     */
    public IzmirAdapter(Context context, ArrayList<Izmir> izmir) {

        super(context, 0, izmir);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Izmir} object located at this position in the list
        Izmir currentIzmir = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID izmir_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.izmir_name);
        // Get the name from the currentIzmir object and set this text on
        // the header TextView.
        nameTextView.setText(currentIzmir.getIzmirName());

        // Find the TextView in the list_item.xml layout with the ID izmir_address
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.izmir_address);
        // Get the address from the currentIzmir object and set this text on
        // the address TextView.
        if (currentIzmir.getIzmirAddress() == null) {
            LinearLayout linearLayout = (LinearLayout) listItemView.findViewById(R.id.address_row);
            linearLayout.setVisibility(View.GONE);
        } else {addressTextView.setText(currentIzmir.getIzmirAddress());}

        // Find the TextView in the list_item.xml layout with the ID izmir_detail
        TextView detailTextView = (TextView) listItemView.findViewById(R.id.izmir_detail);
        // Get the detail from the currentIzmir object and set this text on
        // the detail TextView.
        if (currentIzmir.getIzmirDetail() == null) {
            LinearLayout linearLayout = (LinearLayout) listItemView.findViewById(R.id.description_row);
            linearLayout.setVisibility(View.GONE);
        } else { detailTextView.setText(currentIzmir.getIzmirDetail());}

        // Find the TextView in the list_item.xml layout with the ID izmir_phone_number
        TextView phoneNumberTextView = (TextView) listItemView.findViewById(R.id.izmir_phone_number);
        // Get the detail from the currentIzmir object and set this text on
        // the detail TextView.
        if (currentIzmir.getmIzmirPhoneNumber() == null) {
            LinearLayout linearLayout = (LinearLayout) listItemView.findViewById(R.id.phone_number_row);
            linearLayout.setVisibility(View.GONE);
        } else { phoneNumberTextView.setText(currentIzmir.getmIzmirPhoneNumber()); }

        // Find the TextView in the list_item.xml layout with the ID izmir_web_address
        TextView webAddressTextView = (TextView) listItemView.findViewById(R.id.izmir_web_address);
        // Get the web address from the currentIzmir object and set this text on
        // the web address TextView.
        if (currentIzmir.getIzmirWebAddress() == null) {
            LinearLayout linearLayout = (LinearLayout) listItemView.findViewById(R.id.web_address_row);
            linearLayout.setVisibility(View.GONE);
        } else { webAddressTextView.setText(currentIzmir.getIzmirWebAddress());}

        // Find the ImageView in the list_item.xml layout with the ID image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentIzmir.getImageResourceId());

        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // To do
                Toast.makeText(getContext(), R.string.app_name, Toast.LENGTH_SHORT).show();
            }
        });

        return listItemView;
    }
}