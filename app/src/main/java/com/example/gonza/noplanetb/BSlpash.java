package com.example.gonza.noplanetb;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class BSlpash extends AppCompatActivity {

    //Componentes
    Animation anim;
    ImageView iv;
    TextView sub;
    TextView title;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bslpash);
        //esconder la barra
        getSupportActionBar().hide();

        title = (TextView)findViewById(R.id.tvTituloSplash);
        sub = (TextView)findViewById(R.id.tvSloganSplash);
        iv = (ImageView)findViewById(R.id.ivCoheteSplash);

        anim = AnimationUtils.loadAnimation(this, R.anim.fadein);
        sub.startAnimation(anim);
        title.startAnimation(anim);

        anim = AnimationUtils.loadAnimation(this, R.anim.slideup);
        iv.startAnimation(anim);

        openApp(true);
    }


    //metodo para pasar del BSplash al BLogin
    private void openApp(boolean locationPermission) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(BSlpash.this, BLogin.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}
