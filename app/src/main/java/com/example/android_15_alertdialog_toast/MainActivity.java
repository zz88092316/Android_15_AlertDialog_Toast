package com.example.android_15_alertdialog_toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button toast;
    private Button alertdialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toast = (Button)findViewById(R.id.toast);
        alertdialog = (Button)findViewById(R.id.alertdialog);
        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"hello world",Toast.LENGTH_SHORT).show();
            }
        });
        alertdialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
                alertDialog.setTitle("對話框測試");
                alertDialog.setMessage("這是一個對話視窗");
                alertDialog.setPositiveButton("關閉視窗", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                alertDialog.setCancelable(false);
                alertDialog.show();
            }
        });
    }
}