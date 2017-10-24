package cl.raion.zodiac;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class SelectZodiacActivity extends AppCompatActivity {
    Spinner spinZodiac;
    TextView tvusuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_zodiac);

        Usuario usuario = getIntent().getParcelableExtra("usuario");

        spinZodiac = (Spinner) findViewById(R.id.spinZodiac);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,
                R.array.combo_zodiacos,android.R.layout.simple_spinner_item);

        spinZodiac.setAdapter(adapter);

        tvusuario = (TextView) findViewById(R.id.asz_usr);

        tvusuario.setText(usuario.toString());




    }
    public void goZodiac(View v){
        int zodiac = (int) spinZodiac.getSelectedItemId();
        Intent i;
        try {
            switch (zodiac){
                case 0:
                    i = new Intent (this, AcuariusActivity.class);
                    startActivity(i);
                    break;
                case 1:
                    i = new Intent (this, PiscisActivity.class);
                    startActivity(i);
                    break;
                case 2:
                    i = new Intent (this, AriesActivity.class);
                    startActivity(i);
                    break;
                case 3:
                    i = new Intent (this, TauroActivity.class);
                    startActivity(i);
                    break;
                case 4:
                    i = new Intent (this, GeminisActivity.class);
                    startActivity(i);
                    break;
                case 5:
                    i = new Intent (this, CancerActivity.class);
                    startActivity(i);
                    break;
                case 6:
                    i = new Intent (this, LeoActivity.class);
                    startActivity(i);
                    break;
                case 7:
                    i = new Intent (this, VirgoActivity.class);
                    startActivity(i);
                    break;
                case 8:
                    i = new Intent (this, LibraActivity.class);
                    startActivity(i);
                    break;
                case 9:
                    i = new Intent (this, EscorpioActivity.class);
                    startActivity(i);
                    break;
                case 10:
                    i = new Intent (this, SagitarioActivity.class);
                    startActivity(i);
                    break;
                case 11:
                    i = new Intent (this, CapricornioActivity.class);
                    startActivity(i);
                    break;
            }
        }catch (Exception e ){
            Toast.makeText(this,"Error ; "+ e,Toast.LENGTH_LONG).show();
        }

    }
}
