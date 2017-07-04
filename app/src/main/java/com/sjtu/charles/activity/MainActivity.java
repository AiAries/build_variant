package com.sjtu.charles.activity;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv_channel= (TextView) findViewById(R.id.main_tv_channel);
//        tv_channel.setText(getApplicationMetaValue("UMENG_CHANNEL"));
        tv_channel.setText(getPackageName());

    }

    public void JumpToSecondAct(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
    private String  getApplicationMetaValue(String name) {
        String value= "";
        try {
            ApplicationInfo appInfo =getPackageManager()
                    .getApplicationInfo(getPackageName(),
                            PackageManager.GET_META_DATA);
            value = appInfo.metaData.getString(name);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return value;
    }
}
