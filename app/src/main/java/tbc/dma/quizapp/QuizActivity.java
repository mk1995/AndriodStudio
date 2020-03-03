package tbc.dma.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class QuizActivity extends AppCompatActivity implements View.OnClickListener {

    private Button submit;
    private static final int TotalScore = 100;
    private int TotalObtainedScore;
    private int TotalMistakeScore;

    private RadioButton ansOneRadioButton;
    private RadioButton yourAnsOneRadioButton;
    private RadioGroup ansOneRadioGroup;

    private RadioButton ansTwoRadioButton;
    private RadioButton yourAnsTwoRadioButton;
    private RadioGroup ansTwoRadioGroup;

    private RadioButton ansThreeRadioButton;
    private RadioButton yourAnsThreeRadioButton;
    private RadioGroup ansThreeRadioGroup;

    private CheckBox ansFourCheckBox;
    private CheckBox ansFourOneCheckBox;
    private CheckBox ansFourTwoCheckBox;
    private CheckBox ansFourFourCheckBox;

    private RadioButton ansFiveRadioButton;
    private RadioButton yourAnsFiveRadioButton;
    private RadioGroup ansFiveRadioGroup;

    private EditText ansSixEditText;

    private RadioButton ansSevenRadioButton;
    private RadioButton yourAnsSevenRadioButton;
    private RadioGroup ansSevenRadioGroup;

    private CheckBox ansEightCheckBox;
    private CheckBox ansEightOneCheckBox;
    private CheckBox ansEightTwoCheckBox;
    private CheckBox ansEightFourCheckBox;

    private RadioButton ansNineRadioButton;
    private RadioButton yourAnsNineRadioButton;
    private RadioGroup ansNineRadioGroup;

    private RadioButton ansTenRadioButton;
    private RadioButton yourAnsTenRadioButton;
    private RadioGroup ansTenRadioGroup;

    private ArrayList yourAnswers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

//        layout instances
        ansOneRadioButton = findViewById(R.id.ans_one_three);
        ansOneRadioGroup = (RadioGroup) findViewById(R.id.ans_one_radio_group);

        ansTwoRadioButton = findViewById(R.id.ans_two_two);
        ansTwoRadioGroup = (RadioGroup) findViewById(R.id.ans_two_radio_group);

        ansThreeRadioButton = findViewById(R.id.ans_three_two);
        ansThreeRadioGroup = (RadioGroup) findViewById(R.id.ans_three_radio_group);

        ansFourCheckBox = findViewById(R.id.ans_four_three);
        ansFourFourCheckBox = findViewById(R.id.ans_four_four);
        ansFourOneCheckBox = findViewById(R.id.ans_four_one);
        ansFourTwoCheckBox = findViewById(R.id.ans_four_two);

        ansFiveRadioButton = findViewById(R.id.ans_five_three);
        ansFiveRadioGroup = (RadioGroup) findViewById(R.id.ans_five_radio_group);

        ansSixEditText = findViewById(R.id.ans_six_editText);

        ansSevenRadioButton = findViewById(R.id.ans_seven_two);
        ansSevenRadioGroup = (RadioGroup) findViewById(R.id.ans_seven_radio_group);

        ansEightCheckBox = findViewById(R.id.ans_eight_three);
        ansEightFourCheckBox = findViewById(R.id.ans_eight_four);
        ansEightOneCheckBox = findViewById(R.id.ans_eight_one);
        ansEightTwoCheckBox = findViewById(R.id.ans_eight_two);

        ansNineRadioButton = findViewById(R.id.ans_nine_two);
        ansNineRadioGroup = (RadioGroup) findViewById(R.id.ans_nine_radio_group);

        ansTenRadioButton = findViewById(R.id.ans_ten_two);
        ansTenRadioGroup = (RadioGroup) findViewById(R.id.ans_ten_radio_group);

        submit = findViewById(R.id.submit_button);
        submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.submit_button:
                TotalObtainedScore = 0;
                yourAnswers = new ArrayList(9);
                String answerSix = ansSixEditText.getText().toString().trim();

                yourAnsOneRadioButton = findViewById(ansOneRadioGroup.getCheckedRadioButtonId());
                yourAnsTwoRadioButton = findViewById(ansTwoRadioGroup.getCheckedRadioButtonId());
                yourAnsThreeRadioButton = findViewById(ansThreeRadioGroup.getCheckedRadioButtonId());
                yourAnsFiveRadioButton = findViewById(ansFiveRadioGroup.getCheckedRadioButtonId());
                yourAnsSevenRadioButton = findViewById(ansSevenRadioGroup.getCheckedRadioButtonId());
                yourAnsNineRadioButton = findViewById(ansNineRadioGroup.getCheckedRadioButtonId());
                yourAnsTenRadioButton = findViewById(ansTenRadioGroup.getCheckedRadioButtonId());

                //Toast.makeText(this, "Evaluating Your Result.....", Toast.LENGTH_SHORT).show();
                if(ansOneRadioButton.isChecked()) {
                    TotalObtainedScore += 10;
                    String q1 = "Q1: " + yourAnsOneRadioButton.getText().toString().trim();
                    yourAnswers.add(0, q1);
                }
                else{
                    String q1 = "Q1: " + yourAnsOneRadioButton.getText();
                    yourAnswers.add(0, q1);
                }
                if (ansTwoRadioButton.isChecked()) {
                    TotalObtainedScore += 10;
                    String q2 = "Q2: " + yourAnsTwoRadioButton.getText().toString().trim();
                    yourAnswers.add(1, q2);
                }
                else{
                    String q2 = "Q2: " + yourAnsTwoRadioButton.getText().toString().trim();
                    yourAnswers.add(1, q2);
                }
                if(ansThreeRadioButton.isChecked()){
                    TotalObtainedScore += 10;
                    String q3 = "Q3: " + yourAnsThreeRadioButton.getText().toString().trim();
                    yourAnswers.add(2, q3);
                }
                else{
                    String q3 = "Q3: " + yourAnsThreeRadioButton.getText().toString().trim();
                    yourAnswers.add(2, q3);
                }
                if (ansFourCheckBox.isChecked() && !ansFourFourCheckBox.isChecked() && !ansFourTwoCheckBox.isChecked() && !ansFourOneCheckBox.isChecked()){
                    TotalObtainedScore += 10;
                    //String q4 = "Q4: " + yourAnsThreeRadioButton.getText().toString().trim();
                    yourAnswers.add(3, "Null");
                }
                else{
                    if(ansFourFourCheckBox.isChecked()){}
                    else if(ansFourTwoCheckBox.isChecked()){}
                    else if(ansFourOneCheckBox.isChecked()){}
                    yourAnswers.add(3, "Null");
                }
                if(ansFiveRadioButton.isChecked()){
                    TotalObtainedScore += 10;
                    String q5 = "Q5: " + yourAnsFiveRadioButton.getText().toString().trim();
                    yourAnswers.add(4, q5);
                }
                else{
                    String q5 = "Q5: " + yourAnsFiveRadioButton.getText().toString().trim();
                    yourAnswers.add(4, q5);
                }
                if (answerSix.equals(getString(R.string.ans_six_two))){
                    TotalObtainedScore += 10;
                    yourAnswers.add(5, "null");
                }
                else{
                    yourAnswers.add(5, "null");
                }
                if(ansSevenRadioButton.isChecked()){
                    TotalObtainedScore += 10;
                    String q7 = "Q3: " + yourAnsSevenRadioButton.getText().toString().trim();
                    yourAnswers.add(6, q7);
                }
                else{
                    String q7 = "Q3: " + yourAnsSevenRadioButton.getText().toString().trim();
                    yourAnswers.add(6, q7);
                }
                if (ansEightCheckBox.isChecked() && !ansEightTwoCheckBox.isChecked() && !ansEightOneCheckBox.isChecked() && !ansEightFourCheckBox.isChecked()){
                    TotalObtainedScore += 10;
                    yourAnswers.add(7, "null");
                }
                else{
                    yourAnswers.add(7, "null");
                }
                if(ansNineRadioButton.isChecked()){
                    TotalObtainedScore += 10;
                    String q9 = "Q9: " + yourAnsNineRadioButton.getText().toString().trim();
                    yourAnswers.add(8, q9);
                }
                else{
                    String q9 = "Q9: " + yourAnsNineRadioButton.getText().toString().trim();
                    yourAnswers.add(8, q9);
                }
                if (ansTenRadioButton.isChecked()){
                    TotalObtainedScore += 10;
                    String q10 = "Q10: " + yourAnsTenRadioButton.getText().toString().trim();
                    yourAnswers.add(9, q10);
                }
                else{
                    String q10 = "Q10: " + yourAnsTenRadioButton.getText().toString().trim();
                    yourAnswers.add(9, q10);
                }
                String obtainedScore = String.valueOf(TotalObtainedScore);
                TotalMistakeScore = TotalScore - TotalObtainedScore;
                String mistakeScore = String.valueOf(TotalMistakeScore);
                Intent i = new Intent(QuizActivity.this, ScoreActivity.class);
                i.putExtra("scoreKey", obtainedScore);
                i.putExtra("yourAnswers", yourAnswers);
                startActivity(i);
                break;
        }
    }
}
