package com.illum.MafiaRising;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Rules extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);

        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        );
    }

    public void activityTutorial(View view) {
        Intent intent = new Intent(this, RulesTutorial.class);
        startActivity(intent);
    }

    public void activityScript(View view) {
        Intent intent = new Intent(this, RulesScript.class);
        startActivity(intent);
    }

    public void activityRoles(View view) {
        Intent intent = new Intent(this, RulesRoles.class);
        startActivity(intent);
    }

}
