package cl.raion.zodiac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {
    ArrayList<Usuario> usuarios = new ArrayList<>();
    EditText username;
    EditText password;
    Button bntLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        usuarios.add(new Usuario("bvergara","123456","Bastian","Vergara"));
        usuarios.add(new Usuario("vcontreras","123456","Vicente","Contreras"));
        usuarios.add(new Usuario("fgaete","123456","Fanny","Gaete"));
        usuarios.add(new Usuario("cvergara","123456","Cristian","Vergara"));
        usuarios.add(new Usuario("svergara","123456","Sharitty","Vergara"));
        username = (EditText) findViewById(R.id.et_username);
        password = (EditText) findViewById(R.id.et_password);


    }
    public void iniLogin(View v){

        try {
            Usuario autorizadou = null;
            boolean autorizado = false;
            for (Usuario usuario : usuarios) {
                if (username.getText().toString().equals(usuario.getUsername().toString())
                        &&
                        password.getText().toString().equals(usuario.getPassword().toString())
                        ) {
                    autorizado = true;
                    autorizadou = usuario;
                }
            }
            if (autorizado == true) {
                Intent i = new Intent(this, SelectZodiacActivity.class);
                try {
                    i.putExtra("usuario",autorizadou);
                    startActivity(i);
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"Hubo un problema al iniciar la actividad" + e,Toast.LENGTH_SHORT).show();
                }

            } else {
                Toast.makeText(getApplicationContext(),"Verifica los datos ingresados",Toast.LENGTH_SHORT).show();
            }
        }catch (Exception e){
            Toast.makeText(getApplicationContext(),"Verifica los datos ingresados" + e,Toast.LENGTH_SHORT).show();
        }
    }
}
