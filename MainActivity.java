package comblog.wixsite.ayushgemini.toastprogram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnClickme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         btnClickme = (Button)findViewById(R.id.btn_clickme);
         btnClickme.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Toast.makeText(getApplicationContext(), "Hello World!this is my first project", Toast.LENGTH_SHORT).show();

             }
         });

    }
}
