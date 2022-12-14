package edu.aku.abdulsajid.vasa2018.ui;

import static edu.aku.abdulsajid.vasa2018.ui.N2211_N2248_A.n2211A_ID;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import java.util.Collection;

import edu.aku.abdulsajid.vasa2018.DataTables.N.N2080_N2107;
import edu.aku.abdulsajid.vasa2018.DataTables.N.N2211_N2248_A_C;
import edu.aku.abdulsajid.vasa2018.DataTables.N.N2211_N2248_B;
import edu.aku.abdulsajid.vasa2018.Other.globale;
import edu.aku.abdulsajid.vasa2018.R;
import edu.aku.abdulsajid.vasa2018.data.DBHelper;
import edu.aku.abdulsajid.vasa2018.databinding.N2211N2248CBinding;
import edu.aku.abdulsajid.vasa2018.utils.ClearAllcontrol;

public class N2211_N2248_C extends AppCompatActivity {

    N2211N2248CBinding bi;
    boolean N2241Flag = true, flag_n2212 = true, flag_n2090 = true, flag_n2093 = true, flag_n2213 = false;
    int skip_flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.n2211__n2248_c);
        bi.setCallback(this);

        this.setTitle(getString(R.string.h_n_sec_10));

        GetDataFromDB();
        SetContentUI();

    }

    private void GetDataFromDB() {

        bi.edStudyId.setText(getIntent().getExtras().getString("study_id"));
        bi.edStudyId.setEnabled(false);

        DBHelper db = new DBHelper(this);

//        Inst_1
        Collection<N2211_N2248_B> col_n2211 = db.getSec10BData(bi.edStudyId.getText().toString(), n2211A_ID);
        for (N2211_N2248_B col_data : col_n2211) {
            if (col_data.getN22132A().equals("1")) {

                String n2090 = db.getSpecificData(edu.aku.abdulsajid.vasa2018.data.N.N2080_N2107.TABLE_NAME, bi.edStudyId.getText().toString(), N2080_N2107.sub_N2080_N2107.N2090);
                String n2093 = db.getSpecificData(edu.aku.abdulsajid.vasa2018.data.N.N2080_N2107.TABLE_NAME, bi.edStudyId.getText().toString(), N2080_N2107.sub_N2080_N2107.N2093);
                if (n2090 != null && n2093 != null) {
                    if (Integer.valueOf(n2090) != 1 &&
                            (Integer.valueOf(n2093) == 1 || Integer.valueOf(n2093) == 2 || Integer.valueOf(n2093) == 14 || Integer.valueOf(n2093) == 99)) {
                        flag_n2090 = false;
                        break;
                    } else {
                        flag_n2093 = false;
                        break;
                    }
                }

            }
        }

        if (flag_n2090 && flag_n2093) {

//        Inst_3
            String n2212 = db.getSpecificData(edu.aku.abdulsajid.vasa2018.data.N.N2211_N2248_A_C.TABLE_NAME, bi.edStudyId.getText().toString(), N2211_N2248_A_C.sub_N2211_N2248_A_C.N2212);
            if (n2212 != null) {
                if (Integer.valueOf(n2212) == 2) {
                    flag_n2212 = false;
                }
            }

//        Inst_4
            if (col_n2211 != null) {
                for (N2211_N2248_B col_data : col_n2211) {
                    /*if ((Integer.valueOf(col_data.getN2213()) > 0 && Integer.valueOf(col_data.getN2213()) <= 3)
                            || (Integer.valueOf(col_data.getN22132A()) == 1)) {
                        flag_n2213 = false;
                        break;
                    }
                    if (Integer.valueOf(col_data.getN2213()) <= 3
                            && Integer.valueOf(col_data.getN22132A()) != 1) {
                        flag_n2213 = false;
                        break;
                    }*/

                    if (Integer.valueOf(col_data.getN22132A()) == 1 || Integer.valueOf(col_data.getN2213()) > 3) {
                        flag_n2213 = true;
                        break;
                    }
                }
            }

        } else {
            flag_n2213 = true;
        }


    }

    private void SetContentUI() {

        bi.rgN2215.setOnCheckedChangeListener((radioGroup, i) -> {
            if (i != bi.rbN22151.getId()) {
                ClearAllcontrol.ClearAll(bi.llN2216); //ll_N2216
            }
        });

        /*bi.rgN2220.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN22202.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2238N2246); //ll_N2238_N2246
                    bi.llN2238N2246.setVisibility(View.GONE);
                } else if (i == bi.rbN22203.getId() || i == bi.rbN2220DK.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2221N2237A); //ll_N2221_N2237_A
                    ClearAllcontrol.ClearAll(bi.llN2221N2237B); //ll_N2221_N2237_B
                    bi.llN2221N2237A.setVisibility(View.GONE);
                    bi.llN2221N2237B.setVisibility(View.GONE);

                    bi.llN2238N2246.setVisibility(View.VISIBLE);
                } else {
                    bi.llN2238N2246.setVisibility(View.VISIBLE);
                    bi.llN2221N2237A.setVisibility(View.VISIBLE);
                    bi.llN2221N2237B.setVisibility(View.VISIBLE);
                }

            }
        });

        bi.rgN2219.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN221911.getId() || i != bi.rbN221917.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2222); //ll_N2222
                }


                if (i == bi.rbN221915.getId() || i == bi.rbN2219110.getId() || i == bi.rbN22191DK.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2241N2246); //ll_N2241_N2246
                    bi.llN2241N2246.setVisibility(View.GONE);

                    N2241Flag = false;
                } else {
                    bi.llN2241N2246.setVisibility(View.VISIBLE);

                    N2241Flag = true;
                }

            }
        });

        bi.rgN2223.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN22231.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2224); //ll_N2224

                    if (!bi.rbN22331.isChecked()) {
                        ClearAllcontrol.ClearAll(bi.llN2238N2240); //ll_N2238_N2240
                    }
                } else {
                    ClearAllcontrol.ClearAll(bi.llN2225N2225); //ll_N2225_N2225
                }
            }
        });

        bi.rgN2224.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN222415.getId() || i == bi.rbN2224110.getId() || i == bi.rbN22241DK.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2241N2246); //ll_N2241_N2246
                    bi.llN2241N2246.setVisibility(View.GONE);

                    N2241Flag = false;
                } else {
                    bi.llN2241N2246.setVisibility(View.VISIBLE);

                    N2241Flag = true;
                }
            }
        });

        bi.rgN2226.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN22262.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN22271N22372); //ll_N2227_1_N2237_2
                }
            }
        });

        bi.rgN2229.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN222911.getId() || i != bi.rbN222917.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2232); //ll_N2232
                }

                if (i == bi.rbN222915.getId() || i == bi.rbN2229110.getId() || i == bi.rbN22291DK.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2241N2246); //ll_N2241_N2246
                    bi.llN2241N2246.setVisibility(View.GONE);

                    N2241Flag = false;
                } else {
                    bi.llN2241N2246.setVisibility(View.VISIBLE);

                    N2241Flag = true;
                }
            }
        });

        bi.rgN2230.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN22301.getId() || i != bi.rbN22303.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN22231N2237); //ll_N22231_N2237
                }
            }
        });

        bi.rgN2233.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN22331.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2234); //ll_N2234

                    if (!bi.rbN22231.isChecked()) {
                        ClearAllcontrol.ClearAll(bi.llN2238N2240); //ll_N2238_N2240
                    }
                } else {
                    ClearAllcontrol.ClearAll(bi.llN2235N2235); //ll_N2235_N2235
                }
            }
        });

        bi.rgN2234.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN223415.getId() || i == bi.rbN2234110.getId() || i == bi.rbN22341DK.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2241N2246); //ll_N2241_N2246
                    bi.llN2241N2246.setVisibility(View.GONE);

                    N2241Flag = false;
                } else {
                    bi.llN2241N2246.setVisibility(View.VISIBLE);

                    N2241Flag = true;
                }
            }
        });

        bi.rgN2236.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN22362.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN22371N22372); //ll_N2237_1_N2237_2
                }
            }
        });

        bi.rgN2239.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN22391.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2240); //ll_N2240
                }
            }
        });

        bi.rgN2241.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN22411.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2242); //ll_N2242
                }
            }
        });


        CompoundButton.OnCheckedChangeListener cbx_2242 = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (bi.cbN2242Dk.isChecked()) {
                    bi.cbN22421.setChecked(false);
                    bi.cbN22421.setEnabled(false);
                    bi.cbN22422.setChecked(false);
                    bi.cbN22422.setEnabled(false);
                    bi.cbN22423.setChecked(false);
                    bi.cbN22423.setEnabled(false);
                    bi.cbN22424.setChecked(false);
                    bi.cbN22424.setEnabled(false);
                    bi.cbN22425.setChecked(false);
                    bi.cbN22425.setEnabled(false);
                    bi.cbN22426.setChecked(false);
                    bi.cbN22426.setEnabled(false);
                    bi.cbN22427.setChecked(false);
                    bi.cbN22427.setEnabled(false);
                } else {
                    bi.cbN22421.setEnabled(true);
                    bi.cbN22422.setEnabled(true);
                    bi.cbN22423.setEnabled(true);
                    bi.cbN22424.setEnabled(true);
                    bi.cbN22425.setEnabled(true);
                    bi.cbN22426.setEnabled(true);
                    bi.cbN22427.setEnabled(true);

                }

            }
        };

        bi.cbN22421.setOnCheckedChangeListener(cbx_2242);
        bi.cbN22422.setOnCheckedChangeListener(cbx_2242);
        bi.cbN22423.setOnCheckedChangeListener(cbx_2242);
        bi.cbN22424.setOnCheckedChangeListener(cbx_2242);
        bi.cbN22425.setOnCheckedChangeListener(cbx_2242);
        bi.cbN22426.setOnCheckedChangeListener(cbx_2242);
        bi.cbN22427.setOnCheckedChangeListener(cbx_2242);
        bi.cbN2242Dk.setOnCheckedChangeListener(cbx_2242);


        CompoundButton.OnCheckedChangeListener cbx_2243 = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (bi.cbN2243DK.isChecked()) {
                    bi.cbN22431.setChecked(false);
                    bi.cbN22431.setEnabled(false);
                    bi.cbN22432.setChecked(false);
                    bi.cbN22432.setEnabled(false);
                    bi.cbN22433.setChecked(false);
                    bi.cbN22433.setEnabled(false);
                    bi.cbN22434.setChecked(false);
                    bi.cbN22434.setEnabled(false);
                    bi.cbN22435.setChecked(false);
                    bi.cbN22435.setEnabled(false);
                    bi.cbN22436.setChecked(false);
                    bi.cbN22436.setEnabled(false);
                    bi.cbN22437.setChecked(false);
                    bi.cbN22437.setEnabled(false);
                } else {
                    bi.cbN22431.setEnabled(true);
                    bi.cbN22432.setEnabled(true);
                    bi.cbN22433.setEnabled(true);
                    bi.cbN22434.setEnabled(true);
                    bi.cbN22435.setEnabled(true);
                    bi.cbN22436.setEnabled(true);
                    bi.cbN22437.setEnabled(true);

                }

            }
        };

        bi.cbN22431.setOnCheckedChangeListener(cbx_2243);
        bi.cbN22432.setOnCheckedChangeListener(cbx_2243);
        bi.cbN22433.setOnCheckedChangeListener(cbx_2243);
        bi.cbN22434.setOnCheckedChangeListener(cbx_2243);
        bi.cbN22435.setOnCheckedChangeListener(cbx_2243);
        bi.cbN22436.setOnCheckedChangeListener(cbx_2243);
        bi.cbN22437.setOnCheckedChangeListener(cbx_2243);
        bi.cbN2243DK.setOnCheckedChangeListener(cbx_2243);

        CompoundButton.OnCheckedChangeListener cbx_2240 = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (bi.cbN2240DK.isChecked()) {
                    bi.cbN22401.setChecked(false);
                    bi.cbN22401.setEnabled(false);
                    bi.cbN22402.setChecked(false);
                    bi.cbN22402.setEnabled(false);
                    bi.cbN22403.setChecked(false);
                    bi.cbN22403.setEnabled(false);
                    bi.cbN22404.setChecked(false);
                    bi.cbN22404.setEnabled(false);
                    bi.cbN22405.setChecked(false);
                    bi.cbN22405.setEnabled(false);
                    bi.cbN22406.setChecked(false);
                    bi.cbN22406.setEnabled(false);
                    bi.cbN22407.setChecked(false);
                    bi.cbN22407.setEnabled(false);
                    bi.cbN22408.setChecked(false);
                    bi.cbN22408.setEnabled(false);
                    bi.cbN22409.setChecked(false);
                    bi.cbN22409.setEnabled(false);
                    bi.cbN224010.setChecked(false);
                    bi.cbN224010.setEnabled(false);
                    bi.cbN224011.setChecked(false);
                    bi.cbN224011.setEnabled(false);
                    bi.cbN224012.setChecked(false);
                    bi.cbN224012.setEnabled(false);
                    bi.cbN224013.setChecked(false);
                    bi.cbN224013.setEnabled(false);
                    bi.cbN224014.setChecked(false);
                    bi.cbN224014.setEnabled(false);
                    bi.cbN224015.setChecked(false);
                    bi.cbN224015.setEnabled(false);
                    bi.cbN2240OT.setChecked(false);
                    bi.cbN2240OT.setEnabled(false);
                } else {
                    bi.cbN22401.setEnabled(true);
                    bi.cbN22402.setEnabled(true);
                    bi.cbN22403.setEnabled(true);
                    bi.cbN22404.setEnabled(true);
                    bi.cbN22405.setEnabled(true);
                    bi.cbN22406.setEnabled(true);
                    bi.cbN22407.setEnabled(true);
                    bi.cbN22408.setEnabled(true);
                    bi.cbN22409.setEnabled(true);
                    bi.cbN224010.setEnabled(true);
                    bi.cbN224011.setEnabled(true);
                    bi.cbN224012.setEnabled(true);
                    bi.cbN224013.setEnabled(true);
                    bi.cbN224014.setEnabled(true);
                    bi.cbN224015.setEnabled(true);
                    bi.cbN2240OT.setEnabled(true);

                }

            }
        };

        bi.cbN22401.setOnCheckedChangeListener(cbx_2240);
        bi.cbN22402.setOnCheckedChangeListener(cbx_2240);
        bi.cbN22403.setOnCheckedChangeListener(cbx_2240);
        bi.cbN22404.setOnCheckedChangeListener(cbx_2240);
        bi.cbN22405.setOnCheckedChangeListener(cbx_2240);
        bi.cbN22406.setOnCheckedChangeListener(cbx_2240);
        bi.cbN22407.setOnCheckedChangeListener(cbx_2240);
        bi.cbN22408.setOnCheckedChangeListener(cbx_2240);
        bi.cbN22409.setOnCheckedChangeListener(cbx_2240);
        bi.cbN224010.setOnCheckedChangeListener(cbx_2240);
        bi.cbN224011.setOnCheckedChangeListener(cbx_2240);
        bi.cbN224012.setOnCheckedChangeListener(cbx_2240);
        bi.cbN224013.setOnCheckedChangeListener(cbx_2240);
        bi.cbN224014.setOnCheckedChangeListener(cbx_2240);
        bi.cbN224015.setOnCheckedChangeListener(cbx_2240);
        bi.cbN2240OT.setOnCheckedChangeListener(cbx_2240);
        bi.cbN2240DK.setOnCheckedChangeListener(cbx_2240);

        // Get intent
        skip_flag = getIntent().getIntExtra("valFlag", 0);

        if (skip_flag == 2) {
            ClearAllcontrol.ClearAll(bi.llN2214); //ll_N2214
            bi.llN2214.setVisibility(View.GONE);
        } else if (skip_flag == 9) {
            ClearAllcontrol.ClearAll(bi.llN22214N2247); //ll_N22214_N2247
            bi.llN22214N2247.setVisibility(View.GONE);
        }

        //conditions
        if (!flag_n2212) {
            ClearAllcontrol.ClearAll(bi.llN22217N2248A); //ll_N22217_N2248_A
            bi.llN22217N2248A.setVisibility(View.GONE);
            ClearAllcontrol.ClearAll(bi.llN22217N2248B); //ll_N22217_N2248_B
            bi.llN22217N2248B.setVisibility(View.GONE);

            ClearAllcontrol.ClearAll(bi.llN2248); //ll_N2248
            bi.llN2248.setVisibility(View.GONE);
        }

        if (!flag_n2213) {
            ClearAllcontrol.ClearAll(bi.llN2214); //ll_N2214
            bi.llN2214.setVisibility(View.GONE);

            ClearAllcontrol.ClearAll(bi.llN22217N2246A); //ll_N22217_N2246_A
            bi.llN22217N2246A.setVisibility(View.GONE);
            ClearAllcontrol.ClearAll(bi.llN22217N2246B); //ll_N22217_N2246B
            bi.llN22217N2246B.setVisibility(View.GONE);
        }*/

        if (!flag_n2090 || !flag_n2093) {
            ClearAllcontrol.ClearAll(bi.llN22214N2218A); //ll_N22214_N2218_A
            ClearAllcontrol.ClearAll(bi.llN22214N2218B); //ll_N22214_N2218_B

            bi.llN22214N2218A.setVisibility(View.GONE);
            bi.llN22214N2218B.setVisibility(View.GONE);
        }

        if (!flag_n2093) {
            ClearAllcontrol.ClearAll(bi.llN22214N2223A); //ll_N22214_N2223_A
            ClearAllcontrol.ClearAll(bi.llN22214N2223B); //ll_N22214_N2223_B

            bi.llN22214N2223A.setVisibility(View.GONE);
            bi.llN22214N2223B.setVisibility(View.GONE);
        }

    }

    public void BtnContinue() {
        if (validateField()) {
            if (SaveData()) {
                finish();
                startActivity(new Intent(this, flag_n2212 || flag_n2213 ? N2251_N2260.class : N2271_N2284.class)
                        .putExtra("study_id", bi.edStudyId.getText().toString()));
            } else {
                Toast.makeText(this, "Can't add edu.aku.abdulsajid.VASMonitring.data!!", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_SHORT).show();
        }
    }

    public boolean SaveData() {

        N2211_N2248_A_C n2211C = new N2211_N2248_A_C();

        n2211C.setN2214(bi.rbN22141.isChecked() ? "1" : bi.rbN22142.isChecked() ? "2" : bi.rbN22143.isChecked() ? "3" : bi.rbN22144.isChecked() ? "4"
                : bi.rbN22145.isChecked() ? "5" : bi.rbN2214OT.isChecked() ? "6" : bi.rbN2214DK.isChecked() ? "9" : "-1");
        n2211C.setN2214x(bi.edN2214OT.getText().toString().trim().length() > 0 ? bi.edN2214OT.getText().toString() : "-1");

        n2211C.setN2215(bi.rbN22151.isChecked() ? "1" : bi.rbN22152.isChecked() ? "2" : bi.rbN2215DK.isChecked() ? "9" : "-1");

        n2211C.setN22161(bi.cbN22161.isChecked() ? "1" : "-1");
        n2211C.setN22162(bi.cbN22162.isChecked() ? "2" : "-1");
        n2211C.setN22163(bi.cbN22163.isChecked() ? "3" : "-1");
        n2211C.setN22164(bi.cbN22164.isChecked() ? "4" : "-1");
        n2211C.setN22164x(bi.edN22164.getText().toString().trim().length() > 0 ? bi.edN22164.getText().toString() : "-1");
        n2211C.setN22165(bi.cbN22165.isChecked() ? "5" : "-1");
        n2211C.setN22166(bi.cbN22166.isChecked() ? "6" : "-1");
        n2211C.setN22167(bi.cbN22167.isChecked() ? "7" : "-1");
        n2211C.setN22168(bi.cbN22168.isChecked() ? "8" : "-1");
        n2211C.setN22169(bi.cbN22169.isChecked() ? "9" : "-1");
        n2211C.setN221610(bi.cbN221610.isChecked() ? "10" : "-1");
        n2211C.setN221611(bi.cbN221611.isChecked() ? "11" : "-1");
        n2211C.setN221612(bi.cbN221612.isChecked() ? "12" : "-1");
        n2211C.setN2216Ot(bi.cbN2216OT.isChecked() ? "13" : "-1");
        n2211C.setN2216OTx(bi.edN2216OT.getText().toString().trim().length() > 0 ? bi.edN2216OT.getText().toString() : "-1");
        n2211C.setN2216Dk(bi.cbN2216DK.isChecked() ? "99" : "-1");

        n2211C.setN22171(bi.edN22171.getText().toString().trim().length() > 0 ? bi.edN22171.getText().toString() : "-1");
        n2211C.setN22172(bi.edN22172.getText().toString().trim().length() > 0 ? bi.edN22172.getText().toString() : "-1");
        n2211C.setN22173(bi.edN22173.getText().toString().trim().length() > 0 ? bi.edN22173.getText().toString() : "-1");

        n2211C.setN22181(bi.rbN221811.isChecked() ? "1" : bi.rbN221812.isChecked() ? "2" : bi.rbN221813.isChecked() ? "3" : bi.rbN22181DK.isChecked() ? "9" : "-1");
        n2211C.setN22182(bi.rbN221821.isChecked() ? "1" : bi.rbN221822.isChecked() ? "2" : bi.rbN221823.isChecked() ? "3" : bi.rbN22182DK.isChecked() ? "9" : "-1");

        n2211C.setN2219(bi.rbN221911.isChecked() ? "1" : bi.rbN221912.isChecked() ? "2" : bi.rbN221913.isChecked() ? "3"
                : bi.rbN221914.isChecked() ? "4" : bi.rbN221915.isChecked() ? "5" : bi.rbN221916.isChecked() ? "6" : bi.rbN221917.isChecked() ? "7"
                : bi.rbN221918.isChecked() ? "8" : bi.rbN221919.isChecked() ? "9" : bi.rbN2219110.isChecked() ? "10" : bi.rbN2219111.isChecked() ? "11" : bi.rbN22191DK.isChecked() ? "99" : "-1");
        n2211C.setN22192(bi.edN22192.getText().toString().trim().length() > 0 ? bi.edN22192.getText().toString() : "-1");

        n2211C.setN2220(bi.rbN22201.isChecked() ? "1" : bi.rbN22202.isChecked() ? "2" : bi.rbN22203.isChecked() ? "3" : bi.rbN2220DK.isChecked() ? "9" : "-1");

        n2211C.setN22211(bi.edN22211.getText().toString().trim().length() > 0 ? bi.edN22211.getText().toString() : "-1");
        n2211C.setN22212(bi.edN22212.getText().toString().trim().length() > 0 ? bi.edN22212.getText().toString() : "-1");

        n2211C.setN2222(bi.rbN22221.isChecked() ? "1" : bi.rbN22222.isChecked() ? "2" : bi.rbN2222DK.isChecked() ? "9" : "-1");
        /*n2211C.setN2223(bi.rbN22231.isChecked() ? "1" : bi.rbN22232.isChecked() ? "2" : bi.rbN2223DK.isChecked() ? "9" : "-1");

        n2211C.setN2224(bi.rbN222411.isChecked() ? "1" : bi.rbN222412.isChecked() ? "2" : bi.rbN222413.isChecked() ? "3"
                : bi.rbN222414.isChecked() ? "4" : bi.rbN222415.isChecked() ? "5" : bi.rbN222416.isChecked() ? "6" : bi.rbN222417.isChecked() ? "7"
                : bi.rbN222418.isChecked() ? "8" : bi.rbN222419.isChecked() ? "9" : bi.rbN2224110.isChecked() ? "10" : bi.rbN2224111.isChecked() ? "11" : bi.rbN22241DK.isChecked() ? "99" : "-1");
        n2211C.setN22242(bi.edN22242.getText().toString().trim().length() > 0 ? bi.edN22242.getText().toString() : "-1");

        n2211C.setN22251(bi.rbN222511.isChecked() ? "1" : bi.rbN222512.isChecked() ? "2" : bi.rbN22251DK.isChecked() ? "9" : "-1");
        n2211C.setN22252(bi.rbN222521.isChecked() ? "1" : bi.rbN222522.isChecked() ? "2" : bi.rbN22252DK.isChecked() ? "9" : "-1");

        n2211C.setN2226(bi.rbN22261.isChecked() ? "1" : bi.rbN22262.isChecked() ? "2" : "-1");

        n2211C.setN22271(bi.rbN222711.isChecked() ? "1" : bi.rbN222712.isChecked() ? "2" : bi.rbN222713.isChecked() ? "3" : bi.rbN22271DK.isChecked() ? "9" : "-1");
        n2211C.setN22272(bi.rbN222721.isChecked() ? "1" : bi.rbN222722.isChecked() ? "2" : bi.rbN222723.isChecked() ? "3" : bi.rbN22272DK.isChecked() ? "9" : "-1");

        *//*Repeat*//*

        n2211C.setN22281(bi.rbN222811.isChecked() ? "1" : bi.rbN222812.isChecked() ? "2" : bi.rbN222813.isChecked() ? "3" : bi.rbN22281DK.isChecked() ? "9" : "-1");
        n2211C.setN22282(bi.rbN222821.isChecked() ? "1" : bi.rbN222822.isChecked() ? "2" : bi.rbN222823.isChecked() ? "3" : bi.rbN22282DK.isChecked() ? "9" : "-1");

        n2211C.setN2229(bi.rbN222911.isChecked() ? "1" : bi.rbN222912.isChecked() ? "2" : bi.rbN222913.isChecked() ? "3"
                : bi.rbN222914.isChecked() ? "4" : bi.rbN222915.isChecked() ? "5" : bi.rbN222916.isChecked() ? "6" : bi.rbN222917.isChecked() ? "7"
                : bi.rbN222918.isChecked() ? "8" : bi.rbN222919.isChecked() ? "9" : bi.rbN2229110.isChecked() ? "10" : bi.rbN2229111.isChecked() ? "11" : bi.rbN22291DK.isChecked() ? "99" : "-1");
        n2211C.setN22292(bi.edN22292.getText().toString().trim().length() > 0 ? bi.edN22292.getText().toString() : "-1");

        n2211C.setN2230(bi.rbN22301.isChecked() ? "1" : bi.rbN22302.isChecked() ? "2" : bi.rbN22303.isChecked() ? "3" : bi.rbN2230DK.isChecked() ? "9" : "-1");

        n2211C.setN22311(bi.edN22311.getText().toString().trim().length() > 0 ? bi.edN22311.getText().toString() : "-1");
        n2211C.setN22312(bi.edN22312.getText().toString().trim().length() > 0 ? bi.edN22312.getText().toString() : "-1");

        n2211C.setN2232(bi.rbN22321.isChecked() ? "1" : bi.rbN22322.isChecked() ? "2" : bi.rbN2232DK.isChecked() ? "9" : "-1");
        n2211C.setN2233(bi.rbN22331.isChecked() ? "1" : bi.rbN22332.isChecked() ? "2" : bi.rbN2233DK.isChecked() ? "9" : "-1");

        n2211C.setN2234(bi.rbN223411.isChecked() ? "1" : bi.rbN223412.isChecked() ? "2" : bi.rbN223413.isChecked() ? "3"
                : bi.rbN223414.isChecked() ? "4" : bi.rbN223415.isChecked() ? "5" : bi.rbN223416.isChecked() ? "6" : bi.rbN223417.isChecked() ? "7"
                : bi.rbN223418.isChecked() ? "8" : bi.rbN223419.isChecked() ? "9" : bi.rbN2234110.isChecked() ? "10" : bi.rbN2234111.isChecked() ? "11" : bi.rbN22341DK.isChecked() ? "99" : "-1");
        n2211C.setN22342(bi.edN22342.getText().toString().trim().length() > 0 ? bi.edN22342.getText().toString() : "-1");

        n2211C.setN22351(bi.rbN223511.isChecked() ? "1" : bi.rbN223512.isChecked() ? "2" : bi.rbN22351DK.isChecked() ? "9" : "-1");
        n2211C.setN22352(bi.rbN223521.isChecked() ? "1" : bi.rbN223522.isChecked() ? "2" : bi.rbN22352DK.isChecked() ? "9" : "-1");

        n2211C.setN2236(bi.rbN22361.isChecked() ? "1" : bi.rbN22362.isChecked() ? "2" : "-1");

        n2211C.setN22371(bi.rbN223711.isChecked() ? "1" : bi.rbN223712.isChecked() ? "2" : bi.rbN223713.isChecked() ? "3" : bi.rbN22371DK.isChecked() ? "9" : "-1");
        n2211C.setN22372(bi.rbN223721.isChecked() ? "1" : bi.rbN223722.isChecked() ? "2" : bi.rbN223723.isChecked() ? "3" : bi.rbN22372DK.isChecked() ? "9" : "-1");

        n2211C.setN2238(bi.rbN22381.isChecked() ? "1" : bi.rbN22382.isChecked() ? "2" : bi.rbN2238DK.isChecked() ? "9" : "-1");
        n2211C.setN2239(bi.rbN22391.isChecked() ? "1" : bi.rbN22392.isChecked() ? "2" : bi.rbN2239DK.isChecked() ? "9" : "-1");

        n2211C.setN22401(bi.cbN22401.isChecked() ? "1" : "-1");
        n2211C.setN22402(bi.cbN22402.isChecked() ? "2" : "-1");
        n2211C.setN22403(bi.cbN22403.isChecked() ? "3" : "-1");
        n2211C.setN22404(bi.cbN22404.isChecked() ? "4" : "-1");
        n2211C.setN22405(bi.cbN22405.isChecked() ? "5" : "-1");
        n2211C.setN22405x(bi.edN22405.getText().toString().trim().length() > 0 ? bi.edN22405.getText().toString() : "-1");
        n2211C.setN22406(bi.cbN22406.isChecked() ? "6" : "-1");
        n2211C.setN22407(bi.cbN22407.isChecked() ? "7" : "-1");
        n2211C.setN22408(bi.cbN22408.isChecked() ? "8" : "-1");
        n2211C.setN22409(bi.cbN22409.isChecked() ? "9" : "-1");
        n2211C.setN224010(bi.cbN224010.isChecked() ? "10" : "-1");
        n2211C.setN224011(bi.cbN224011.isChecked() ? "11" : "-1");
        n2211C.setN224012(bi.cbN224012.isChecked() ? "12" : "-1");
        n2211C.setN224013(bi.cbN224013.isChecked() ? "13" : "-1");
        n2211C.setN224014(bi.cbN224014.isChecked() ? "14" : "-1");
        n2211C.setN224015(bi.cbN224015.isChecked() ? "15" : "-1");
        n2211C.setN2240Ot(bi.cbN2240OT.isChecked() ? "16" : "-1");
        n2211C.setN2240OTx(bi.edN2240OT.getText().toString().trim().length() > 0 ? bi.edN2240OT.getText().toString() : "-1");
        n2211C.setN2240Dk(bi.cbN2240DK.isChecked() ? "99" : "-1");

        n2211C.setN2241(bi.rbN22411.isChecked() ? "1" : bi.rbN22412.isChecked() ? "2" : bi.rbN2241DK.isChecked() ? "9" : "-1");


        n2211C.setN22421(bi.cbN22421.isChecked() ? "1" : "-1");
        n2211C.setN22422(bi.cbN22422.isChecked() ? "2" : "-1");
        n2211C.setN22423(bi.cbN22423.isChecked() ? "3" : "-1");
        n2211C.setN22424(bi.cbN22424.isChecked() ? "4" : "-1");
        n2211C.setN22425(bi.cbN22425.isChecked() ? "5" : "-1");
        n2211C.setN22426(bi.cbN22426.isChecked() ? "6" : "-1");
        n2211C.setN22427(bi.cbN22427.isChecked() ? "7" : "-1");
        n2211C.setN2242Dk(bi.cbN2242Dk.isChecked() ? "99" : "-1");

        n2211C.setN22431(bi.cbN22431.isChecked() ? "1" : "-1");
        n2211C.setN22432(bi.cbN22432.isChecked() ? "2" : "-1");
        n2211C.setN22433(bi.cbN22433.isChecked() ? "3" : "-1");
        n2211C.setN22434(bi.cbN22434.isChecked() ? "4" : "-1");
        n2211C.setN22435(bi.cbN22435.isChecked() ? "5" : "-1");
        n2211C.setN22436(bi.cbN22436.isChecked() ? "6" : "-1");
        n2211C.setN22437(bi.cbN22437.isChecked() ? "7" : "-1");
        n2211C.setN2243Dk(bi.cbN2243DK.isChecked() ? "99" : "-1");

        n2211C.setN2244(bi.rbN22441.isChecked() ? "1" : bi.rbN22442.isChecked() ? "2" : bi.rbN2244DK.isChecked() ? "9" : bi.rbN2244RA.isChecked() ? "8" : "-1");
        n2211C.setN2245(bi.rbN22451.isChecked() ? "1" : bi.rbN22452.isChecked() ? "2" : bi.rbN2245DK.isChecked() ? "9" : bi.rbN2245RA.isChecked() ? "8" : "-1");
        n2211C.setN2246(bi.rbN22461.isChecked() ? "1" : bi.rbN22462.isChecked() ? "2" : bi.rbN2246DK.isChecked() ? "9" : bi.rbN2246RA.isChecked() ? "8" : "-1");

        //n2211C.setN2247(bi.rbN22471.isChecked() ? "1" : bi.rbN22472.isChecked() ? "2" : bi.rbN2247DK.isChecked() ? "9" : bi.rbN2247RA.isChecked() ? "8" : "-1");

        n2211C.setN2248(bi.edN2248.getText().toString().trim().length() > 0 ? bi.edN2248.getText().toString() : "-1");*/

        DBHelper db = new DBHelper(this);
        Long row = db.update_N2211C(n2211C, bi.edStudyId.getText().toString());

        return row > 0;
    }

    public Boolean validateField() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

    @Override
    public void onBackPressed() {
        globale.interviewExit(this, this, bi.edStudyId.getText().toString(), 13);
    }
}
