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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        box1 = (TextView)findViewById(R.id.textView);
        box2 = (TextView)findViewById(R.id.textView2);
        box3 = (TextView)findViewById(R.id.textView3);
        box4 = (TextView)findViewById(R.id.textView4);
        box5 = (TextView)findViewById(R.id.textView5);
        box6 = (TextView)findViewById(R.id.textView6);
        box7 = (TextView)findViewById(R.id.textView7);
        box8 = (TextView)findViewById(R.id.textView8);
        box9 = (TextView)findViewById(R.id.textView9);

        Intent getIntent = getIntent();
        String player1 = getIntent.getStringExtra("Player1");
        String player2 = getIntent.getStringExtra("Player2");
        //just a test to make sure my shizznit is coming over
        //Log.d("GameActivity", player1);

        box1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });




    }
}
