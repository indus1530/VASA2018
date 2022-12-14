package edu.aku.abdulsajid.vasa2018.ui;

import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import edu.aku.abdulsajid.vasa2018.Core.HomeActivity;
import edu.aku.abdulsajid.vasa2018.DataTables.GS.Q1101_Q1610;
import edu.aku.abdulsajid.vasa2018.R;
import edu.aku.abdulsajid.vasa2018.data.DBHelper;
import edu.aku.abdulsajid.vasa2018.utils.Gothrough;

public class InterviewEnd extends AppCompatActivity implements View.OnClickListener {

    Button btn_next;

    LinearLayout
            ll_study_id,
            ll_Q1311;

    RadioButton
            rb_Q1311_1,
            rb_Q1311_2,
            rb_Q1311_3,
            rb_Q1311_4,
            rb_Q1311_5,
            rb_Q1311_6,
            rb_Q1311_7,
            rb_Q1311_8,
            rb_Q1311_9,
            rb_Q1311_10,
            rb_Q1311_11,
            rb_Q1311_12;

    EditText
            ed_study_id;

    String
            study_id,
            Q1309,
            Q1310,
            Q1311;

    int currentSection, bCurrentSection;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interview_end);

        ll_study_id = findViewById(R.id.ll_study_id);
        ed_study_id = findViewById(R.id.ed_study_id);
        Intent getStudyId = getIntent();
        study_id = getStudyId.getExtras().getString("study_id");

        bCurrentSection = getStudyId.getExtras().getInt("currentSection");

        ed_study_id.setText(study_id);
        ed_study_id.setEnabled(false);

        Initialization();

        if(bCurrentSection > 0){  // Zero because CurrentSection intent will pass a "0" value

            currentSection = bCurrentSection;
            rb_Q1311_1.setEnabled(false);

        } else {

            currentSection = 111;
            rb_Q1311_2.setEnabled(false);
            rb_Q1311_3.setEnabled(false);
            rb_Q1311_4.setEnabled(false);
            rb_Q1311_5.setEnabled(false);
            rb_Q1311_6.setEnabled(false);
            rb_Q1311_7.setEnabled(false);
            rb_Q1311_8.setEnabled(false);
            rb_Q1311_9.setEnabled(false);
            rb_Q1311_10.setEnabled(false);
            rb_Q1311_11.setEnabled(false);
            rb_Q1311_12.setEnabled(false);
        }

        btn_next.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (validateField() == false) {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_LONG).show();
            return;
        }

        value_assignment();

        //Toast.makeText(this, Q1311, Toast.LENGTH_LONG).show();


        DBHelper db = new DBHelper(this);

        ContentValues values = new ContentValues();
        values.put(Q1101_Q1610.Q1309, Q1309);
        values.put(Q1101_Q1610.Q1310, Q1310);
        values.put(Q1101_Q1610.Q1311, Q1311);
        values.put(Q1101_Q1610.currentSection, currentSection);

        Long res = db.updateData("Q1101_Q1610", values, study_id);


        if (res > 0) {

            Toast.makeText(this, "Thank you", Toast.LENGTH_LONG).show();

            Intent c = new Intent(this, HomeActivity.class);
            startActivity(c);

        } else {

            Toast.makeText(this, "Something went wrong", Toast.LENGTH_LONG).show();
        }
    }

    void Initialization() {

        // Button Next
        btn_next = findViewById(R.id.btn_next);

        // Layouts
        /*ll_Q1311 = findViewById(R.id.ll_Q1311);*/

        rb_Q1311_1 = findViewById(R.id.rb_Q1311_1);
        rb_Q1311_2 = findViewById(R.id.rb_Q1311_2);
        rb_Q1311_3 = findViewById(R.id.rb_Q1311_3);
        rb_Q1311_4 = findViewById(R.id.rb_Q1311_4);
        rb_Q1311_5 = findViewById(R.id.rb_Q1311_5);
        rb_Q1311_6 = findViewById(R.id.rb_Q1311_6);
        rb_Q1311_7 = findViewById(R.id.rb_Q1311_7);
        rb_Q1311_8 = findViewById(R.id.rb_Q1311_8);
        rb_Q1311_9 = findViewById(R.id.rb_Q1311_9);
        rb_Q1311_10 = findViewById(R.id.rb_Q1311_10);
        rb_Q1311_11 = findViewById(R.id.rb_Q1311_11);
        rb_Q1311_12 = findViewById(R.id.rb_Q1311_12);
    }


    void value_assignment() {


        Calendar cdt = Calendar.getInstance();
        SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String formattedDate = dt.format(cdt.getTime());
        String[] dtf = formattedDate.split(" ");

        if (dtf[0].length() > 0){

            Q1309 = dtf[0].trim();
        }

        if (dtf[1].length() > 0){

            Q1310 = dtf[1].trim();
        }

        Q1311 = "-1";

        if (rb_Q1311_1.isChecked()) {
            Q1311 = "1";
        } else if (rb_Q1311_2.isChecked()) {
            Q1311 = "2";
        } else if (rb_Q1311_3.isChecked()) {
            Q1311 = "3";
        } else if (rb_Q1311_4.isChecked()) {
            Q1311 = "4";
        } else if (rb_Q1311_5.isChecked()) {
            Q1311 = "5";
        } else if (rb_Q1311_6.isChecked()) {
            Q1311 = "6";
        } else if (rb_Q1311_7.isChecked()) {
            Q1311 = "7";
        } else if (rb_Q1311_8.isChecked()) {
            Q1311 = "8";
        } else if (rb_Q1311_9.isChecked()) {
            Q1311 = "9";
        } else if (rb_Q1311_10.isChecked()) {
            Q1311 = "10";
        } else if (rb_Q1311_11.isChecked()) {
            Q1311 = "11";
        } else if (rb_Q1311_12.isChecked()) {
            Q1311 = "12";
        }

    }

    boolean validateField() {

        if (Gothrough.IamHiden(ll_study_id) == false) {
            return false;
        }

        return Gothrough.IamHiden(ll_Q1311) != false;
    }

}
