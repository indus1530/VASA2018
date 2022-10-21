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
import edu.aku.abdulsajid.vasa2018.databinding.N2001N2011Binding;
import edu.aku.abdulsajid.vasa2018.utils.ClearAllcontrol;

public class N2001_N2011 extends AppCompatActivity {

    N2001N2011Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.n2001__n2011);
        bi.setCallback(this);
        this.setTitle(getString(R.string.h_n_sec_2_1));
        SetContentUI();
    }

    private void SetContentUI() {

        bi.edStudyId.setText(getIntent().getExtras().getString("study_id"));
        bi.edStudyId.setEnabled(false);

        bi.n2001.setOnCheckedChangeListener((radioGroup, i) -> {
            if (i != bi.n2001a.getId()) bi.n2002.clearCheck();
        });

        bi.n2003.setOnCheckedChangeListener((radioGroup, i) -> {
            if (i == bi.n2003a.getId()) ClearAllcontrol.ClearAll(bi.llN2004N2005);
        });

    }

    public void BtnContinue() {
        if (!validateField()) return;
        if (SaveData()) {
            finish();
            startActivity(new Intent(this, N2012_N2016.class)
                    .putExtra("study_id", bi.edStudyId.getText().toString()));
        } else {
            Toast.makeText(this, "Can't add edu.aku.abdulsajid.VASMonitring.data!!", Toast.LENGTH_SHORT).show();
        }
    }

    public boolean SaveData() {

        edu.aku.abdulsajid.vasa2018.DataTables.N.N2001_N2011 n2001 = new edu.aku.abdulsajid.vasa2018.DataTables.N.N2001_N2011();

        n2001.setN2001(bi.n2001a.isChecked() ? "1"
                : bi.n2001b.isChecked() ? "2"
                : bi.n200198.isChecked() ? "98"
                : bi.n200199.isChecked() ? "99"
                : "-1");

        n2001.setN2002(bi.n2002a.isChecked() ? "1"
                : bi.n2002b.isChecked() ? "2"
                : bi.n200298.isChecked() ? "98"
                : bi.n200299.isChecked() ? "99"
                : "-1");

        n2001.setN2003(bi.n2003a.isChecked() ? "1"
                : bi.n2003b.isChecked() ? "2"
                : bi.n200398.isChecked() ? "98"
                : bi.n200399.isChecked() ? "99"
                : "-1");

        n2001.setN2004(bi.n2004a.isChecked() ? "1"
                : bi.n2004b.isChecked() ? "2"
                : bi.n2004c.isChecked() ? "3"
                : bi.n200498.isChecked() ? "98"
                : bi.n200499.isChecked() ? "99"
                : "-1");

        n2001.setN2005u(bi.n2005d.isChecked() ? "1"
                : bi.n2005w.isChecked() ? "2"
                : bi.n2005m.isChecked() ? "3"
                : bi.n200598.isChecked() ? "98"
                : bi.n200599.isChecked() ? "99"
                : "-1");

        n2001.setN2005d(bi.n2005d.getText().toString().trim().length() > 0 ? bi.n2005d.getText().toString() : "-1");
        n2001.setN2005w(bi.n2005w.getText().toString().trim().length() > 0 ? bi.n2005w.getText().toString() : "-1");
        n2001.setN2005m(bi.n2005m.getText().toString().trim().length() > 0 ? bi.n2005m.getText().toString() : "-1");

        n2001.setN2006(bi.n2006a.isChecked() ? "1"
                : bi.n2006b.isChecked() ? "2"
                : bi.n2006c.isChecked() ? "3"
                : bi.n2006d.isChecked() ? "4"
                : bi.n2006e.isChecked() ? "5"
                : bi.n2006f.isChecked() ? "6"
                : bi.n2006g.isChecked() ? "7"
                : bi.n2006h.isChecked() ? "8"
                : bi.n2006i.isChecked() ? "9"
                : bi.n2006j.isChecked() ? "10"
                : bi.n2006k.isChecked() ? "11"
                : bi.n200696.isChecked() ? "96"
                : bi.n200698.isChecked() ? "98"
                : bi.n200699.isChecked() ? "99"
                : "-1");

        n2001.setN2006x(bi.n2006f.isChecked() ? bi.n2006fx.getText().toString()
                : bi.n2006j.isChecked() ? bi.n2006jx.getText().toString()
                : bi.n200696.isChecked() ? bi.n200696x.getText().toString()
                : "-1");


        n2001.setN2008(bi.n2008a.isChecked() ? "1"
                : bi.n2008b.isChecked() ? "2"
                : bi.n2008c.isChecked() ? "3"
                : bi.n2008d.isChecked() ? "4"
                : bi.n2008e.isChecked() ? "5"
                : bi.n2008f.isChecked() ? "6"
                : bi.n2008g.isChecked() ? "7"
                : bi.n200896.isChecked() ? "96"
                : bi.n200898.isChecked() ? "98"
                : "-1");

        n2001.setN2008x(bi.n200896x.getText().toString().trim().length() > 0 ? bi.n200896x.getText().toString() : "-1");

        n2001.setN2009_1(bi.n2009aa.isChecked() ? "1"
                : bi.n2009ab.isChecked() ? "2"
                : bi.n2009a98.isChecked() ? "98"
                : bi.n2009a99.isChecked() ? "99"
                : "-1");

        n2001.setN2009_2(bi.n2009ba.isChecked() ? "1"
                : bi.n2009bb.isChecked() ? "2"
                : bi.n2009b98.isChecked() ? "98"
                : bi.n2009b99.isChecked() ? "99"
                : "-1");

        n2001.setN2009_3(bi.n2009ca.isChecked() ? "1"
                : bi.n2009cb.isChecked() ? "2"
                : bi.n2009c98.isChecked() ? "98"
                : bi.n2009c99.isChecked() ? "99"
                : "-1");

        n2001.setN2009_4(bi.n2009da.isChecked() ? "1"
                : bi.n2009db.isChecked() ? "2"
                : bi.n2009d98.isChecked() ? "98"
                : bi.n2009d99.isChecked() ? "99"
                : "-1");

        n2001.setN2010(bi.n2010.getText().toString().trim().length() > 0 ? bi.n2010.getText().toString() : "-1");

        n2001.setN2011(bi.n2011a.isChecked() ? "1"
                : bi.n2011b.isChecked() ? "2"
                : "-1");

        n2001.setSTUDYID(bi.edStudyId.getText().toString());


        DBHelper db = new DBHelper(this);
        Long row = db.add_N2001(n2001);

        return row != 0;
    }


    public Boolean validateField() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    @Override
    public void onBackPressed() {
        globale.interviewExit(this, this, bi.edStudyId.getText().toString(), 2);
    }

}