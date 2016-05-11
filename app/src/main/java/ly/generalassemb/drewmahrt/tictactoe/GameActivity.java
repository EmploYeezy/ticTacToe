package ly.generalassemb.drewmahrt.tictactoe;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
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
    public String winner;
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

        messagetext.setText(player1 + " is naughts");


        box1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (counter2 % 2 == 0) {
                    box1.setText("O");
                    messagetext.setText(player2 + "'s turn");
                    playTracker[0][0] = 1;
                    box1.setClickable(false);
                } else {
                    box1.setText("X");
                    messagetext.setText(player1 + "'s turn");
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
                    messagetext.setText(player2 + "'s turn");
                    playTracker[0][1] = 1;
                    box2.setClickable(false);
                } else {
                    box2.setText("X");
                    messagetext.setText(player1 + "'s turn");
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
                    messagetext.setText(player2 + "'s turn");
                    playTracker[0][2] = 1;
                    box3.setClickable(false);
                } else {
                    box3.setText("X");
                    messagetext.setText(player1 + "'s turn");
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
                    messagetext.setText(player2 + "'s turn");
                    playTracker[1][0] = 1;
                    box4.setClickable(false);
                } else {
                    box4.setText("X");
                    messagetext.setText(player1 + "'s turn");
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
                    messagetext.setText(player2 + "'s turn");
                    playTracker[1][1] = 1;
                    box5.setClickable(false);
                } else {
                    box5.setText("X");
                    messagetext.setText(player1 + "'s turn");
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
                    messagetext.setText(player2 + "'s turn");
                    playTracker[1][2] = 1;
                    box6.setClickable(false);
                } else {
                    box6.setText("X");
                    messagetext.setText(player1 + "'s turn");
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
                    messagetext.setText(player2 + "'s turn");
                    playTracker[2][0] = 1;
                    box7.setClickable(false);
                } else {
                    box7.setText("X");
                    messagetext.setText(player1 + "'s turn");
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
                    messagetext.setText(player2 + "'s turn");
                    playTracker[2][1] = 1;
                    box8.setClickable(false);
                } else {
                    box8.setText("X");
                    messagetext.setText(player1 + "'s turn");
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
                    messagetext.setText(player2 + "'s turn");
                    playTracker[2][2] = 1;
                    box9.setClickable(false);
                } else {
                    box9.setText("X");
                    messagetext.setText(player1 + "'s turn");
                    playTracker[2][2] = 2;
                    box9.setClickable(false);
                }
                checkForWinner();
            }
        });
    }



    @Override
    public String toString() {
        return "GameActivity{" +
                "winner='" + winner + '\'' +
                '}';
    }

    public void saveWinner() {
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("naughtsAndCrossesKey", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("winner", winner);
        editor.commit();
    }

    public void disableAllTheClickers() {
        box1.setClickable(false);
        box2.setClickable(false);
        box3.setClickable(false);
        box4.setClickable(false);
        box5.setClickable(false);
        box6.setClickable(false);
        box7.setClickable(false);
        box8.setClickable(false);
        box9.setClickable(false);
    }

    @TargetApi(Build.VERSION_CODES.M)
    public void checkForWinner() {
            counter2++;
        Intent getIntent = getIntent();
        final String player1 = getIntent.getStringExtra("Player1");
        final String player2 = getIntent.getStringExtra("Player2");

        if (counter2 == 9 && winner == null) {
            messagetext.setText("Cat's Game :(");
            Toast.makeText(GameActivity.this, "here kitty kitty... Meow", Toast.LENGTH_LONG).show();
        }

        //beings horizontal win Checker @ position 0,0
            if (playTracker[0][0] == 0 || playTracker[0][1] == 0 || playTracker[0][2] == 0 ){
            } else if(playTracker[0][0] == playTracker[0][1] && playTracker[0][0] == playTracker[0][2]){

                if (playTracker[0][0] == 1) {
                    winner = "1";
                    saveWinner();
                    Toast.makeText(GameActivity.this, "Player 1 wins", Toast.LENGTH_SHORT).show();
                    messagetext.setText(player1 + " Wins!");
                    disableAllTheClickers();
                    box1.setBackgroundColor(getColor(R.color.colorAccent));
                    box2.setBackgroundColor(getColor(R.color.colorAccent));
                    box3.setBackgroundColor(getColor(R.color.colorAccent));
                } else {
                    winner = "2";
                    saveWinner();
                    Toast.makeText(GameActivity.this, "Player 2 wins", Toast.LENGTH_SHORT).show();
                    messagetext.setText(player2 + " Wins!");
                    disableAllTheClickers();
                    box1.setBackgroundColor(getColor(R.color.colorAccent));
                    box2.setBackgroundColor(getColor(R.color.colorAccent));
                    box3.setBackgroundColor(getColor(R.color.colorAccent));
                }
            }

            //line two horizontal checker
            if (playTracker[1][0] == 0 || playTracker[1][1] == 0 || playTracker[1][2] == 0 ){
            } else if(playTracker[1][0] == playTracker[1][1] && playTracker[1][0] == playTracker[1][2]){

                if (playTracker[1][1] == 1) {
                    winner = "1";
                    saveWinner();
                    Toast.makeText(GameActivity.this, "Player 1 wins", Toast.LENGTH_SHORT).show();
                    messagetext.setText(player1 + " Wins!");
                    disableAllTheClickers();
                    box4.setBackgroundColor(getColor(R.color.colorAccent));
                    box5.setBackgroundColor(getColor(R.color.colorAccent));
                    box6.setBackgroundColor(getColor(R.color.colorAccent));
                } else {
                    winner = "2";
                    saveWinner();
                    Toast.makeText(GameActivity.this, "Player 2 wins", Toast.LENGTH_SHORT).show();
                    messagetext.setText(player2 + " Wins!");
                    disableAllTheClickers();
                    box4.setBackgroundColor(getColor(R.color.colorAccent));
                    box5.setBackgroundColor(getColor(R.color.colorAccent));
                    box6.setBackgroundColor(getColor(R.color.colorAccent));
                }
            }

            //line three horizontal checker
            if (playTracker[2][0] == 0 || playTracker[2][1] == 0 || playTracker[2][2] == 0 ){
            } else if(playTracker[2][0] == playTracker[2][1] && playTracker[2][0] == playTracker[2][2]){

                if (playTracker[2][1] == 1) {
                    winner = "1";
                    saveWinner();
                    Toast.makeText(GameActivity.this, "Player 1 wins", Toast.LENGTH_SHORT).show();
                    messagetext.setText(player1 + " Wins!");
                    disableAllTheClickers();
                    box7.setBackgroundColor(getColor(R.color.colorAccent));
                    box8.setBackgroundColor(getColor(R.color.colorAccent));
                    box9.setBackgroundColor(getColor(R.color.colorAccent));
                } else {
                    winner = "2";
                    saveWinner();
                    Toast.makeText(GameActivity.this, "Player 2 wins", Toast.LENGTH_SHORT).show();
                    messagetext.setText(player2 + " Wins!");
                    disableAllTheClickers();
                    box7.setBackgroundColor(getColor(R.color.colorAccent));
                    box8.setBackgroundColor(getColor(R.color.colorAccent));
                    box9.setBackgroundColor(getColor(R.color.colorAccent));
                }
            }

            //Begins Vertical checkers column 1
            if (playTracker[0][0] == 0 || playTracker[1][0] == 0 || playTracker[2][0] == 0 ){
            } else if(playTracker[0][0] == playTracker[1][0] && playTracker[2][0] == playTracker[0][0]){

                if (playTracker[0][0] == 1) {
                    winner = "1";
                    saveWinner();
                    Toast.makeText(GameActivity.this, "Player 1 wins", Toast.LENGTH_SHORT).show();
                    messagetext.setText(player1 + " Wins!");
                    disableAllTheClickers();
                    box1.setBackgroundColor(getColor(R.color.colorAccent));
                    box4.setBackgroundColor(getColor(R.color.colorAccent));
                    box7.setBackgroundColor(getColor(R.color.colorAccent));
                } else {
                    winner = "2";
                    saveWinner();
                    Toast.makeText(GameActivity.this, "Player 2 wins", Toast.LENGTH_SHORT).show();
                    messagetext.setText(player2 + " Wins!");
                    disableAllTheClickers();
                    box1.setBackgroundColor(getColor(R.color.colorAccent));
                    box4.setBackgroundColor(getColor(R.color.colorAccent));
                    box7.setBackgroundColor(getColor(R.color.colorAccent));
                }
            }

                //Vertical checkers column 2
            if (playTracker[0][1] == 0 || playTracker[1][1] == 0 || playTracker[2][1] == 0 ){
            } else if(playTracker[0][1] == playTracker[1][1] && playTracker[2][1] == playTracker[0][1]){

                if (playTracker[0][1] == 1) {
                    winner = "1";
                    saveWinner();
                    Toast.makeText(GameActivity.this, "Player 1 wins", Toast.LENGTH_SHORT).show();
                    messagetext.setText(player1 + " Wins!");
                    disableAllTheClickers();
                    box2.setBackgroundColor(getColor(R.color.colorAccent));
                    box5.setBackgroundColor(getColor(R.color.colorAccent));
                    box8.setBackgroundColor(getColor(R.color.colorAccent));
                } else {
                    winner = "2";
                    saveWinner();
                    Toast.makeText(GameActivity.this, "Player 2 wins", Toast.LENGTH_SHORT).show();
                    messagetext.setText(player2 + " Wins!");
                    disableAllTheClickers();
                    box2.setBackgroundColor(getColor(R.color.colorAccent));
                    box5.setBackgroundColor(getColor(R.color.colorAccent));
                    box8.setBackgroundColor(getColor(R.color.colorAccent));
                }
            }

                //Vertical column three checker
            if (playTracker[0][2] == 0 || playTracker[1][2] == 0 || playTracker[2][2] == 0 ){
            } else if(playTracker[0][2] == playTracker[1][2] && playTracker[2][2] == playTracker[0][2]){

                if (playTracker[0][2] == 1) {
                    winner = "1";
                    saveWinner();
                    Toast.makeText(GameActivity.this, "Player 1 wins", Toast.LENGTH_SHORT).show();
                    messagetext.setText(player1 + " Wins!");
                    disableAllTheClickers();
                    box3.setBackgroundColor(getColor(R.color.colorAccent));
                    box6.setBackgroundColor(getColor(R.color.colorAccent));
                    box9.setBackgroundColor(getColor(R.color.colorAccent));
                } else {
                    winner = "2";
                    saveWinner();
                    Toast.makeText(GameActivity.this, "Player 2 wins", Toast.LENGTH_SHORT).show();
                    messagetext.setText(player2 + " Wins!");
                    disableAllTheClickers();
                    box3.setBackgroundColor(getColor(R.color.colorAccent));
                    box6.setBackgroundColor(getColor(R.color.colorAccent));
                    box9.setBackgroundColor(getColor(R.color.colorAccent));
                }
            }
                //Diagonal left to right from 0,0 Win checker
            if (playTracker[0][0] == 0 || playTracker[1][1] == 0 || playTracker[2][2] == 0 ){
            } else if(playTracker[0][0] == playTracker[1][1] && playTracker[2][2] == playTracker[0][0]){

                if (playTracker[0][0] == 1) {
                    winner = "1";
                    saveWinner();
                    Toast.makeText(GameActivity.this, "Player 1 wins", Toast.LENGTH_SHORT).show();
                    messagetext.setText(player1 + " Wins!");
                    disableAllTheClickers();
                    box1.setBackgroundColor(getColor(R.color.colorAccent));
                    box5.setBackgroundColor(getColor(R.color.colorAccent));
                    box9.setBackgroundColor(getColor(R.color.colorAccent));
                } else {
                    winner = "2";
                    saveWinner();
                    Toast.makeText(GameActivity.this, "Player 2 wins", Toast.LENGTH_SHORT).show();
                    messagetext.setText(player2 + " Wins!");
                    disableAllTheClickers();
                    box1.setBackgroundColor(getColor(R.color.colorAccent));
                    box5.setBackgroundColor(getColor(R.color.colorAccent));
                    box9.setBackgroundColor(getColor(R.color.colorAccent));
                }
            }
                //Diagonal from left to right starting at 2,0 win checker
            if (playTracker[2][0] == 0 || playTracker[1][1] == 0 || playTracker[0][2] == 0 ){
            } else if(playTracker[2][0] == playTracker[1][1] && playTracker[0][2] == playTracker[2][0]){

                if (playTracker[2][0] == 1) {
                    winner = "1";
                    saveWinner();
                    Toast.makeText(GameActivity.this, "Player 1 wins", Toast.LENGTH_SHORT).show();
                    messagetext.setText(player1 + " Wins!");
                    disableAllTheClickers();
                    box3.setBackgroundColor(getColor(R.color.colorAccent));
                    box5.setBackgroundColor(getColor(R.color.colorAccent));
                    box7.setBackgroundColor(getColor(R.color.colorAccent));
                } else {
                    winner = "2";
                    saveWinner();
                    Toast.makeText(GameActivity.this, "Player 2 wins", Toast.LENGTH_SHORT).show();
                    messagetext.setText(player2 + " Wins!");
                    disableAllTheClickers();
                    box3.setBackgroundColor(getColor(R.color.colorAccent));
                    box5.setBackgroundColor(getColor(R.color.colorAccent));
                    box7.setBackgroundColor(getColor(R.color.colorAccent));
                }
            }

    }

}
