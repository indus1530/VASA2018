package edu.aku.abdulsajid.vasa2018.utils;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

import androidx.cardview.widget.CardView;


public class ClearAllcontrol {


    public static void ClearAll(ViewGroup vg) {

        /// Checkbox Celar*************************************

        try {

            for (int i = 0, count = vg.getChildCount(); i < count; ++i) {
                View view = vg.getChildAt(i);
                if (view instanceof CheckBox) {
                    ((CheckBox) view).setChecked(false);

                } else if (view instanceof RadioGroup) {
                    ((RadioGroup) view).clearCheck();
                } else if (view instanceof EditText) {
                    ((EditText) view).setText("");

                } else if (view instanceof CardView) {
                    for (int j = 0; j < ((CardView) view).getChildCount(); j++) {
                        View view1 = ((CardView) view).getChildAt(j);
                        if (view1 instanceof LinearLayout) {
                            ClearAll((LinearLayout) view1);
                        }
                    }
                } else if (view instanceof LinearLayout) {
                    ClearAll((LinearLayout) view);
                }

            }
        } catch (Exception e) {

        }


    }
}
