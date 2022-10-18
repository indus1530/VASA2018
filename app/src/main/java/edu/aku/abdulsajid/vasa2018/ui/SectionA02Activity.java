package edu.aku.abdulsajid.vasa2018.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import edu.aku.abdulsajid.vasa2018.DataTables.A.A4051_A4066;
import edu.aku.abdulsajid.vasa2018.Other.globale;
import edu.aku.abdulsajid.vasa2018.R;
import edu.aku.abdulsajid.vasa2018.data.LocalDataManager;
import edu.aku.abdulsajid.vasa2018.databinding.ActivitySectionA02Binding;
import edu.aku.abdulsajid.vasa2018.utils.InputFilterMinMax;

public class SectionA02Activity extends AppCompatActivity {

    String
            study_id,
            A051,
            A052,
            A052dx,
            A052mx,
            A053,
            A054,
            A055,
            A056,
            A057,
            A058,
            A059,
            A059dx,
            A059mx,
            A060,
            A061,
            A062,
            A063,
            A064,
            A064dx,
            A064mx,
            A064a,
            A065,
            A066,
            A067,
            A068,
            A069,
            A069dx,
            A069mx,
            A069yx,
            A070,
            STATUS;

    int currentSection;
    ActivitySectionA02Binding bi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_a02);
        this.setTitle(getString(R.string.h_a_sec_9));
        bi.setCallback(this);
        Intent getStudyId = getIntent();
        study_id = getStudyId.getExtras().getString("study_id");
        bi.studyid.setText(study_id);
        bi.studyid.setEnabled(false);
        events_calls();

    }


    public void btnContinue(View view) {
        if (!validateField()) return;
        value_assignment();
        insert_data();
        startActivity(new Intent(SectionA02Activity.this, A4067_A4080.class).putExtra("study_id", study_id));
    }

    private void events_calls() {

        //A051
        bi.a051.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.cvA052);
            Clear.clearAllFields(bi.cvA053);
            Clear.clearAllFields(bi.cvA054);
            Clear.clearAllFields(bi.cvA055);
            Clear.clearAllFields(bi.cvA056);
            bi.cvA052.setVisibility(View.GONE);
            bi.cvA053.setVisibility(View.GONE);
            bi.cvA054.setVisibility(View.GONE);
            bi.cvA055.setVisibility(View.GONE);
            bi.cvA056.setVisibility(View.GONE);
            if (i == bi.a051a.getId()) {
                bi.cvA052.setVisibility(View.VISIBLE);
                bi.cvA053.setVisibility(View.VISIBLE);
                bi.cvA054.setVisibility(View.VISIBLE);
                bi.cvA055.setVisibility(View.VISIBLE);
                bi.cvA056.setVisibility(View.VISIBLE);
            }
        });

        //A058
        bi.a058.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.cvA059);
            bi.cvA059.setVisibility(View.GONE);
            if (i == bi.a058a.getId()) {
                bi.cvA059.setVisibility(View.VISIBLE);
            }
        });

        //A060
        bi.a060.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.cvA061);
            bi.cvA061.setVisibility(View.GONE);
            if (i == bi.a060a.getId()) {
                bi.cvA061.setVisibility(View.VISIBLE);
            }
        });

        //A062
        bi.a062.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.cvA063);
            Clear.clearAllFields(bi.cvA064);
            Clear.clearAllFields(bi.cvA064a);
            Clear.clearAllFields(bi.cvA065);
            bi.cvA063.setVisibility(View.GONE);
            bi.cvA064.setVisibility(View.GONE);
            bi.cvA064a.setVisibility(View.GONE);
            bi.cvA065.setVisibility(View.GONE);
            if (i == bi.a062a.getId()) {
                bi.cvA063.setVisibility(View.VISIBLE);
                bi.cvA064.setVisibility(View.VISIBLE);
                bi.cvA064a.setVisibility(View.VISIBLE);
                bi.cvA065.setVisibility(View.VISIBLE);
            }
        });

        //A067
        bi.a067.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.cvA068);
            Clear.clearAllFields(bi.cvA069);
            Clear.clearAllFields(bi.cvA070);
            bi.cvA068.setVisibility(View.GONE);
            bi.cvA069.setVisibility(View.GONE);
            bi.cvA070.setVisibility(View.GONE);
            if (i == bi.a067a.getId()) {
                bi.cvA068.setVisibility(View.VISIBLE);
                bi.cvA069.setVisibility(View.VISIBLE);
                bi.cvA070.setVisibility(View.VISIBLE);
            }
        });

        bi.a052dx.setFilters(new InputFilter[]{new InputFilterMinMax(0, 29, 99, 99)});
        bi.a052mx.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});
        bi.a059dx.setFilters(new InputFilter[]{new InputFilterMinMax(0, 29, 99, 99)});
        bi.a059mx.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});
        bi.a064dx.setFilters(new InputFilter[]{new InputFilterMinMax(0, 29, 99, 99)});
        bi.a064mx.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});

    }

    void value_assignment() {

        study_id = bi.studyid.getText().toString().length() > 0 ? bi.studyid.getText().toString().trim() : "0";

        A051 = bi.a051a.isChecked() ? "1"
                : bi.a051b.isChecked() ? "2"
                : bi.a05198.isChecked() ? "98"
                : bi.a05199.isChecked() ? "99"
                : "-1";

        A052 = bi.a052d.isChecked() ? "1"
                : bi.a052m.isChecked() ? "2"
                : bi.a05298.isChecked() ? "98"
                : bi.a05299.isChecked() ? "99"
                : "-1";

        A052dx = bi.a052dx.getText().toString().length() > 0 ? bi.a052dx.getText().toString().trim() : "-1";
        A052mx = bi.a052mx.getText().toString().length() > 0 ? bi.a052mx.getText().toString().trim() : "-1";

        A053 = bi.a053a.isChecked() ? "1"
                : bi.a053b.isChecked() ? "2"
                : bi.a05398.isChecked() ? "98"
                : bi.a05399.isChecked() ? "99"
                : "-1";

        A054 = bi.a054a.isChecked() ? "1"
                : bi.a054b.isChecked() ? "2"
                : bi.a054c.isChecked() ? "3"
                : bi.a05498.isChecked() ? "98"
                : bi.a05499.isChecked() ? "99"
                : "-1";

        A055 = bi.a055a.isChecked() ? "1"
                : bi.a055b.isChecked() ? "2"
                : bi.a055b.isChecked() ? "2"
                : bi.a055c.isChecked() ? "2"
                : bi.a05598.isChecked() ? "98"
                : bi.a05599.isChecked() ? "99"
                : "-1";

        A056 = bi.a056a.isChecked() ? "1"
                : bi.a056b.isChecked() ? "2"
                : bi.a05698.isChecked() ? "98"
                : bi.a05699.isChecked() ? "99"
                : "-1";

        A057 = bi.a057a.isChecked() ? "1"
                : bi.a057b.isChecked() ? "2"
                : bi.a05798.isChecked() ? "98"
                : bi.a05799.isChecked() ? "99"
                : "-1";

        A058 = bi.a058a.isChecked() ? "1"
                : bi.a058b.isChecked() ? "2"
                : bi.a05898.isChecked() ? "98"
                : bi.a05899.isChecked() ? "99"
                : "-1";

        A059 = bi.a059d.isChecked() ? "1"
                : bi.a059m.isChecked() ? "2"
                : bi.a05998.isChecked() ? "98"
                : bi.a05999.isChecked() ? "99"
                : "-1";

        A059dx = bi.a059dx.getText().toString().length() > 0 ? bi.a059dx.getText().toString().trim() : "-1";
        A059mx = bi.a059mx.getText().toString().length() > 0 ? bi.a059mx.getText().toString().trim() : "-1";

        A060 = bi.a060a.isChecked() ? "1"
                : bi.a060b.isChecked() ? "2"
                : bi.a06098.isChecked() ? "98"
                : bi.a06099.isChecked() ? "99"
                : "-1";

        A061 = bi.a061a.isChecked() ? "1"
                : bi.a061b.isChecked() ? "2"
                : bi.a06198.isChecked() ? "98"
                : bi.a06199.isChecked() ? "99"
                : "-1";

        A062 = bi.a062a.isChecked() ? "1"
                : bi.a062b.isChecked() ? "2"
                : bi.a06298.isChecked() ? "98"
                : bi.a06299.isChecked() ? "99"
                : "-1";

        A063 = bi.a063a.isChecked() ? "1"
                : bi.a063b.isChecked() ? "2"
                : bi.a06398.isChecked() ? "98"
                : bi.a06399.isChecked() ? "99"
                : "-1";

        A064 = bi.a064d.isChecked() ? "1"
                : bi.a064m.isChecked() ? "2"
                : bi.a06498.isChecked() ? "98"
                : bi.a06499.isChecked() ? "99"
                : "-1";
        A064dx = bi.a064dx.getText().toString().length() > 0 ? bi.a064dx.getText().toString().trim() : "-1";
        A064mx = bi.a064mx.getText().toString().length() > 0 ? bi.a064mx.getText().toString().trim() : "-1";

        A064a = bi.a064aa.isChecked() ? "1"
                : bi.a064ab.isChecked() ? "2"
                : bi.a064a98.isChecked() ? "98"
                : bi.a064a99.isChecked() ? "99"
                : "-1";

        A065 = bi.a065a.isChecked() ? "1"
                : bi.a065b.isChecked() ? "2"
                : bi.a06598.isChecked() ? "98"
                : bi.a06599.isChecked() ? "99"
                : "-1";

        A066 = bi.a066a.isChecked() ? "1"
                : bi.a066b.isChecked() ? "2"
                : bi.a06698.isChecked() ? "98"
                : bi.a06699.isChecked() ? "99"
                : "-1";

        A067 = bi.a067a.isChecked() ? "1"
                : bi.a067b.isChecked() ? "2"
                : bi.a06798.isChecked() ? "98"
                : bi.a06799.isChecked() ? "99"
                : "-1";

        A068 = bi.a068a.isChecked() ? "1"
                : bi.a068b.isChecked() ? "2"
                : bi.a06898.isChecked() ? "98"
                : bi.a06899.isChecked() ? "99"
                : "-1";

        A069 = bi.a069d.isChecked() ? "1"
                : bi.a069m.isChecked() ? "2"
                : bi.a069y.isChecked() ? "3"
                : bi.a06998.isChecked() ? "98"
                : bi.a06999.isChecked() ? "99"
                : "-1";
        A069dx = bi.a069dx.getText().toString().length() > 0 ? bi.a069dx.getText().toString().trim() : "-1";
        A069mx = bi.a069mx.getText().toString().length() > 0 ? bi.a069mx.getText().toString().trim() : "-1";
        A069yx = bi.a069yx.getText().toString().length() > 0 ? bi.a069yx.getText().toString().trim() : "-1";

        A070 = bi.a070a.isChecked() ? "1"
                : bi.a070b.isChecked() ? "2"
                : bi.a070c.isChecked() ? "3"
                : bi.a07098.isChecked() ? "98"
                : bi.a07099.isChecked() ? "99"
                : "-1";

        STATUS = "0";

    }

    void insert_data() {

        String query = "insert into A4051_A4066("

                + A4051_A4066.study_id + ","
                + A4051_A4066.A051 + ","
                + A4051_A4066.A052 + ","
                + A4051_A4066.A052dx + ","
                + A4051_A4066.A052mx + ","
                + A4051_A4066.A053 + ","
                + A4051_A4066.A054 + ","
                + A4051_A4066.A055 + ","
                + A4051_A4066.A056 + ","
                + A4051_A4066.A057 + ","
                + A4051_A4066.A058 + ","
                + A4051_A4066.A059 + ","
                + A4051_A4066.A059dx + ","
                + A4051_A4066.A059mx + ","
                + A4051_A4066.A060 + ","
                + A4051_A4066.A061 + ","
                + A4051_A4066.A062 + ","
                + A4051_A4066.A063 + ","
                + A4051_A4066.A064 + ","
                + A4051_A4066.A064dx + ","
                + A4051_A4066.A064mx + ","
                + A4051_A4066.A064a + ","
                + A4051_A4066.A065 + ","
                + A4051_A4066.A066 + ","
                + A4051_A4066.A067 + ","
                + A4051_A4066.A068 + ","
                + A4051_A4066.A069 + ","
                + A4051_A4066.A069dx + ","
                + A4051_A4066.A069mx + ","
                + A4051_A4066.A069yx + ","
                + A4051_A4066.A070 + ","
                + A4051_A4066.STATUS + ")" +

                " values ('" +

                study_id + "','" +
                A051 + "','" +
                A052 + "','" +
                A052dx + "','" +
                A052mx + "','" +
                A053 + "','" +
                A054 + "','" +
                A055 + "','" +
                A056 + "','" +
                A057 + "','" +
                A058 + "','" +
                A059 + "','" +
                A059dx + "','" +
                A059mx + "','" +
                A060 + "','" +
                A061 + "','" +
                A062 + "','" +
                A063 + "','" +
                A064 + "','" +
                A064dx + "','" +
                A064mx + "','" +
                A064a + "','" +
                A065 + "','" +
                A066 + "','" +
                A067 + "','" +
                A068 + "','" +
                A069 + "','" +
                A069dx + "','" +
                A069mx + "','" +
                A069yx + "','" +
                A070 + "','" +
                STATUS + "')";

        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(this, "2nd TABLE SAVED Successfully", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

    public void onBackPressed() {
        globale.interviewExit(this, this, study_id, currentSection = 3);
    }
}