package edu.aku.abdulsajid.vasa2018.ui;

import static java.lang.Integer.parseInt;

import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import edu.aku.abdulsajid.vasa2018.R;
import edu.aku.abdulsajid.vasa2018.data.DBHelper;
import edu.aku.abdulsajid.vasa2018.data.LocalDataManager;
import edu.aku.abdulsajid.vasa2018.utils.ClearAllcontrol;
import edu.aku.abdulsajid.vasa2018.utils.MyPreferences;

public class SectionQ01Activity extends AppCompatActivity implements View.OnClickListener, TextWatcher, AdapterView.OnItemSelectedListener {

    private Pattern pattern;
    private Matcher matcher;
    private static final String DATE_PATTERN = "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)";

    //region Declaration

    Button btn_next, btn_Q1502;

    //CardView
    LinearLayout
            ll1405,
            GrpName;

    // LinerLayouts
    CardView
            cvStudyId,
            cvQ1201,
            cvQ1201_1,
            cvQ1201_2,
            cvQ1202,
            cvQ1203,
            cvQ1204,
            cvQ1205,
            cvQ1206_d,
            cvQ1206_m,
            cvQ1206_y,
            cvQ1207,
            cvQ1208,
            cvQ1209,
            cvQ1301,
            cvQ1302,
            cvQ1312,
            cvQ1313,
            cvQ1401,
            cvQ1402,
            cvQ1403,
            cvQ1404,
            cvQ1405,
            cvQ1406,
            cvQ1407,
            cvQ1408,
            cvQ1409,
            cvQ1410,
            cvQ1411,
            cvQ1412,
            cvQ1413,
            cvQ1414,
            cvQ1415,
            cvQ1416,
            cvQ1417,
            cvQ1418,
            cvQ1419,
            cvQ1420,
            cvQ1421,
            cvQ1501,
            cvQ1502,
            cvQ1601,
            cvQ1602,
            cvQ1603,
            cvQ1604,
            cvQ1605,
            cvQ1606,
            cvQ1607,
            cvQ1608,
            cvQ1609,
            cvQ1610;

    RadioGroup
            q1405,
            q1403,
            q1407,
            q1416,
            q1417,
            q1418,
            q1419,
            q1420,
            q1421,
            q1501,
            q1602,
            q1604,
            q1605,
            q1609;

    RadioButton
            rb_Q1203_1,
            rb_Q1203_2,
            rb_Q1207_1,
            rb_Q1207_2,
            rb_Q1207_DK,
            rb_Q1402_1,
            rb_Q1402_2,
            rb_Q1402_DK,
            rb_Q1403_1,
            rb_Q1403_2,
            rb_Q1403_3,
            rb_Q1403_4,
            rb_Q1403_5,
            rb_Q1403_6,
            rb_Q1403_7,
            rb_Q1403_8,
            rb_Q1403_9,
            rb_Q1403_10,
            rb_Q1403_11,
            rb_Q1403_12,
            rb_Q1403_13,
            rb_Q1403_14,
            rb_Q1404_1,
            rb_Q1404_2,
            rb_Q1404_DK,
            rb_Q1405_1,
            rb_Q1405_2,
            rb_Q1407_1,
            rb_Q1407_2,
            rb_Q1407_DK,
            rb_Q1408_1,
            rb_Q1408_2,
            rb_Q1408_3,
            rb_Q1408_DK,
            rb_Q1410_1,
            rb_Q1410_2,
            rb_Q1410_3,
            rb_Q1410_4,
            rb_Q1410_5,
            rb_Q1413_1,
            rb_Q1413_2,
            rb_Q1413_DK,
            rb_Q1414_1_1,
            rb_Q1414_1_2,
            rb_Q1414_1_DK,
            rb_Q1414_2_1,
            rb_Q1414_2_2,
            rb_Q1414_2_DK,
            rb_Q1414_3_1,
            rb_Q1414_3_2,
            rb_Q1414_3_DK,
            rb_Q1414_4_1,
            rb_Q1414_4_2,
            rb_Q1414_4_DK,
            rb_Q1414_5_1,
            rb_Q1414_5_2,
            rb_Q1414_5_DK,
            rb_Q1414_6_1,
            rb_Q1414_6_2,
            rb_Q1414_6_DK,
            rb_Q1414_7_1,
            rb_Q1414_7_2,
            rb_Q1414_7_DK,
            rb_Q1414_8_1,
            rb_Q1414_8_2,
            rb_Q1414_8_DK,
            rb_Q1414_9_1,
            rb_Q1414_9_2,
            rb_Q1414_9_DK,
            rb_Q1414_10_1,
            rb_Q1414_10_2,
            rb_Q1414_10_DK,
            rb_Q1415_1,
            rb_Q1415_2,
            rb_Q1415_3,
            rb_Q1415_4,
            rb_Q1415_5,
            rb_Q1415_6,
            rb_Q1415_7,
            rb_Q1415_8,
            rb_Q1415_9,
            rb_Q1415_10,
            rb_Q1415_11,
            rb_Q1415_12,
            rb_Q1415_DK,
            rb_Q1416_1,
            rb_Q1416_2,
            rb_Q1416_3,
            rb_Q1416_4,
            rb_Q1416_5,
            rb_Q1416_6,
            rb_Q1416_7,
            rb_Q1416_OT,
            rb_Q1416_DK,
            rb_Q1417_1,
            rb_Q1417_2,
            rb_Q1417_3,
            rb_Q1417_4,
            rb_Q1417_5,
            rb_Q1417_6,
            rb_Q1417_7,
            rb_Q1417_8,
            rb_Q1417_9,
            rb_Q1417_DK,
            rb_Q1418_1,
            rb_Q1418_2,
            rb_Q1418_3,
            rb_Q1418_4,
            rb_Q1418_5,
            rb_Q1418_6,
            rb_Q1418_7,
            rb_Q1418_8,
            rb_Q1418_9,
            rb_Q1418_DK,
            rb_Q1419_1,
            rb_Q1419_2,
            rb_Q1419_3,
            rb_Q1419_4,
            rb_Q1419_5,
            rb_Q1419_6,
            rb_Q1419_7,
            rb_Q1419_8,
            rb_Q1419_DK,
            rb_Q1420_1,
            rb_Q1420_2,
            rb_Q1420_3,
            rb_Q1420_4,
            rb_Q1420_5,
            rb_Q1420_6,
            rb_Q1420_7,
            rb_Q1420_DK,
            rb_Q1421_1,
            rb_Q1421_2,
            rb_Q1421_3,
            rb_Q1421_4,
            rb_Q1421_5,
            rb_Q1421_6,
            rb_Q1421_7,
            rb_Q1421_8,
            rb_Q1421_9,
            rb_Q1421_10,
            rb_Q1421_DK,
            rb_Q1501_1,
            rb_Q1501_2,
            rb_Q1601_1,
            rb_Q1601_2,
            rb_Q1601_DK,
            rb_Q1602_1,
            rb_Q1602_2,
            rb_Q1602_DK,
            rb_Q1604_1,
            rb_Q1604_2,
            rb_Q1604_3,
            rb_Q1604_4,
            rb_Q1604_5,
            rb_Q1604_DK,
            rb_Q1605_1,
            rb_Q1605_2,
            rb_Q1609_1,
            rb_Q1609_2,
            rb_Q1609_3,
            rb_Q1609_4,
            rb_Q1609_5;

    CheckBox cb_Q1607_conflict;

    EditText
            ed_study_id,
            ed_Q1201_3,
            ed_Q1201_4,
            ed_Q1201_5,
            ed_Q1201_6,
            ed_Q1202,
            ed_Q1204,
            ed_Q1205,
            ed_Q1206_d,
            ed_Q1206_m,
            ed_Q1206_y,
            ed_Q1208,
            ed_Q1209,
            ed_Q1301,
            ed_Q1302,
            ed_Q1312,
            ed_Q1313,
            ed_Q1401,
            ed_Q1403_OT,
            ed_Q1406,
            ed_Q1409,
            ed_Q1411,
            ed_Q1412,
            ed_Q1416_OT,
            ed_Q1417_OT,
            ed_Q1418_OT,
            ed_Q1419_OT,
            ed_Q1420_OT,
            ed_Q1421_OT,
            ed_Q1502,
            ed_Q1603,
            ed_Q1604_OT,
            ed_Q1606,
            ed_Q1607_1,
            ed_Q1607_2,
            ed_Q1607_3,
            ed_Q1608_1,
            ed_Q1608_2,
            ed_Q1608_3,
            ed_Q1610_1,
            ed_Q1610_2,
            ed_Q1610_3;

    Spinner sp_Q1201_1,
            sp_Q1201_2;

    String
            study_id,
            Q1201_1,
            Q1201_2,
            Q1201_3,
            Q1201_4,
            Q1201_5,
            Q1201_6,
            Q1202,
            Q1203,
            Q1204,
            Q1205,
            Q1206_d,
            Q1206_m,
            Q1206_y,
            Q1207,
            Q1208,
            Q1209,
            Q1301,
            Q1302,
            Q1307,
            Q1308,
            Q1309,
            Q1310,
            Q1311,
            Q1312,
            Q1313,
            Q1401,
            Q1402,
            Q1403,
            Q1403_OT,
            Q1404,
            Q1405,
            Q1406,
            Q1407,
            Q1408,
            Q1409,
            Q1410,
            Q1411,
            Q1412,
            Q1413,
            Q1414_1,
            Q1414_2,
            Q1414_3,
            Q1414_4,
            Q1414_5,
            Q1414_6,
            Q1414_7,
            Q1414_8,
            Q1414_9,
            Q1414_10,
            Q1415,
            Q1416,
            Q1416_OT,
            Q1417,
            Q1417_OT,
            Q1418,
            Q1418_OT,
            Q1419,
            Q1419_OT,
            Q1420,
            Q1420_OT,
            Q1421,
            Q1421_OT,
            Q1501,
            Q1502,
            Q1503,
            Q1503_OT,
            Q1601,
            Q1602,
            Q1603,
            Q1604,
            Q1604_OT,
            Q1605,
            Q1606,
            Q1607_1,
            Q1607_2,
            Q1607_3,
            Q1608_1,
            Q1608_2,
            Q1608_3,
            Q1609,
            Q1610_1,
            Q1610_2,
            Q1610_3,
            STATUS;

    int
            interviewType,
            currentSection;

    //endregion

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        change_langua();
        setContentView(R.layout.activity_section_q01);

        Initialization();

        /*ed_Q1202.setEnabled(false);
        rb_Q1203_1.setEnabled(false);
        rb_Q1203_2.setEnabled(false);
        ed_Q1204.setEnabled(false);
        ed_Q1205.setEnabled(false);
        ed_Q1206_d.setEnabled(false);
        ed_Q1206_m.setEnabled(false);
        ed_Q1206_y.setEnabled(false);
        ed_Q1607_1.setEnabled(false);
        ed_Q1607_2.setEnabled(false);
        ed_Q1607_3.setEnabled(false);*/

        /*cvQ1403_OT.setVisibility(View.GONE);
        cvQ1416_OT.setVisibility(View.GONE);
        cvQ1417_OT.setVisibility(View.GONE);
        cvQ1418_OT.setVisibility(View.GONE);
        cvQ1419_OT.setVisibility(View.GONE);
        cvQ1420_OT.setVisibility(View.GONE);
        cvQ1421_OT.setVisibility(View.GONE);

        cvQ1604_OT.setVisibility(View.GONE);*/

        /*cvQ1608.setVisibility(View.GONE);*/

        //rb_Q1207_1.setEnabled(false);
        //rb_Q1207_2.setEnabled(false);
        //rb_Q1207_DK.setEnabled(false);
        //ed_Q1208.setEnabled(false);
        //ed_Q1209.setEnabled(false);
        //ed_Q1301.setEnabled(false);
        //ed_Q1302.setEnabled(false);

        //ed_Q1312.setEnabled(false);
        //ed_Q1313.setEnabled(false);

        events_call();

        btn_next.setOnClickListener(this);
        btn_Q1502.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        /*if ((rb_Q1207_1.isChecked() || rb_Q1207_2.isChecked()) && (!rb_Q1609_1.isChecked() || Q1609 != "-1")) {

            Toast.makeText(this, "Conflict in Q1207 and Q1609", Toast.LENGTH_LONG).show();
            return;
        }*/

        if (ed_study_id.getText().toString().length() < 11) {

            Toast.makeText(this, "Minimum Study ID length should be 9 characters", Toast.LENGTH_LONG).show();
            return;
        }


        if (view.getId() == R.id.btn_next) {

            /*if (ed_Q1201_1.getText().toString().length() < 1 || ed_Q1201_2.getText().toString().length() < 1) {
                Toast.makeText(this, "Province and District are required", Toast.LENGTH_LONG).show();
                return;
            }*/

            if (validateField() == false) {
                Toast.makeText(this, "Required fields are missing", Toast.LENGTH_LONG).show();
                return;
            }


            if (ed_Q1502.getText().toString().trim().length() > 0) {
                int total = Integer.parseInt(ed_Q1502.getText().toString().trim());
                if (total < lst_q1503.size()) {
                    Toast.makeText(this, "Please Enter All Relative Q1503", Toast.LENGTH_LONG).show();
                    return;
                }
            }


            pattern = Pattern.compile(DATE_PATTERN);

            if (cvQ1204.getVisibility() == View.VISIBLE) {

                if (!validate(ed_Q1204.getText().toString().trim())) {

                    ed_Q1204.setError("Kindly enter a valid Date of Birth for Q1204");
                    ed_Q1204.requestFocus();
                    return;
                }
            }


            if (cvQ1205.getVisibility() == View.VISIBLE) {

                if (!validate(ed_Q1205.getText().toString().trim())) {

                    ed_Q1205.setError("Kindly enter a valid Date of Death for Q1205");
                    ed_Q1205.requestFocus();
                    return;
                }
            }

            if (cvQ1603.getVisibility() == View.VISIBLE) {

                if (!validate(ed_Q1603.getText().toString().trim())) {

                    ed_Q1603.setError("Kindly enter a valid Date of Birth");
                    ed_Q1603.requestFocus();
                    return;
                }
            }

            if (cvQ1603.getVisibility() == View.VISIBLE && cvQ1606.getVisibility() == View.VISIBLE) {

                if (!validate(ed_Q1606.getText().toString().trim())) {

                    ed_Q1606.setError("Kindly enter a valid Date of Death");
                    ed_Q1606.requestFocus();
                    return;

                } else {

                    String dob = ed_Q1603.getText().toString().trim();
                    String dod = ed_Q1606.getText().toString().trim();

                    String[] dob_sep = dob.split("/");
                    String[] dod_sep = dod.split("/");

                    if (!Integer.valueOf(dob_sep[2]).equals(9999)
                            && !Integer.valueOf(dod_sep[2]).equals(9999)
                            && Integer.valueOf(dob_sep[2]) > Integer.valueOf(dod_sep[2])) {

                        ed_Q1603.setError("Date of Birth Year cannot be greater than Date of Death Year");
                        ed_Q1603.requestFocus();
                        return;

                    } else if (Integer.valueOf(dob_sep[2]).equals(Integer.valueOf(dod_sep[2]))
                            && !Integer.valueOf(dob_sep[1]).equals(99)
                            && !Integer.valueOf(dod_sep[1]).equals(99)
                            && Integer.valueOf(dob_sep[1]) > Integer.valueOf(dod_sep[1])) {

                        ed_Q1603.setError("Date of Birth Month cannot be greater than Date of Death Month");
                        ed_Q1603.requestFocus();
                        return;

                    } else if (Integer.valueOf(dob_sep[2]).equals(Integer.valueOf(dod_sep[2]))
                            && Integer.valueOf(dob_sep[1]).equals(Integer.valueOf(dod_sep[1]))
                            && !Integer.valueOf(dob_sep[0]).equals(99)
                            && !Integer.valueOf(dod_sep[0]).equals(99)
                            && Integer.valueOf(dob_sep[0]) > Integer.valueOf(dod_sep[0])) {

                        ed_Q1603.setError("Date of Birth Day cannot be greater than Date of Death Day");
                        ed_Q1603.requestFocus();
                        return;
                    }
                }
            }

            value_assignment();

            if (if_study_id_exsist() == true) {

                Toast.makeText(this, "Study ID Already Exist", Toast.LENGTH_LONG).show();

                ed_study_id.requestFocus();
                ed_study_id.setError("This ID Already Exist");
                return;
            }

            insert_data();

            DBHelper db = new DBHelper(this);
            Cursor res = db.getData("Q1101_Q1610", study_id);

            if (res.getCount() > 0) {
                res.moveToFirst();

                if (Integer.valueOf(res.getString(res.getColumnIndex("Q1405"))).equals(2)) {

                    Intent c = new Intent(this, InterviewEnd.class);
                    c.putExtra("study_id", study_id);
                    c.putExtra("currentSection", currentSection);
                    startActivity(c);

                } else {

                    if (Integer.valueOf(res.getString(res.getColumnIndex("Q1609"))).equals(5)) {

                        Intent c = new Intent(this, SectionA01Activity.class);
                        c.putExtra("study_id", study_id);
                        startActivity(c);

                    } else if (Integer.valueOf(res.getString(res.getColumnIndex("Q1609"))).equals(2)) {

                        Intent c = new Intent(this, SectionWActivity.class);
                        c.putExtra("study_id", study_id);
                        //c.putExtra("section", "C3001_C3011");
                        startActivity(c);

                    } else if (Integer.valueOf(res.getString(res.getColumnIndex("Q1609"))).equals(3) || Integer.valueOf(res.getString(res.getColumnIndex("Q1609"))).equals(4)) {

                        Intent c = new Intent(this, SectionWActivity.class);
                        c.putExtra("study_id", study_id);
                        //c.putExtra("section", "C3012_C3022");
                        startActivity(c);

                    } else if (Integer.valueOf(res.getString(res.getColumnIndex("Q1609"))).equals(1)) {

                        Intent c = new Intent(this, SectionWActivity.class);
                        c.putExtra("study_id", study_id);
                        //c.putExtra("section", "N2001_N2011");
                        startActivity(c);

                    }
                }
            }

        } else if (view.getId() == R.id.btn_Q1502) {

            if (ed_Q1502.getText().toString().trim().length() > 0) {
                int total = Integer.parseInt(ed_Q1502.getText().toString().trim());

                if (total > lst_q1503.size()) {
                    show_dailuge_Q1503();
                } else {
                    Toast.makeText(this, "you have reached Maximum Number", Toast.LENGTH_LONG).show();
                    return;
                }

                int sixx = lst_q1503.size() + 1;
                btn_Q1502.setText("Add Persion No( " + sixx + ")");
            }
        }

    }

    List<String> lst_q1503 = new ArrayList();
    List<String> lst_other = new ArrayList();

    String[] dataDistricts = null;

    void show_dailuge_Q1503() {


        final AlertDialog b = new AlertDialog.Builder(SectionQ01Activity.this).create();

        LayoutInflater layoutInflater = getLayoutInflater();
        View v = layoutInflater.inflate(R.layout.dialog_q1503, null);
        b.setCancelable(false);
        b.setView(v);
        b.show();

        final LinearLayout llQ1503;
        final RadioGroup q1503;
        final EditText ed_Q1503_OT;
        final TextView txt_Q1503_header;

        final RadioButton
                rb_Q1503_1,
                rb_Q1503_2,
                rb_Q1503_3,
                rb_Q1503_4,
                rb_Q1503_5,
                rb_Q1503_6,
                rb_Q1503_7,
                rb_Q1503_8,
                rb_Q1503_9,
                rb_Q1503_10,
                rb_Q1503_11,
                rb_Q1503_12,
                rb_Q1503_13,
                rb_Q1503_14;


        q1503 = v.findViewById(R.id.q1503);
        rb_Q1503_1 = v.findViewById(R.id.rb_Q1503_1);
        rb_Q1503_2 = v.findViewById(R.id.rb_Q1503_2);
        rb_Q1503_3 = v.findViewById(R.id.rb_Q1503_3);
        rb_Q1503_4 = v.findViewById(R.id.rb_Q1503_4);
        rb_Q1503_5 = v.findViewById(R.id.rb_Q1503_5);
        rb_Q1503_6 = v.findViewById(R.id.rb_Q1503_6);
        rb_Q1503_7 = v.findViewById(R.id.rb_Q1503_7);
        rb_Q1503_8 = v.findViewById(R.id.rb_Q1503_8);
        rb_Q1503_9 = v.findViewById(R.id.rb_Q1503_9);
        rb_Q1503_10 = v.findViewById(R.id.rb_Q1503_10);
        rb_Q1503_11 = v.findViewById(R.id.rb_Q1503_11);
        rb_Q1503_12 = v.findViewById(R.id.rb_Q1503_12);
        rb_Q1503_13 = v.findViewById(R.id.rb_Q1503_13);
        rb_Q1503_14 = v.findViewById(R.id.rb_Q1503_14);


        ed_Q1503_OT = v.findViewById(R.id.ed_Q1503_OT);

        llQ1503 = v.findViewById(R.id.llQ1503);
        /*txt_Q1503_header = v.findViewById(R.id.txt_Q1503_header);*/


        ed_Q1503_OT.setVisibility(View.GONE);


        Button btn_add = v.findViewById(R.id.btn_add);

        int db = lst_q1503.size() + 1;

        /*txt_Q1503_header.setText("Please Enter Relationship for Person No: " + db);*/

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!Validator.emptyCheckingContainer(v.getContext(), llQ1503)) {
                    //Toast.makeText(Q1101_Q1610.this, "Select Mandatory Field", Toast.LENGTH_LONG).show();
                    return;
                }

                if (rb_Q1503_1.isChecked()) {
                    lst_q1503.add("1");
                } else if (rb_Q1503_2.isChecked()) {
                    lst_q1503.add("2");
                } else if (rb_Q1503_3.isChecked()) {
                    lst_q1503.add("3");
                } else if (rb_Q1503_4.isChecked()) {
                    lst_q1503.add("4");
                } else if (rb_Q1503_5.isChecked()) {
                    lst_q1503.add("5");
                } else if (rb_Q1503_6.isChecked()) {
                    lst_q1503.add("6");
                } else if (rb_Q1503_7.isChecked()) {
                    lst_q1503.add("7");
                } else if (rb_Q1503_8.isChecked()) {
                    lst_q1503.add("8");
                } else if (rb_Q1503_9.isChecked()) {
                    lst_q1503.add("9");
                } else if (rb_Q1503_10.isChecked()) {
                    lst_q1503.add("10");
                } else if (rb_Q1503_11.isChecked()) {
                    lst_q1503.add("11");
                } else if (rb_Q1503_12.isChecked()) {
                    lst_q1503.add("12");
                    lst_other.add(ed_Q1503_OT.getText().toString().trim());
                } else if (rb_Q1503_13.isChecked()) {
                    lst_q1503.add("13");
                    lst_other.add(ed_Q1503_OT.getText().toString().trim());
                } else if (rb_Q1503_14.isChecked()) {
                    lst_q1503.add("14");
                    lst_other.add(ed_Q1503_OT.getText().toString().trim());
                }
                b.cancel();
            }


        });

        q1503.setOnCheckedChangeListener((radioGroup, i) -> {
            ed_Q1503_OT.setText("");
            ed_Q1503_OT.setVisibility(View.GONE);
            if (i == R.id.rb_Q1503_12 || i == R.id.rb_Q1503_13 || i == R.id.rb_Q1503_14)
                ed_Q1503_OT.setVisibility(View.VISIBLE);
        });

    }

    void Initialization() {

        // Button Next
        q1405 = findViewById(R.id.q1405);
        q1403 = findViewById(R.id.q1403);
        q1407 = findViewById(R.id.q1407);
        q1416 = findViewById(R.id.q1416);
        q1417 = findViewById(R.id.q1417);
        q1418 = findViewById(R.id.q1418);
        q1419 = findViewById(R.id.q1419);
        q1420 = findViewById(R.id.q1420);
        q1421 = findViewById(R.id.q1421);
        q1501 = findViewById(R.id.q1501);
        q1602 = findViewById(R.id.q1602);
        q1604 = findViewById(R.id.q1604);
        q1605 = findViewById(R.id.q1605);
        q1609 = findViewById(R.id.q1609);
        btn_next = findViewById(R.id.btn_next);
        btn_Q1502 = findViewById(R.id.btn_Q1502);

        // Layouts
        GrpName = findViewById(R.id.GrpName);
        cvStudyId = findViewById(R.id.cvStudyId);
        ll1405 = findViewById(R.id.ll1405);
        cvQ1201 = findViewById(R.id.cvQ1201);
        cvQ1202 = findViewById(R.id.cvQ1202);


        cvQ1203 = findViewById(R.id.cvQ1203);
        cvQ1204 = findViewById(R.id.cvQ1204);
        cvQ1205 = findViewById(R.id.cvQ1205);
        cvQ1206_d = findViewById(R.id.cvQ1206);
        cvQ1207 = findViewById(R.id.cvQ1207);
        cvQ1208 = findViewById(R.id.cvQ1208);
        cvQ1209 = findViewById(R.id.cvQ1209);
        cvQ1301 = findViewById(R.id.cvQ1301);
        cvQ1302 = findViewById(R.id.cvQ1302);
        /*cvQ1312 = findViewById(R.id.cvQ1312);
        cvQ1313 = findViewById(R.id.cvQ1313);*/
        cvQ1401 = findViewById(R.id.cvQ1401);
        cvQ1402 = findViewById(R.id.cvQ1402);
        cvQ1403 = findViewById(R.id.cvQ1403);
        cvQ1404 = findViewById(R.id.cvQ1404);
        cvQ1405 = findViewById(R.id.cvQ1405);
        cvQ1406 = findViewById(R.id.cvQ1406);
        cvQ1407 = findViewById(R.id.cvQ1407);
        cvQ1408 = findViewById(R.id.cvQ1408);
        cvQ1409 = findViewById(R.id.cvQ1409);
        cvQ1410 = findViewById(R.id.cvQ1410);
        cvQ1411 = findViewById(R.id.cvQ1411);
        cvQ1412 = findViewById(R.id.cvQ1412);
        cvQ1413 = findViewById(R.id.cvQ1413);

        cvQ1414 = findViewById(R.id.cvQ1414);
        cvQ1415 = findViewById(R.id.cvQ1415);


        cvQ1416 = findViewById(R.id.cvQ1416);
        cvQ1417 = findViewById(R.id.cvQ1417);
        cvQ1418 = findViewById(R.id.cvQ1418);
        cvQ1419 = findViewById(R.id.cvQ1419);
        cvQ1420 = findViewById(R.id.cvQ1420);
        cvQ1421 = findViewById(R.id.cvQ1421);
        cvQ1501 = findViewById(R.id.cvQ1501);
        cvQ1502 = findViewById(R.id.cvQ1502);
        ed_Q1502 = findViewById(R.id.ed_Q1502);

        cvQ1601 = findViewById(R.id.cvQ1601);
        cvQ1602 = findViewById(R.id.cvQ1602);
        cvQ1603 = findViewById(R.id.cvQ1603);
        cvQ1604 = findViewById(R.id.cvQ1604);
        cvQ1605 = findViewById(R.id.cvQ1605);
        cvQ1606 = findViewById(R.id.cvQ1606);
        cvQ1607 = findViewById(R.id.cvQ1607);
        cvQ1608 = findViewById(R.id.cvQ1608);
        cvQ1609 = findViewById(R.id.cvQ1609);
        cvQ1610 = findViewById(R.id.cvQ1610);

        // Radio Buttons

        rb_Q1203_1 = findViewById(R.id.q1203a);
        rb_Q1203_2 = findViewById(R.id.q1203b);
        rb_Q1207_1 = findViewById(R.id.rb_Q1207_1);
        rb_Q1207_2 = findViewById(R.id.rb_Q1207_2);
        rb_Q1207_DK = findViewById(R.id.rb_Q1207_3);
        rb_Q1402_1 = findViewById(R.id.q1402a);
        rb_Q1402_2 = findViewById(R.id.q1402b);
        rb_Q1402_DK = findViewById(R.id.q140298);
        rb_Q1403_1 = findViewById(R.id.rb_Q1403_1);
        rb_Q1403_2 = findViewById(R.id.rb_Q1403_2);
        rb_Q1403_3 = findViewById(R.id.rb_Q1403_3);
        rb_Q1403_4 = findViewById(R.id.rb_Q1403_4);
        rb_Q1403_5 = findViewById(R.id.rb_Q1403_5);
        rb_Q1403_6 = findViewById(R.id.rb_Q1403_6);
        rb_Q1403_7 = findViewById(R.id.rb_Q1403_7);
        rb_Q1403_8 = findViewById(R.id.rb_Q1403_8);
        rb_Q1403_9 = findViewById(R.id.rb_Q1403_9);
        rb_Q1403_10 = findViewById(R.id.rb_Q1403_10);
        rb_Q1403_11 = findViewById(R.id.rb_Q1403_11);
        rb_Q1403_12 = findViewById(R.id.rb_Q1403_12);
        rb_Q1403_13 = findViewById(R.id.rb_Q1403_13);
        rb_Q1403_14 = findViewById(R.id.rb_Q1403_14);
        rb_Q1404_1 = findViewById(R.id.rb_Q1404_1);
        rb_Q1404_2 = findViewById(R.id.rb_Q1404_2);
        rb_Q1404_DK = findViewById(R.id.rb_Q1404_DK);
        rb_Q1405_1 = findViewById(R.id.q1405a);
        rb_Q1405_2 = findViewById(R.id.q1405b);
        rb_Q1407_1 = findViewById(R.id.rb_Q1407_1);
        rb_Q1407_2 = findViewById(R.id.rb_Q1407_2);
        rb_Q1407_DK = findViewById(R.id.rb_Q1407_DK);
        rb_Q1408_1 = findViewById(R.id.rb_Q1408_1);
        rb_Q1408_2 = findViewById(R.id.rb_Q1408_2);
        rb_Q1408_3 = findViewById(R.id.rb_Q1408_3);
        rb_Q1408_DK = findViewById(R.id.rb_Q1408_DK);
        rb_Q1410_1 = findViewById(R.id.rb_Q1410_1);
        rb_Q1410_2 = findViewById(R.id.rb_Q1410_2);
        rb_Q1410_3 = findViewById(R.id.rb_Q1410_3);
        rb_Q1410_4 = findViewById(R.id.rb_Q1410_4);
        rb_Q1410_5 = findViewById(R.id.rb_Q1410_5);
        rb_Q1413_1 = findViewById(R.id.rb_Q1413_1);
        rb_Q1413_2 = findViewById(R.id.rb_Q1413_2);
        rb_Q1413_DK = findViewById(R.id.rb_Q1413_DK);
        rb_Q1414_1_1 = findViewById(R.id.rb_Q1414_1_1);
        rb_Q1414_1_2 = findViewById(R.id.rb_Q1414_1_2);
        rb_Q1414_1_DK = findViewById(R.id.rb_Q1414_1_DK);
        rb_Q1414_2_1 = findViewById(R.id.rb_Q1414_2_1);
        rb_Q1414_2_2 = findViewById(R.id.rb_Q1414_2_2);
        rb_Q1414_2_DK = findViewById(R.id.rb_Q1414_2_DK);
        rb_Q1414_3_1 = findViewById(R.id.rb_Q1414_3_1);
        rb_Q1414_3_2 = findViewById(R.id.rb_Q1414_3_2);
        rb_Q1414_3_DK = findViewById(R.id.rb_Q1414_3_DK);
        rb_Q1414_4_1 = findViewById(R.id.rb_Q1414_4_1);
        rb_Q1414_4_2 = findViewById(R.id.rb_Q1414_4_2);
        rb_Q1414_4_DK = findViewById(R.id.rb_Q1414_4_DK);
        rb_Q1414_5_1 = findViewById(R.id.rb_Q1414_5_1);
        rb_Q1414_5_2 = findViewById(R.id.rb_Q1414_5_2);
        rb_Q1414_5_DK = findViewById(R.id.rb_Q1414_5_DK);
        rb_Q1414_6_1 = findViewById(R.id.rb_Q1414_6_1);
        rb_Q1414_6_2 = findViewById(R.id.rb_Q1414_6_2);
        rb_Q1414_6_DK = findViewById(R.id.rb_Q1414_6_DK);
        rb_Q1414_7_1 = findViewById(R.id.rb_Q1414_7_1);
        rb_Q1414_7_2 = findViewById(R.id.rb_Q1414_7_2);
        rb_Q1414_7_DK = findViewById(R.id.rb_Q1414_7_DK);
        rb_Q1414_8_1 = findViewById(R.id.rb_Q1414_8_1);
        rb_Q1414_8_2 = findViewById(R.id.rb_Q1414_8_2);
        rb_Q1414_8_DK = findViewById(R.id.rb_Q1414_8_DK);
        rb_Q1414_9_1 = findViewById(R.id.rb_Q1414_9_1);
        rb_Q1414_9_2 = findViewById(R.id.rb_Q1414_9_2);
        rb_Q1414_9_DK = findViewById(R.id.rb_Q1414_9_DK);
        rb_Q1414_10_1 = findViewById(R.id.rb_Q1414_10_1);
        rb_Q1414_10_2 = findViewById(R.id.rb_Q1414_10_2);
        rb_Q1414_10_DK = findViewById(R.id.rb_Q1414_10_DK);
        rb_Q1415_1 = findViewById(R.id.rb_Q1415_1);
        rb_Q1415_2 = findViewById(R.id.rb_Q1415_2);
        rb_Q1415_3 = findViewById(R.id.rb_Q1415_3);
        rb_Q1415_4 = findViewById(R.id.rb_Q1415_4);
        rb_Q1415_5 = findViewById(R.id.rb_Q1415_5);
        rb_Q1415_6 = findViewById(R.id.rb_Q1415_6);
        rb_Q1415_7 = findViewById(R.id.rb_Q1415_7);
        rb_Q1415_8 = findViewById(R.id.rb_Q1415_8);
        rb_Q1415_9 = findViewById(R.id.rb_Q1415_9);
        rb_Q1415_10 = findViewById(R.id.rb_Q1415_10);
        rb_Q1415_11 = findViewById(R.id.rb_Q1415_11);
        rb_Q1415_12 = findViewById(R.id.rb_Q1415_12);
        rb_Q1415_DK = findViewById(R.id.rb_Q1415_DK);
        rb_Q1416_1 = findViewById(R.id.rb_Q1416_1);
        rb_Q1416_2 = findViewById(R.id.rb_Q1416_2);
        rb_Q1416_3 = findViewById(R.id.rb_Q1416_3);
        rb_Q1416_4 = findViewById(R.id.rb_Q1416_4);
        rb_Q1416_5 = findViewById(R.id.rb_Q1416_5);
        rb_Q1416_6 = findViewById(R.id.rb_Q1416_6);
        rb_Q1416_7 = findViewById(R.id.rb_Q1416_7);
        rb_Q1416_OT = findViewById(R.id.rb_Q1416_OT);
        rb_Q1416_DK = findViewById(R.id.rb_Q1416_DK);
        rb_Q1417_1 = findViewById(R.id.rb_Q1417_1);
        rb_Q1417_2 = findViewById(R.id.rb_Q1417_2);
        rb_Q1417_3 = findViewById(R.id.rb_Q1417_3);
        rb_Q1417_4 = findViewById(R.id.rb_Q1417_4);
        rb_Q1417_5 = findViewById(R.id.rb_Q1417_5);
        rb_Q1417_6 = findViewById(R.id.rb_Q1417_6);
        rb_Q1417_7 = findViewById(R.id.rb_Q1417_7);
        rb_Q1417_8 = findViewById(R.id.rb_Q1417_8);
        rb_Q1417_9 = findViewById(R.id.rb_Q1417_9);
        rb_Q1417_DK = findViewById(R.id.rb_Q1417_DK);
        rb_Q1418_1 = findViewById(R.id.rb_Q1418_1);
        rb_Q1418_2 = findViewById(R.id.rb_Q1418_2);
        rb_Q1418_3 = findViewById(R.id.rb_Q1418_3);
        rb_Q1418_4 = findViewById(R.id.rb_Q1418_4);
        rb_Q1418_5 = findViewById(R.id.rb_Q1418_5);
        rb_Q1418_6 = findViewById(R.id.rb_Q1418_6);
        rb_Q1418_7 = findViewById(R.id.rb_Q1418_7);
        rb_Q1418_8 = findViewById(R.id.rb_Q1418_8);
        rb_Q1418_9 = findViewById(R.id.rb_Q1418_9);
        rb_Q1418_DK = findViewById(R.id.rb_Q1418_DK);
        rb_Q1419_1 = findViewById(R.id.rb_Q1419_1);
        rb_Q1419_2 = findViewById(R.id.rb_Q1419_2);
        rb_Q1419_3 = findViewById(R.id.rb_Q1419_3);
        rb_Q1419_4 = findViewById(R.id.rb_Q1419_4);
        rb_Q1419_5 = findViewById(R.id.rb_Q1419_5);
        rb_Q1419_6 = findViewById(R.id.rb_Q1419_6);
        rb_Q1419_7 = findViewById(R.id.rb_Q1419_7);
        rb_Q1419_8 = findViewById(R.id.rb_Q1419_8);
        rb_Q1419_DK = findViewById(R.id.rb_Q1419_DK);
        rb_Q1420_1 = findViewById(R.id.rb_Q1420_1);
        rb_Q1420_2 = findViewById(R.id.rb_Q1420_2);
        rb_Q1420_3 = findViewById(R.id.rb_Q1420_3);
        rb_Q1420_4 = findViewById(R.id.rb_Q1420_4);
        rb_Q1420_5 = findViewById(R.id.rb_Q1420_5);
        rb_Q1420_6 = findViewById(R.id.rb_Q1420_6);
        rb_Q1420_7 = findViewById(R.id.rb_Q1420_7);
        rb_Q1420_DK = findViewById(R.id.rb_Q1420_DK);

        rb_Q1421_1 = findViewById(R.id.rb_Q1421_1);
        rb_Q1421_2 = findViewById(R.id.rb_Q1421_2);
        rb_Q1421_3 = findViewById(R.id.rb_Q1421_3);
        rb_Q1421_4 = findViewById(R.id.rb_Q1421_4);
        rb_Q1421_5 = findViewById(R.id.rb_Q1421_5);
        rb_Q1421_6 = findViewById(R.id.rb_Q1421_6);
        rb_Q1421_7 = findViewById(R.id.rb_Q1421_7);
        rb_Q1421_8 = findViewById(R.id.rb_Q1421_8);
        rb_Q1421_9 = findViewById(R.id.rb_Q1421_9);
        rb_Q1421_10 = findViewById(R.id.rb_Q1421_10);
        rb_Q1421_DK = findViewById(R.id.rb_Q1421_DK);
        rb_Q1501_1 = findViewById(R.id.rb_Q1501_1);
        rb_Q1501_2 = findViewById(R.id.rb_Q1501_2);

        rb_Q1601_1 = findViewById(R.id.rb_Q1601_1);
        rb_Q1601_2 = findViewById(R.id.rb_Q1601_2);
        rb_Q1601_DK = findViewById(R.id.rb_Q1601_DK);
        rb_Q1602_1 = findViewById(R.id.rb_Q1602_1);
        rb_Q1602_2 = findViewById(R.id.rb_Q1602_2);
        rb_Q1602_DK = findViewById(R.id.rb_Q1602_DK);
        rb_Q1604_1 = findViewById(R.id.rb_Q1604_1);
        rb_Q1604_2 = findViewById(R.id.rb_Q1604_2);
        rb_Q1604_3 = findViewById(R.id.rb_Q1604_3);
        rb_Q1604_4 = findViewById(R.id.rb_Q1604_4);
        rb_Q1604_5 = findViewById(R.id.rb_Q1604_5);
        rb_Q1604_DK = findViewById(R.id.rb_Q1604_DK);
        rb_Q1605_1 = findViewById(R.id.rb_Q1605_1);
        rb_Q1605_2 = findViewById(R.id.rb_Q1605_2);

        rb_Q1609_1 = findViewById(R.id.rb_Q1609_1);
        rb_Q1609_2 = findViewById(R.id.rb_Q1609_2);
        rb_Q1609_3 = findViewById(R.id.rb_Q1609_3);
        rb_Q1609_4 = findViewById(R.id.rb_Q1609_4);
        rb_Q1609_5 = findViewById(R.id.rb_Q1609_5);


        cb_Q1607_conflict = findViewById(R.id.cb_Q1607_conflict);


        ed_study_id = findViewById(R.id.ed_study_id);

        sp_Q1201_1 = findViewById(R.id.sp_province);
        sp_Q1201_2 = findViewById(R.id.sp_district);

        ed_Q1201_3 = findViewById(R.id.ed_Q1201_3);
        ed_Q1201_4 = findViewById(R.id.ed_Q1201_4);
        ed_Q1201_5 = findViewById(R.id.ed_Q1201_5);
        ed_Q1201_6 = findViewById(R.id.ed_Q1201_6);
        ed_Q1202 = findViewById(R.id.q1202);
        ed_Q1204 = findViewById(R.id.ed_Q1204);
        ed_Q1205 = findViewById(R.id.ed_Q1205);
        ed_Q1206_d = findViewById(R.id.ed_Q1206_d);
        ed_Q1206_m = findViewById(R.id.ed_Q1206_m);
        ed_Q1206_y = findViewById(R.id.ed_Q1206_y);
        ed_Q1208 = findViewById(R.id.ed_Q1208);
        ed_Q1209 = findViewById(R.id.ed_Q1209);
        ed_Q1301 = findViewById(R.id.ed_Q1301);
        ed_Q1302 = findViewById(R.id.ed_Q1302);
        ed_Q1312 = findViewById(R.id.q1312);
        ed_Q1313 = findViewById(R.id.q1313);
        ed_Q1401 = findViewById(R.id.ed_Q1401);
        ed_Q1403_OT = findViewById(R.id.ed_Q1403_OT);
        ed_Q1406 = findViewById(R.id.ed_Q1406);
        ed_Q1409 = findViewById(R.id.ed_Q1409);
        ed_Q1411 = findViewById(R.id.ed_Q1411);
        ed_Q1412 = findViewById(R.id.ed_Q1412);
        ed_Q1416_OT = findViewById(R.id.ed_Q1416_OT);
        ed_Q1417_OT = findViewById(R.id.ed_Q1417_OT);
        ed_Q1418_OT = findViewById(R.id.ed_Q1418_OT);
        ed_Q1419_OT = findViewById(R.id.ed_Q1419_OT);
        ed_Q1420_OT = findViewById(R.id.ed_Q1420_OT);
        ed_Q1421_OT = findViewById(R.id.ed_Q1421_OT);

        ed_Q1603 = findViewById(R.id.ed_Q1603);
        ed_Q1604_OT = findViewById(R.id.ed_Q1604_OT);
        ed_Q1606 = findViewById(R.id.ed_Q1606);
        ed_Q1607_1 = findViewById(R.id.ed_Q1607_1);
        ed_Q1607_2 = findViewById(R.id.ed_Q1607_2);
        ed_Q1607_3 = findViewById(R.id.ed_Q1607_3);
        ed_Q1608_1 = findViewById(R.id.ed_Q1608_1);
        ed_Q1608_2 = findViewById(R.id.ed_Q1608_2);
        ed_Q1608_3 = findViewById(R.id.ed_Q1608_3);
        ed_Q1610_1 = findViewById(R.id.ed_Q1610_1);
        ed_Q1610_2 = findViewById(R.id.ed_Q1610_2);
        ed_Q1610_3 = findViewById(R.id.ed_Q1610_3);
    }

    void events_call() {

        //ed_Q1206_d.setFilters(new InputFilter[]{new InputFilterMinMax(0, 27, 27, 27)});
        //ed_Q1206_m.setFilters(new InputFilter[]{new InputFilterMinMax(1, 23, 23, 23)});
        //ed_Q1206_y.setFilters(new InputFilter[]{new InputFilterMinMax(2, 70, 70, 70)});

        //ed_Q1409.setFilters(new InputFilter[]{new InputFilterMinMax(0, 18, 99, 99)});

        //ed_Q1607_1.setFilters(new InputFilter[]{new InputFilterMinMax(0, 27, 27, 27)});
        //ed_Q1607_2.setFilters(new InputFilter[]{new InputFilterMinMax(1, 23, 23, 23)});
        //ed_Q1607_3.setFilters(new InputFilter[]{new InputFilterMinMax(2, 70, 70, 70)});

        //ed_Q1608_1.setFilters(new InputFilter[]{new InputFilterMinMax(0, 27, 27, 27)});
        //ed_Q1608_2.setFilters(new InputFilter[]{new InputFilterMinMax(1, 23, 23, 23)});
        //ed_Q1608_3.setFilters(new InputFilter[]{new InputFilterMinMax(2, 70, 70, 70)});

        //ed_Q1610_1.setFilters(new InputFilter[]{new InputFilterMinMax(0, 27, 27, 27)});
        //ed_Q1610_2.setFilters(new InputFilter[]{new InputFilterMinMax(1, 23, 23, 23)});
        //ed_Q1610_3.setFilters(new InputFilter[]{new InputFilterMinMax(2, 70, 70, 70)});

        TextWatcher txtWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {


                if (ed_Q1204.getText().toString().length() == 10 && ed_Q1205.getText().toString().length() == 10) {

                    if (!ed_Q1206_d.getText().toString().isEmpty()
                            || !ed_Q1206_m.getText().toString().isEmpty()
                            || !ed_Q1206_y.getText().toString().isEmpty()) {

                        if (!ed_Q1206_y.getText().toString().isEmpty()
                                && Integer.valueOf(ed_Q1206_y.getText().toString().trim()) >= 12) {

                            ClearAllcontrol.ClearAll(cvQ1207);
                            ClearAllcontrol.ClearAll(cvQ1208);

                            cvQ1207.setVisibility(View.GONE);
                            cvQ1208.setVisibility(View.GONE);

                        } else if ((!ed_Q1206_y.getText().toString().isEmpty()
                                && Integer.valueOf(ed_Q1206_y.getText().toString().trim()) > 0
                                && Integer.valueOf(ed_Q1206_y.getText().toString().trim()) < 12)
                                || ((!ed_Q1206_d.getText().toString().isEmpty()
                                && parseInt(ed_Q1206_d.getText().toString().trim()) > 0)
                                || (!ed_Q1206_m.getText().toString().isEmpty()
                                && parseInt(ed_Q1206_m.getText().toString().trim()) > 0))) {

                            ClearAllcontrol.ClearAll(cvQ1207);
                            cvQ1207.setVisibility(View.GONE);

                            cvQ1208.setVisibility(View.VISIBLE);

                        } else {

                            cvQ1207.setVisibility(View.VISIBLE);
                            cvQ1208.setVisibility(View.VISIBLE);
                        }

                    } else {

                        cvQ1207.setVisibility(View.VISIBLE);
                        cvQ1208.setVisibility(View.VISIBLE);
                    }
                }


                if (!ed_Q1409.getText().toString().isEmpty()) {

                    if (Integer.valueOf(ed_Q1409.getText().toString()) > 6) {

                        ClearAllcontrol.ClearAll(cvQ1410);
                        cvQ1410.setVisibility(View.GONE);

                    } else {

                        cvQ1410.setVisibility(View.VISIBLE);
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        };

        ed_Q1206_d.addTextChangedListener(txtWatcher);
        ed_Q1206_m.addTextChangedListener(txtWatcher);
        ed_Q1206_y.addTextChangedListener(txtWatcher);

        ed_Q1409.addTextChangedListener(txtWatcher);

        ed_Q1206_d.addTextChangedListener(txtWatcher);
        ed_Q1206_m.addTextChangedListener(txtWatcher);
        ed_Q1206_y.addTextChangedListener(txtWatcher);

        sp_Q1201_1.setOnItemSelectedListener(this);

        q1405.setOnCheckedChangeListener((radioGroup, i) -> {
            ll1405.setVisibility(View.VISIBLE);
            if (i == R.id.q1405b) {
                Clear.clearAllFields(ll1405);
                ll1405.setVisibility(View.GONE);
            }
        });

        q1403.setOnCheckedChangeListener((radioGroup, i) -> {
            ed_Q1403_OT.setText("");
            ed_Q1403_OT.setVisibility(View.GONE);
            if (i == R.id.rb_Q1403_12 || i == R.id.rb_Q1403_13 || i == R.id.rb_Q1403_14)
                ed_Q1403_OT.setVisibility(View.VISIBLE);
        });

        q1407.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(cvQ1408);
            Clear.clearAllFields(cvQ1409);
            cvQ1408.setVisibility(View.GONE);
            cvQ1409.setVisibility(View.GONE);
            if (i == R.id.rb_Q1407_1) {
                cvQ1408.setVisibility(View.VISIBLE);
                cvQ1409.setVisibility(View.VISIBLE);
            }
        });

        q1416.setOnCheckedChangeListener((radioGroup, i) -> {
            ed_Q1416_OT.setText("");
            ed_Q1416_OT.setVisibility(View.GONE);
            if (i == R.id.rb_Q1416_OT) ed_Q1416_OT.setVisibility(View.VISIBLE);
        });

        q1417.setOnCheckedChangeListener((radioGroup, i) -> {
            ed_Q1417_OT.setText("");
            ed_Q1417_OT.setVisibility(View.GONE);
            if (i == R.id.rb_Q1417_9) ed_Q1417_OT.setVisibility(View.VISIBLE);
        });

        q1418.setOnCheckedChangeListener((radioGroup, i) -> {
            ed_Q1418_OT.setText("");
            ed_Q1418_OT.setVisibility(View.GONE);
            if (i == R.id.rb_Q1418_9) ed_Q1417_OT.setVisibility(View.VISIBLE);
        });

        q1419.setOnCheckedChangeListener((radioGroup, i) -> {
            ed_Q1419_OT.setText("");
            ed_Q1419_OT.setVisibility(View.GONE);
            if (i == R.id.rb_Q1419_8) ed_Q1419_OT.setVisibility(View.VISIBLE);
        });

        q1420.setOnCheckedChangeListener((radioGroup, i) -> {
            ed_Q1420_OT.setText("");
            ed_Q1420_OT.setVisibility(View.GONE);
            if (i == R.id.rb_Q1420_7) ed_Q1420_OT.setVisibility(View.VISIBLE);
        });

        q1421.setOnCheckedChangeListener((radioGroup, i) -> {
            ed_Q1421_OT.setText("");
            ed_Q1421_OT.setVisibility(View.GONE);
            if (i == R.id.rb_Q1421_10) ed_Q1421_OT.setVisibility(View.VISIBLE);
        });

        q1501.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(cvQ1502);
            cvQ1502.setVisibility(View.GONE);
            if (i == R.id.rb_Q1501_1) cvQ1502.setVisibility(View.VISIBLE);
        });

        q1602.setOnCheckedChangeListener((radioGroup, i) -> {
            cvQ1603.setVisibility(View.VISIBLE);
            cb_Q1607_conflict.setChecked(false);
            ed_Q1607_1.setText("0");
            ed_Q1607_2.setText("0");
            ed_Q1607_3.setText("0");
            if (i == R.id.rb_Q1602_2 || i == R.id.rb_Q1602_DK) {
                Clear.clearAllFields(cvQ1603);
                cvQ1603.setVisibility(View.GONE);
                cb_Q1607_conflict.setChecked(true);
                ed_Q1607_1.setText("0");
                ed_Q1607_2.setText("0");
                ed_Q1607_3.setText("0");
            }
        });

        q1604.setOnCheckedChangeListener((radioGroup, i) -> {
            ed_Q1604_OT.setText("");
            ed_Q1604_OT.setVisibility(View.GONE);
            if (i == R.id.rb_Q1604_5) ed_Q1604_OT.setVisibility(View.VISIBLE);
        });

        q1605.setOnCheckedChangeListener((radioGroup, i) -> {
            cvQ1606.setVisibility(View.VISIBLE);
            cb_Q1607_conflict.setChecked(false);
            ed_Q1607_1.setText("0");
            ed_Q1607_2.setText("0");
            ed_Q1607_3.setText("0");
            if (i == R.id.rb_Q1605_2) {
                Clear.clearAllFields(cvQ1606);
                cvQ1606.setVisibility(View.GONE);
                cb_Q1607_conflict.setChecked(true);
                ed_Q1607_1.setText("0");
                ed_Q1607_2.setText("0");
                ed_Q1607_3.setText("0");
            }
        });

        cb_Q1607_conflict.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) cvQ1608.setVisibility(View.VISIBLE);
            else {
                Clear.clearAllFields(cvQ1608);
                cvQ1608.setVisibility(View.GONE);
            }
        });

        q1609.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(cvQ1610);
            cvQ1610.setVisibility(View.GONE);
            if (i == R.id.rb_Q1609_1) cvQ1610.setVisibility(View.VISIBLE);
        });

    }

    void value_assignment() {

        study_id = ed_study_id.getText().toString().trim().length() > 0 ? ed_study_id.getText().toString().trim() : "-1";
        Q1201_1 = sp_Q1201_1.getSelectedItem().toString();
        Q1201_2 = sp_Q1201_2.getSelectedItem().toString();
        Q1201_3 = ed_Q1201_3.getText().toString().trim().length() > 0 ? ed_Q1201_3.getText().toString().trim() : "-1";
        Q1201_4 = ed_Q1201_4.getText().toString().trim().length() > 0 ? ed_Q1201_4.getText().toString().trim() : "-1";
        Q1201_5 = ed_Q1201_5.getText().toString().trim().length() > 0 ? ed_Q1201_5.getText().toString().trim() : "-1";
        Q1201_6 = ed_Q1201_6.getText().toString().trim().length() > 0 ? ed_Q1201_6.getText().toString().trim() : "-1";
        Q1202 = ed_Q1202.getText().length() > 0 ? ed_Q1202.getText().toString().trim() : "-1";
        Q1203 = rb_Q1203_1.isChecked() ? "1" : rb_Q1203_2.isChecked() ? "2" : "-1";
        Q1204 = ed_Q1204.getText().toString().trim().length() > 0 ? ed_Q1204.getText().toString().trim() : "-1";
        Q1205 = ed_Q1205.getText().toString().trim().length() > 0 ? ed_Q1205.getText().toString().trim() : "-1";
        Q1206_d = ed_Q1206_d.getText().toString().trim().length() > 0 ? ed_Q1206_d.getText().toString().trim() : "-1";
        Q1206_m = ed_Q1206_m.getText().toString().trim().length() > 0 ? ed_Q1206_m.getText().toString().trim() : "-1";
        Q1206_y = ed_Q1206_y.getText().toString().trim().length() > 0 ? ed_Q1206_y.getText().toString().trim() : "-1";
        Q1207 = rb_Q1207_1.isChecked() ? "1" : rb_Q1207_2.isChecked() ? "2" : rb_Q1207_DK.isChecked() ? "9" : "-1";
        Q1208 = ed_Q1208.getText().toString().trim().length() > 0 ? ed_Q1208.getText().toString().trim() : "-1";
        Q1209 = ed_Q1209.getText().toString().trim().length() > 0 ? ed_Q1209.getText().toString().trim() : "-1";
        Q1301 = ed_Q1301.getText().toString().trim().length() > 0 ? ed_Q1301.getText().toString().trim() : "-1";
        Q1302 = ed_Q1302.getText().toString().trim().length() > 0 ? ed_Q1302.getText().toString().trim() : "-1";
        Q1309 = "-1";
        Q1310 = "-1";
        Q1311 = "-1";
        Q1312 = ed_Q1312.getText().toString().trim().length() > 0 ? ed_Q1312.getText().toString().trim() : "-1";
        Q1313 = ed_Q1313.getText().toString().trim().length() > 0 ? ed_Q1313.getText().toString().trim() : "-1";
        Q1401 = ed_Q1401.getText().toString().trim().length() > 0 ? ed_Q1401.getText().toString().trim() : "-1";

        Q1402 = rb_Q1402_1.isChecked() ? "1"
                : rb_Q1402_2.isChecked() ? "2"
                : rb_Q1402_DK.isChecked() ? "9"
                : "-1";

        Q1403 = rb_Q1403_1.isChecked() ? "1"
                : rb_Q1403_2.isChecked() ? "2"
                : rb_Q1403_3.isChecked() ? "3"
                : rb_Q1403_4.isChecked() ? "4"
                : rb_Q1403_5.isChecked() ? "5"
                : rb_Q1403_6.isChecked() ? "6"
                : rb_Q1403_7.isChecked() ? "7"
                : rb_Q1403_8.isChecked() ? "8"
                : rb_Q1403_9.isChecked() ? "9"
                : rb_Q1403_10.isChecked() ? "10"
                : rb_Q1403_11.isChecked() ? "11"
                : rb_Q1403_12.isChecked() ? "12"
                : rb_Q1403_13.isChecked() ? "13"
                : rb_Q1403_14.isChecked() ? "14"
                : "-1";

        Q1403_OT = ed_Q1403_OT.getText().toString().trim().length() > 0 ? ed_Q1403_OT.getText().toString().trim() : "-1";

        Q1404 = rb_Q1404_1.isChecked() ? "1"
                : rb_Q1404_2.isChecked() ? "2"
                : rb_Q1404_DK.isChecked() ? "9"
                : "-1";

        Q1405 = rb_Q1405_1.isChecked() ? "1"
                : rb_Q1405_2.isChecked() ? "2"
                : "-1";

        Q1406 = ed_Q1406.getText().toString().trim().length() > 0 ? ed_Q1406.getText().toString().trim() : "-1";

        Q1407 = rb_Q1407_1.isChecked() ? "1"
                : rb_Q1407_2.isChecked() ? "2"
                : rb_Q1407_DK.isChecked() ? "9"
                : "-1";

        Q1408 = rb_Q1408_1.isChecked() ? "1"
                : rb_Q1408_2.isChecked() ? "2"
                : rb_Q1408_3.isChecked() ? "3"
                : rb_Q1408_DK.isChecked() ? "9"
                : "-1";

        Q1409 = ed_Q1409.getText().toString().trim().length() > 0 ? ed_Q1409.getText().toString().trim() : "-1";

        Q1410 = rb_Q1410_1.isChecked() ? "1"
                : rb_Q1410_2.isChecked() ? "2"
                : rb_Q1410_3.isChecked() ? "3"
                : rb_Q1410_4.isChecked() ? "4"
                : rb_Q1410_5.isChecked() ? "5"
                : "-1";

        Q1411 = ed_Q1411.getText().toString().trim().length() > 0 ? ed_Q1411.getText().toString().trim() : "-1";
        Q1412 = ed_Q1412.getText().toString().trim().length() > 0 ? ed_Q1412.getText().toString().trim() : "-1";

        Q1413 = rb_Q1413_1.isChecked() ? "1"
                : rb_Q1413_2.isChecked() ? "2"
                : rb_Q1413_DK.isChecked() ? "9"
                : "-1";

        Q1414_1 = rb_Q1414_1_1.isChecked() ? "1"
                : rb_Q1414_1_2.isChecked() ? "2"
                : rb_Q1414_1_DK.isChecked() ? "9"
                : "-1";

        Q1414_2 = rb_Q1414_2_1.isChecked() ? "1"
                : rb_Q1414_2_2.isChecked() ? "2"
                : rb_Q1414_2_DK.isChecked() ? "9"
                : "-1";

        Q1414_3 = rb_Q1414_3_1.isChecked() ? "1"
                : rb_Q1414_3_2.isChecked() ? "2"
                : rb_Q1414_3_DK.isChecked() ? "9"
                : "-1";

        Q1414_4 = rb_Q1414_4_1.isChecked() ? "1"
                : rb_Q1414_4_2.isChecked() ? "2"
                : rb_Q1414_4_DK.isChecked() ? "9"
                : "-1";

        Q1414_5 = rb_Q1414_5_1.isChecked() ? "1"
                : rb_Q1414_5_2.isChecked() ? "2"
                : rb_Q1414_5_DK.isChecked() ? "9"
                : "-1";

        Q1414_6 = rb_Q1414_6_1.isChecked() ? "1"
                : rb_Q1414_6_2.isChecked() ? "2"
                : rb_Q1414_6_DK.isChecked() ? "9"
                : "-1";

        Q1414_7 = rb_Q1414_7_1.isChecked() ? "1"
                : rb_Q1414_7_2.isChecked() ? "2"
                : rb_Q1414_7_DK.isChecked() ? "9"
                : "-1";

        Q1414_8 = rb_Q1414_8_1.isChecked() ? "1"
                : rb_Q1414_8_2.isChecked() ? "2"
                : rb_Q1414_8_DK.isChecked() ? "9"
                : "-1";

        Q1414_9 = rb_Q1414_9_1.isChecked() ? "1"
                : rb_Q1414_9_2.isChecked() ? "2"
                : rb_Q1414_9_DK.isChecked() ? "9"
                : "-1";

        Q1414_10 = rb_Q1414_10_1.isChecked() ? "1"
                : rb_Q1414_10_2.isChecked() ? "2"
                : rb_Q1414_10_DK.isChecked() ? "9"
                : "-1";

        Q1415 = rb_Q1415_1.isChecked() ? "1"
                : rb_Q1415_2.isChecked() ? "2"
                : rb_Q1415_3.isChecked() ? "3"
                : rb_Q1415_4.isChecked() ? "4"
                : rb_Q1415_5.isChecked() ? "5"
                : rb_Q1415_6.isChecked() ? "6"
                : rb_Q1415_7.isChecked() ? "7"
                : rb_Q1415_8.isChecked() ? "8"
                : rb_Q1415_9.isChecked() ? "9"
                : rb_Q1415_10.isChecked() ? "10"
                : rb_Q1415_11.isChecked() ? "11"
                : rb_Q1415_12.isChecked() ? "12"
                : rb_Q1415_DK.isChecked() ? "99"
                : "-1";

        Q1416 = rb_Q1416_1.isChecked() ? "1"
                : rb_Q1416_2.isChecked() ? "2"
                : rb_Q1416_3.isChecked() ? "3"
                : rb_Q1416_4.isChecked() ? "4"
                : rb_Q1416_5.isChecked() ? "5"
                : rb_Q1416_6.isChecked() ? "6"
                : rb_Q1416_7.isChecked() ? "7"
                : rb_Q1416_OT.isChecked() ? "8"
                : rb_Q1416_DK.isChecked() ? "9"
                : "-1";

        Q1416_OT = ed_Q1416_OT.getText().toString().trim().length() > 0 ? ed_Q1416_OT.getText().toString().trim() : "-1";

        Q1417 = rb_Q1417_1.isChecked() ? "1"
                : rb_Q1417_2.isChecked() ? "2"
                : rb_Q1417_3.isChecked() ? "3"
                : rb_Q1417_4.isChecked() ? "4"
                : rb_Q1417_5.isChecked() ? "5"
                : rb_Q1417_6.isChecked() ? "6"
                : rb_Q1417_7.isChecked() ? "7"
                : rb_Q1417_8.isChecked() ? "8"
                : rb_Q1417_9.isChecked() ? "9"
                : rb_Q1417_DK.isChecked() ? "99"
                : "-1";

        Q1417_OT = ed_Q1417_OT.getText().toString().trim().length() > 0 ? ed_Q1417_OT.getText().toString().trim() : "-1";

        Q1418 = rb_Q1418_1.isChecked() ? "1"
                : rb_Q1418_2.isChecked() ? "2"
                : rb_Q1418_3.isChecked() ? "3"
                : rb_Q1418_4.isChecked() ? "4"
                : rb_Q1418_5.isChecked() ? "5"
                : rb_Q1418_6.isChecked() ? "6"
                : rb_Q1418_7.isChecked() ? "7"
                : rb_Q1418_8.isChecked() ? "8"
                : rb_Q1418_9.isChecked() ? "9"
                : rb_Q1418_DK.isChecked() ? "99"
                : "-1";

        Q1418_OT = ed_Q1418_OT.getText().toString().trim().length() > 0 ? ed_Q1418_OT.getText().toString().trim() : "-1";

        Q1419 = rb_Q1419_1.isChecked() ? "1"
                : rb_Q1419_2.isChecked() ? "2"
                : rb_Q1419_3.isChecked() ? "3"
                : rb_Q1419_4.isChecked() ? "4"
                : rb_Q1419_5.isChecked() ? "5"
                : rb_Q1419_6.isChecked() ? "6"
                : rb_Q1419_7.isChecked() ? "7"
                : rb_Q1419_8.isChecked() ? "8"
                : rb_Q1419_DK.isChecked() ? "9"
                : "-1";

        Q1419_OT = ed_Q1419_OT.getText().toString().trim().length() > 0 ? ed_Q1419_OT.getText().toString().trim() : "-1";

        Q1420 = rb_Q1420_1.isChecked() ? "1"
                : rb_Q1420_2.isChecked() ? "2"
                : rb_Q1420_3.isChecked() ? "3"
                : rb_Q1420_4.isChecked() ? "4"
                : rb_Q1420_5.isChecked() ? "5"
                : rb_Q1420_6.isChecked() ? "6"
                : rb_Q1420_7.isChecked() ? "7"
                : rb_Q1420_DK.isChecked() ? "9"
                : "-1";

        Q1420_OT = ed_Q1420_OT.getText().toString().trim().length() > 0 ? ed_Q1420_OT.getText().toString().trim() : "-1";

        Q1421 = rb_Q1421_1.isChecked() ? "1"
                : rb_Q1421_2.isChecked() ? "2"
                : rb_Q1421_3.isChecked() ? "3"
                : rb_Q1421_4.isChecked() ? "4"
                : rb_Q1421_5.isChecked() ? "5"
                : rb_Q1421_6.isChecked() ? "6"
                : rb_Q1421_7.isChecked() ? "7"
                : rb_Q1421_8.isChecked() ? "8"
                : rb_Q1421_9.isChecked() ? "9"
                : rb_Q1421_10.isChecked() ? "10"
                : rb_Q1421_DK.isChecked() ? "99"
                : "-1";

        Q1421_OT = ed_Q1421_OT.getText().toString().trim().length() > 0 ? ed_Q1421_OT.getText().toString().trim() : "-1";

        Q1501 = rb_Q1501_1.isChecked() ? "1"
                : rb_Q1501_2.isChecked() ? "2"
                : "-1";

        Q1502 = ed_Q1502.getText().toString().trim().length() > 0 ? ed_Q1502.getText().toString().trim() : "-1";

        Q1503 = "-1";
        Q1503_OT = "-1";

        Q1601 = rb_Q1601_1.isChecked() ? "1"
                : rb_Q1601_2.isChecked() ? "2"
                : rb_Q1601_DK.isChecked() ? "9"
                : "-1";

        Q1602 = rb_Q1602_1.isChecked() ? "1"
                : rb_Q1602_2.isChecked() ? "2"
                : rb_Q1602_DK.isChecked() ? "9"
                : "-1";

        Q1603 = ed_Q1603.getText().toString().trim().length() > 0 ? ed_Q1603.getText().toString().trim() : "-1";

        Q1604 = rb_Q1604_1.isChecked() ? "1"
                : rb_Q1604_2.isChecked() ? "2"
                : rb_Q1604_3.isChecked() ? "3"
                : rb_Q1604_4.isChecked() ? "4"
                : rb_Q1604_5.isChecked() ? "5"
                : rb_Q1604_DK.isChecked() ? "99"
                : "-1";

        Q1604_OT = ed_Q1604_OT.getText().toString().trim().length() > 0 ? ed_Q1604_OT.getText().toString().trim() : "-1";

        Q1605 = rb_Q1605_1.isChecked() ? "1"
                : rb_Q1605_2.isChecked() ? "2"
                : "-1";

        Q1606 = ed_Q1606.getText().toString().trim().length() > 0 ? ed_Q1606.getText().toString().trim() : "-1";
        Q1607_1 = ed_Q1607_1.getText().toString().trim().length() > 0 ? ed_Q1607_1.getText().toString().trim() : "-1";
        Q1607_2 = ed_Q1607_2.getText().toString().trim().length() > 0 ? ed_Q1607_2.getText().toString().trim() : "-1";
        Q1607_3 = ed_Q1607_3.getText().toString().trim().length() > 0 ? ed_Q1607_3.getText().toString().trim() : "-1";
        Q1608_1 = ed_Q1608_1.getText().toString().trim().length() > 0 ? ed_Q1608_1.getText().toString().trim() : "-1";
        Q1608_2 = ed_Q1608_2.getText().toString().trim().length() > 0 ? ed_Q1608_2.getText().toString().trim() : "-1";
        Q1608_3 = ed_Q1608_3.getText().toString().trim().length() > 0 ? ed_Q1608_3.getText().toString().trim() : "-1";

        Q1609 = rb_Q1609_1.isChecked() ? "1"
                : rb_Q1609_2.isChecked() ? "2"
                : rb_Q1609_3.isChecked() ? "3"
                : rb_Q1609_4.isChecked() ? "4"
                : rb_Q1609_5.isChecked() ? "5"
                : "-1";

        Q1610_1 = ed_Q1610_1.getText().toString().trim().length() > 0 ? ed_Q1610_1.getText().toString().trim() : "-1";
        Q1610_2 = ed_Q1610_2.getText().toString().trim().length() > 0 ? ed_Q1610_2.getText().toString().trim() : "-1";
        Q1610_3 = ed_Q1610_3.getText().toString().trim().length() > 0 ? ed_Q1610_3.getText().toString().trim() : "-1";

        STATUS = "0";

        interviewType = Q1609.equals("1") ? 1
                : Q1609.equals("2") ? 2
                : Q1609.equals("3") ? 2
                : Q1609.equals("4") ? 2
                : Q1609.equals("5") ? 3
                : Q1405.equals("2") ? 4
                : -1;

        currentSection = Q1405.equals("2") ? 99 : 1;


        for (int i = 0; i < lst_q1503.size(); i++) {
            if (i == 0) Q1503 = lst_q1503.get(i) + ",";
            else {
                if (i == lst_q1503.size() - 1) Q1503 = Q1503 + lst_q1503.get(i);
                else Q1503 = Q1503 + lst_q1503.get(i) + ",";
            }
        }

        for (int j = 0; j < lst_other.size(); j++) {
            if (j == 0) Q1503_OT = lst_other.get(j) + ",";
            else {
                if (j == lst_other.size() - 1) Q1503_OT = Q1503_OT + lst_other.get(j);
                else Q1503_OT = Q1503_OT + lst_other.get(j) + ",";
            }
        }


        Calendar cdt = Calendar.getInstance();
        SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String formattedDate = dt.format(cdt.getTime());
        String[] dtf = formattedDate.split(" ");

        if (dtf[0].length() > 0) Q1307 = dtf[0].trim();
        if (dtf[1].length() > 0) Q1308 = dtf[1].trim();

    }


    void insert_data() {

        String query = "insert into Q1101_Q1610("
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.study_id + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1201_1 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1201_2 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1201_3 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1201_4 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1201_5 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1201_6 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1202 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1203 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1204 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1205 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1206_d + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1206_m + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1206_y + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1207 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1208 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1209 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1301 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1302 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1307 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1308 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1309 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1310 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1311 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1312 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1313 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1401 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1402 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1403 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1403_OT + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1404 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1405 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1406 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1407 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1408 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1409 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1410 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1411 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1412 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1413 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1414_1 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1414_2 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1414_3 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1414_4 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1414_5 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1414_6 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1414_7 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1414_8 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1414_9 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1414_10 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1415 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1416 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1416_OT + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1417 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1417_OT + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1418 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1418_OT + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1419 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1419_OT + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1420 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1420_OT + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1421 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1421_OT + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1501 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1502 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1503 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1503_OT + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1601 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1602 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1603 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1604 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1604_OT + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1605 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1606 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1607_1 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1607_2 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1607_3 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1608_1 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1608_2 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1608_3 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1609 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1610_1 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1610_2 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.Q1610_3 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.interviewType + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.currentSection + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610.STATUS + ") values ('" +

                study_id + "','" +
                Q1201_1 + "','" +
                Q1201_2 + "','" +
                Q1201_3 + "','" +
                Q1201_4 + "','" +
                Q1201_5 + "','" +
                Q1201_6 + "','" +
                Q1202 + "','" +
                Q1203 + "','" +
                Q1204 + "','" +
                Q1205 + "','" +
                Q1206_d + "','" +
                Q1206_m + "','" +
                Q1206_y + "','" +
                Q1207 + "','" +
                Q1208 + "','" +
                Q1209 + "','" +
                Q1301 + "','" +
                Q1302 + "','" +
                Q1307 + "','" +
                Q1308 + "','" +
                Q1309 + "','" +
                Q1310 + "','" +
                Q1311 + "','" +
                Q1312 + "','" +
                Q1313 + "','" +
                Q1401 + "','" +
                Q1402 + "','" +
                Q1403 + "','" +
                Q1403_OT + "','" +
                Q1404 + "','" +
                Q1405 + "','" +
                Q1406 + "','" +
                Q1407 + "','" +
                Q1408 + "','" +
                Q1409 + "','" +
                Q1410 + "','" +
                Q1411 + "','" +
                Q1412 + "','" +
                Q1413 + "','" +
                Q1414_1 + "','" +
                Q1414_2 + "','" +
                Q1414_3 + "','" +
                Q1414_4 + "','" +
                Q1414_5 + "','" +
                Q1414_6 + "','" +
                Q1414_7 + "','" +
                Q1414_8 + "','" +
                Q1414_9 + "','" +
                Q1414_10 + "','" +
                Q1415 + "','" +
                Q1416 + "','" +
                Q1416_OT + "','" +
                Q1417 + "','" +
                Q1417_OT + "','" +
                Q1418 + "','" +
                Q1418_OT + "','" +
                Q1419 + "','" +
                Q1419_OT + "','" +
                Q1420 + "','" +
                Q1420_OT + "','" +
                Q1421 + "','" +
                Q1421_OT + "','" +
                Q1501 + "','" +
                Q1502 + "','" +
                Q1503 + "','" +
                Q1503_OT + "','" +
                Q1601 + "','" +
                Q1602 + "','" +
                Q1603 + "','" +
                Q1604 + "','" +
                Q1604_OT + "','" +
                Q1605 + "','" +
                Q1606 + "','" +
                Q1607_1 + "','" +
                Q1607_2 + "','" +
                Q1607_3 + "','" +
                Q1608_1 + "','" +
                Q1608_2 + "','" +
                Q1608_3 + "','" +
                Q1609 + "','" +
                Q1610_1 + "','" +
                Q1610_2 + "','" +
                Q1610_3 + "','" +
                interviewType + "','" +
                currentSection + "','" +
                STATUS + "')";


        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(this, "General Section inserted successfully", Toast.LENGTH_SHORT).show();
    }


    private static boolean isValid(String s) {

        if (!s.trim().equals("")) {

            String[] date_sep = s.split("/");

            int dd = Integer.valueOf(date_sep[0]);
            int mm = Integer.valueOf(date_sep[1]);
            int yy = Integer.valueOf(date_sep[2]);

            return dd != 99 || mm != 99 || yy != 9999;
        }

        return false;
    }


    public static int MonthsToDays(int tMonth, int tYear) {
        if (tMonth == 1 || tMonth == 3 || tMonth == 5 || tMonth == 7
                || tMonth == 8 || tMonth == 10 || tMonth == 12) {
            return 31;
        } else if (tMonth == 2) {
            if (tYear % 4 == 0) {
                return 29;
            } else {
                return 28;
            }
        } else {
            return 30;
        }
    }


    boolean validateField() {
        return Validator.emptyCheckingContainer(this, GrpName);
    }


    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }


    public int[] calculateAge(String dob, String dod) {

        String[] dob_sep = dob.split("/");
        String[] dod_sep = dod.split("/");

        String dob_day = dob_sep[0];
        String dob_month = dob_sep[1];
        String dob_year = dob_sep[2];

        String dod_day = dod_sep[0];
        String dod_month = dod_sep[1];
        String dod_year = dod_sep[2];

        int mYearDiff, mMonDiff, mDayDiff;

        if (parseInt(dob_year) == 9999 || parseInt(dod_year) == 9999) {

            mYearDiff = 0;

        } else {

            mYearDiff = parseInt(dod_year) - parseInt(dob_year);
        }

        if (parseInt(dob_month) == 99 || parseInt(dod_month) == 99) {

            mMonDiff = 0;

        } else {

            mMonDiff = parseInt(dod_month) - parseInt(dob_month);

            if (mMonDiff < 0) {
                mYearDiff = mYearDiff - 1;
                mMonDiff = mMonDiff + 12;
            }
        }

        if (parseInt(dob_day) == 99 || parseInt(dod_day) == 99) {

            mDayDiff = 0;

        } else {

            mDayDiff = parseInt(dod_day) - parseInt(dob_day);
        }

        if (mDayDiff < 0) {
            if (mMonDiff > 0) {
                mMonDiff = mMonDiff - 1;
                mDayDiff = mDayDiff + MonthsToDays(parseInt(dod_month) - 1, parseInt(dod_year));

            } else {
                mYearDiff = mYearDiff - 1;
                mMonDiff = 11;
                mDayDiff = mDayDiff + MonthsToDays(parseInt(dod_month) - 1, parseInt(dod_year));
            }

        }

        int[] Age = new int[]{mDayDiff, mMonDiff, mYearDiff};

        return Age;
    }

    @Override
    public void afterTextChanged(Editable s) {
    }

    /*private static boolean isValid(String s) {

        return !s.trim().equals("") && !s.trim().equals("99/99/9999");
    }*/

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

        if (ed_Q1204.getText().toString().length() == 10 && ed_Q1205.getText().toString().length() == 10) {

            if (isValid(ed_Q1204.getText().toString()) && isValid(ed_Q1205.getText().toString())) {

                String dob, dod;

                dob = ed_Q1204.getText().toString().trim();
                dod = ed_Q1205.getText().toString().trim();

                int[] Age = calculateAge(dob, dod);

                int days = Age[0];
                int months = Age[1];
                int years = Age[2];

                // Force assigning values from here start
                if (years >= 2) {

                    ed_Q1206_d.setText("0");
                    ed_Q1206_m.setText("0");
                    ed_Q1206_y.setText(String.valueOf(years));

                } else {

                    months = (years * 12) + months;

                    if (months > 0 && months <= 24) {

                        ed_Q1206_d.setText("0");
                        ed_Q1206_m.setText(String.valueOf(months));
                        ed_Q1206_y.setText("0");

                    } else if (months == 0) {

                        if (days < 28) {

                            ed_Q1206_d.setText(String.valueOf(days));
                            ed_Q1206_m.setText("0");
                            ed_Q1206_y.setText("0");

                        } else {

                            ed_Q1206_d.setText("0");
                            ed_Q1206_m.setText("1");
                            ed_Q1206_y.setText("0");
                        }
                    }
                }
                // Force assigning values end

                ed_Q1206_d.setEnabled(false);
                ed_Q1206_m.setEnabled(false);
                ed_Q1206_y.setEnabled(false);

            } else {

                ed_Q1206_d.setText(null);
                ed_Q1206_m.setText(null);
                ed_Q1206_y.setText(null);

                ed_Q1206_d.setEnabled(true);
                ed_Q1206_m.setEnabled(true);
                ed_Q1206_y.setEnabled(true);
            }

        } else {

            ed_Q1206_d.setText(null);
            ed_Q1206_m.setText(null);
            ed_Q1206_y.setText(null);

            ed_Q1206_d.setEnabled(false);
            ed_Q1206_m.setEnabled(false);
            ed_Q1206_y.setEnabled(false);
        }


        if (ed_Q1603.getText().toString().length() == 10 && ed_Q1606.getText().toString().length() == 10) {

            if (isValid(ed_Q1603.getText().toString()) && isValid(ed_Q1606.getText().toString())) {

                String dob, dod;

                dob = ed_Q1603.getText().toString().trim();
                dod = ed_Q1606.getText().toString().trim();

                int[] Age = calculateAge(dob, dod);

                int days = Age[0];
                int months = Age[1];
                int years = Age[2];

                // Force assigning values from here start
                if (years >= 2) {

                    ed_Q1607_1.setText("0");
                    ed_Q1607_2.setText("0");
                    ed_Q1607_3.setText(String.valueOf(years));

                } else {

                    months = (years * 12) + months;

                    if (months > 0 && months <= 24) {

                        ed_Q1607_1.setText("0");
                        ed_Q1607_2.setText(String.valueOf(months));
                        ed_Q1607_3.setText("0");

                    } else if (months == 0) {

                        if (days < 28) {

                            ed_Q1607_1.setText(String.valueOf(days));
                            ed_Q1607_2.setText("0");
                            ed_Q1607_3.setText("0");

                        } else {

                            ed_Q1607_1.setText("0");
                            ed_Q1607_2.setText("1");
                            ed_Q1607_3.setText("0");
                        }
                    }

                    cb_Q1607_conflict.setChecked(false);
                }
                // Force assigning values end

            } else {

                ed_Q1607_1.setText("0");
                ed_Q1607_2.setText("0");
                ed_Q1607_3.setText("0");

                cb_Q1607_conflict.setChecked(true);
            }

        } else {

            ed_Q1607_1.setText("0");
            ed_Q1607_2.setText("0");
            ed_Q1607_3.setText("0");

            cb_Q1607_conflict.setChecked(true);
        }
    }

    public boolean validate(final String date) {

        matcher = pattern.matcher(date);

        String[] date_sep = date.split("/");

        if (!date.equals("") && (date_sep[0].equals("99") || date_sep[1].equals("99") || date_sep[2].equals("9999"))) {

            return true;

        } else if (matcher.matches()) {

            matcher.reset();

            if (matcher.find()) {

                String day = matcher.group(1);
                String month = matcher.group(2);
                int year = Integer.parseInt(matcher.group(3));

                if (day.equals("31") &&
                        (month.equals("4") || month.equals("6") || month.equals("9") ||
                                month.equals("11") || month.equals("04") || month.equals("06") ||
                                month.equals("09"))) {
                    return false; // only 1,3,5,7,8,10,12 has 31 days
                } else if (month.equals("2") || month.equals("02")) {
                    //leap year
                    if (year % 4 == 0) {
                        return !day.equals("30") && !day.equals("31");
                    } else {
                        return !day.equals("29") && !day.equals("30") && !day.equals("31");
                    }
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    boolean if_study_id_exsist() {
        DBHelper db = new DBHelper(this);
        Cursor res = db.getData("Q1101_Q1610", study_id);

        return res.getCount() > 0;

    }

    void change_langua() {

        final MyPreferences preferences = new MyPreferences(this);

        String lang = preferences.getlanguage();

//create a string for country
        String country = preferences.getcountry();
//use constructor with country


        if (lang == null) {
            lang = "ur";
            country = "PK";

        }
        Locale locale = new Locale(lang, country);


        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        this.getResources().updateConfiguration(config,
                this.getResources().getDisplayMetrics());

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        switch (i) {
            case 0:
                dataDistricts = getResources().getStringArray(R.array.district0);
                break;
            case 1:
                dataDistricts = getResources().getStringArray(R.array.balochistan);
                break;
            case 2:
                dataDistricts = getResources().getStringArray(R.array.punjab);
                break;
            case 3:
                dataDistricts = getResources().getStringArray(R.array.sindh);
                break;
            case 4:
                dataDistricts = getResources().getStringArray(R.array.kpk);
                break;
            case 5:
                dataDistricts = getResources().getStringArray(R.array.fata);
                break;
            case 6:
                dataDistricts = getResources().getStringArray(R.array.gb);
                break;
            case 7:
                dataDistricts = getResources().getStringArray(R.array.ajk);
                break;
        }

        sp_Q1201_2.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dataDistricts));
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }


}