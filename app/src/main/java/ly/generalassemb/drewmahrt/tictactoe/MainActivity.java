package ly.generalassemb.drewmahrt.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView player1Name = (TextView) findViewById(R.id.player_one_name );
        final TextView player2Name = (TextView) findViewById(R.id.player_two_name);
        final Button startGame = (Button) findViewById(R.id.start_game_button);

            startGame.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, GameActivity.class);
                    String name1 = (player1Name).getText().toString();
                    String name2 = (player2Name).getText().toString();
                    intent.putExtra("Player1", name1);
                    intent.putExtra("Player2", name2);
                    startActivity(intent);
                }
            });
    }
}
