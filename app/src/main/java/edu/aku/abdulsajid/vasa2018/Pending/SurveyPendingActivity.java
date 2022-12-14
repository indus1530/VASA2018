package edu.aku.abdulsajid.vasa2018.Pending;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Collections;
import java.util.List;

import edu.aku.abdulsajid.vasa2018.R;
import edu.aku.abdulsajid.vasa2018.data.LocalDataManager;
import edu.aku.abdulsajid.vasa2018.ui.A4251_A4284;
import edu.aku.abdulsajid.vasa2018.ui.A4301_A4315;
import edu.aku.abdulsajid.vasa2018.ui.A4351_A4364;
import edu.aku.abdulsajid.vasa2018.ui.A4401_A4473;
import edu.aku.abdulsajid.vasa2018.ui.C3001_C3011;
import edu.aku.abdulsajid.vasa2018.ui.C3012_C3022;
import edu.aku.abdulsajid.vasa2018.ui.C3051_C3099;
import edu.aku.abdulsajid.vasa2018.ui.C3101_C3112;
import edu.aku.abdulsajid.vasa2018.ui.C3121_C3228;
import edu.aku.abdulsajid.vasa2018.ui.C3251_C3288_A;
import edu.aku.abdulsajid.vasa2018.ui.C3251_C3288_B;
import edu.aku.abdulsajid.vasa2018.ui.C3251_C3288_C;
import edu.aku.abdulsajid.vasa2018.ui.C3301_C3314;
import edu.aku.abdulsajid.vasa2018.ui.C3351_C3364;
import edu.aku.abdulsajid.vasa2018.ui.C3401_C3457;
import edu.aku.abdulsajid.vasa2018.ui.C3471_C3472;
import edu.aku.abdulsajid.vasa2018.ui.N2012_N2016;
import edu.aku.abdulsajid.vasa2018.ui.N2017_N2022_3;
import edu.aku.abdulsajid.vasa2018.ui.N2023_N2026;
import edu.aku.abdulsajid.vasa2018.ui.N2051_N2078;
import edu.aku.abdulsajid.vasa2018.ui.N2080_N2107;
import edu.aku.abdulsajid.vasa2018.ui.N2110_N2189a;
import edu.aku.abdulsajid.vasa2018.ui.N2190_N2191;
import edu.aku.abdulsajid.vasa2018.ui.N2192_N2202;
import edu.aku.abdulsajid.vasa2018.ui.N2211_N2248_A;
import edu.aku.abdulsajid.vasa2018.ui.N2211_N2248_B;
import edu.aku.abdulsajid.vasa2018.ui.N2211_N2248_C;
import edu.aku.abdulsajid.vasa2018.ui.N2251_N2260;
import edu.aku.abdulsajid.vasa2018.ui.N2271_N2284;
import edu.aku.abdulsajid.vasa2018.ui.N2291_N2304;
import edu.aku.abdulsajid.vasa2018.ui.N2311_N2317;
import edu.aku.abdulsajid.vasa2018.ui.N2321_N2322;
import edu.aku.abdulsajid.vasa2018.ui.SectionA01Activity;
import edu.aku.abdulsajid.vasa2018.ui.SectionA02Activity;
import edu.aku.abdulsajid.vasa2018.ui.SectionA03Activity;
import edu.aku.abdulsajid.vasa2018.ui.SectionA04Activity;
import edu.aku.abdulsajid.vasa2018.ui.SectionA05Activity;
import edu.aku.abdulsajid.vasa2018.ui.SectionA06Activity;
import edu.aku.abdulsajid.vasa2018.ui.SectionA07Activity;
import edu.aku.abdulsajid.vasa2018.ui.SectionA08Activity;
import edu.aku.abdulsajid.vasa2018.ui.SectionA09Activity;
import edu.aku.abdulsajid.vasa2018.ui.SectionA10Activity;
import edu.aku.abdulsajid.vasa2018.ui.SectionN01Activity;
import edu.aku.abdulsajid.vasa2018.ui.SectionWActivity;


public class SurveyPendingActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pending_interviews);

        List<String> list = new LocalDataManager(this).getLogListPending("0");


        if (list == null)
            return;

        Collections.sort(list);

        mRecyclerView = findViewById(R.id.list_survey_completed);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);


        mAdapter = new SurveyPendingCustomAdapter(this, list);
        mRecyclerView.setAdapter(mAdapter);
    }
}


class SurveyPendingCustomAdapter extends RecyclerView.Adapter {

    Context      mContext;
    List<String> mList;

    public SurveyPendingCustomAdapter(Context context, List<String> list) {
        mContext = context;
        mList = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_survey_pending, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        final ViewHolder vh = (ViewHolder) holder;

        //rejected items..
        if (mList.get(position).contains("--00")) {
            vh.itemView.setBackgroundColor(Color.parseColor("#FFB7BC"));
        }

        vh.textName.setText(mList.get(position).split("--")[0]);
        vh.textId.setText(position + 1 + "");


        vh.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                AlertDialog.Builder b = new AlertDialog.Builder(mContext);
                b.setTitle("Restart Interview");
                b.setMessage("Do you want to restart this interview");
                b.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {



                        String memberId = vh.textName.getText().toString();


                        String[] arrr = memberId.split("/");

                        String study_id = arrr[0];
                        int curentSection = Integer.valueOf(arrr[1]);
                        int interviewType = Integer.valueOf(arrr[2]);

                        //here call activity
                        Intent  intent = null;

                        if(interviewType == 1){

                            if(curentSection == 2){

                                intent = new Intent(mContext, SectionN01Activity.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }
                            if(curentSection == 3){

                                intent= new Intent(mContext, N2012_N2016.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }
                            if(curentSection == 4){

                                intent= new Intent(mContext, N2017_N2022_3.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }
                            if(curentSection == 5){

                                intent= new Intent(mContext, N2023_N2026.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }
                            if(curentSection == 6){

                                intent= new Intent(mContext, N2051_N2078.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }
                            if(curentSection == 7){

                                intent= new Intent(mContext, N2080_N2107.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }
                            if(curentSection == 8){

                                intent= new Intent(mContext, N2110_N2189a.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }
                            if(curentSection == 9){

                                intent= new Intent(mContext, N2190_N2191.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }
                            if(curentSection == 10){

                                intent= new Intent(mContext, N2192_N2202.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }
                            if(curentSection == 11){

                                intent= new Intent(mContext, N2211_N2248_A.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }

                            if(curentSection == 12){

                                intent= new Intent(mContext, N2211_N2248_B.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }

                            if(curentSection == 13){

                                intent= new Intent(mContext, N2211_N2248_C.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }

                            if(curentSection == 14){

                                intent= new Intent(mContext, N2251_N2260.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }

                            if(curentSection == 15){

                                intent= new Intent(mContext, N2271_N2284.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }

                            if(curentSection == 16){

                                intent= new Intent(mContext, N2291_N2304.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }

                            if(curentSection == 17){

                                intent= new Intent(mContext, N2311_N2317.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }

                            if(curentSection == 18){

                                intent= new Intent(mContext, N2321_N2322.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }

                            if(curentSection == 20){

                                intent = new Intent(mContext, SectionWActivity.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }

                        } else if(interviewType == 2){

                            if(curentSection == 2){

                                intent= new Intent(mContext, C3001_C3011.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }
                            if(curentSection == 3){

                                intent= new Intent(mContext, C3012_C3022.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }
                            if(curentSection == 4){

                                intent= new Intent(mContext, C3051_C3099.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }
                            if(curentSection == 5){

                                intent= new Intent(mContext, C3101_C3112.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }
                            if(curentSection == 6){

                                intent= new Intent(mContext, C3121_C3228.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }
                            if(curentSection == 7){

                                intent= new Intent(mContext, C3251_C3288_A.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }
                            if(curentSection == 8){

                                intent= new Intent(mContext, C3251_C3288_B.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }
                            if(curentSection == 9){

                                intent= new Intent(mContext, C3251_C3288_C.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }
                            if(curentSection == 10){

                                intent= new Intent(mContext, C3301_C3314.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }
                            if(curentSection == 11){

                                intent= new Intent(mContext, C3351_C3364.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }

                            if(curentSection == 12){

                                intent= new Intent(mContext, C3401_C3457.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }

                            if(curentSection == 13){

                                intent= new Intent(mContext, C3471_C3472.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }

                            if(curentSection == 20){

                                intent = new Intent(mContext, SectionWActivity.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }

                        } else if(interviewType == 3){

                            if(curentSection == 2){

                                intent = new Intent(mContext, SectionA01Activity.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }
                            if(curentSection == 3){

                                intent = new Intent(mContext, SectionA02Activity.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }
                            if(curentSection == 4){

                                intent = new Intent(mContext, SectionA03Activity.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }
                            if(curentSection == 5){

                                intent = new Intent(mContext, SectionA04Activity.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }
                            if(curentSection == 6){

                                intent = new Intent(mContext, SectionA05Activity.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }
                            if(curentSection == 7){

                                intent = new Intent(mContext, SectionA06Activity.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }
                            if(curentSection == 8){

                                intent = new Intent(mContext, SectionA07Activity.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }
                            if(curentSection == 9){

                                intent = new Intent(mContext, SectionA08Activity.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }
                            if(curentSection == 10){

                                intent = new Intent(mContext, SectionA09Activity.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }
                            if(curentSection == 11){

                                intent = new Intent(mContext, SectionA10Activity.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }

                            if(curentSection == 12){

                                intent= new Intent(mContext, A4251_A4284.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }

                            if(curentSection == 13){

                                intent= new Intent(mContext, A4301_A4315.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }

                            if(curentSection == 14){

                                intent= new Intent(mContext, A4351_A4364.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }

                            if(curentSection == 15){

                                intent= new Intent(mContext, A4401_A4473.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }

                            if(curentSection == 20){

                                intent = new Intent(mContext, SectionWActivity.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }

                        }

                    }
                }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        // Intent intent = null;

                      //    intent = new Intent(this, SurveyPendingActivity.class);
                    }
                }).show();
            }
        });
    }





    @Override
    public int getItemCount() {
        return mList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textName, textId;

        public ViewHolder(View v) {
            super(v);
            textName = v.findViewById(R.id.text_item_survey_pending_name);
            textId = v.findViewById(R.id.text_item_survey_pending_id);
        }
    }


}