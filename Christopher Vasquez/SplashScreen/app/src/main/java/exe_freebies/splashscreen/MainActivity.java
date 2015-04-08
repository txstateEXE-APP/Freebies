package exe_freebies.splashscreen;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import java.io.*;
import java.util.*;


public class MainActivity extends ActionBarActivity {

  /*  Random random = new Random ();
    int n = random.nextInt(2)+1;
    if(n == 1)
    {

    }
*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ImageView imgView = new ImageView(this);
        Random rand = new Random();
        int rndInt = rand.nextInt(2) + 1;
        String imgName = "img" + rndInt;
        int id = getResources().getIdentifier(imgName, "drawable", getPackageName());


        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        //imageView.setImageResource(R.drawable.img1);
        imageView.setImageResource(id);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
