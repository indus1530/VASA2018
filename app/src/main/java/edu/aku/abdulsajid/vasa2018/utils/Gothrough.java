package edu.aku.abdulsajid.vasa2018.utils;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

/**
 * Created by irfansyed on 3/28/2017.
 */

public class Gothrough {


    public static boolean IamHiden(LinearLayout ll) {

        ///Yes dear should I import Adult Section Layout

        /// Checkbox Celar*************************************

        try {
            if (ll.getVisibility() != View.VISIBLE) {
                return true;
            }

            for (int i = 0, count = ll.getChildCount(); i < count; ++i) {
                View view = ll.getChildAt(i);

                if (view.getVisibility() == View.VISIBLE) {

                    if (view instanceof CheckBox) {
                        ((CheckBox) view).setError(null);

                        if (((CheckBox) view).isChecked()) {
                            return true;
                        }

                        if (i == count - 1) {
                            ((CheckBox) view).setError("Select Atleast One");
                        }
                    } else if (view instanceof RadioGroup) {
                        if (((RadioGroup) view).getCheckedRadioButtonId() != -1) {
                            return true;
                        }

                    } else if (view instanceof EditText) {
                        if (view.isEnabled()) {

                            ((EditText) view).setError(null);

                            if (((EditText) view).getText().toString().trim().length() > 0) {
                                if (i + 1 == ll.getChildCount()) {
                                    return true;
                                }
                            } else {
                                if (view.isEnabled()) {
                                    ((EditText) view).setError("Enter Text");
                                    return false;
                                } else {
                                    if (i + 1 == ll.getChildCount()) {
                                        return true;
                                    }
                                }
                            }
                        } else {
                            return true;
                        }
                    }
                }
            }
        } catch (Exception e) {

            // return true;
        }

        ll.requestFocus();

        return false;
    }


    public static boolean TextHidden(EditText txt) {

        if (txt != null) {
            txt.setError(null);
            txt.clearFocus();
            if (txt.getText().toString().trim().length() > 0)
                return true;
            else {
                txt.setError("Enter Text");
                return false;
            }
        } else {
            return true;
        }
    }
}
