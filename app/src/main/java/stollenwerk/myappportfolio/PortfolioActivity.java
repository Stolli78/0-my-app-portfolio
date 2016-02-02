package stollenwerk.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class PortfolioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);
        initializeButtons();
    }

    /**
     * Initialize all buttons with an onClickListener
     */
    private void initializeButtons() {
        View.OnClickListener buttonListener = createAppButtonListener();

        Button spotifyButton = (Button) findViewById(R.id.btnSpotifyStreamer);
        spotifyButton.setOnClickListener(buttonListener);
        Button scoresButton = (Button) findViewById(R.id.btnScoresApp);
        scoresButton.setOnClickListener(buttonListener);
        Button libButton = (Button) findViewById(R.id.btnLibApp);
        libButton.setOnClickListener(buttonListener);
        Button buildItBiggerButton = (Button) findViewById(R.id.btnBuildItBigger);
        buildItBiggerButton.setOnClickListener(buttonListener);
        Button xyzReaderButton = (Button) findViewById(R.id.btnXyzReader);
        xyzReaderButton.setOnClickListener(buttonListener);
        Button capStoneButton = (Button) findViewById(R.id.btnCapStone);
        capStoneButton.setOnClickListener(buttonListener);

    }

    /**
     * Create the OnClickListener used on all buttons
     * @return the OneClickListener instance
     */
    private View.OnClickListener createAppButtonListener() {
       return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String clickedAppName = "";
                switch(v.getId()) {
                    case R.id.btnSpotifyStreamer:
                        clickedAppName = "SpotifyStreamer";
                        break;
                    case R.id.btnScoresApp:
                        clickedAppName = "Scores App";
                        break;
                    case R.id.btnLibApp:
                        clickedAppName = "Library App";
                        break;
                    case R.id.btnBuildItBigger:
                        clickedAppName = "Build It Bigger";
                        break;
                    case R.id.btnXyzReader:
                        clickedAppName = "XyzReader";
                        break;
                    case R.id.btnCapStone:
                        clickedAppName = "Capstone";
                        break;
                }
                Toast.makeText(getApplicationContext(), "This button will launch my " + clickedAppName + " App!", Toast.LENGTH_SHORT).show();
            }
        };
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
