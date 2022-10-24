package edu.aku.abdulsajid.vasa2018.ui;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import java.util.ArrayList;
import java.util.List;

import edu.aku.abdulsajid.vasa2018.DataTables.RP.w204_w215;
import edu.aku.abdulsajid.vasa2018.DataTables.RP.w216_w222;
import edu.aku.abdulsajid.vasa2018.Other.globale;
import edu.aku.abdulsajid.vasa2018.R;
import edu.aku.abdulsajid.vasa2018.data.DBHelper;
import edu.aku.abdulsajid.vasa2018.data.LocalDataManager;
import edu.aku.abdulsajid.vasa2018.databinding.ActivitySectionWBinding;
import edu.aku.abdulsajid.vasa2018.databinding.DialogW217W22Binding;
import edu.aku.abdulsajid.vasa2018.utils.ClearAllcontrol;


public class SectionWActivity extends AppCompatActivity {
    String
            study_id,
            W201d,
            W201m,
            W201y,
            W202,
            W203,
            W204,
            W205,
            W206,
            W207,
            W208,
            W209,
            W210a,
            W210b,
            W210c,
            W21098,
            W21099,
            W211,
            W212,
            W213,
            W214,
            W215;

    //endregion
    int currentSection;
    List<String> lst_w17 = new ArrayList();
    List<String> lst_w18 = new ArrayList();
    List<String> lst_w19 = new ArrayList();
    List<String> lst_w21 = new ArrayList();
    List<String> lst_w22 = new ArrayList();
    String
            w17,
            w18,
            w19,
            w21,
            w22,
            mult_w19,
            mult_w21,
            mult_w22;
    String section;

    ActivitySectionWBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_w);
        bi.setCallback(this);
        Intent getStudyId = getIntent();
        study_id = getStudyId.getExtras().getString("study_id");
        section = getStudyId.getExtras().getString("section");
        setupSkips();

    }

    private void setupSkips() {

        bi.w204.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.cvW205);
            bi.cvW205.setVisibility(View.GONE);
            if (i == bi.w204b.getId()) {
                bi.cvW205.setVisibility(View.VISIBLE);
            }
        });

        bi.w205.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.cvW206);
            Clear.clearAllFields(bi.cvW207);
            Clear.clearAllFields(bi.llw207);
            bi.cvW206.setVisibility(View.GONE);
            bi.cvW207.setVisibility(View.GONE);
            bi.llw207.setVisibility(View.GONE);
            if (i == bi.w205a.getId()) {
                bi.cvW206.setVisibility(View.VISIBLE);
                bi.cvW207.setVisibility(View.VISIBLE);
                bi.llw207.setVisibility(View.VISIBLE);
            }
        });

        bi.w207.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.llw207);
            bi.llw207.setVisibility(View.GONE);
            if (i == bi.w207a.getId()) bi.llw207.setVisibility(View.VISIBLE);
        });

        bi.w208.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.cvW209);
            Clear.clearAllFields(bi.cvW210);
            bi.cvW209.setVisibility(View.GONE);
            bi.cvW210.setVisibility(View.GONE);
            if (i == bi.w208a.getId()) {
                bi.cvW209.setVisibility(View.VISIBLE);
                bi.cvW210.setVisibility(View.VISIBLE);
            }
        });

        bi.w209.setOnCheckedChangeListener((radioGroup, i) -> {
            Clear.clearAllFields(bi.cvW210);
            bi.cvW210.setVisibility(View.GONE);
            if (i == bi.w209a.getId()) {
                bi.cvW210.setVisibility(View.VISIBLE);
            }
        });

        bi.w21098.setOnCheckedChangeListener((compoundButton, b) -> Clear.clearAllFields(bi.w210check, !b));
        bi.w21099.setOnCheckedChangeListener((compoundButton, b) -> Clear.clearAllFields(bi.w210check, !b));

    }


    void show_dailuge() {

        mult_w19 = "";
        mult_w21 = "";
        mult_w22 = "";

        final AlertDialog b = new AlertDialog.Builder(this).create();
        LayoutInflater layoutInflater = getLayoutInflater();
        View v = layoutInflater.inflate(R.layout.dialog_w217_w22, null);
        DialogW217W22Binding di = DataBindingUtil.bind(v);
        b.setCancelable(false);
        b.setView(v);

        int preg = lst_w17.size() + 1;
        di.pregno.setText("Enter Detail for Pregnancy No: (" + preg + ")");


        di.addChild.setOnClickListener(view -> {

            if (!Validator.emptyCheckingContainer(SectionWActivity.this, di.GrpName)) return;

            mult_w19 = di.w219a.isChecked() ? "1" : di.w219b.isChecked() ? "2" : "-1";

            int year_21 = 0;
            int month_21 = 0;
            int days_21 = 0;

            if (di.w221y.getText().toString().trim().length() > 0) {
                if (di.w221y.getText().toString().equals("98")) {
                    year_21 = 00;
                } else {
                    year_21 = Integer.parseInt(di.w221y.getText().toString().trim()) * 365;
                }
            }


            if (di.w221m.getText().toString().trim().length() > 0) {
                if (di.w221m.getText().toString().equals("98")) {
                    month_21 = 00;
                } else {
                    month_21 = Integer.parseInt(di.w221m.getText().toString().trim()) * 30;
                }
            }

            if (di.w221d.getText().toString().trim().length() > 0) {
                if (di.w221d.getText().toString().equals("98")) {
                    days_21 = 00;
                } else {
                    days_21 = Integer.parseInt(di.w221d.getText().toString().trim()) * 1;
                }
            }


            days_21 = days_21 + month_21 + year_21;

            mult_w21 = Integer.toString(days_21);


            int year_22 = 0;
            int month_22 = 0;
            int days_22 = 0;

            if (di.w222y.getText().toString().trim().length() > 0) {
                if (di.w222y.getText().toString().equals("98")) {

                    year_22 = 00;

                } else {
                    year_22 = Integer.parseInt(di.w222y.getText().toString().trim()) * 365;
                }
            }

            if (di.w222m.getText().toString().trim().length() > 0) {

                if (di.w222m.getText().toString().equals("98")) {
                    month_22 = 00;
                } else {
                    month_22 = Integer.parseInt(di.w222m.getText().toString().trim()) * 30;
                }

            }

            if (di.w222d.getText().toString().trim().length() > 0) {

                if (di.w222d.getText().toString().trim().equals("98")) {
                    days_22 = 0;
                } else {

                    days_22 = Integer.parseInt(di.w222d.getText().toString().trim()) * 1;

                }
            }

            days_22 = days_22 + month_22 + year_22;
            mult_w22 = Integer.toString(days_22);
            di.addPregnancy.setVisibility(View.VISIBLE);
            di.addChild.setVisibility(View.GONE);
            Clear.clearAllFields(di.cvw219);
            Clear.clearAllFields(di.cvw221);
            Clear.clearAllFields(di.cvw222);
        });


        di.addPregnancy.setOnClickListener(view -> {

            if (!Validator.emptyCheckingContainer(SectionWActivity.this, di.GrpName)) return;

            lst_w17.add(di.w217y.getText().toString().trim().length() > 0 ? di.w217y.getText().toString().trim() : "-1");

            lst_w18.add(di.w218a.isChecked() ? "1"
                    : di.w218a.isChecked() ? "2"
                    : di.w218a.isChecked() ? "3"
                    : di.w218a.isChecked() ? "4"
                    : di.w218a.isChecked() ? "5"
                    : di.w218a.isChecked() ? "6"
                    : "-1");

            lst_w19.add(di.w219a.isChecked() ? "1" + "_" + mult_w19
                    : di.w219b.isChecked() ? "2" + "_" + mult_w19
                    : "-1" + "_" + mult_w19);

            int year_21 = 0;
            int month_21 = 0;
            int days_21 = 0;

            if (di.w221y.getText().toString().trim().length() > 0) {
                if (di.w221y.getText().toString().equals("98")) {
                    year_21 = 00;
                } else {
                    year_21 = Integer.parseInt(di.w221y.getText().toString().trim()) * 365;
                }
            }


            if (di.w221m.getText().toString().trim().length() > 0) {
                if (di.w221m.getText().toString().equals("98")) {
                    month_21 = 00;
                } else {
                    month_21 = Integer.parseInt(di.w221m.getText().toString().trim()) * 30;
                }
            }

            if (di.w221d.getText().toString().trim().length() > 0) {
                if (di.w221d.getText().toString().equals("98")) {
                    days_21 = 00;
                } else {
                    days_21 = Integer.parseInt(di.w221d.getText().toString().trim()) * 1;
                }
            }


            days_21 = days_21 + month_21 + year_21;


            int year_22 = 0;
            int month_22 = 0;
            int days_22 = 0;

            if (di.w222y.getText().toString().trim().length() > 0) {
                if (di.w222y.getText().toString().equals("98")) {
                    year_21 = 00;
                } else {
                    year_21 = Integer.parseInt(di.w222y.getText().toString().trim()) * 365;
                }
            }


            if (di.w222m.getText().toString().trim().length() > 0) {
                if (di.w222m.getText().toString().equals("98")) {
                    month_21 = 00;
                } else {
                    month_21 = Integer.parseInt(di.w222m.getText().toString().trim()) * 30;
                }
            }

            if (di.w222d.getText().toString().trim().length() > 0) {
                if (di.w222d.getText().toString().equals("98")) {
                    days_21 = 00;
                } else {
                    days_21 = Integer.parseInt(di.w222d.getText().toString().trim()) * 1;
                }
            }

            days_22 = days_22 + month_22 + year_22;

            lst_w21.add(days_21 + "_" + mult_w21);
            lst_w22.add(days_22 + "_" + mult_w22);


            int number_preg = Integer.parseInt(bi.w215.getText().toString());

            if (lst_w17.size() < number_preg) {
                bi.btnNext.setText("Add Next Pregnancy No:(" + lst_w17.size() + ")");
            } else {
                bi.btnNext.setText("Next Section");
            }

            b.cancel();
        });


        di.w218.setOnCheckedChangeListener((radioGroup, i) -> {
            if (i == di.w218a.getId() || i == di.w218b.getId()) {
                ClearAllcontrol.ClearAll(di.cvw219);
                ClearAllcontrol.ClearAll(di.cvw221);
                ClearAllcontrol.ClearAll(di.cvw222);
                di.cvw219.setVisibility(View.GONE);
                di.cvw221.setVisibility(View.GONE);
                di.cvw222.setVisibility(View.GONE);
                di.addPregnancy.setVisibility(View.VISIBLE);
                di.addChild.setVisibility(View.GONE);
            } else {
                di.cvw219.setVisibility(View.VISIBLE);
                di.cvw221.setVisibility(View.VISIBLE);
                di.cvw222.setVisibility(View.VISIBLE);
                di.addPregnancy.setVisibility(View.GONE);
                di.addChild.setVisibility(View.VISIBLE);
            }
        });


        di.w219.setOnCheckedChangeListener((radioGroup, i) -> {
            ClearAllcontrol.ClearAll(di.cvw221);
            ClearAllcontrol.ClearAll(di.cvw222);
            di.cvw221.setVisibility(View.GONE);
            di.cvw222.setVisibility(View.GONE);
            if (i == di.w219a.getId()) {
                di.cvw221.setVisibility(View.VISIBLE);
            } else if (i == di.w219b.getId()) {
                di.cvw222.setVisibility(View.VISIBLE);
            }
        });

        b.show();

    }

    boolean validateField() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    void value_assignment() {
        W201d = bi.w201d.getText().toString().length() > 0 ? bi.w201d.getText().toString() : "-1";
        W201m = bi.w201m.getText().toString().length() > 0 ? bi.w201m.getText().toString() : "-1";
        W201y = bi.w201y.getText().toString().length() > 0 ? bi.w201y.getText().toString() : "-1";
        W202 = bi.w202.getText().toString().length() > 0 ? bi.w202.getText().toString() : "-1";
        W203 = bi.w203a.isChecked() ? "1" : bi.w203b.isChecked() ? "2" : "-1";
        W204 = bi.w204a.isChecked() ? "1" : bi.w204b.isChecked() ? "2" : "-1";
        W205 = bi.w205a.isChecked() ? "1" : bi.w205b.isChecked() ? "2" : "-1";
        W206 = bi.w206.getText().toString().length() > 0 ? bi.w206.getText().toString() : "-1";
        W207 = bi.w207a.isChecked() ? "1" : bi.w207b.isChecked() ? "2" : "-1";
        W208 = bi.w208a.isChecked() ? "1" : bi.w208b.isChecked() ? "2" : "-1";
        W209 = bi.w209a.isChecked() ? "1" : bi.w209b.isChecked() ? "2" : "-1";
        W210a = bi.w210a.isChecked() ? "1" : "-1";
        W210b = bi.w210b.isChecked() ? "2" : "-1";
        W210c = bi.w210c.isChecked() ? "3" : "-1";
        W21098 = bi.w21098.isChecked() ? "98" : "-1";
        W21099 = bi.w21099.isChecked() ? "99" : "-1";
        W211 = bi.w211.getText().toString().length() > 0 ? bi.w211.getText().toString() : "-1";
        W212 = bi.w212.getText().toString().length() > 0 ? bi.w212.getText().toString() : "-1";
        W213 = bi.w213.getText().toString().length() > 0 ? bi.w213.getText().toString() : "-1";
        W214 = bi.w214.getText().toString().length() > 0 ? bi.w214.getText().toString() : "-1";
        W215 = bi.w215.getText().toString().length() > 0 ? bi.w215.getText().toString() : "-1";
    }


    void insert_data() {

        String query = "insert into w204_w215("

                + w204_w215.study_id + "," +
                w204_w215.W201_d + "," +
                w204_w215.W201_m + "," +
                w204_w215.W201_y + "," +
                w204_w215.W202 + "," +
                w204_w215.W203 + "," +
                w204_w215.W204 + "," +
                w204_w215.W205 + "," +
                w204_w215.W206 + "," +
                w204_w215.W207 + "," +
                w204_w215.W208 + "," +
                w204_w215.W209 + "," +
                w204_w215.W210_1 + "," +
                w204_w215.W210_2 + "," +
                w204_w215.W210_3 + "," +
                w204_w215.W210_4 + "," +
                w204_w215.W210_5 + "," +
                w204_w215.W211 + "," +
                w204_w215.W212 + "," +
                w204_w215.W213 + "," +
                w204_w215.W214 + "," +
                w204_w215.W215 + ")" +


                " values ('" +
                study_id + "','" +
                W201d + "','" +
                W201m + "','" +
                W201y + "','" +
                W202 + "','" +
                W203 + "','" +
                W204 + "','" +
                W205 + "','" +
                W206 + "','" +
                W207 + "','" +
                W208 + "','" +
                W209 + "','" +
                W210a + "','" +
                W210b + "','" +
                W210c + "','" +
                W21098 + "','" +
                W21099 + "','" +
                W211 + "','" +
                W212 + "','" +
                W213 + "','" +
                W214 + "','" +
                W215 + "')";


        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(this, "1st TABLE SAVED Successfully", Toast.LENGTH_SHORT).show();

    }

    void insert_w216_w222() {


        w17 = "-1";
        w18 = "-1";
        w19 = "-1";
        w21 = "-1";
        w22 = "-1";


        for (int i = 0; i < lst_w17.size(); i++) {

            w17 = lst_w17.get(i);
            w18 = lst_w18.get(i);
            w19 = lst_w19.get(i);
            w21 = lst_w21.get(i);
            w22 = lst_w22.get(i);


            String query = "insert into w216_w222(" +

                    w216_w222.study_id + "," +
                    w216_w222.W17 + "," +
                    w216_w222.W18 + "," +
                    w216_w222.W19 + "," +
                    w216_w222.W21 + "," +
                    w216_w222.W22 + ")" +

                    " values ('" +
                    study_id + "','" +

                    w17 + "','" +
                    w18 + "','" +
                    w19 + "','" +
                    w21 + "','" +
                    w22 + "')";


            query = String.format(query);

            LocalDataManager Lm = new LocalDataManager(this);

            LocalDataManager.database.execSQL(query);

            Toast.makeText(this, "2nd TABLE SAVED Successfully", Toast.LENGTH_SHORT).show();

        }

    }


    public void btnContinue() {
        if (!validateField()) return;

        int number_preg = 0;

        if (bi.w211.getText().toString().length() > 0) {
            number_preg = Integer.parseInt(bi.w211.getText().toString());
        }

        if (bi.w208a.isChecked()) {
            number_preg = number_preg - 1;
        }

        if (lst_w17.size() < number_preg) {
            show_dailuge();
            return;
        }

        this.value_assignment();
        this.insert_data();
        this.insert_w216_w222();

            /*if (section.equals("C3001_C3011")) {

                Intent c = new Intent(this, edu.aku.abdulsajid.VASMonitring.C.C3001_C3011.class);
                c.putExtra("study_id", study_id);
                startActivity(c);

            } else if (section.equals("C3012_C3022")) {

                Intent c = new Intent(this, edu.aku.abdulsajid.VASMonitring.C.C3012_C3022.class);
                c.putExtra("study_id", study_id);
                startActivity(c);

            } else if (section.equals("N2001_N2011")) {

                Intent c = new Intent(this, edu.aku.abdulsajid.VASMonitring.N.N2001_N2011.class);
                c.putExtra("study_id", study_id);
                startActivity(c);

            } else {

                Intent c = new Intent(this, edu.aku.abdulsajid.VASMonitring.A.A4001_A4014.class);
                c.putExtra("study_id", study_id);
                startActivity(c);
            }*/


        DBHelper db = new DBHelper(this);
        Cursor res = db.getData("Q1101_Q1610", study_id);

        if (res.getCount() > 0) {
            res.moveToFirst();
            if (Integer.valueOf(res.getString(res.getColumnIndex("Q1609"))).equals(1)) {
                Intent c = new Intent(this, SectionN01Activity.class);
                c.putExtra("study_id", study_id);
                startActivity(c);
            } else if (Integer.valueOf(res.getString(res.getColumnIndex("Q1609"))).equals(2)) {
                Intent c = new Intent(this, C3001_C3011.class);
                c.putExtra("study_id", study_id);
                startActivity(c);
            } else if (Integer.valueOf(res.getString(res.getColumnIndex("Q1609"))).equals(3) ||
                    Integer.valueOf(res.getString(res.getColumnIndex("Q1609"))).equals(4)) {

                Intent c = new Intent(this, C3012_C3022.class);
                c.putExtra("study_id", study_id);
                startActivity(c);

            } else if (Integer.valueOf(res.getString(res.getColumnIndex("Q1609"))).equals(5)) {

                Intent c = new Intent(this, SectionA01Activity.class);
                c.putExtra("study_id", study_id);
                startActivity(c);
            }
        }
    }


    @Override
    public void onBackPressed() {
        globale.interviewExit(this, this, study_id, currentSection = 20);
    }


}