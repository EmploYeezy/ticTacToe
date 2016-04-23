package ly.generalassemb.drewmahrt.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

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
    private int position;
    private int counter;
    private int mplayer1;
    private int mplayer2;

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
        String player2 = getIntent.getStringExtra("Player2");
        //just a test to make sure my shizznit is coming over
        //Log.d("GameActivity", player1);

        while (counter < 9) {
            switch (position) {
                case 0:
                    counter++;
                    messagetext.setText(player1);
                    break;
                case 1:
                    counter++;
                    messagetext.setText(player2);
                    break;
                case 2:
                    counter++;
                    messagetext.setText(player1);
                    break;
                case 3:
                    counter++;
                    messagetext.setText(player2);
                    break;
                case 4:
                    counter++;
                    messagetext.setText(player1);
                    break;
                case 5:
                    counter++;
                    messagetext.setText(player2);
                    break;
                case 6:
                    counter++;
                    messagetext.setText(player1);
                    break;
                case 7:
                    counter++;
                    messagetext.setText(player2);
                    break;
                case 8:
                    counter++;
                    messagetext.setText(player1);
                    break;
                default:
                    messagetext.setText("no more turns");

        mplayer1 = (1);
        mplayer2 = (2);

        box1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((counter == 0) || (counter == 2) || (counter == 4) || (counter == 6) || (counter == 8)){
                    messagetext.setText("X");
                } else {
                    messagetext.setText("O");
                }
            }
        });







            }
        }
    }
}






//
//        box1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                counter++;
//
//            }
//        });
