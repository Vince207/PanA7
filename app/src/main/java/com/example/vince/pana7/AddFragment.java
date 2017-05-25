package com.example.vince.pana7;


import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class AddFragment extends DialogFragment
{

    public Dialog onCreateDialog(Bundle bundle)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View additionDialogView = getActivity().getLayoutInflater().inflate(R.layout.fragment_add, null);
        builder.setView(additionDialogView);
        builder.setTitle(R.string.menuitem_add);
        return builder.create();
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        View view = inflater.inflate(R.layout.fragment_add, container, false);
        return view;


    }

    public void onViewCreated(View rootView, Bundle savedInstanceState)
    {
        super.onViewCreated(rootView, savedInstanceState);
        final View v = rootView;

        String groceries = getString(R.string.groceries_name);
        String utilities = getString(R.string.utilities_name);
        String transportation = getString(R.string.transportation_name);
        String eatingout = getString(R.string.eating_out_name);
        String entertainment = getString(R.string.entertainment_name);

        Spinner spinner = (Spinner) rootView.findViewById(R.id.add_spinner);

        List<String> selections = new ArrayList<String>();

        selections.add(groceries);
        selections.add(utilities);
        selections.add(transportation);
        selections.add(eatingout);
        selections.add(entertainment);

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, selections);

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(dataAdapter);

    }

}
