package edu.aku.abdulsajid.vasa2018.utils;

import android.app.AlertDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.view.View;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import edu.aku.abdulsajid.vasa2018.data.LocalDataManager;

/**
 * Created by prabeesh on 7/14/2015.
 */
public class BackgroundTask extends AsyncTask<String, Void, String> {

    AlertDialog alertDialog;
    Context     ctx;
    View view;

    public BackgroundTask(Context ctx) {
        this.ctx = ctx;
        //view = v;
    }

    @Override
    protected void onPreExecute() {

        /*if (isNetworkAvailable(ctx) == true){
            Toast.makeText(ctx, "Hai net", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(ctx, "Nahi Hai", Toast.LENGTH_LONG).show();
        }*/
    }

    @Override
    protected String doInBackground(String... params) {
        //String reg_url = "http://10.0.2.2/webapp/register.php";
        String login_url = "http://43.245.131.159:8080/uendashboard/sm/index.php/Welcome/collect_Response";
        String method = params[0];

        if (method.equals("check_study_id")) {
            String study_id = params[1];
            try {
                URL url = new URL(login_url);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8));
                String data = URLEncoder.encode("study_id", "UTF-8") + "=" + URLEncoder.encode(study_id, "UTF-8");
                bufferedWriter.write(data);
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();
                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.ISO_8859_1));
                String response = "";
                String line = "";
                if ((line = bufferedReader.readLine()) != null) {

                    response += line;

                } else {

                    LocalDataManager Lm = new LocalDataManager(ctx);
                    LocalDataManager.database.execSQL("UPDATE Q1101_Q1610 set STATUS = 0 where study_id = " + "'" + study_id + "'");
                }

                bufferedReader.close();
                inputStream.close();
                httpURLConnection.disconnect();
                return response;
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onPostExecute(String result) {

        //if (result != null && !result.isEmpty()) {
            //view.setBackgroundColor(Color.parseColor("#99FF99"));
            //view.setClickable(false);
            //Toast.makeText(ctx, ""+result, Toast.LENGTH_LONG).show();

            //LocalDataManager Lm = new LocalDataManager(ctx);
            //LocalDataManager.database.execSQL("UPDATE Q1101_Q1610 set STATUS = 1 where study_id = " + "'" + result + "'");


        //} //else {
            //view.setBackgroundColor(Color.parseColor("#FFB7BC"));
            //view.setClickable(true);
            //Toast.makeText(ctx, ""+result, Toast.LENGTH_LONG).show();
        //}
    }


    /*public boolean isNetworkAvailable(Context ctx) {
        Runtime runtime = Runtime.getRuntime();
        try {
            Process ipProcess = runtime.exec("/system/bin/ping -c 1 8.8.8.8");
            int     exitValue = ipProcess.waitFor();
            return (exitValue == 0);
        }
        catch (IOException e)          { e.printStackTrace(); }
        catch (InterruptedException e) { e.printStackTrace(); }

        return false;
    }*/
}
