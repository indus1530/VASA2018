package edu.aku.abdulsajid.vasa2018.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import edu.aku.abdulsajid.vasa2018.Other.globale;
import edu.aku.abdulsajid.vasa2018.R;
import edu.aku.abdulsajid.vasa2018.data.LocalDataManager;
import edu.aku.abdulsajid.vasa2018.databinding.ActivitySectionA10Binding;
import edu.aku.abdulsajid.vasa2018.utils.InputFilterMinMax;


public class SectionA10Activity extends AppCompatActivity {

    String
            study_id,
            A4206a,
            A4206b,
            A4206c,
            A4206d,
            A4206e,
            A4206f,
            A4206g,
            A4206h,
            A4206i,
            A4206j,
            A4206k,
            A4206l,
            A4206m,
            A4206n,
            A4206o,
            A4206p,
            A4206q,
            A4206r,
            A4206s,
            A4206t,
            A4206u,
            A4206v,
            A4206w,
            A4207hx,
            A4207dx,
            STATUS;

    int currentSection;
    ActivitySectionA10Binding bi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_a10);
        this.setTitle(getString(R.string.h_a_sec_I_A));
        Intent getStudyId = getIntent();
        study_id = getStudyId.getExtras().getString("study_id");
        bi.studyid.setText(study_id);
        bi.studyid.setEnabled(false);
        events_calls();
    }


    public void btnContinue() {
        if (!validateField()) return;
        value_assignment();
        insert_data();
        startActivity(new Intent(SectionA10Activity.this, SectionA11Activity.class).putExtra("study_id", study_id));
    }


    private void events_calls() {

        bi.a206a.setOnCheckedChangeListener((radioGroup, i) -> Clear.clearAllFields(bi.ll206a));

        bi.a206b.setOnCheckedChangeListener((radioGroup, i) -> Clear.clearAllFields(bi.ll206b));

        bi.a206i.setOnCheckedChangeListener((radioGroup, i) -> Clear.clearAllFields(bi.cvA206j));

        bi.a206j.setOnCheckedChangeListener((radioGroup, i) -> Clear.clearAllFields(bi.cvA206k));

        bi.a206v.setOnCheckedChangeListener((radioGroup, i) -> Clear.clearAllFields(bi.cvA206w));

        bi.a206w.setOnCheckedChangeListener((radioGroup, i) -> Clear.clearAllFields(bi.cvA207));

        bi.a207hx.setFilters(new InputFilter[]{new InputFilterMinMax(0, 23, 99, 99)});

        //bi.a207dx.setFilters(new InputFilter[]{new InputFilterMinMax(0, 23, 99, 99)});


    }

    void value_assignment() {

        study_id = bi.studyid.getText().toString().length() > 0 ? bi.studyid.getText().toString().trim() : "0";

        A4206a = bi.a206aa.isChecked() ? "1"
                : bi.a206ab.isChecked() ? "2"
                : bi.a206a98.isChecked() ? "98"
                : bi.a206a99.isChecked() ? "99"
                : "-1";

        A4206b = bi.a206ba.isChecked() ? "1"
                : bi.a206bb.isChecked() ? "2"
                : bi.a206b98.isChecked() ? "98"
                : bi.a206b99.isChecked() ? "99"
                : "-1";

        A4206c = bi.a206ca.isChecked() ? "1"
                : bi.a206cb.isChecked() ? "2"
                : bi.a206cc.isChecked() ? "3"
                : bi.a206cd.isChecked() ? "4"
                : bi.a206ce.isChecked() ? "5"
                : bi.a206c96.isChecked() ? "96"
                : bi.a206c98.isChecked() ? "98"
                : bi.a206c99.isChecked() ? "99"
                : "-1";
        A4206c = bi.a206c96x.getText().toString().length() > 0 ? bi.a206c96x.getText().toString().trim() : "-1";

        A4206d = bi.a206da.isChecked() ? "1"
                : bi.a206db.isChecked() ? "2"
                : bi.a206dc.isChecked() ? "3"
                : bi.a206dd.isChecked() ? "4"
                : bi.a206de.isChecked() ? "5"
                : bi.a206df.isChecked() ? "6"
                : bi.a206d96.isChecked() ? "96"
                : bi.a206d98.isChecked() ? "98"
                : bi.a206d99.isChecked() ? "99"
                : "-1";
        A4206d = bi.a206d96x.getText().toString().length() > 0 ? bi.a206d96x.getText().toString().trim() : "-1";

        A4206e = bi.a206ea.isChecked() ? "1"
                : bi.a206eb.isChecked() ? "2"
                : bi.a206e98.isChecked() ? "98"
                : bi.a206e99.isChecked() ? "99"
                : "-1";

        A4206f = bi.a206fa.isChecked() ? "1"
                : bi.a206fb.isChecked() ? "2"
                : bi.a206f98.isChecked() ? "98"
                : bi.a206f99.isChecked() ? "99"
                : "-1";

        A4206g = bi.a206ga.isChecked() ? "1"
                : bi.a206gb.isChecked() ? "2"
                : bi.a206g98.isChecked() ? "98"
                : bi.a206g99.isChecked() ? "99"
                : "-1";

        A4206h = bi.a206ha.isChecked() ? "1"
                : bi.a206hb.isChecked() ? "2"
                : bi.a206h98.isChecked() ? "98"
                : bi.a206h99.isChecked() ? "99"
                : "-1";

        A4206i = bi.a206ia.isChecked() ? "1"
                : bi.a206ib.isChecked() ? "2"
                : bi.a206i98.isChecked() ? "98"
                : bi.a206i99.isChecked() ? "99"
                : "-1";

        A4206j = bi.a206ja.isChecked() ? "1"
                : bi.a206jb.isChecked() ? "2"
                : bi.a206j98.isChecked() ? "98"
                : bi.a206j99.isChecked() ? "99"
                : "-1";

        A4206k = bi.a206ka.isChecked() ? "1"
                : bi.a206kb.isChecked() ? "2"
                : bi.a206kc.isChecked() ? "3"
                : bi.a206k96.isChecked() ? "96"
                : bi.a206k98.isChecked() ? "98"
                : bi.a206k99.isChecked() ? "99"
                : "-1";
        A4206k = bi.a206k96x.getText().toString().length() > 0 ? bi.a206k96x.getText().toString().trim() : "-1";

        A4206l = bi.a206ia.isChecked() ? "1"
                : bi.a206ib.isChecked() ? "2"
                : bi.a206i98.isChecked() ? "98"
                : bi.a206i99.isChecked() ? "99"
                : "-1";

        A4206m = bi.a206ia.isChecked() ? "1"
                : bi.a206ib.isChecked() ? "2"
                : bi.a206i98.isChecked() ? "98"
                : bi.a206i99.isChecked() ? "99"
                : "-1";

        A4206n = bi.a206ia.isChecked() ? "1"
                : bi.a206ib.isChecked() ? "2"
                : bi.a206i98.isChecked() ? "98"
                : bi.a206i99.isChecked() ? "99"
                : "-1";

        A4206o = bi.a206ia.isChecked() ? "1"
                : bi.a206ib.isChecked() ? "2"
                : bi.a206i98.isChecked() ? "98"
                : bi.a206i99.isChecked() ? "99"
                : "-1";

        A4206p = bi.a206ia.isChecked() ? "1"
                : bi.a206ib.isChecked() ? "2"
                : bi.a206i98.isChecked() ? "98"
                : bi.a206i99.isChecked() ? "99"
                : "-1";

        A4206q = bi.a206ia.isChecked() ? "1"
                : bi.a206ib.isChecked() ? "2"
                : bi.a206i98.isChecked() ? "98"
                : bi.a206i99.isChecked() ? "99"
                : "-1";

        A4206r = bi.a206ia.isChecked() ? "1"
                : bi.a206ib.isChecked() ? "2"
                : bi.a206i98.isChecked() ? "98"
                : bi.a206i99.isChecked() ? "99"
                : "-1";

        A4206s = bi.a206ia.isChecked() ? "1"
                : bi.a206ib.isChecked() ? "2"
                : bi.a206i98.isChecked() ? "98"
                : bi.a206i99.isChecked() ? "99"
                : "-1";

        A4206t = bi.a206ia.isChecked() ? "1"
                : bi.a206ib.isChecked() ? "2"
                : bi.a206i98.isChecked() ? "98"
                : bi.a206i99.isChecked() ? "99"
                : "-1";

        A4206u = bi.a206ia.isChecked() ? "1"
                : bi.a206ib.isChecked() ? "2"
                : bi.a206i98.isChecked() ? "98"
                : bi.a206i99.isChecked() ? "99"
                : "-1";

        A4206v = bi.a206ia.isChecked() ? "1"
                : bi.a206ib.isChecked() ? "2"
                : bi.a206i98.isChecked() ? "98"
                : bi.a206i99.isChecked() ? "99"
                : "-1";

        A4206w = bi.a206ia.isChecked() ? "1"
                : bi.a206ib.isChecked() ? "2"
                : bi.a206i98.isChecked() ? "98"
                : bi.a206i99.isChecked() ? "99"
                : "-1";

        A4207hx = bi.a207hx.getText().toString().length() > 0 ? bi.a207hx.getText().toString().trim() : "-1";
        A4207dx = bi.a207dx.getText().toString().length() > 0 ? bi.a207dx.getText().toString().trim() : "-1";

        STATUS = "0";

    }

    void insert_data() {

        String query = "insert into A4206_A4207("

                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4206_A4207.study_id + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4206_A4207.A4206 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4206_A4207.A4206_1 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4206_A4207.A4206_2 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4206_A4207.A4206_3 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4206_A4207.A4206_4 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4206_A4207.A4206_5 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4206_A4207.A4206_6 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4206_A4207.A4206_7 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4206_A4207.A4206_8 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4206_A4207.A4206_9 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4206_A4207.A4206_10 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4206_A4207.A4206_11 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4206_A4207.A4206_12 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4206_A4207.A4206_13 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4206_A4207.A4206_14 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4206_A4207.A4206_15 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4206_A4207.A4206_16 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4206_A4207.A4206_17 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4206_A4207.A4206_18 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4206_A4207.A4206_19 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4206_A4207.A4206_20 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4206_A4207.A4206_21 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4206_A4207.A4206_22 + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4206_A4207.A4207_hour + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4206_A4207.A4207_day + ","
                + edu.aku.abdulsajid.vasa2018.DataTables.A.A4206_A4207.STATUS + ")" +

                " values ('" +

                study_id + "','" +
                A4206a + "','" +
                A4206b + "','" +
                A4206c + "','" +
                A4206d + "','" +
                A4206e + "','" +
                A4206f + "','" +
                A4206g + "','" +
                A4206h + "','" +
                A4206i + "','" +
                A4206j + "','" +
                A4206k + "','" +
                A4206l + "','" +
                A4206m + "','" +
                A4206n + "','" +
                A4206o + "','" +
                A4206p + "','" +
                A4206q + "','" +
                A4206r + "','" +
                A4206s + "','" +
                A4206t + "','" +
                A4206u + "','" +
                A4206v + "','" +
                A4206w + "','" +
                A4207hx + "','" +
                A4207dx + "','" +
                STATUS + "')";

        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);
        LocalDataManager.database.execSQL(query);
        Toast.makeText(this, "10th TABLE SAVED Successfully", Toast.LENGTH_SHORT).show();

    }


    boolean validateField() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    public void onBackPressed() {
        globale.interviewExit(this, this, study_id, currentSection = 11);
    }


}
