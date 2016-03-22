package com.ss.medicalrecordsapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by loveloliii on 16-3-12.
 */
public class Menu_Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup contanier,Bundle savedInstanceStatc){
        View view = inflater.inflate(R.layout.menu_fragment,contanier,false);
        return  view;
    }
}
