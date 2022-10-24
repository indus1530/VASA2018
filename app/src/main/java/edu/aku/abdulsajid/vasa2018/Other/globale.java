package edu.aku.abdulsajid.vasa2018.Other;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;

import edu.aku.abdulsajid.vasa2018.ui.InterviewEnd;

/**
 * Created by irfansyed on 12/20/2017.
 */

public class globale {


    public static void interviewExit(final Context context, final Activity activity, final String study_id, final int currentSection) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                context);
        alertDialogBuilder
                .setMessage("Do you want to End Interview?")
                .setCancelable(false)
                .setPositiveButton("Yes",
                        (dialog, id) -> {
                            activity.finish();
                            Intent end_intent = new Intent(context, InterviewEnd.class);
                            end_intent.putExtra("study_id", study_id);
                            end_intent.putExtra("currentSection", currentSection);
                            context.startActivity(end_intent);
                        });
        alertDialogBuilder.setNegativeButton("No",
                (dialog, id) -> dialog.cancel());
        AlertDialog alert = alertDialogBuilder.create();
        alert.show();
    }
}
