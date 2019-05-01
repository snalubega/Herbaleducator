package sylivia.herbal.com.herbalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/*
 * NAME: NALUBEGA SYLIVIA
 * REG NO: 2017/BIT/167
 * MBARARA UNIVERSITY OF SCIENCE AND TECHNOLOGY
 * PURSUING A BARCHOLS DEGREE IN INFORMATION TECHNOLOGY
 * LIKES PROGRAMMING
 * AM A PROUD MUGANDA
 * I LIKE READING NOVELS
 * */

public class MainActivity extends AppCompatActivity {

    private Button ctd;
    final String TAG = "States";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "MainActivity: onCreate()");

        ctd = (Button) findViewById(R.id.btncontinue);

        ctd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ImagesActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_item,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.item1:
                Intent intent = new Intent(MainActivity.this,AddActivity.class);
                startActivity(intent);
                return true;

            case R.id.item2:
                Intent inten= new Intent(MainActivity.this,ListActivity.class);
                startActivity(inten);
                return true;

            case R.id.item3:
                Intent inte= new Intent(MainActivity.this,ImagesActivity.class);
                startActivity(inte);

            case R.id.item4:
               Intent innt = new Intent(MainActivity.this,FragmentsActivity.class);
               startActivity(innt);

                case R.id.item5:
                Intent inteey= new Intent(MainActivity.this,HerbalListActivity.class);
                startActivity(inteey);

                return true;
            default:

                return super.onOptionsItemSelected(item);
        }


    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "MainActivity: onRestart()");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "MainActivity: onStart()");
    }
}
