package com.mathquiz.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.salesforce.androidsdk.app.SalesforceSDKManager;
import com.salesforce.androidsdk.mobilesync.app.MobileSyncSDKManager;
import com.salesforce.androidsdk.rest.ApiVersionStrings;
import com.salesforce.androidsdk.rest.RestClient;
import com.salesforce.androidsdk.rest.RestClient.AsyncRequestCallback;
import com.salesforce.androidsdk.rest.RestRequest;
import com.salesforce.androidsdk.rest.RestResponse;
import com.salesforce.androidsdk.ui.SalesforceActivity;

import org.json.JSONArray;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class StartActivity2 extends Activity {
    Button btn_start, btn_answer0, btn_answer1,btn_answer2,btn_answer3;
    TextView tv_score, tv_questions, tv_timer, tv_bottommesage;
    ProgressBar prog_timer;

    Game2 g = new Game2();

    int secondsRemaining =30;

    CountDownTimer timer = new CountDownTimer(30000,1000) {
        @Override
        public void onTick(long millisUntilFinished) {
            secondsRemaining--;
            tv_timer.setText(Integer.toString(secondsRemaining) + "sec");
            prog_timer.setProgress(30 - secondsRemaining);
        }

        @Override
        public void onFinish() {
            btn_answer0.setEnabled(false);
            btn_answer1.setEnabled(false);
            btn_answer2.setEnabled(false);
            btn_answer3.setEnabled(false);
            tv_bottommesage.setText(("Time is up!" + g.getNumberCorrect1() + "/" +( g.getTotalQuestions1()-1)));

            final Handler handler = new Handler();

            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    btn_start.setVisibility(View.VISIBLE);
                }
            }, 4000);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        btn_start = findViewById(R.id.btn_start);
        btn_answer0 = findViewById(R.id.btn_answer0);
        btn_answer1 = findViewById(R.id.btn_answer1);
        btn_answer2 = findViewById(R.id.btn_answer2);
        btn_answer3 = findViewById(R.id.btn_answer3);

        tv_score = findViewById(R.id.tv_score);
        tv_questions = findViewById(R.id.tv_questions);
        tv_timer = findViewById(R.id.tv_timer);
        tv_bottommesage = findViewById(R.id.tv_bottommessage);

        prog_timer = findViewById(R.id.prog_timer);

        tv_timer.setText("0sec");
        tv_questions.setText("");
        tv_bottommesage.setText("Press START");
        tv_score.setText("0pts");

        View.OnClickListener startButtonClickListner = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button start_button = (Button) v;

                start_button.setVisibility(View.INVISIBLE);
                secondsRemaining = 30;
                g = new Game2();

                nextTurn1();
                timer.start();


            }
        };

        View.OnClickListener answerButtonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button buttonClicked = (Button) v;

                int answerSelected = Integer.parseInt(buttonClicked.getText().toString());

                g.checkAnswer(answerSelected);
                tv_score.setText(Integer.toString(g.getScore1()));
                nextTurn1();
            }
        };

        btn_start.setOnClickListener(startButtonClickListner);

        btn_answer0.setOnClickListener(answerButtonClickListener);
        btn_answer1.setOnClickListener(answerButtonClickListener);
        btn_answer2.setOnClickListener(answerButtonClickListener);
        btn_answer3.setOnClickListener(answerButtonClickListener);
    }


    private void nextTurn1(){
        g.makeNewQuestion();
        int [] answer = g.getCurrentQuestion1().getAnswerArray1();
        btn_answer0.setText(Integer.toString(answer[0]));
        btn_answer1.setText(Integer.toString(answer[1]));
        btn_answer2.setText(Integer.toString(answer[2]));
        btn_answer3.setText(Integer.toString(answer[3]));

        btn_answer0.setEnabled(true);
        btn_answer1.setEnabled(true);
        btn_answer2.setEnabled(true);
        btn_answer3.setEnabled(true);

        tv_questions.setText(g.getCurrentQuestion1().getQuestionPhrase1());

        tv_bottommesage.setText(g.getNumberCorrect1() + "/" + (g.getTotalQuestions1()-1));


    }
}
