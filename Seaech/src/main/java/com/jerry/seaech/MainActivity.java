package com.jerry.seaech;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ContentView;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.lidroid.xutils.view.annotation.event.OnClick;

@ContentView(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @ViewInject(R.id.et_1)
    private EditText et1;
    @ViewInject(R.id.et_2)
    private EditText et2;
    @ViewInject(R.id.et_3)
    private EditText et3;
    @ViewInject(R.id.btu_1)
    private Button btu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        ViewUtils.inject(this);

    }

    @OnClick({R.id.btu_1})
    public void doAdd(View view){
        int num1 = Integer.parseInt(et1.getText().toString());
        int num2 = Integer.parseInt(et2.getText().toString());
        et3.setText(num1 + num2);
    }
}
