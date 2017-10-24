package cl.raion.zodiac;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class AcuariusActivity extends AppCompatActivity {
    ImageView imgzodiac;
    TextView nombrezodiac,tvzodiacfechas,tvZodiacDesc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zodiac_description);
        imgzodiac = (ImageView) findViewById(R.id.imgZodiac);
        imgzodiac.setImageResource(R.drawable.acuario);
        nombrezodiac = (TextView) findViewById(R.id.tvSelectedZodiac);
        nombrezodiac.setText(R.string.acuario);
        tvzodiacfechas = (TextView) findViewById(R.id.tvZodiacFechas);
        tvzodiacfechas.setText(R.string.txt_acuario_fecha);
        tvZodiacDesc = (TextView) findViewById(R.id.tvZodiacDesc);
        tvZodiacDesc.setText(R.string.txt_acuario_desc);
    }
}
