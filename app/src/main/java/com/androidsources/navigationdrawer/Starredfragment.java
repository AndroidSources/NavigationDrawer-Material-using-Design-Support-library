package com.androidsources.navigationdrawer;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Gowtham Chandrasekar on 7/20/2015.
 */
public class Starredfragment extends Fragment {

    public Starredfragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_starred, container, false);

        return root;
    }
}
