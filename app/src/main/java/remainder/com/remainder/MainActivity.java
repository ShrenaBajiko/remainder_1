package remainder.com.remainder;

import android.app.DatePickerDialog;
import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import remainder.com.remainder.database.ChildClass;
import remainder.com.remainder.database.database;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "";
    public static database database;

    private TextView tv_child, tv_view, tv_preg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         database = Room.databaseBuilder(getApplicationContext(), database.class, "userinfo").allowMainThreadQueries().build();

         tv_view = findViewById(R.id.view);
        tv_child = findViewById(R.id.child);
        tv_preg = findViewById(R.id.preg);

        tv_child.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newIntent = new Intent(MainActivity.this, ChildClass.class);
                startActivity(newIntent);
            }
        });



            tv_view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent newIntent = new Intent(MainActivity.this, EditActivity.class);
                    startActivity(newIntent);
                }
            });

         tv_preg.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent newIntent = new Intent (MainActivity.this,  Pregnant.class);
                 startActivity(newIntent);
             }
         });
    }
}
