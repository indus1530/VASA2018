package edu.aku.abdulsajid.vasa2018.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

import edu.aku.abdulsajid.vasa2018.Other.globale;
import edu.aku.abdulsajid.vasa2018.R;
import edu.aku.abdulsajid.vasa2018.data.DBHelper;
import edu.aku.abdulsajid.vasa2018.databinding.N2251N2260Binding;
import edu.aku.abdulsajid.vasa2018.utils.ClearAllcontrol;
import edu.aku.abdulsajid.vasa2018.utils.Gothrough;
import edu.aku.abdulsajid.vasa2018.utils.ValidateDate;

public class N2251_N2260 extends AppCompatActivity {

    N2251N2260Binding bi;
    String dtToday = new SimpleDateFormat("dd/MM/yyyy HH:mm").format(new Date().getTime());
    ValidateDate val_n22551, val_n22552, val_n2256;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.n2251__n2260);
        bi.setCallback(this);

        val_n22551 = new ValidateDate();
        val_n22552 = new ValidateDate();
        val_n2256 = new ValidateDate();

        this.setTitle(getString(R.string.h_n_sec_11));

        SetContentUI();

    }

    private void SetContentUI() {

        bi.edStudyId.setText(getIntent().getExtras().getString("study_id"));
        bi.edStudyId.setEnabled(false);

        //Initializing datepickers

       /* bi.edN22551.setManager(getSupportFragmentManager());
        bi.edN22551.setMaxDate(dtToday);

        bi.edN22552.setManager(getSupportFragmentManager());
        bi.edN22552.setMaxDate(dtToday);

        bi.edN2256.setManager(getSupportFragmentManager());
        bi.edN2256.setMaxDate(dtToday);*/

        bi.rgN2251.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN22511.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2252N2252); //ll_N2252_N2252
                }
            }
        });

        bi.rgN2253.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN22531.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2254N2258);
                }
            }
        });

        bi.rgN2254.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN22542.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2255N2258);
                }
            }
        });

        val_n22551.ValDate(bi.edN22551);
        val_n22552.ValDate(bi.edN22552);
        val_n2256.ValDate(bi.edN2256);

    }

    public void BtnContinue() {
        if (validateField()) {
            if (SaveData()) {
                finish();
                startActivity(new Intent(this, N2271_N2284.class)
                        .putExtra("study_id", bi.edStudyId.getText().toString()));
            } else {
                Toast.makeText(this, "Can't add edu.aku.abdulsajid.VASMonitring.data!!", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_SHORT).show();
        }
    }

    public boolean SaveData() {

        edu.aku.abdulsajid.vasa2018.DataTables.N.N2251_N2260 n2251 = new edu.aku.abdulsajid.vasa2018.DataTables.N.N2251_N2260();

        n2251.setN2251(bi.rbN22511.isChecked() ? "1" : bi.rbN22512.isChecked() ? "2" : bi.rbN2251DK.isChecked() ? "9"
                : bi.rbN2251RA.isChecked() ? "8" : "-1");
        n2251.setN22521(bi.rbN225211.isChecked() ? "1" : bi.rbN225212.isChecked() ? "2" : bi.rbN22521DK.isChecked() ? "9"
                : bi.rbN22521RA.isChecked() ? "8" : "-1");
        n2251.setN22522(bi.rbN225221.isChecked() ? "1" : bi.rbN225222.isChecked() ? "2" : bi.rbN22522DK.isChecked() ? "9"
                : bi.rbN22522RA.isChecked() ? "8" : "-1");
        n2251.setN22523(bi.rbN225231.isChecked() ? "1" : bi.rbN225232.isChecked() ? "2" : bi.rbN22523DK.isChecked() ? "9"
                : bi.rbN22523RA.isChecked() ? "8" : "-1");
        n2251.setN22524(bi.rbN225241.isChecked() ? "1" : bi.rbN225242.isChecked() ? "2" : bi.rbN22524DK.isChecked() ? "9"
                : bi.rbN22524RA.isChecked() ? "8" : "-1");
        n2251.setN22525(bi.rbN225251.isChecked() ? "1" : bi.rbN225252.isChecked() ? "2" : bi.rbN22525DK.isChecked() ? "9"
                : bi.rbN22525RA.isChecked() ? "8" : "-1");
        n2251.setN22526(bi.rbN225261.isChecked() ? "1" : bi.rbN225262.isChecked() ? "2" : bi.rbN22526DK.isChecked() ? "9"
                : bi.rbN22526RA.isChecked() ? "8" : "-1");
        n2251.setN22527(bi.rbN225271.isChecked() ? "1" : bi.rbN225272.isChecked() ? "2" : bi.rbN22527DK.isChecked() ? "9"
                : bi.rbN22527RA.isChecked() ? "8" : "-1");
        n2251.setN2253(bi.rbN22531.isChecked() ? "1" : bi.rbN22532.isChecked() ? "2" : bi.rbN2253DK.isChecked() ? "9"
                : bi.rbN2253RA.isChecked() ? "8" : "-1");
        n2251.setN2254(bi.rbN22541.isChecked() ? "1" : bi.rbN22542.isChecked() ? "2" : "-1");
        n2251.setN22551check(bi.rbN22551check1.isChecked() ? "1" : bi.rbN22551check2.isChecked() ? "2" : "-1");
        n2251.setN22551(bi.edN22551.getText().toString().trim().length() > 0 ? bi.edN22551.getText().toString() : "-1");
        n2251.setN22552check(bi.rbN22552check1.isChecked() ? "1" : bi.rbN22552check2.isChecked() ? "2" : "-1");
        n2251.setN22552(bi.edN22552.getText().toString().trim().length() > 0 ? bi.edN22552.getText().toString() : "-1");
        n2251.setN2256(bi.edN2256.getText().toString().trim().length() > 0 ? bi.edN2256.getText().toString() : "-1");
        n2251.setN2257(bi.edN2257.getText().toString().trim().length() > 0 ? bi.edN2257.getText().toString() : "-1");
        n2251.setN2258(bi.edN2258.getText().toString().trim().length() > 0 ? bi.edN2258.getText().toString() : "-1");
        n2251.setN2259(bi.rbN22591.isChecked() ? "1" : bi.rbN22592.isChecked() ? "2" : bi.rbN2259DK.isChecked() ? "9"
                : bi.rbN2259RA.isChecked() ? "8" : "-1");
        n2251.setN2260(bi.edN2260.getText().toString().trim().length() > 0 ? bi.edN2260.getText().toString() : "-1");

        n2251.setSTUDYID(bi.edStudyId.getText().toString());
        DBHelper db = new DBHelper(this);
        Long row = db.add_N2251(n2251);

        return row != 0;
    }

    public Boolean validateField() {

        //ll_N2251
        if (!Gothrough.IamHiden(bi.llN2251)) {
            return false;
        }

        if (bi.rbN22511.isChecked()) {
            //ll_N2252_1
            if (!Gothrough.IamHiden(bi.llN22521)) {
                return false;
            }
            //ll_N2252_2
            if (!Gothrough.IamHiden(bi.llN22522)) {
                return false;
            }
            //ll_N2252_3
            if (!Gothrough.IamHiden(bi.llN22523)) {
                return false;
            }
            //ll_N2252_4
            if (!Gothrough.IamHiden(bi.llN22524)) {
                return false;
            }
            //ll_N2252_5
            if (!Gothrough.IamHiden(bi.llN22525)) {
                return false;
            }
            //ll_N2252_6
            if (!Gothrough.IamHiden(bi.llN22526)) {
                return false;
            }
            //ll_N2252_7
            if (!Gothrough.IamHiden(bi.llN22527)) {
                return false;
            }
        }

        //ll_N2253
        if (!Gothrough.IamHiden(bi.llN2253)) {
            return false;
        }

        if (bi.rbN22531.isChecked()) {
            //ll_N2254
            if (!Gothrough.IamHiden(bi.llN2254)) {
                return false;
            }

            if (bi.rbN22541.isChecked()) {
                //ll_N2255_1check
                if (!Gothrough.IamHiden(bi.llN22551check)) {
                    return false;
                }

                if (bi.rbN22551check1.isChecked()) {
                    //ll_N2255_1
                    if (!Gothrough.IamHiden(bi.llN22551)) {
                        return false;
                    }
                    if (!val_n22551.ValFlag() || !val_n22551.TextLen()) {
                        Toast.makeText(this, "Error: " + getString(R.string.txt_N2255_1), Toast.LENGTH_SHORT).show();
                        return false;
                    }
                }

                //ll_N2255_2check
                if (!Gothrough.IamHiden(bi.llN22552check)) {
                    return false;
                }

                if (bi.rbN22552check1.isChecked()) {
                    //ll_N2255_2
                    if (!Gothrough.IamHiden(bi.llN22552)) {
                        return false;
                    }
                    if (!val_n22552.ValFlag() || !val_n22552.TextLen()) {
                        Toast.makeText(this, "Error: " + getString(R.string.txt_N2255_2), Toast.LENGTH_SHORT).show();
                        return false;
                    }
                }

                //ll_N2256
                if (!Gothrough.IamHiden(bi.llN2256)) {
                    return false;
                }
                if (!val_n2256.ValFlag() || !val_n2256.TextLen()) {
                    Toast.makeText(this, "Error: " + getString(R.string.txt_N2256), Toast.LENGTH_SHORT).show();
                    return false;
                }

                //ll_N2257
                if (!Gothrough.IamHiden(bi.llN2257)) {
                    return false;
                }
                //ll_N2258
                if (!Gothrough.IamHiden(bi.llN2258)) {
                    return false;
                }
            }
        }

        //ll_N2259
        if (!Gothrough.IamHiden(bi.llN2259)) {
            return false;
        }

        if (bi.rbN22591.isChecked()) {
            //ll_N2260
            return Gothrough.IamHiden(bi.llN2260);
        }

        return true;
    }

    @Override
    public void onBackPressed() {
        globale.interviewExit(this, this, bi.edStudyId.getText().toString(), 14);
    }

}
