package devdeeds.com.changelanguage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import devdeeds.com.changelanguage.utils.LocaleHelper;

/**
 * Created by devdeeds.com on 18/4/17.
 * by Jayakrishnan P.M
 */

public class MainActivity extends AppCompatActivity {

    private String mLanguageCode = "fr";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.btnChangeLangView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LocaleHelper.setLocale(MainActivity.this, mLanguageCode);
                recreate();
            }
        });
    }
}
