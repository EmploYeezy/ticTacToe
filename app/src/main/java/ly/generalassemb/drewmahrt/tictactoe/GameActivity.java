package ly.generalassemb.drewmahrt.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Intent getIntent = getIntent();
        String player1 = getIntent.getStringExtra("Player1");
        String player2 = getIntent.getStringExtra("Player2");

        //just a test to make sure my shizznit is coming over
        Log.d("GameActivity", player1);

    }
}
