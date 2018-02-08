package com.example.lidia.quiz;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    float correctAnswers = 0;                 //variable used for counting the correct answers
    String name;                            //variable used for saving the name of the user
    String answer;                          //variable used for saving the answer for the last question

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getData(View view) {

        correctAnswers += 1;
    }

    public void getData2(View view) {

        CheckBox laPazCheckBox = (CheckBox) findViewById(R.id.LaPaz);
        boolean checkedLaPaz = laPazCheckBox.isChecked();
        //is La Paz checked?

        CheckBox sucreCheckBox = (CheckBox) findViewById(R.id.Sucre);
        boolean checkedSucre = sucreCheckBox.isChecked();
        //is Sucre checked?

        CheckBox santiagoCheckBox = (CheckBox) findViewById(R.id.Santiago);
        boolean checkedSantiago = santiagoCheckBox.isChecked();
        //is San Diego checked?

        if (checkedLaPaz == true) {
            if(checkedSucre == true) {
                if (!checkedSantiago) {
                    correctAnswers = correctAnswers + 1;
                } else {
                    correctAnswers += 0.5;
                }
            }
        }
    }

    public void submitAnswers(View view){


        EditText nameField = (EditText)findViewById(R.id.name_field);
        Editable nameEditable = nameField.getText();
        name = nameEditable.toString();

        //at this point we have the name of the user

        EditText answerField = (EditText)findViewById(R.id.answer);
        Editable answerEditable = answerField.getText();
        answer = answerEditable.toString();

        if(answer.equals("Beijing")){
            correctAnswers = correctAnswers + 1;
        }

        Context context = getApplicationContext();
        CharSequence text = "Dear " + name +", you got " + correctAnswers  +" points out of 7!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context,text,duration);
        toast.show();

    }

}
