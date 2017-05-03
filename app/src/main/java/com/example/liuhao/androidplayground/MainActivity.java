package com.example.liuhao.androidplayground;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.facebook.litho.ComponentContext;
import com.facebook.litho.LithoView;
import com.facebook.litho.widget.Text;

public class MainActivity extends AppCompatActivity {

    private LinearLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        container = (LinearLayout) findViewById(R.id.container);
        ComponentContext context = new ComponentContext(this);

        LithoView lithoView1 = LithoView.create(context, Text.create(context).text("Hello World").textSizeSp(16).textColor(getResources().getColor(R.color.colorAccent)).build());

        LithoView lithoView2 = LithoView.create(context, Text.create(context).text("Hello Litho").textSizeSp(16).textColor(getResources().getColor(R.color.colorPrimary)).build());

        LithoView lithoView3 = LithoView.create(context, Text.create(context).text("Hello Yoga").textSizeSp(16).textColor(getResources().getColor(R.color.colorPrimaryDark)).build());

        container.addView(lithoView1);
        container.addView(lithoView2);
        container.addView(lithoView3);

    }
}
