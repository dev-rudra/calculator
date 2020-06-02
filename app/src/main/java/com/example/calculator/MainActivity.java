package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, button10, buttonC, buttonEqual, buttonMod;

    EditText calResutl;
    float mValueOne, mValueTwo;
    boolean Addition, mSubtract, Multiplication, Division, Module, isDecimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonDivision = (Button) findViewById(R.id.buttondiv);
        buttonMod = (Button) findViewById(R.id.buttonmod);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonEqual = (Button) findViewById(R.id.buttoneql);
        calResutl = (EditText) findViewById(R.id.edt1);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calResutl.setText(calResutl.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calResutl.setText(calResutl.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calResutl.setText(calResutl.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calResutl.setText(calResutl.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calResutl.setText(calResutl.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calResutl.setText(calResutl.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calResutl.setText(calResutl.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calResutl.setText(calResutl.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calResutl.setText(calResutl.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calResutl.setText(calResutl.getText() + "0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (calResutl == null) {
                        calResutl.setText("");
                    } else {
                        mValueOne = Float.parseFloat(calResutl.getText() + "");
                        Addition = true;
                        calResutl.setText(null);
                    }

                } catch(Exception e) {
                    calResutl.setText("Please Enter Value First");
                }

            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    mValueOne = Float.parseFloat(calResutl.getText() + "");
                    mSubtract = true;
                    calResutl.setText(null);
                } catch(Exception e) {
                    calResutl.setText("Please Enter Value First");
                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    mValueOne = Float.parseFloat(calResutl.getText() + "");
                    Multiplication = true;
                    calResutl.setText(null);
                } catch(Exception e) {
                    calResutl.setText("Please Enter Value First");
                }
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    mValueOne = Float.parseFloat(calResutl.getText() + "");
                    Division = true;
                    calResutl.setText(null);
                } catch(Exception e) {
                    calResutl.setText("Please Enter Value First");
                }
            }
        });
        buttonMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    mValueOne = Float.parseFloat(calResutl.getText() + "");
                    Module = true;
                    calResutl.setText(null);
                } catch(Exception e) {
                    calResutl.setText("Please Enter Value First");
                }
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    mValueTwo = Float.parseFloat(calResutl.getText() + "");

                    if (Addition == true) {
                        calResutl.setText(mValueOne + mValueTwo + "");
                        Addition = false;
                    }

                    if (mSubtract == true) {
                        calResutl.setText(mValueOne - mValueTwo + "");
                        mSubtract = false;
                    }

                    if (Multiplication == true) {
                        calResutl.setText(mValueOne * mValueTwo + "");
                        Multiplication = false;
                    }

                    if (Division == true) {
                        calResutl.setText(mValueOne / mValueTwo + "");
                        Division = false;
                    }
                    if(Module == true) {
                        calResutl.setText(mValueOne % mValueTwo + "");
                        Module = false;
                    }
                }catch(Exception e) {
                    calResutl.setText("Please Operation Some Value First");
                }

            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calResutl.setText("");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isDecimal) {
                    calResutl.setText("You can not add multiple dot");
                } else {
                    calResutl.setText(calResutl.getText() + ".");
                    isDecimal = true;
                }
            }
        });
    }
}
