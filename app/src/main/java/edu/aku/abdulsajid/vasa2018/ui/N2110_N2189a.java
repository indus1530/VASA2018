package edu.aku.abdulsajid.vasa2018.ui;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import edu.aku.abdulsajid.vasa2018.DataTables.N.N2001_N2011;
import edu.aku.abdulsajid.vasa2018.DataTables.N.N2051_N2078;
import edu.aku.abdulsajid.vasa2018.Other.globale;
import edu.aku.abdulsajid.vasa2018.R;
import edu.aku.abdulsajid.vasa2018.data.DBHelper;
import edu.aku.abdulsajid.vasa2018.databinding.N2110N2189aBinding;
import edu.aku.abdulsajid.vasa2018.utils.ClearAllcontrol;

public class N2110_N2189a extends AppCompatActivity {

    N2110N2189aBinding bi;
    boolean flag_n2006 = true, flag_n2006_2 = true, flag_n2066 = true, flag_n2067 = true;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.n2110__n2189a);
        bi.setCallback(this);

        this.setTitle(getString(R.string.h_n_sec_5));

        GetDataFromDB();
        SetContentUI();

    }

    private void GetDataFromDB() {

        bi.edStudyId.setText(getIntent().getExtras().getString("study_id"));
        bi.edStudyId.setEnabled(false);

        DBHelper db = new DBHelper(this);

        String n2006 = db.getSpecificData(edu.aku.abdulsajid.vasa2018.data.N.N2001_N2011.TABLE_NAME, bi.edStudyId.getText().toString(), N2001_N2011.sub_N2001_N2011.N2006);
        if (n2006 != null) {
            if (Integer.valueOf(n2006) >= 3 && Integer.valueOf(n2006) <= 10) {
                flag_n2006 = false;
            }
            if (Integer.valueOf(n2006) == 1 || Integer.valueOf(n2006) == 2 || Integer.valueOf(n2006) == 11 || Integer.valueOf(n2006) == 12 || Integer.valueOf(n2006) == 99) {
                flag_n2006_2 = false;
            }
        }

        String n2066 = db.getSpecificData(edu.aku.abdulsajid.vasa2018.data.N.N2051_N2078.TABLE_NAME, bi.edStudyId.getText().toString(), N2051_N2078.sub_N2051_N2078.N2066);
        if (n2066 != null) {
            if (Integer.valueOf(n2066) != 1) {
                flag_n2066 = false;
            }
        }

        String n2067 = db.getSpecificData(edu.aku.abdulsajid.vasa2018.data.N.N2051_N2078.TABLE_NAME, bi.edStudyId.getText().toString(), N2051_N2078.sub_N2051_N2078.N2067);
        if (n2067 != null) {
            if (Integer.valueOf(n2067) == 9 || Integer.valueOf(n2067) == 10) {
                flag_n2067 = false;
            }
        }

    }

    private void SetContentUI() {

        bi.rgN2112.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN21121.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2113); //ll_N2113
                }
            }
        });

        bi.rgN2115.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN21151.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN21161N21163); //ll_N2116_1_N2116_3
                }
            }
        });

        bi.rgN21162.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN211621.getId()) {
                    bi.rgN21163.clearCheck();
                }
            }
        });

        bi.rgN2118.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN21182.getId()) {
                    bi.rgN2119.clearCheck();
                }
            }
        });

        /*bi.edN2122.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (bi.edN2122.getText().toString().trim().equals("98")) {
                    bi.llN2124N2125.setVisibility(View.GONE); //ll_N2124_N2125
                    ClearAllcontrol.ClearAll(bi.llN2124N2125); //ll_N2124_N2125
                } else {
                    bi.llN2124N2125.setVisibility(View.VISIBLE); //ll_N2124_N2125
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        bi.rgN2126.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN21261.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2127N2130); //ll_N2127_N2130
                }
            }
        });

        bi.rgN2132.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN21321.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2133N2134); //ll_N2133_N2134
                }
            }
        });

        bi.rgN2136.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN21361.getId()) {
                    bi.rgN2137.clearCheck();
                }
            }
        });

        bi.rgN2137.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN21371.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2138N2140); //ll_N2138_N2140
                }
            }
        });

        bi.rgN2138.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN21381.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2139N2140); //ll_N2139_N2140
                }
            }
        });

        bi.rgN2141.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN21411.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2142N2143); //ll_N2142_N2143
                }
            }
        });

        bi.rgN2142.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN21421.getId()) {
                    bi.rgN2143.clearCheck();
                }
            }
        });

        bi.rgN2145.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN21451.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2146N2148); //ll_N2146_N2148
                }
            }
        });

        bi.rgN2146.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbN21461.getId()) {
                    bi.rgN2147.clearCheck();
                }
            }
        });

        bi.rgN2151.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN21511.getId()) {
                    bi.rgN2152.clearCheck();
                }
            }
        });

        bi.rgN2155.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN21551.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2156N2158); //ll_N2156_N2158
                }
            }
        });

        bi.rgN2162.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbN21621.getId()) {
                    ClearAllcontrol.ClearAll(bi.llN2163N2164); //ll_N2163_N2164
                }
            }
        });

        //conditions
        if (!flag_n2006) {
            ClearAllcontrol.ClearAll(bi.llN2110N2112); //ll_N2110_N2112
            bi.llN2110N2112.setVisibility(View.GONE);
        }

        if ((!flag_n2066 && !flag_n2067) || !flag_n2006_2) {
            ClearAllcontrol.ClearAll(bi.llN2129N2130); //ll_N2129_N2130
            bi.llN2129N2130.setVisibility(View.GONE);
        }*/

    }

    public void BtnContinue() {
        if (validateField()) {
            if (SaveData()) {
                finish();
                startActivity(new Intent(this, N2190_N2191.class)
                        .putExtra("study_id", bi.edStudyId.getText().toString()));
            } else {
                Toast.makeText(this, "Can't add edu.aku.abdulsajid.VASMonitring.data!!", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_SHORT).show();
        }
    }

    public boolean SaveData() {

        edu.aku.abdulsajid.vasa2018.DataTables.N.N2110_N2189a n2110 = new edu.aku.abdulsajid.vasa2018.DataTables.N.N2110_N2189a();

        n2110.setN2110(bi.rbN21101.isChecked() ? "1" : bi.rbN21102.isChecked() ? "2" : bi.rbN21103.isChecked() ? "3"
                : bi.rbN2110OT.isChecked() ? "4" : bi.rbN2110DK.isChecked() ? "9" : "-1");
        n2110.setN2110x(bi.edN2110OT.getText().toString().trim().length() > 0 ? bi.edN2110OT.getText().toString() : "-1");
        n2110.setN2111(bi.rbN21111.isChecked() ? "1" : bi.rbN21112.isChecked() ? "2" : bi.rbN21113.isChecked() ? "3"
                : bi.rbN2111OT.isChecked() ? "4" : bi.rbN2111DK.isChecked() ? "9" : "-1");
        n2110.setN2111x(bi.edN2111OT.getText().toString().trim().length() > 0 ? bi.edN2111OT.getText().toString() : "-1");
        n2110.setN2112(bi.rbN21121.isChecked() ? "1" : bi.rbN21122.isChecked() ? "2" : bi.rbN2112DK.isChecked() ? "9" : "-1");

        n2110.setN21131(bi.cbN21131.isChecked() ? "1" : "-1");
        n2110.setN21132(bi.cbN21132.isChecked() ? "2" : "-1");
        n2110.setN21133(bi.cbN21133.isChecked() ? "3" : "-1");
        n2110.setN21134(bi.cbN21134.isChecked() ? "4" : "-1");
        n2110.setN2113Ot(bi.cbN2113OT.isChecked() ? "5" : "-1");
        n2110.setN2113Ot(bi.edN2113OT.getText().toString().trim().length() > 0 ? bi.edN2113OT.getText().toString() : "-1");
        n2110.setN2113Dk(bi.cbN2113DK.isChecked() ? "9" : "-1");

        n2110.setN2114(bi.rbN21141.isChecked() ? "1" : bi.rbN21142.isChecked() ? "2" : bi.rbN2114DK.isChecked() ? "9" : bi.rbN2114RA.isChecked() ? "8" : "-1");
        n2110.setN2115(bi.rbN21151.isChecked() ? "1" : bi.rbN21152.isChecked() ? "2" : bi.rbN2115DK.isChecked() ? "9" : bi.rbN2115RA.isChecked() ? "8" : "-1");
        n2110.setN21161(bi.rbN211611.isChecked() ? "1" : bi.rbN211612.isChecked() ? "2" : bi.rbN21161DK.isChecked() ? "9" : bi.rbN21161RA.isChecked() ? "8" : "-1");
        n2110.setN21162(bi.rbN211621.isChecked() ? "1" : bi.rbN211622.isChecked() ? "2" : bi.rbN21162DK.isChecked() ? "9" : bi.rbN21162RA.isChecked() ? "8" : "-1");
        n2110.setN21163(bi.rbN211631.isChecked() ? "1" : bi.rbN211632.isChecked() ? "2" : bi.rbN21163DK.isChecked() ? "9" : bi.rbN21163RA.isChecked() ? "8" : "-1");
        n2110.setN2117(bi.rbN21171.isChecked() ? "1" : bi.rbN21172.isChecked() ? "2" : bi.rbN2117DK.isChecked() ? "9" : bi.rbN2117RA.isChecked() ? "8" : "-1");
        n2110.setN2118(bi.rbN21181.isChecked() ? "1" : bi.rbN21182.isChecked() ? "2" : bi.rbN2118DK.isChecked() ? "9" : bi.rbN2118RA.isChecked() ? "8" : "-1");
        n2110.setN2119(bi.rbN21191.isChecked() ? "1" : bi.rbN21192.isChecked() ? "2" : bi.rbN2119DK.isChecked() ? "9" : bi.rbN2119RA.isChecked() ? "8" : "-1");
        n2110.setN2120(bi.rbN21201.isChecked() ? "1" : bi.rbN21202.isChecked() ? "2" : bi.rbN2120DK.isChecked() ? "9" : bi.rbN2120RA.isChecked() ? "8" : "-1");
        n2110.setN2121(bi.rbN21211.isChecked() ? "1" : bi.rbN21212.isChecked() ? "2" : bi.rbN2121DK.isChecked() ? "9" : bi.rbN2121RA.isChecked() ? "8" : "-1");
        n2110.setN2122(bi.edN2122.getText().toString().trim().length() > 0 ? bi.edN2122.getText().toString() : "-1");
        /*n2110.setN2123(bi.rbN21231.isChecked() ? "1" : bi.rbN21232.isChecked() ? "2" : bi.rbN2123DK.isChecked() ? "9" : bi.rbN2123RA.isChecked() ? "8" : "-1");
        n2110.setN2124(bi.edN2124.getText().toString().trim().length() > 0 ? bi.edN2124.getText().toString() : "-1");
        n2110.setN2125(bi.rbN21251.isChecked() ? "1" : bi.rbN21252.isChecked() ? "2" : bi.rbN2125DK.isChecked() ? "9" : "-1");
        n2110.setN2126(bi.rbN21261.isChecked() ? "1" : bi.rbN21262.isChecked() ? "2" : bi.rbN2126DK.isChecked() ? "9" : "-1");
        n2110.setN2127(bi.rbN21271.isChecked() ? "1" : bi.rbN21272.isChecked() ? "2" : bi.rbN21273.isChecked() ? "3" : bi.rbN2127DK.isChecked() ? "9" : "-1");
        n2110.setN2127h(bi.edN21273.getText().toString().trim().length() > 0 ? bi.edN21273.getText().toString() : "-1");
        n2110.setN2128(bi.rbN21281.isChecked() ? "1" : bi.rbN21282.isChecked() ? "2" : bi.rbN2128DK.isChecked() ? "9" : "-1");
        n2110.setN2129(bi.edN2129.getText().toString().trim().length() > 0 ? bi.edN2129.getText().toString() : "-1");
        n2110.setN2130(bi.edN2130.getText().toString().trim().length() > 0 ? bi.edN2130.getText().toString() : "-1");
        n2110.setN2131(bi.rbN21311.isChecked() ? "1" : bi.rbN21312.isChecked() ? "2" : bi.rbN21313.isChecked() ? "3" : bi.rbN21314.isChecked() ? "4"
                : bi.rbN2131DK.isChecked() ? "9" : "-1");
        n2110.setN2132(bi.rbN21321.isChecked() ? "1" : bi.rbN21322.isChecked() ? "2" : bi.rbN2132DK.isChecked() ? "9" : "-1");
        n2110.setN2133(bi.rbN21331.isChecked() ? "1" : bi.rbN21332.isChecked() ? "2" : bi.rbN21333.isChecked() ? "3" : bi.rbN21334.isChecked() ? "4"
                : bi.rbN2133DK.isChecked() ? "9" : "-1");
        n2110.setN2133h(bi.edN21333.getText().toString().trim().length() > 0 ? bi.edN21333.getText().toString() : "-1");
        n2110.setN2133d(bi.edN21334.getText().toString().trim().length() > 0 ? bi.edN21334.getText().toString() : "-1");
        n2110.setN2134(bi.rbN21341.isChecked() ? "1" : bi.rbN21342.isChecked() ? "2" : bi.rbN2134DK.isChecked() ? "9" : "-1");
        n2110.setN21351(bi.rbN213511.isChecked() ? "1" : bi.rbN213512.isChecked() ? "2" : bi.rbN21351DK.isChecked() ? "9" : "-1");
        n2110.setN21352(bi.rbN213521.isChecked() ? "1" : bi.rbN213522.isChecked() ? "2" : bi.rbN21352DK.isChecked() ? "9" : "-1");
        n2110.setN21353(bi.rbN213531.isChecked() ? "1" : bi.rbN213532.isChecked() ? "2" : bi.rbN21353DK.isChecked() ? "9" : "-1");
        n2110.setN21354(bi.rbN213541.isChecked() ? "1" : bi.rbN213542.isChecked() ? "2" : bi.rbN21354DK.isChecked() ? "9" : "-1");
        n2110.setN21355(bi.rbN213551.isChecked() ? "1" : bi.rbN213552.isChecked() ? "2" : bi.rbN21355DK.isChecked() ? "9" : "-1");
        n2110.setN21356(bi.rbN213561.isChecked() ? "1" : bi.rbN213562.isChecked() ? "2" : bi.rbN21356DK.isChecked() ? "9" : "-1");
        n2110.setN21357(bi.rbN213571.isChecked() ? "1" : bi.rbN213572.isChecked() ? "2" : bi.rbN21357DK.isChecked() ? "9" : "-1");
        n2110.setN21358(bi.rbN213581.isChecked() ? "1" : bi.rbN213582.isChecked() ? "2" : bi.rbN21358DK.isChecked() ? "9" : "-1");
        n2110.setN21359(bi.rbN213591.isChecked() ? "1" : bi.rbN213592.isChecked() ? "2" : bi.rbN21359DK.isChecked() ? "9" : "-1");
        n2110.setN213510(bi.rbN2135101.isChecked() ? "1" : bi.rbN2135102.isChecked() ? "2" : bi.rbN213510DK.isChecked() ? "9" : "-1");
        n2110.setN213511(bi.rbN2135111.isChecked() ? "1" : bi.rbN2135112.isChecked() ? "2" : bi.rbN213511DK.isChecked() ? "9" : "-1");
        n2110.setN213511x(bi.edN213512OT.getText().toString().trim().length() > 0 ? bi.edN213512OT.getText().toString() : "-1");
        n2110.setN2136(bi.rbN21361.isChecked() ? "1" : bi.rbN21362.isChecked() ? "2" : bi.rbN2136DK.isChecked() ? "9" : bi.rbN2136RA.isChecked() ? "8" : "-1");
        n2110.setN2137(bi.rbN21371.isChecked() ? "1" : bi.rbN21372.isChecked() ? "2" : bi.rbN2137DK.isChecked() ? "9" : bi.rbN2137RA.isChecked() ? "8" : "-1");
        n2110.setN2138(bi.rbN21381.isChecked() ? "1" : bi.rbN21382.isChecked() ? "2" : bi.rbN2138DK.isChecked() ? "9" : bi.rbN2138RA.isChecked() ? "8" : "-1");
        n2110.setN2139(bi.edN2139.getText().toString().trim().length() > 0 ? bi.edN2139.getText().toString() : "-1");
        n2110.setN2140(bi.rbN21401.isChecked() ? "1" : bi.rbN21402.isChecked() ? "2" : bi.rbN2140DK.isChecked() ? "9" : bi.rbN2140RA.isChecked() ? "8" : "-1");
        n2110.setN2141(bi.rbN21411.isChecked() ? "1" : bi.rbN21412.isChecked() ? "2" : bi.rbN2141DK.isChecked() ? "9" : bi.rbN2141RA.isChecked() ? "8" : "-1");
        n2110.setN2142(bi.rbN21421.isChecked() ? "1" : bi.rbN21422.isChecked() ? "2" : bi.rbN2142DK.isChecked() ? "9" : bi.rbN2142RA.isChecked() ? "8" : "-1");
        n2110.setN2143(bi.rbN21431.isChecked() ? "1" : bi.rbN21432.isChecked() ? "2" : bi.rbN2143DK.isChecked() ? "9" : bi.rbN2143RA.isChecked() ? "8" : "-1");
        n2110.setN2144(bi.rbN21441.isChecked() ? "1" : bi.rbN21442.isChecked() ? "2" : bi.rbN2144DK.isChecked() ? "9" : bi.rbN2144RA.isChecked() ? "8" : "-1");
        n2110.setN2145(bi.rbN21451.isChecked() ? "1" : bi.rbN21452.isChecked() ? "2" : bi.rbN2145DK.isChecked() ? "9" : bi.rbN2145RA.isChecked() ? "8" : "-1");
        n2110.setN2146(bi.rbN21461.isChecked() ? "1" : bi.rbN21462.isChecked() ? "2" : bi.rbN2146DK.isChecked() ? "9" : bi.rbN2146RA.isChecked() ? "8" : "-1");
        n2110.setN2147(bi.rbN21471.isChecked() ? "1" : bi.rbN21472.isChecked() ? "2" : bi.rbN2147DK.isChecked() ? "9" : bi.rbN2147RA.isChecked() ? "8" : "-1");
        n2110.setN2148(bi.rbN21481.isChecked() ? "1" : bi.rbN21482.isChecked() ? "2" : bi.rbN2148DK.isChecked() ? "9" : bi.rbN2148RA.isChecked() ? "8" : "-1");
        n2110.setN2149(bi.rbN21491.isChecked() ? "1" : bi.rbN21492.isChecked() ? "2" : bi.rbN2149DK.isChecked() ? "9" : bi.rbN2149RA.isChecked() ? "8" : "-1");
        n2110.setN2150(bi.rbN21501.isChecked() ? "1" : bi.rbN21502.isChecked() ? "2" : bi.rbN2150DK.isChecked() ? "9" : bi.rbN2150RA.isChecked() ? "8" : "-1");
        n2110.setN2151(bi.rbN21511.isChecked() ? "1" : bi.rbN21512.isChecked() ? "2" : bi.rbN2151DK.isChecked() ? "9" : bi.rbN2151RA.isChecked() ? "8" : "-1");
        n2110.setN2152(bi.rbN21521.isChecked() ? "1" : bi.rbN21522.isChecked() ? "2" : bi.rbN2152DK.isChecked() ? "9" : bi.rbN2152RA.isChecked() ? "8" : "-1");
        n2110.setN2153(bi.rbN21531.isChecked() ? "1" : bi.rbN21532.isChecked() ? "2" : bi.rbN2153DK.isChecked() ? "9" : bi.rbN2153RA.isChecked() ? "8" : "-1");
        n2110.setN2154(bi.rbN21541.isChecked() ? "1" : bi.rbN21542.isChecked() ? "2" : bi.rbN2154DK.isChecked() ? "9" : bi.rbN2154RA.isChecked() ? "8" : "-1");
        n2110.setN2155(bi.rbN21551.isChecked() ? "1" : bi.rbN21552.isChecked() ? "2" : bi.rbN2155DK.isChecked() ? "9" : bi.rbN2155RA.isChecked() ? "8" : "-1");
        n2110.setN2156(bi.edN2156.getText().toString().trim().length() > 0 ? bi.edN2156.getText().toString() : "-1");
        n2110.setN2157(bi.edN2157.getText().toString().trim().length() > 0 ? bi.edN2157.getText().toString() : "-1");
        n2110.setN2158(bi.rbN21581.isChecked() ? "1" : bi.rbN21582.isChecked() ? "2" : bi.rbN2158DK.isChecked() ? "9" : bi.rbN2158RA.isChecked() ? "8" : "-1");
        n2110.setN2159(bi.rbN21591.isChecked() ? "1" : bi.rbN21592.isChecked() ? "2" : bi.rbN2159DK.isChecked() ? "9" : bi.rbN2159RA.isChecked() ? "8" : "-1");
        n2110.setN2160(bi.edN2160.getText().toString().trim().length() > 0 ? bi.edN2160.getText().toString() : "-1");
        n2110.setN2161(bi.edN2161.getText().toString().trim().length() > 0 ? bi.edN2161.getText().toString() : "-1");
        n2110.setN2162(bi.rbN21621.isChecked() ? "1" : bi.rbN21622.isChecked() ? "2" : bi.rbN2162DK.isChecked() ? "9" : bi.rbN2162RA.isChecked() ? "8" : "-1");
        n2110.setN2163(bi.rbN21631.isChecked() ? "1" : bi.rbN21632.isChecked() ? "2" : bi.rbN2163DK.isChecked() ? "9" : bi.rbN2163RA.isChecked() ? "8" : "-1");
        n2110.setN2164(bi.rbN21641.isChecked() ? "1" : bi.rbN21642.isChecked() ? "2" : bi.rbN2164DK.isChecked() ? "9" : bi.rbN2164RA.isChecked() ? "8" : "-1");
        n2110.setN2165(bi.rbN21651.isChecked() ? "1" : bi.rbN21652.isChecked() ? "2" : bi.rbN2165DK.isChecked() ? "9" : bi.rbN2165RA.isChecked() ? "8" : "-1");
        n2110.setN2166(bi.edN2166.getText().toString().trim().length() > 0 ? bi.edN2166.getText().toString() : "-1");
        n2110.setN21661(bi.edN21661.getText().toString().trim().length() > 0 ? bi.edN21661.getText().toString() : "-1");
        n2110.setN2167(bi.rbN21671.isChecked() ? "1" : bi.rbN21672.isChecked() ? "2" : bi.rbN2167DK.isChecked() ? "9" : bi.rbN2167RA.isChecked() ? "8" : "-1");*/
        /*n2110.setN2168(bi.edN2168.getText().toString().trim().length() > 0 ? bi.edN2168.getText().toString() : "-1");
        n2110.setN2169(bi.edN2169.getText().toString().trim().length() > 0 ? bi.edN2169.getText().toString() : "-1");
        n2110.setN2170(bi.rbN21701.isChecked() ? "1" : bi.rbN21702.isChecked() ? "2" : bi.rbN2170DK.isChecked() ? "9" : bi.rbN2170RA.isChecked() ? "8" : "-1");
        n2110.setN2171(bi.edN2171.getText().toString().trim().length() > 0 ? bi.edN2171.getText().toString() : "-1");
        n2110.setN2172(bi.rbN21721.isChecked() ? "1" : bi.rbN21722.isChecked() ? "2" : bi.rbN2172DK.isChecked() ? "9" : bi.rbN2172RA.isChecked() ? "8" : "-1");
//        n2110.setN2173(bi.rbN21731.isChecked() ? "1" : bi.rbN21732.isChecked() ? "2" : bi.rbN2173DK.isChecked() ? "9" : bi.rbN2173RA.isChecked() ? "8" : "-1");
        n2110.setN2174(bi.rbN21741.isChecked() ? "1" : bi.rbN21742.isChecked() ? "2" : bi.rbN2174DK.isChecked() ? "9" : bi.rbN2174RA.isChecked() ? "8" : "-1");
        n2110.setN2175(bi.rbN21751.isChecked() ? "1" : bi.rbN21752.isChecked() ? "2" : bi.rbN2175DK.isChecked() ? "9" : bi.rbN2175RA.isChecked() ? "8" : "-1");
        n2110.setN2176(bi.rbN21761.isChecked() ? "1" : bi.rbN21762.isChecked() ? "2" : bi.rbN2176DK.isChecked() ? "9" : bi.rbN2176RA.isChecked() ? "8" : "-1");*/
        /*n2110.setN2177(bi.rbN21771.isChecked() ? "1" : bi.rbN21772.isChecked() ? "2" : bi.rbN2177DK.isChecked() ? "9" : bi.rbN2177RA.isChecked() ? "8" : "-1");
        n2110.setN2177A(bi.rbN2177a1.isChecked() ? "1" : bi.rbN2177a2.isChecked() ? "2" : bi.rbN2177aDK.isChecked() ? "9" : bi.rbN2177aRA.isChecked() ? "8" : "-1");
        n2110.setN2178(bi.rbN21781.isChecked() ? "1" : bi.rbN21782.isChecked() ? "2" : bi.rbN2178DK.isChecked() ? "9" : bi.rbN2178RA.isChecked() ? "8" : "-1");
        n2110.setN2179(bi.rbN21791.isChecked() ? "1" : bi.rbN21792.isChecked() ? "2" : bi.rbN2179DK.isChecked() ? "9" : bi.rbN2179RA.isChecked() ? "8" : "-1");
        n2110.setN2180(bi.rbN21801.isChecked() ? "1" : bi.rbN21802.isChecked() ? "2" : bi.rbN2180DK.isChecked() ? "9" : bi.rbN2180RA.isChecked() ? "8" : "-1");
        n2110.setN2181(bi.rbN21811.isChecked() ? "1" : bi.rbN21812.isChecked() ? "2" : bi.rbN2181DK.isChecked() ? "9" : bi.rbN2181RA.isChecked() ? "8" : "-1");*/
        /*n2110.setN2182(bi.rbN21821.isChecked() ? "1" : bi.rbN21822.isChecked() ? "2" : bi.rbN2182DK.isChecked() ? "9" : bi.rbN2182RA.isChecked() ? "8" : "-1");
        n2110.setN2183(bi.rbN21831.isChecked() ? "1" : bi.rbN21832.isChecked() ? "2" : bi.rbN2183DK.isChecked() ? "9" : bi.rbN2183RA.isChecked() ? "8" : "-1");
        n2110.setN2184(bi.edN2184.getText().toString().trim().length() > 0 ? bi.edN2184.getText().toString() : "-1");
        n2110.setN2185(bi.rbN21851.isChecked() ? "1" : bi.rbN21852.isChecked() ? "2" : bi.rbN2185DK.isChecked() ? "9" : bi.rbN2185RA.isChecked() ? "8" : "-1");*/
        /*n2110.setN2186(bi.edN2186.getText().toString().trim().length() > 0 ? bi.edN2186.getText().toString() : "-1");
        n2110.setN2187(bi.edN2187.getText().toString().trim().length() > 0 ? bi.edN2187.getText().toString() : "-1");
        n2110.setN2188(bi.rbN21881.isChecked() ? "1" : bi.rbN21882.isChecked() ? "2" : bi.rbN2188DK.isChecked() ? "9" : bi.rbN2188RA.isChecked() ? "8" : "-1");
        n2110.setN2189(bi.rbN21891.isChecked() ? "1" : bi.rbN21892.isChecked() ? "2" : bi.rbN2189DK.isChecked() ? "9" : bi.rbN2189RA.isChecked() ? "8" : "-1");
        n2110.setN2189A(bi.rbN2189a1.isChecked() ? "1" : bi.rbN2189a2.isChecked() ? "2" : bi.rbN2189aDK.isChecked() ? "9" : bi.rbN2189aRA.isChecked() ? "8" : "-1");*/


        n2110.setSTUDYID(bi.edStudyId.getText().toString());
        DBHelper db = new DBHelper(this);
        Long row = db.add_N2110(n2110);

        return row != 0;
    }

    public Boolean validateField() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

    @Override
    public void onBackPressed() {
        globale.interviewExit(this, this, bi.edStudyId.getText().toString(), 8);
    }

    /*public void BtnChest() {
        changeMediaUI(bi.btnChest, R.raw.look_chest_i);
    }

    public void BtnStri() {
        changeMediaUI(bi.btnStri, R.raw.child_i_s);
    }

    public void BtnGrunt() {
        changeMediaUI(bi.btnGrunt, R.raw.grunting);
    }

    public void BtnWheez() {
        changeMediaUI(bi.btnWheez, R.raw.breath_sounds_w);
    }*/

    private void changeMediaUI(final Button btn, final int resID) {

        if (mediaPlayer != null) {
            btnDefaultState();
            mediaPlayer.stop();
        }

        btn.setBackgroundColor(getResources().getColor(R.color.green2));
        btn.setTextColor(getResources().getColor(R.color.white));

        mediaPlayer = MediaPlayer.create(getApplicationContext(), resID);
        mediaPlayer.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(mediaPlayer.getDuration() + 200);

                    runOnUiThread(new Runnable() {

                        @Override
                        public void run() {
                            btn.setBackgroundColor(getResources().getColor(R.color.gray));
                            btn.setTextColor(getResources().getColor(R.color.black));
                        }
                    });

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();
    }

    private void btnDefaultState() {
        /*bi.btnChest.setBackgroundColor(getResources().getColor(R.color.gray));
        bi.btnChest.setTextColor(getResources().getColor(R.color.black));

        bi.btnGrunt.setBackgroundColor(getResources().getColor(R.color.gray));
        bi.btnGrunt.setTextColor(getResources().getColor(R.color.black));

        bi.btnStri.setBackgroundColor(getResources().getColor(R.color.gray));
        bi.btnStri.setTextColor(getResources().getColor(R.color.black));

        bi.btnWheez.setBackgroundColor(getResources().getColor(R.color.gray));
        bi.btnWheez.setTextColor(getResources().getColor(R.color.black));*/
    }

}
