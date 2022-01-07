package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    String turn = "X";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //region Declare
        Button btnX1Y1 = (Button) findViewById(R.id.kletkaX1Y1);
        Button btnX2Y1 = (Button) findViewById(R.id.kletkaX2Y1);
        Button btnX3Y1 = (Button) findViewById(R.id.kletkaX3Y1);
        Button btnX1Y2 = (Button) findViewById(R.id.kletkaX1Y2);
        Button btnX2Y2 = (Button) findViewById(R.id.kletkaX2Y2);
        Button btnX3Y2 = (Button) findViewById(R.id.kletkaX3Y2);
        Button btnX1Y3 = (Button) findViewById(R.id.kletkaX1Y3);
        Button btnX2Y3 = (Button) findViewById(R.id.kletkaX2Y3);
        Button btnX3Y3 = (Button) findViewById(R.id.kletkaX3Y3);
        Button menu = (Button) findViewById(R.id.menuButton);

        TextView winner = (TextView) findViewById(R.id.winner);
        //endregion

        //region KletkaClick

        btnX1Y1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner.setVisibility(View.INVISIBLE);
                btnX1Y1.setText(turn);
                if (turn == "O")
                {
                    turn = "X";
                }
                else
                {
                    turn = "O";
                }
                btnX1Y1.setClickable(false);
                Check();
            }
        });
        
        btnX2Y1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner.setVisibility(View.INVISIBLE);
                btnX2Y1.setText(turn);
                if (turn == "O")
                {
                    turn = "X";
                }
                else
                {
                    turn = "O";
                }
                btnX2Y1.setClickable(false);
                Check();
            }
        });

        btnX3Y1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner.setVisibility(View.INVISIBLE);
                btnX3Y1.setText(turn);
                if (turn == "O")
                {
                    turn = "X";
                }
                else
                {
                    turn = "O";
                }
                btnX3Y1.setClickable(false);
                Check();
            }
        });

        btnX1Y2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner.setVisibility(View.INVISIBLE);
                btnX1Y2.setText(turn);
                if (turn == "O")
                {
                    turn = "X";
                }
                else
                {
                    turn = "O";
                }
                btnX1Y2.setClickable(false);
                Check();
            }
        });

        btnX2Y2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner.setVisibility(View.INVISIBLE);
                btnX2Y2.setText(turn);
                if (turn == "O")
                {
                    turn = "X";
                }
                else
                {
                    turn = "O";
                }
                btnX2Y2.setClickable(false);
                Check();
            }
        });

        btnX3Y2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner.setVisibility(View.INVISIBLE);
                btnX3Y2.setText(turn);
                if (turn == "O")
                {
                    turn = "X";
                }
                else
                {
                    turn = "O";
                }
                btnX3Y2.setClickable(false);
                Check();
            }
        });

        btnX1Y3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner.setVisibility(View.INVISIBLE);
                btnX1Y3.setText(turn);
                if (turn == "O")
                {
                    turn = "X";
                }
                else
                {
                    turn = "O";
                }
                btnX1Y3.setClickable(false);
                Check();
            }
        });

        btnX2Y3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner.setVisibility(View.INVISIBLE);
                btnX2Y3.setText(turn);
                if (turn == "O")
                {
                    turn = "X";
                }
                else
                {
                    turn = "O";
                }
                btnX2Y3.setClickable(false);
                Check();
            }
        });

        btnX3Y3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner.setVisibility(View.INVISIBLE);
                btnX3Y3.setText(turn);
                if (turn == "O")
                {
                    turn = "X";
                }
                else
                {
                    turn = "O";
                }
                btnX3Y3.setClickable(false);
                Check();
            }
        });

        //endregion

        //region Menu
        menu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
                startActivity(new Intent(SecondActivity.this, MainActivity.class));
            }
        });
        //endregion
    }

    void Check()
    {
        //region Declare
        Button btnX1Y1 = (Button) findViewById(R.id.kletkaX1Y1);
        Button btnX2Y1 = (Button) findViewById(R.id.kletkaX2Y1);
        Button btnX3Y1 = (Button) findViewById(R.id.kletkaX3Y1);
        Button btnX1Y2 = (Button) findViewById(R.id.kletkaX1Y2);
        Button btnX2Y2 = (Button) findViewById(R.id.kletkaX2Y2);
        Button btnX3Y2 = (Button) findViewById(R.id.kletkaX3Y2);
        Button btnX1Y3 = (Button) findViewById(R.id.kletkaX1Y3);
        Button btnX2Y3 = (Button) findViewById(R.id.kletkaX2Y3);
        Button btnX3Y3 = (Button) findViewById(R.id.kletkaX3Y3);

        TextView winner = (TextView) findViewById(R.id.winner);
        //endregion

        //region X
        if (btnX1Y1.getText().toString().equals("X"))
        {
            if (btnX1Y2.getText().toString().equals("X"))
            {
                if (btnX1Y3.getText().toString().equals("X"))
                {
                    btnX1Y1.setText("");
                    btnX2Y1.setText("");
                    btnX3Y1.setText("");
                    btnX1Y2.setText("");
                    btnX2Y2.setText("");
                    btnX3Y2.setText("");
                    btnX1Y3.setText("");
                    btnX2Y3.setText("");
                    btnX3Y3.setText("");
                    turn = "X";

                    btnX1Y1.setClickable(true);
                    btnX2Y1.setClickable(true);
                    btnX3Y1.setClickable(true);
                    btnX1Y2.setClickable(true);
                    btnX2Y2.setClickable(true);
                    btnX3Y2.setClickable(true);
                    btnX1Y3.setClickable(true);
                    btnX2Y3.setClickable(true);
                    btnX3Y3.setClickable(true);
                    winner.setVisibility(View.VISIBLE);
                    winner.setText("X WINS!");
                }
            }
        }
        if (btnX2Y1.getText().toString().equals("X"))
        {
            if (btnX2Y2.getText().toString().equals("X"))
            {
                if (btnX2Y3.getText().toString().equals("X"))
                {
                    btnX1Y1.setText("");
                    btnX2Y1.setText("");
                    btnX3Y1.setText("");
                    btnX1Y2.setText("");
                    btnX2Y2.setText("");
                    btnX3Y2.setText("");
                    btnX1Y3.setText("");
                    btnX2Y3.setText("");
                    btnX3Y3.setText("");
                    turn = "X";

                    btnX1Y1.setClickable(true);
                    btnX2Y1.setClickable(true);
                    btnX3Y1.setClickable(true);
                    btnX1Y2.setClickable(true);
                    btnX2Y2.setClickable(true);
                    btnX3Y2.setClickable(true);
                    btnX1Y3.setClickable(true);
                    btnX2Y3.setClickable(true);
                    btnX3Y3.setClickable(true);
                    winner.setVisibility(View.VISIBLE);
                    winner.setText("X WINS!");
                }
            }
        }
        if (btnX3Y1.getText().toString().equals("X"))
        {
            if (btnX3Y2.getText().toString().equals("X"))
            {
                if (btnX3Y3.getText().toString().equals("X"))
                {
                    btnX1Y1.setText("");
                    btnX2Y1.setText("");
                    btnX3Y1.setText("");
                    btnX1Y2.setText("");
                    btnX2Y2.setText("");
                    btnX3Y2.setText("");
                    btnX1Y3.setText("");
                    btnX2Y3.setText("");
                    btnX3Y3.setText("");
                    turn = "X";

                    btnX1Y1.setClickable(true);
                    btnX2Y1.setClickable(true);
                    btnX3Y1.setClickable(true);
                    btnX1Y2.setClickable(true);
                    btnX2Y2.setClickable(true);
                    btnX3Y2.setClickable(true);
                    btnX1Y3.setClickable(true);
                    btnX2Y3.setClickable(true);
                    btnX3Y3.setClickable(true);
                    winner.setVisibility(View.VISIBLE);
                    winner.setText("X WINS!");
                }
            }
        }

        if (btnX1Y1.getText().toString().equals("X"))
        {
            if (btnX2Y1.getText().toString().equals("X"))
            {
                if (btnX3Y1.getText().toString().equals("X"))
                {
                    btnX1Y1.setText("");
                    btnX2Y1.setText("");
                    btnX3Y1.setText("");
                    btnX1Y2.setText("");
                    btnX2Y2.setText("");
                    btnX3Y2.setText("");
                    btnX1Y3.setText("");
                    btnX2Y3.setText("");
                    btnX3Y3.setText("");
                    turn = "X";

                    btnX1Y1.setClickable(true);
                    btnX2Y1.setClickable(true);
                    btnX3Y1.setClickable(true);
                    btnX1Y2.setClickable(true);
                    btnX2Y2.setClickable(true);
                    btnX3Y2.setClickable(true);
                    btnX1Y3.setClickable(true);
                    btnX2Y3.setClickable(true);
                    btnX3Y3.setClickable(true);
                    winner.setVisibility(View.VISIBLE);
                    winner.setText("X WINS!");
                }
            }
        }
        if (btnX1Y2.getText().toString().equals("X"))
        {
            if (btnX2Y2.getText().toString().equals("X"))
            {
                if (btnX3Y2.getText().toString().equals("X"))
                {
                    btnX1Y1.setText("");
                    btnX2Y1.setText("");
                    btnX3Y1.setText("");
                    btnX1Y2.setText("");
                    btnX2Y2.setText("");
                    btnX3Y2.setText("");
                    btnX1Y3.setText("");
                    btnX2Y3.setText("");
                    btnX3Y3.setText("");
                    turn = "X";

                    btnX1Y1.setClickable(true);
                    btnX2Y1.setClickable(true);
                    btnX3Y1.setClickable(true);
                    btnX1Y2.setClickable(true);
                    btnX2Y2.setClickable(true);
                    btnX3Y2.setClickable(true);
                    btnX1Y3.setClickable(true);
                    btnX2Y3.setClickable(true);
                    btnX3Y3.setClickable(true);
                    winner.setVisibility(View.VISIBLE);
                    winner.setText("X WINS!");
                }
            }
        }
        if (btnX1Y3.getText().toString().equals("X"))
        {
            if (btnX2Y3.getText().toString().equals("X"))
            {
                if (btnX3Y3.getText().toString().equals("X"))
                {
                    btnX1Y1.setText("");
                    btnX2Y1.setText("");
                    btnX3Y1.setText("");
                    btnX1Y2.setText("");
                    btnX2Y2.setText("");
                    btnX3Y2.setText("");
                    btnX1Y3.setText("");
                    btnX2Y3.setText("");
                    btnX3Y3.setText("");
                    turn = "X";

                    btnX1Y1.setClickable(true);
                    btnX2Y1.setClickable(true);
                    btnX3Y1.setClickable(true);
                    btnX1Y2.setClickable(true);
                    btnX2Y2.setClickable(true);
                    btnX3Y2.setClickable(true);
                    btnX1Y3.setClickable(true);
                    btnX2Y3.setClickable(true);
                    btnX3Y3.setClickable(true);
                    winner.setVisibility(View.VISIBLE);
                    winner.setText("X WINS!");
                }
            }
        }

        if (btnX1Y1.getText().toString().equals("X"))
        {
            if (btnX2Y2.getText().toString().equals("X"))
            {
                if (btnX3Y3.getText().toString().equals("X"))
                {
                    btnX1Y1.setText("");
                    btnX2Y1.setText("");
                    btnX3Y1.setText("");
                    btnX1Y2.setText("");
                    btnX2Y2.setText("");
                    btnX3Y2.setText("");
                    btnX1Y3.setText("");
                    btnX2Y3.setText("");
                    btnX3Y3.setText("");
                    turn = "X";

                    btnX1Y1.setClickable(true);
                    btnX2Y1.setClickable(true);
                    btnX3Y1.setClickable(true);
                    btnX1Y2.setClickable(true);
                    btnX2Y2.setClickable(true);
                    btnX3Y2.setClickable(true);
                    btnX1Y3.setClickable(true);
                    btnX2Y3.setClickable(true);
                    btnX3Y3.setClickable(true);
                    winner.setVisibility(View.VISIBLE);
                    winner.setText("X WINS!");
                }
            }
        }
        if (btnX3Y1.getText().toString().equals("X"))
        {
            if (btnX2Y2.getText().toString().equals("X"))
            {
                if (btnX1Y3.getText().toString().equals("X"))
                {
                    btnX1Y1.setText("");
                    btnX2Y1.setText("");
                    btnX3Y1.setText("");
                    btnX1Y2.setText("");
                    btnX2Y2.setText("");
                    btnX3Y2.setText("");
                    btnX1Y3.setText("");
                    btnX2Y3.setText("");
                    btnX3Y3.setText("");
                    turn = "X";

                    btnX1Y1.setClickable(true);
                    btnX2Y1.setClickable(true);
                    btnX3Y1.setClickable(true);
                    btnX1Y2.setClickable(true);
                    btnX2Y2.setClickable(true);
                    btnX3Y2.setClickable(true);
                    btnX1Y3.setClickable(true);
                    btnX2Y3.setClickable(true);
                    btnX3Y3.setClickable(true);
                    winner.setVisibility(View.VISIBLE);
                    winner.setText("X WINS!");
                }
            }
        }

        //endregion

        //region O
        if (btnX1Y1.getText().toString().equals("O"))
        {
            if (btnX1Y2.getText().toString().equals("O"))
            {
                if (btnX1Y3.getText().toString().equals("O"))
                {
                    btnX1Y1.setText("");
                    btnX2Y1.setText("");
                    btnX3Y1.setText("");
                    btnX1Y2.setText("");
                    btnX2Y2.setText("");
                    btnX3Y2.setText("");
                    btnX1Y3.setText("");
                    btnX2Y3.setText("");
                    btnX3Y3.setText("");
                    turn = "X";

                    btnX1Y1.setClickable(true);
                    btnX2Y1.setClickable(true);
                    btnX3Y1.setClickable(true);
                    btnX1Y2.setClickable(true);
                    btnX2Y2.setClickable(true);
                    btnX3Y2.setClickable(true);
                    btnX1Y3.setClickable(true);
                    btnX2Y3.setClickable(true);
                    btnX3Y3.setClickable(true);
                    winner.setVisibility(View.VISIBLE);
                    winner.setText("O WINS!");
                }
            }


        }
        if (btnX2Y1.getText().toString().equals("O"))
        {
            if (btnX2Y2.getText().toString().equals("O"))
            {
                if (btnX2Y3.getText().toString().equals("O"))
                {
                    btnX1Y1.setText("");
                    btnX2Y1.setText("");
                    btnX3Y1.setText("");
                    btnX1Y2.setText("");
                    btnX2Y2.setText("");
                    btnX3Y2.setText("");
                    btnX1Y3.setText("");
                    btnX2Y3.setText("");
                    btnX3Y3.setText("");
                    turn = "X";

                    btnX1Y1.setClickable(true);
                    btnX2Y1.setClickable(true);
                    btnX3Y1.setClickable(true);
                    btnX1Y2.setClickable(true);
                    btnX2Y2.setClickable(true);
                    btnX3Y2.setClickable(true);
                    btnX1Y3.setClickable(true);
                    btnX2Y3.setClickable(true);
                    btnX3Y3.setClickable(true);
                    winner.setVisibility(View.VISIBLE);
                    winner.setText("O WINS!");
                }
            }
        }
        if (btnX3Y1.getText().toString().equals("O"))
        {
            if (btnX3Y2.getText().toString().equals("O"))
            {
                if (btnX3Y3.getText().toString().equals("O"))
                {
                    btnX1Y1.setText("");
                    btnX2Y1.setText("");
                    btnX3Y1.setText("");
                    btnX1Y2.setText("");
                    btnX2Y2.setText("");
                    btnX3Y2.setText("");
                    btnX1Y3.setText("");
                    btnX2Y3.setText("");
                    btnX3Y3.setText("");
                    turn = "X";

                    btnX1Y1.setClickable(true);
                    btnX2Y1.setClickable(true);
                    btnX3Y1.setClickable(true);
                    btnX1Y2.setClickable(true);
                    btnX2Y2.setClickable(true);
                    btnX3Y2.setClickable(true);
                    btnX1Y3.setClickable(true);
                    btnX2Y3.setClickable(true);
                    btnX3Y3.setClickable(true);
                    winner.setVisibility(View.VISIBLE);
                    winner.setText("O WINS!");
                }
            }
        }

        if (btnX1Y1.getText().toString().equals("O"))
        {
            if (btnX2Y1.getText().toString().equals("O"))
            {
                if (btnX3Y1.getText().toString().equals("O"))
                {
                    btnX1Y1.setText("");
                    btnX2Y1.setText("");
                    btnX3Y1.setText("");
                    btnX1Y2.setText("");
                    btnX2Y2.setText("");
                    btnX3Y2.setText("");
                    btnX1Y3.setText("");
                    btnX2Y3.setText("");
                    btnX3Y3.setText("");
                    turn = "X";

                    btnX1Y1.setClickable(true);
                    btnX2Y1.setClickable(true);
                    btnX3Y1.setClickable(true);
                    btnX1Y2.setClickable(true);
                    btnX2Y2.setClickable(true);
                    btnX3Y2.setClickable(true);
                    btnX1Y3.setClickable(true);
                    btnX2Y3.setClickable(true);
                    btnX3Y3.setClickable(true);
                    winner.setVisibility(View.VISIBLE);
                    winner.setText("O WINS!");
                }
            }
        }
        if (btnX1Y2.getText().toString().equals("O"))
        {
            if (btnX2Y2.getText().toString().equals("O"))
            {
                if (btnX3Y2.getText().toString().equals("O"))
                {
                    btnX1Y1.setText("");
                    btnX2Y1.setText("");
                    btnX3Y1.setText("");
                    btnX1Y2.setText("");
                    btnX2Y2.setText("");
                    btnX3Y2.setText("");
                    btnX1Y3.setText("");
                    btnX2Y3.setText("");
                    btnX3Y3.setText("");
                    turn = "X";

                    btnX1Y1.setClickable(true);
                    btnX2Y1.setClickable(true);
                    btnX3Y1.setClickable(true);
                    btnX1Y2.setClickable(true);
                    btnX2Y2.setClickable(true);
                    btnX3Y2.setClickable(true);
                    btnX1Y3.setClickable(true);
                    btnX2Y3.setClickable(true);
                    btnX3Y3.setClickable(true);
                    winner.setVisibility(View.VISIBLE);
                    winner.setText("O WINS!");
                }
            }
        }
        if (btnX1Y3.getText().toString().equals("O"))
        {
            if (btnX2Y3.getText().toString().equals("O"))
            {
                if (btnX3Y3.getText().toString().equals("O"))
                {
                    btnX1Y1.setText("");
                    btnX2Y1.setText("");
                    btnX3Y1.setText("");
                    btnX1Y2.setText("");
                    btnX2Y2.setText("");
                    btnX3Y2.setText("");
                    btnX1Y3.setText("");
                    btnX2Y3.setText("");
                    btnX3Y3.setText("");
                    turn = "X";

                    btnX1Y1.setClickable(true);
                    btnX2Y1.setClickable(true);
                    btnX3Y1.setClickable(true);
                    btnX1Y2.setClickable(true);
                    btnX2Y2.setClickable(true);
                    btnX3Y2.setClickable(true);
                    btnX1Y3.setClickable(true);
                    btnX2Y3.setClickable(true);
                    btnX3Y3.setClickable(true);
                    winner.setVisibility(View.VISIBLE);
                    winner.setText("O WINS!");
                }
            }
        }

        if (btnX1Y1.getText().toString().equals("O"))
        {
            if (btnX2Y2.getText().toString().equals("O"))
            {
                if (btnX3Y3.getText().toString().equals("O"))
                {
                    btnX1Y1.setText("");
                    btnX2Y1.setText("");
                    btnX3Y1.setText("");
                    btnX1Y2.setText("");
                    btnX2Y2.setText("");
                    btnX3Y2.setText("");
                    btnX1Y3.setText("");
                    btnX2Y3.setText("");
                    btnX3Y3.setText("");
                    turn = "X";

                    btnX1Y1.setClickable(true);
                    btnX2Y1.setClickable(true);
                    btnX3Y1.setClickable(true);
                    btnX1Y2.setClickable(true);
                    btnX2Y2.setClickable(true);
                    btnX3Y2.setClickable(true);
                    btnX1Y3.setClickable(true);
                    btnX2Y3.setClickable(true);
                    btnX3Y3.setClickable(true);
                    winner.setVisibility(View.VISIBLE);
                    winner.setText("O WINS!");
                }
            }
        }
        if (btnX3Y1.getText().toString().equals("O"))
        {
            if (btnX2Y2.getText().toString().equals("O"))
            {
                if (btnX1Y3.getText().toString().equals("O"))
                {
                    btnX1Y1.setText("");
                    btnX2Y1.setText("");
                    btnX3Y1.setText("");
                    btnX1Y2.setText("");
                    btnX2Y2.setText("");
                    btnX3Y2.setText("");
                    btnX1Y3.setText("");
                    btnX2Y3.setText("");
                    btnX3Y3.setText("");
                    turn = "X";

                    btnX1Y1.setClickable(true);
                    btnX2Y1.setClickable(true);
                    btnX3Y1.setClickable(true);
                    btnX1Y2.setClickable(true);
                    btnX2Y2.setClickable(true);
                    btnX3Y2.setClickable(true);
                    btnX1Y3.setClickable(true);
                    btnX2Y3.setClickable(true);
                    btnX3Y3.setClickable(true);
                    winner.setVisibility(View.VISIBLE);
                    winner.setText("O WINS!");
                }
            }
        }
        //endregion

        //region Draw

        if (!btnX1Y1.getText().toString().equals("") & !btnX2Y1.getText().toString().equals("") & !btnX3Y1.getText().toString().equals("") & !btnX1Y2.getText().toString().equals("") & !btnX2Y2.getText().toString().equals("") & !btnX3Y2.getText().toString().equals("") & !btnX1Y3.getText().toString().equals("") & !btnX2Y3.getText().toString().equals("") & !btnX3Y3.getText().toString().equals(""))
        {
            winner.setVisibility(View.VISIBLE);
            winner.setText("Draw!");
            btnX1Y1.setText("");
            btnX2Y1.setText("");
            btnX3Y1.setText("");
            btnX1Y2.setText("");
            btnX2Y2.setText("");
            btnX3Y2.setText("");
            btnX1Y3.setText("");
            btnX2Y3.setText("");
            btnX3Y3.setText("");
            turn = "X";

            btnX1Y1.setClickable(true);
            btnX2Y1.setClickable(true);
            btnX3Y1.setClickable(true);
            btnX1Y2.setClickable(true);
            btnX2Y2.setClickable(true);
            btnX3Y2.setClickable(true);
            btnX1Y3.setClickable(true);
            btnX2Y3.setClickable(true);
            btnX3Y3.setClickable(true);
        }

        //endregion
    }
}










