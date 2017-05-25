package com.example.vince.pana7;


import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddFragment extends DialogFragment
{
    private EditText spinnerText;

    public Dialog onCreateDialog(Bundle bundle)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View additionDialogView = getActivity().getLayoutInflater().inflate(R.layout.fragment_add, null);
        builder.setView(additionDialogView);
        builder.setTitle(R.string.menuitem_add);

        spinnerText = (EditText) additionDialogView.findViewById(R.id.spinner_edit);
        builder.setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                spinnerText.setText(spinnerText.getText());
            }
        });

        return builder.create();
    }


}
