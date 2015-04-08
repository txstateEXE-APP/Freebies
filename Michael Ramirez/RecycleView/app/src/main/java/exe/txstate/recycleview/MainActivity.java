package exe.txstate.recycleview;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {
    public final static String EXTRA_EVENT = "com.example.michael.recycleview.eventName" ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        RecyclerView eventList=(RecyclerView) findViewById(R.id.eventRecyclerView) ;
        eventList.setLayoutManager(new LinearLayoutManager(this));
        List<String> data=new ArrayList<>();
        for(int i=0;i<=20;i++){
            if (i==10)
            {
                data.add("if statement used to put this here");
                continue;
            }
            data.add("event name. "+i);
        }
        eventList.setAdapter(new eventAdapter(data,this));
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

    public void displayEventInformation(View view) {
        Intent intent = new Intent(this, EventDetails.class);
        Button button= (Button) findViewById(R.id.txtEvent);
        String eventName = button.getText().toString();
        intent.putExtra(EXTRA_EVENT, eventName);
        startActivity(intent);

    }

    }

