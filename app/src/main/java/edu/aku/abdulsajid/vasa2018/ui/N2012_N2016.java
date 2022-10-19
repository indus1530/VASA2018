package edu.aku.abdulsajid.vasa2018.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import edu.aku.abdulsajid.vasa2018.Other.globale;
import edu.aku.abdulsajid.vasa2018.R;
import edu.aku.abdulsajid.vasa2018.data.DBHelper;
import edu.aku.abdulsajid.vasa2018.databinding.N2012N2016Binding;

public class N2012_N2016 extends AppCompatActivity {

    N2012N2016Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.n2012__n2016);
        bi.setCallback(this);
        this.setTitle(getString(R.string.h_n_sec_2_2));
        bi.edStudyId.setText(getIntent().getExtras().getString("study_id"));
        bi.edStudyId.setEnabled(false);
    }

    public void BtnContinue() {
        if (!validateField()) return;
        if (SaveData()) {
            finish();
            startActivity(new Intent(this, bi.n2016a.isChecked() ? N2017_N2022_3.class : N2023_N2026.class)
                    .putExtra("study_id", bi.edStudyId.getText().toString()));
        } else {
            Toast.makeText(this, "Can't add data!!", Toast.LENGTH_SHORT).show();
        }
    }


    public boolean SaveData() {

        edu.aku.abdulsajid.vasa2018.DataTables.N.N2012_N2016 n2012 = new edu.aku.abdulsajid.vasa2018.DataTables.N.N2012_N2016();

        n2012.setN2012(bi.n2012a.isChecked() ? "1"
                : bi.n2012b.isChecked() ? "2"
                : bi.n201298.isChecked() ? "98"
                : bi.n201299.isChecked() ? "99"
                : "-1");

        n2012.setN2013(bi.n2013a.isChecked() ? "1"
                : bi.n2013b.isChecked() ? "2"
                : bi.n201398.isChecked() ? "98"
                : bi.n201399.isChecked() ? "99"
                : "-1");

        n2012.setN2014(bi.n2014a.isChecked() ? "1"
                : bi.n2014b.isChecked() ? "2"
                : bi.n201498.isChecked() ? "98"
                : bi.n201499.isChecked() ? "99"
                : "-1");

        n2012.setN2015(bi.n2015a.isChecked() ? "1"
                : bi.n2015b.isChecked() ? "2"
                : bi.n201598.isChecked() ? "98"
                : bi.n201599.isChecked() ? "99"
                : "-1");

        n2012.setN2016(bi.n2016a.isChecked() ? "1"
                : bi.n2016b.isChecked() ? "2"
                : "-1");

        n2012.setSTUDYID(bi.edStudyId.getText().toString());

        DBHelper db = new DBHelper(this);
        Long row = db.add_N2012(n2012);

        return row != 0;
    }


    public Boolean validateField() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    @Override
    public void onBackPressed() {
        globale.interviewExit(this, this, bi.edStudyId.getText().toString(), 3);
    }

}
