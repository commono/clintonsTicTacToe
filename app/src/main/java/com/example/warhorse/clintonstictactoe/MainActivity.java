package com.example.warhorse.clintonstictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    int turn,counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        turn = 1;
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b1.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b1.setText("X");
                        counter++;
                    } else if (turn == 2) {
                        turn = 1;
                        b1.setText("O");
                        counter++;
                    }
                }
                endGame();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b2.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b2.setText("X");
                        counter++;
                    } else if (turn == 2) {
                        turn = 1;
                        b2.setText("O");
                        counter++;
                    }
                }
                endGame();

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b3.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b3.setText("X");
                        counter++;
                    } else if (turn == 2) {
                        turn = 1;
                        b3.setText("O");
                        counter++;
                    }
                }
                endGame();

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b4.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b4.setText("X");
                        counter++;
                    } else if (turn == 2) {
                        turn = 1;
                        b4.setText("O");
                        counter++;
                    }
                }
                endGame();

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b5.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b5.setText("X");
                        counter++;
                    } else if (turn == 2) {
                        turn = 1;
                        b5.setText("O");
                        counter++;
                    }
                }
                endGame();

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b6.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b6.setText("X");
                        counter++;
                    } else if (turn == 2) {
                        turn = 1;
                        b6.setText("O");
                        counter++;
                    }
                }
                endGame();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b7.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b7.setText("X");
                        counter++;
                    } else if (turn == 2) {
                        turn = 1;
                        b7.setText("O");
                        counter++;
                    }
                }
                endGame();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b8.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b8.setText("X");
                        counter++;
                    } else if (turn == 2) {
                        turn = 1;
                        b8.setText("O");
                        counter++;
                    }
                }
                endGame();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b9.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b9.setText("X");
                        counter++;
                    } else if (turn == 2) {
                        turn = 1;
                        b9.setText("O");
                        counter++;
                    }
                }
                endGame();
            }
        });
    }

    public void resetGame(){
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
    }
    public void endGame() {
        String a, b, c, d, e, f, g, h, i;
        boolean end = false;
        a = b1.getText().toString();
        b = b2.getText().toString();
        c = b3.getText().toString();
        d = b4.getText().toString();
        e = b5.getText().toString();
        f = b6.getText().toString();
        g = b7.getText().toString();
        h = b8.getText().toString();
        i = b9.getText().toString();

        if (a.equals(b) && a.equals(c) && a.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner player X!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (a.equals(e) && a.equals(i) && a.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner player X!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (a.equals(d) && a.equals(g) && a.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner player X!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (b.equals(e) && b.equals(h) && b.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner player X!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c.equals(f) && c.equals(i) && c.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner player X!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d.equals(e) && d.equals(f) && d.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner player X!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (g.equals(h) && g.equals(i) && g.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner player X!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (g.equals("X") && e.equals("X") && c.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner player X!", Toast.LENGTH_LONG).show();
            end = true;
        }

        if (a.equals(b) && a.equals(c) && a.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner player O!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (a.equals(e) && a.equals(i) && a.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner player O!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (a.equals(d) && a.equals(g) && a.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner player O!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (b.equals(e) && b.equals(h) && b.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner player O!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c.equals(f) && c.equals(i) && c.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner player O!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d.equals(e) && d.equals(f) && d.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner player O!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (g.equals(h) && g.equals(i) && g.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner player O!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (g.equals("O") && e.equals("O") && c.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner player O!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (end) {
            resetGame();
            counter = 0;
        }
        else if(counter == 9){
            Toast.makeText(MainActivity.this, "DRAW !", Toast.LENGTH_LONG).show();
            resetGame();
            counter = 0;
        }
    }
}
