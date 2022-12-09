package com.example.lab2_ph17442_tranngocphu.Lab21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.lab2_ph17442_tranngocphu.R;

public class L21MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView lbtt;
    EditText txtname,txtscore;
    String link;
    Button btnread;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l21_main);
        lbtt = findViewById(R.id.lbtt);
        link = "http://localhost/tranphu_ph17442/student_get.php";
        txtname = findViewById(R.id.txtname);
        txtscore = findViewById(R.id.txtscore);
        btnread = findViewById(R.id.btnread);

        btnread.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        L21AsyncTaskGet l21AsyncTaskGet = new L21AsyncTaskGet(this,link,txtname.getText().toString(),txtscore.getText().toString(),lbtt);
        l21AsyncTaskGet.execute();
    }
}