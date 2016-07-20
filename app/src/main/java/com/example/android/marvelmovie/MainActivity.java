package com.example.android.marvelmovie;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox avGenreCheckbox;
    CheckBox avPlaydateCheckbox;
    CheckBox avRunningTimeCheckbox;
    CheckBox avScreeningGradeCheckbox;

    CheckBox irGenreCheckbox;
    CheckBox irPlaydateCheckbox;
    CheckBox irRunningTimeCheckbox;
    CheckBox irScreeningGradeCheckbox;

    CheckBox caGenreCheckbox;
    CheckBox caPlaydateCheckbox;
    CheckBox caRunningTimeCheckbox;
    CheckBox caScreeningGradeCheckbox;

    CheckBox thGenreCheckbox;
    CheckBox thPlaydateCheckbox;
    CheckBox thRunningTimeCheckbox;
    CheckBox thScreeningGradeCheckbox;

    CheckBox huGenreCheckbox;
    CheckBox huPlaydateCheckbox;
    CheckBox huRunningTimeCheckbox;
    CheckBox huScreeningGradeCheckbox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        avGenreCheckbox = (CheckBox) findViewById(R.id.avGenreCheckbox);
        avPlaydateCheckbox = (CheckBox) findViewById(R.id.avPlaydateCheckbox);
        avRunningTimeCheckbox = (CheckBox) findViewById(R.id.avRunningTimeCheckbox);
        avScreeningGradeCheckbox = (CheckBox) findViewById(R.id.avScreeningGradeCheckbox);

        irGenreCheckbox = (CheckBox) findViewById(R.id.irGenreCheckbox);
        irPlaydateCheckbox = (CheckBox) findViewById(R.id.irPlaydateCheckbox);
        irRunningTimeCheckbox = (CheckBox) findViewById(R.id.irRunningTimeCheckbox);
        irScreeningGradeCheckbox = (CheckBox) findViewById(R.id.irScreeningGradeCheckbox);

        caGenreCheckbox = (CheckBox) findViewById(R.id.caGenreCheckbox);
        caPlaydateCheckbox = (CheckBox) findViewById(R.id.caPlaydateCheckbox);
        caRunningTimeCheckbox = (CheckBox) findViewById(R.id.caRunningTimeCheckbox);
        caScreeningGradeCheckbox = (CheckBox) findViewById(R.id.caScreeningGradeCheckbox);

        thGenreCheckbox = (CheckBox) findViewById(R.id.thGenreCheckbox);
        thPlaydateCheckbox = (CheckBox) findViewById(R.id.thPlaydateCheckbox);
        thRunningTimeCheckbox = (CheckBox) findViewById(R.id.thRunningTimeCheckbox);
        thScreeningGradeCheckbox = (CheckBox) findViewById(R.id.thScreeingGradeCheckbox);

        huGenreCheckbox = (CheckBox) findViewById(R.id.huGenreCheckbox);
        huPlaydateCheckbox = (CheckBox) findViewById(R.id.huPlaydateCheckbox);
        huRunningTimeCheckbox = (CheckBox) findViewById(R.id.huRunningTimeCheckbox);
        huScreeningGradeCheckbox = (CheckBox) findViewById(R.id.huScreeningGradeCheckbox);

    }

    public void showAvengers (String name) {
        TextView Viewer = (TextView) findViewById(R.id.avShow);
        Viewer.setText(name);

    }
    public void showIronman (String name) {
        TextView Viewer = (TextView) findViewById(R.id.irShow);
        Viewer.setText(name);
    }
    public void showCaptain (String name) {
        TextView Viewer = (TextView) findViewById(R.id.caShow);
        Viewer.setText(name);
    }
    public void showThor (String name) {
        TextView Viewer = (TextView) findViewById(R.id.thShow);
        Viewer.setText(name);
    }
    public void showHulk (String name) {
        TextView Viewer = (TextView) findViewById(R.id.huShow);
        Viewer.setText(name);
    }




    public void onCheckboxClicked(View view) {

        //boolean checked = ((CheckBox) view).isChecked();
        String message = "";
        String message2 = "";
        String message3 = "";
        String message4 = "";
        String message5 = "";

                if (avGenreCheckbox.isChecked())
                    message += "Action, Adventure, Fantasy\n";
                if (avPlaydateCheckbox.isChecked())
                    message += "23.04.2015\n";
                if (avRunningTimeCheckbox.isChecked())
                    message += "141 minutes\n ";
                if (avScreeningGradeCheckbox.isChecked())
                    message += "12 rating";

                if (irGenreCheckbox.isChecked())
                    message2 += "Action, SF, Drama\n";
                if (irPlaydateCheckbox.isChecked())
                    message2 += "30.04.2008\n";
                if (irRunningTimeCheckbox.isChecked())
                    message2 += "125 minutes\n ";
                if (irScreeningGradeCheckbox.isChecked())
                    message2 += "12 rating";

                if (caGenreCheckbox.isChecked())
                    message3 += "Action, Adventure\n";
                if (caPlaydateCheckbox.isChecked())
                    message3 += "28.07.2011\n";
                if (caRunningTimeCheckbox.isChecked())
                    message3 += "123 minutes\n ";
                if (caScreeningGradeCheckbox.isChecked())
                    message3 += "12 rating";

                if (thGenreCheckbox.isChecked())
                    message4 += "Action, Adventure, Fantasy\n";
                if (thPlaydateCheckbox.isChecked())
                    message4 += "28.04.2011\n";
                if (thRunningTimeCheckbox.isChecked())
                    message4 += "112 minutes\n ";
                if (thScreeningGradeCheckbox.isChecked())
                    message4 += "12 rating";

                if (huGenreCheckbox.isChecked())
                    message5 += "Action, SF, Fantasy\n";
                if (huPlaydateCheckbox.isChecked())
                    message5 += "12.06.2008\n";
                if (huRunningTimeCheckbox.isChecked())
                    message5 += "113 minutes\n ";
                if (huScreeningGradeCheckbox.isChecked())
                    message5 += "15 rating";

        showAvengers(message);
        showIronman(message2);
        showCaptain(message3);
        showThor(message4);
        showHulk(message5);
    }


    }





