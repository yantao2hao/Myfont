package cn.com.heytalk.myfont;

        import android.app.Activity;
        import android.graphics.Typeface;
        import android.os.Bundle;
        import android.widget.TextView;


public class MainActivity extends Activity {

    TextView textView,textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textview);
        textView2 = (TextView) findViewById(R.id.textview2);
        //Assets folder should be directly in main folder and not inside res
        Typeface customFont = Typeface.createFromAsset(getAssets(),"fonts/Roboto-BoldItalic.ttf");
        Typeface customFont2 = Typeface.createFromAsset(getAssets(),"fonts/jinmei.ttf");
        textView.setTypeface(customFont);
        textView2.setTypeface(customFont2);

    }

}
