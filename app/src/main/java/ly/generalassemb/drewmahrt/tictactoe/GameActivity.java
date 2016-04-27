package ly.generalassemb.drewmahrt.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.api.GoogleApiClient;

public class GameActivity extends AppCompatActivity {

    private TextView messagetext;
    private TextView box1;
    private TextView box2;
    private TextView box3;
    private TextView box4;
    private TextView box5;
    private TextView box6;
    private TextView box7;
    private TextView box8;
    private TextView box9;
    int [] [] playTracker = new int [3][3];
    //private char playTracker;
    //private int position;
    //private int counter;
    private int counter2;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;
    //private int mplayer1;
    //private int mplayer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        messagetext = (TextView) findViewById(R.id.game_message_text);
        box1 = (TextView) findViewById(R.id.textView);
        box2 = (TextView) findViewById(R.id.textView2);
        box3 = (TextView) findViewById(R.id.textView3);
        box4 = (TextView) findViewById(R.id.textView4);
        box5 = (TextView) findViewById(R.id.textView5);
        box6 = (TextView) findViewById(R.id.textView6);
        box7 = (TextView) findViewById(R.id.textView7);
        box8 = (TextView) findViewById(R.id.textView8);
        box9 = (TextView) findViewById(R.id.textView9);

        Intent getIntent = getIntent();
        final String player1 = getIntent.getStringExtra("Player1");
        final String player2 = getIntent.getStringExtra("Player2");
        //just a test to make sure my shizznit is coming over
        //Log.d("GameActivity", player1);

        messagetext.setText(player1 + " is crosses");

        box1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (counter2 % 2 == 0) {
                    box1.setText("O");
                    messagetext.setText(player1 + "'s turn");
                    playTracker[0][0] = 1;
                    box1.setClickable(false);
                } else {
                    box1.setText("X");
                    messagetext.setText(player2 + "'s turn");
                    playTracker[0][0] = 2;
                    box1.setClickable(false);
                }
                checkForWinner();
            }
        });

        box2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (counter2 % 2 == 0) {
                    box2.setText("O");
                    messagetext.setText(player1 + "'s turn");
                    playTracker[0][1] = 1;
                    box2.setClickable(false);
                } else {
                    box2.setText("X");
                    messagetext.setText(player2 + "'s turn");
                    playTracker[0][1] = 2;
                    box2.setClickable(false);
                }
                checkForWinner();
            }
        });

        box3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (counter2 % 2 == 0) {
                    box3.setText("O");
                    messagetext.setText(player1 + "'s turn");
                    playTracker[0][2] = 1;
                    box3.setClickable(false);
                } else {
                    box3.setText("X");
                    messagetext.setText(player2 + "'s turn");
                    playTracker[0][2] = 2;
                    box3.setClickable(false);
                }
                checkForWinner();
            }
        });

        box4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (counter2 % 2 == 0) {
                    box4.setText("O");
                    messagetext.setText(player1 + "'s turn");
                    playTracker[1][0] = 1;
                    box4.setClickable(false);
                } else {
                    box4.setText("X");
                    messagetext.setText(player2 + "'s turn");
                    playTracker[1][0] = 2;
                    box4.setClickable(false);
                }
                checkForWinner();
            }
        });

        box5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (counter2 % 2 == 0) {
                    box5.setText("O");
                    messagetext.setText(player1 + "'s turn");
                    playTracker[1][1] = 1;
                    box5.setClickable(false);
                } else {
                    box5.setText("X");
                    messagetext.setText(player2 + "'s turn");
                    playTracker[1][1] = 2;
                    box5.setClickable(false);
                }
                checkForWinner();
            }
        });

        box6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (counter2 % 2 == 0) {
                    box6.setText("O");
                    messagetext.setText(player1 + "'s turn");
                    playTracker[1][2] = 1;
                    box6.setClickable(false);
                } else {
                    box6.setText("X");
                    messagetext.setText(player2 + "'s turn");
                    playTracker[1][2] = 2;
                    box6.setClickable(false);
                }
                checkForWinner();
            }
        });

        box7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (counter2 % 2 == 0) {
                    box7.setText("O");
                    messagetext.setText(player1 + "'s turn");
                    playTracker[2][0] = 1;
                    box7.setClickable(false);
                } else {
                    box7.setText("X");
                    messagetext.setText(player2 + "'s turn");
                    playTracker[2][0] = 2;
                    box7.setClickable(false);
                }
                checkForWinner();
            }
        });

        box8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (counter2 % 2 == 0) {
                    box8.setText("O");
                    messagetext.setText(player1 + "'s turn");
                    playTracker[2][1] = 1;
                    box8.setClickable(false);
                } else {
                    box8.setText("X");
                    messagetext.setText(player2 + "'s turn");
                    playTracker[2][1] = 2;
                    box8.setClickable(false);
                }
                checkForWinner();
            }
        });

        box9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter2 % 2 == 0) {
                    box9.setText("O");
                    messagetext.setText(player1 + "'s turn");
                    playTracker[2][2] = 1;
                    box9.setClickable(false);
                } else {
                    box9.setText("X");
                    messagetext.setText(player2 + "'s turn");
                    playTracker[2][2] = 2;
                    box9.setClickable(false);
                }
                checkForWinner();
            }
        });
    }

        public void checkForWinner() {
            counter2++;
            //Log.d("checkForWinner", "method invoked");
//             boolean someOneWon = false;

            // if any boxes are zero, dont check
            if ( playTracker[0][0] == 0 || playTracker[0][1] == 0 || playTracker[0][2] == 0 ){
                //dont check
            // else if all three are equal
            } else if(playTracker[0][0] == playTracker[0][1] && playTracker[0][0] == playTracker[0][2]){

                if ( playTracker[0][0] == 1) {
                    Toast.makeText(GameActivity.this, "Player 2 wins", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(GameActivity.this, "Player 1 wins", Toast.LENGTH_SHORT).show();
                }
            }






    }

}
