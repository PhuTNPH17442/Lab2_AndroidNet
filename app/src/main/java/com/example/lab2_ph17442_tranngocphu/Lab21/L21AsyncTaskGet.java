package com.example.lab2_ph17442_tranngocphu.Lab21;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class L21AsyncTaskGet extends AsyncTask<String,Void,String> {
    private Context context;
    private  String link , name , score;
    private TextView lbtt;
    private String tt="";
    public L21AsyncTaskGet(Context context , String link, String name , String score, TextView lbtt) {
        this.context = context;
        this.link = link;
        this.name = name;
        this.score = score;
        this.lbtt = lbtt;
    }
        @Override
    protected String doInBackground(String... strings) {
            try {
                link += "?name= "+ name +"&score"+score ;
                URL url = new URL(link);
                HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
                StringBuffer stringBuffer = new StringBuffer();
                String line ="";
                while ((line = bufferedReader.readLine())!=null){
                    stringBuffer.append(line);
                }
                tt = stringBuffer.toString();
                urlConnection.disconnect();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        return tt;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        lbtt.setText(tt);
    }
}
