package edu.quinnipiac.ser210.jhtravels;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ShareActionProvider;
import androidx.core.view.MenuItemCompat;
import androidx.navigation.NavController;

public class MainActivity extends AppCompatActivity {
    private ShareActionProvider provider;
    private View mConstraintLayout;
    private String color = "white";
    boolean userSelect = false;
    NavController navController = null;

    //creates share option for action bar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        provider = (ShareActionProvider) MenuItemCompat.getActionProvider(menu.findItem(R.id.share));
        return super.onCreateOptionsMenu(menu);
    }

    public void shareText(View view) {
        Intent intent = new Intent(android.content.Intent.ACTION_SEND);
        intent.setType("text/plain");
        String shareBodyText = "Your sharing message goes here";
        intent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject/Title");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, shareBodyText);
        startActivity(Intent.createChooser(intent, "Choose sharing method"));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            //changes background color when settings is clicked on
            case R.id.settings:
                if (color == "white") {
                    mConstraintLayout.setBackgroundColor(Color.YELLOW);
                    color = "yellow";
                } else if (color == "yellow") {
                    mConstraintLayout.setBackgroundColor(Color.RED);
                    color = "red";
                } else if (color == "red") {
                    mConstraintLayout.setBackgroundColor(Color.BLUE);
                    color = "blue";
                } else {
                    mConstraintLayout.setBackgroundColor(Color.WHITE);
                    color = "white";
                }
                break;
                //share option on action bar

            case R.id.share:
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBodyText = "Check it out. Your message goes here";
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT,"Subject here");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBodyText);
                startActivity(Intent.createChooser(sharingIntent, "Shearing Option"));
                return true;

            case android.R.id.home:
                this.finish();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
        return super.onOptionsItemSelected(item);
    }

    //interaction for action bar
    @Override
    public void onUserInteraction() {
        super.onUserInteraction();
        userSelect = true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mConstraintLayout = findViewById(R.id.layout);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}