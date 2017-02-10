package br.com.murilozinezi.splashscreen;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreeenActivity extends AppCompatActivity {

    private final int SPLASH_DISPLAY_LENGHT = 3500;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screeen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run () {
                // Após o tempo definido irá executar a próxima tela
                Intent intent = new Intent (SplashScreeenActivity.this,
                        MenuPrincipalActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
                SplashScreeenActivity.this.finish();


            }

        }, SPLASH_DISPLAY_LENGHT);

    }

}
