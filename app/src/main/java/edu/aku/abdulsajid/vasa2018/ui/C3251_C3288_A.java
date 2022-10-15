package edu.aku.abdulsajid.vasa2018.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import edu.aku.abdulsajid.vasa2018.DataTables.C.C3251_C3288_A_C;
import edu.aku.abdulsajid.vasa2018.Other.globale;
import edu.aku.abdulsajid.vasa2018.R;
import edu.aku.abdulsajid.vasa2018.data.DBHelper;
import edu.aku.abdulsajid.vasa2018.databinding.C3251C3288ABinding;
import edu.aku.abdulsajid.vasa2018.utils.Gothrough;



public class C3251_C3288_A extends AppCompatActivity {

    int currentSection;

    String study_id;

    public static int c3251A_ID = 0;
    C3251C3288ABinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.c3251_c3288_a);
        bi.setCallback(this);
        this.setTitle(getString(R.string.h_c_sec_10));
        study_id = getIntent().getExtras().getString("study_id");
        bi.edStudyId.setText(getIntent().getExtras().getString("study_id"));
        bi.edStudyId.setEnabled(false);

    }

    public void BtnContinue() {
        if (validateField()) {
            if (SaveData()) {
                startActivity(new Intent(this, bi.rbC32521.isChecked() ? C3251_C3288_B.class : C3251_C3288_C.class)
                        .putExtra("valFlag", bi.rbC32522.isChecked() ? 2 : 9)
                        .putExtra("study_id", bi.edStudyId.getText().toString()));
            } else {
                Toast.makeText(this, "Can't add edu.aku.abdulsajid.VASMonitring.data!!", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_SHORT).show();
        }
    }

    public boolean SaveData() {

        C3251_C3288_A_C c3251 = new C3251_C3288_A_C();

        c3251.setC32511(bi.rbC325111.isChecked() ? "1"
                : bi.rbC325112.isChecked() ? "2"
                : bi.rbC325113.isChecked() ? "3"
                : bi.rbC32511DK.isChecked() ? "9"
                : "-1");

        c3251.setC32512(bi.rbC325121.isChecked() ? "1"
                : bi.rbC325122.isChecked() ? "2"
                : bi.rbC325123.isChecked() ? "3"
                : bi.rbC32512DK.isChecked() ? "9"
                : "-1");

        c3251.setC3252(bi.rbC32521.isChecked() ? "1"
                : bi.rbC32522.isChecked() ? "2"
                : bi.rbC3252DK.isChecked() ? "9"
                : "-1");

        c3251.setSTUDYID(bi.edStudyId.getText().toString());
        DBHelper db = new DBHelper(this);
        Long row = db.add_C3251_A_C(c3251);

        c3251A_ID = row.intValue();

        return row != 0;
    }

    public Boolean validateField() {

        //ll_C3251_1
        if (!Gothrough.IamHiden(bi.c3251a)) return false;

        //ll_C3251_2
        if (!Gothrough.IamHiden(bi.c3251b)) return false;

        //ll_C3252
        return Gothrough.IamHiden(bi.c3252);
    }

    @Override
    public void onBackPressed() {
        globale.interviewExit(this, this, bi.edStudyId.getText().toString(), currentSection = 7);
    }
}
