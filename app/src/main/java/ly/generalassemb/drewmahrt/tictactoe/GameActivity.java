package ly.generalassemb.drewmahrt.tictactoe;

import android.annotation.TargetApi;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Explode;
import android.transition.Fade;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.makeText;

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
    public Button replayButton;

    int[][] playTracker = new int[3][3];
    private int counter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        thingExploder();
        setContentView(R.layout.activity_game);

        replayButton = (Button) findViewById(R.id.replayButton);
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

        messagetext.setText(player1 + getString(R.string.isnaughts));

        box1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (counter2 % 2 == 0) {
                    box1.setText(R.string.O);
                    messagetext.setText(player2 + getString(R.string.sturn));
                    playTracker[0][0] = 1;
                    box1.setClickable(false);
                } else {
                    box1.setText(R.string.X);
                    messagetext.setText(player1 + getString(R.string.sturn));
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
                    box2.setText(R.string.O);
                    messagetext.setText(player2 + getString(R.string.sturn));
                    playTracker[0][1] = 1;
                    box2.setClickable(false);
                } else {
                    box2.setText(R.string.X);
                    messagetext.setText(player1 + getString(R.string.sturn));
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
                    box3.setText(R.string.O);
                    messagetext.setText(player2 + getString(R.string.sturn));
                    playTracker[0][2] = 1;
                    box3.setClickable(false);
                } else {
                    box3.setText(R.string.X);
                    messagetext.setText(player1 + getString(R.string.sturn));
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
                    box4.setText(R.string.O);
                    messagetext.setText(player2 + getString(R.string.sturn));
                    playTracker[1][0] = 1;
                    box4.setClickable(false);
                } else {
                    box4.setText(R.string.X);
                    messagetext.setText(player1 + getString(R.string.sturn));
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
                    box5.setText(R.string.O);
                    messagetext.setText(player2 + getString(R.string.sturn));
                    playTracker[1][1] = 1;
                    box5.setClickable(false);
                } else {
                    box5.setText(R.string.X);
                    messagetext.setText(player1 + getString(R.string.sturn));
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
                    box6.setText(R.string.O);
                    messagetext.setText(player2 + getString(R.string.sturn));
                    playTracker[1][2] = 1;
                    box6.setClickable(false);
                } else {
                    box6.setText(R.string.X);
                    messagetext.setText(player1 + getString(R.string.sturn));
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
                    box7.setText(R.string.O);
                    messagetext.setText(player2 + getString(R.string.sturn));
                    playTracker[2][0] = 1;
                    box7.setClickable(false);
                } else {
                    box7.setText(R.string.X);
                    messagetext.setText(player1 + getString(R.string.sturn));
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
                    box8.setText(R.string.O);
                    messagetext.setText(player2 + getString(R.string.sturn));
                    playTracker[2][1] = 1;
                    box8.setClickable(false);
                } else {
                    box8.setText(R.string.X);
                    messagetext.setText(player1 + getString(R.string.sturn));
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
                    box9.setText(R.string.O);
                    messagetext.setText(player2 + getString(R.string.sturn));
                    playTracker[2][2] = 1;
                    box9.setClickable(false);
                } else {
                    box9.setText(R.string.X);
                    messagetext.setText(player1 + getString(R.string.sturn));
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

    public void thingExploder(){
//        TransitionSet transition = new TransitionSet();
//        transition.addTransition((new ChangeTransform()));
//
//        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
//        getWindow().setSharedElementEnterTransition(transition);
//        getWindow().setSharedElementReturnTransition(transition);

        getWindow().setExitTransition(new Explode());
        getWindow().setEnterTransition(new Fade());
    }

    @TargetApi(Build.VERSION_CODES.M)
    public void checkForWinner() {
        counter2++;

        if (counter2 > 8 && winner == null) {
            makeText(GameActivity.this, R.string.meow, Toast.LENGTH_LONG).show();
            messagetext.setText(R.string.catsgame);
        }

        Intent getIntent = getIntent(); //this shouldn't be here. It's a really shitty hack.
        final String player1 = getIntent.getStringExtra("Player1"); //yup, pretty bad.
        final String player2 = getIntent.getStringExtra("Player2"); //like, wow.

        replayButton.setClickable(true);
        replayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(GameActivity.this, GameActivity.class);
                String name1 = (player1);
                String name2 = (player2);
                mIntent.putExtra("Player1", name1);
                mIntent.putExtra("Player2", name2);

                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(GameActivity.this);

                startActivity(mIntent, options.toBundle());
            }
        });
        //beings horizontal win Checker @ position 0,0
        if (playTracker[0][0] == 0 || playTracker[0][1] == 0 || playTracker[0][2] == 0) {
        } else if (playTracker[0][0] == playTracker[0][1] && playTracker[0][0] == playTracker[0][2]) {

            if (playTracker[0][0] == 1) {
                winner = "1";
                saveWinner();
                makeText(GameActivity.this, R.string.playeronewins, Toast.LENGTH_SHORT).show();
                messagetext.setText(player1 + getString(R.string.Wins));
                disableAllTheClickers();
                box1.setBackgroundColor(getColor(R.color.colorAccent));
                box2.setBackgroundColor(getColor(R.color.colorAccent));
                box3.setBackgroundColor(getColor(R.color.colorAccent));
            } else {
                winner = "2";
                saveWinner();
                makeText(GameActivity.this, R.string.player2wins, Toast.LENGTH_SHORT).show();
                messagetext.setText(player2 + getString(R.string.Wins));
                disableAllTheClickers();
                box1.setBackgroundColor(getColor(R.color.colorAccent));
                box2.setBackgroundColor(getColor(R.color.colorAccent));
                box3.setBackgroundColor(getColor(R.color.colorAccent));
            }
        }
        //line two horizontal checker
        if (playTracker[1][0] == 0 || playTracker[1][1] == 0 || playTracker[1][2] == 0) {
        } else if (playTracker[1][0] == playTracker[1][1] && playTracker[1][0] == playTracker[1][2]) {

            if (playTracker[1][1] == 1) {
                winner = "1";
                saveWinner();
                makeText(GameActivity.this, R.string.playeronewins, Toast.LENGTH_SHORT).show();
                messagetext.setText(player1 + getString(R.string.Wins));
                disableAllTheClickers();
                box4.setBackgroundColor(getColor(R.color.colorAccent));
                box5.setBackgroundColor(getColor(R.color.colorAccent));
                box6.setBackgroundColor(getColor(R.color.colorAccent));
            } else {
                winner = "2";
                saveWinner();
                makeText(GameActivity.this, R.string.player2wins, Toast.LENGTH_SHORT).show();
                messagetext.setText(player2 + getString(R.string.Wins));
                disableAllTheClickers();
                box4.setBackgroundColor(getColor(R.color.colorAccent));
                box5.setBackgroundColor(getColor(R.color.colorAccent));
                box6.setBackgroundColor(getColor(R.color.colorAccent));
            }
        }
        //line three horizontal checker
        if (playTracker[2][0] == 0 || playTracker[2][1] == 0 || playTracker[2][2] == 0) {
        } else if (playTracker[2][0] == playTracker[2][1] && playTracker[2][0] == playTracker[2][2]) {

            if (playTracker[2][1] == 1) {
                winner = "1";
                saveWinner();
                makeText(GameActivity.this, R.string.playeronewins, Toast.LENGTH_SHORT).show();
                messagetext.setText(player1 + getString(R.string.Wins));
                disableAllTheClickers();
                box7.setBackgroundColor(getColor(R.color.colorAccent));
                box8.setBackgroundColor(getColor(R.color.colorAccent));
                box9.setBackgroundColor(getColor(R.color.colorAccent));
            } else {
                winner = "2";
                saveWinner();
                makeText(GameActivity.this, R.string.player2wins, Toast.LENGTH_SHORT).show();
                messagetext.setText(player2 + getString(R.string.Wins));
                disableAllTheClickers();
                box7.setBackgroundColor(getColor(R.color.colorAccent));
                box8.setBackgroundColor(getColor(R.color.colorAccent));
                box9.setBackgroundColor(getColor(R.color.colorAccent));
            }
        }
        //Begins Vertical checkers column 1
        if (playTracker[0][0] == 0 || playTracker[1][0] == 0 || playTracker[2][0] == 0) {
        } else if (playTracker[0][0] == playTracker[1][0] && playTracker[2][0] == playTracker[0][0]) {

            if (playTracker[0][0] == 1) {
                winner = "1";
                saveWinner();
                makeText(GameActivity.this, R.string.playeronewins, Toast.LENGTH_SHORT).show();
                messagetext.setText(player1 + getString(R.string.Wins));
                disableAllTheClickers();
                box1.setBackgroundColor(getColor(R.color.colorAccent));
                box4.setBackgroundColor(getColor(R.color.colorAccent));
                box7.setBackgroundColor(getColor(R.color.colorAccent));
            } else {
                winner = "2";
                saveWinner();
                makeText(GameActivity.this, R.string.player2wins, Toast.LENGTH_SHORT).show();
                messagetext.setText(player2 + getString(R.string.Wins));
                disableAllTheClickers();
                box1.setBackgroundColor(getColor(R.color.colorAccent));
                box4.setBackgroundColor(getColor(R.color.colorAccent));
                box7.setBackgroundColor(getColor(R.color.colorAccent));
            }
        }
        //Vertical checkers column 2
        if (playTracker[0][1] == 0 || playTracker[1][1] == 0 || playTracker[2][1] == 0) {
        } else if (playTracker[0][1] == playTracker[1][1] && playTracker[2][1] == playTracker[0][1]) {

            if (playTracker[0][1] == 1) {
                winner = "1";
                saveWinner();
                makeText(GameActivity.this, R.string.playeronewins, Toast.LENGTH_SHORT).show();
                messagetext.setText(player1 + getString(R.string.Wins));
                disableAllTheClickers();
                box2.setBackgroundColor(getColor(R.color.colorAccent));
                box5.setBackgroundColor(getColor(R.color.colorAccent));
                box8.setBackgroundColor(getColor(R.color.colorAccent));
            } else {
                winner = "2";
                saveWinner();
                makeText(GameActivity.this, R.string.player2wins, Toast.LENGTH_SHORT).show();
                messagetext.setText(player2 + getString(R.string.Wins));
                disableAllTheClickers();
                box2.setBackgroundColor(getColor(R.color.colorAccent));
                box5.setBackgroundColor(getColor(R.color.colorAccent));
                box8.setBackgroundColor(getColor(R.color.colorAccent));
            }
        }
        //Vertical column three checker
        if (playTracker[0][2] == 0 || playTracker[1][2] == 0 || playTracker[2][2] == 0) {
        } else if (playTracker[0][2] == playTracker[1][2] && playTracker[2][2] == playTracker[0][2]) {

            if (playTracker[0][2] == 1) {
                winner = "1";
                saveWinner();
                makeText(GameActivity.this, R.string.playeronewins, Toast.LENGTH_SHORT).show();
                messagetext.setText(player1 + getString(R.string.Wins));
                disableAllTheClickers();
                box3.setBackgroundColor(getColor(R.color.colorAccent));
                box6.setBackgroundColor(getColor(R.color.colorAccent));
                box9.setBackgroundColor(getColor(R.color.colorAccent));
            } else {
                winner = "2";
                saveWinner();
                makeText(GameActivity.this, R.string.player2wins, Toast.LENGTH_SHORT).show();
                messagetext.setText(player2 + getString(R.string.Wins));
                disableAllTheClickers();
                box3.setBackgroundColor(getColor(R.color.colorAccent));
                box6.setBackgroundColor(getColor(R.color.colorAccent));
                box9.setBackgroundColor(getColor(R.color.colorAccent));
            }
        }
        //Diagonal left to right from 0,0 Win checker
        if (playTracker[0][0] == 0 || playTracker[1][1] == 0 || playTracker[2][2] == 0) {
        } else if (playTracker[0][0] == playTracker[1][1] && playTracker[2][2] == playTracker[0][0]) {

            if (playTracker[0][0] == 1) {
                winner = "1";
                saveWinner();
                makeText(GameActivity.this, R.string.playeronewins, Toast.LENGTH_SHORT).show();
                messagetext.setText(player1 + getString(R.string.Wins));
                disableAllTheClickers();
                box1.setBackgroundColor(getColor(R.color.colorAccent));
                box5.setBackgroundColor(getColor(R.color.colorAccent));
                box9.setBackgroundColor(getColor(R.color.colorAccent));
            } else {
                winner = "2";
                saveWinner();
                makeText(GameActivity.this, R.string.player2wins, Toast.LENGTH_SHORT).show();
                messagetext.setText(player2 + getString(R.string.Wins));
                disableAllTheClickers();
                box1.setBackgroundColor(getColor(R.color.colorAccent));
                box5.setBackgroundColor(getColor(R.color.colorAccent));
                box9.setBackgroundColor(getColor(R.color.colorAccent));
            }
        }
        //Diagonal from left to right starting at 2,0 win checker
        if (playTracker[2][0] == 0 || playTracker[1][1] == 0 || playTracker[0][2] == 0) {
        } else if (playTracker[2][0] == playTracker[1][1] && playTracker[0][2] == playTracker[2][0]) {

            if (playTracker[2][0] == 1) {
                winner = "1";
                saveWinner();
                makeText(GameActivity.this, R.string.playeronewins, Toast.LENGTH_SHORT).show();
                messagetext.setText(player1 + getString(R.string.Wins));
                disableAllTheClickers();
                box3.setBackgroundColor(getColor(R.color.colorAccent));
                box5.setBackgroundColor(getColor(R.color.colorAccent));
                box7.setBackgroundColor(getColor(R.color.colorAccent));
            } else {
                winner = "2";
                saveWinner();
                makeText(GameActivity.this, R.string.player2wins, Toast.LENGTH_SHORT).show();
                messagetext.setText(player2 + getString(R.string.Wins));
                disableAllTheClickers();
                box3.setBackgroundColor(getColor(R.color.colorAccent));
                box5.setBackgroundColor(getColor(R.color.colorAccent));
                box7.setBackgroundColor(getColor(R.color.colorAccent));
            }
        }
    }
}

