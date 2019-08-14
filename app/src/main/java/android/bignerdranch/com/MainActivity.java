
package android.bignerdranch.com;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private Button mTrueButton;
    private Button mFalseButton;
    private int mCurrentIndex;
    private Button mNextButton;
    private TextView mQuestionTextView;
    private Button mCheatButton;
    private static final String TAG = "QuizActivity";


            private TrueFalse[] mQuestionBank = new TrueFalse[] {
            new TrueFalse(R.string.question_oceans, true, false),
            new TrueFalse(R.string.question_mideast, false, false),
            new TrueFalse(R.string.question_africa, false, false),
            new TrueFalse(R.string.question_americas, true, false),
            new TrueFalse(R.string.question_asia, true, false)
    };
    private boolean[] mCheaterStatus = new boolean[mQuestionBank.length];

    private void updateQuestion() {
        int question = mQuestionBank[mCurrentIndex].getQuestion();
        mQuestionTextView.setText(question);
    }
}
    private void checkAnswer(boolean userPressedTrue) {
        boolean answerIsTrue = mQuestionBank[mCurrentIndex].isTrueQuestion();

        int messageResId = 0;

        if (userPressedTrue == answerIsTrue) {
            messageResId = R.string.correct_toast;
        } else {
            messageResId = R.string.incorrect_toast;
        }
        Toast.makeText(this, messageResId, Toast.LENGTH_SHORT)
                .show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate(Bundle) called");
        mQuestionTextView = (TextView)findViewById(R.id.question_text_view);
        mTrueButton = (Button)findViewById(R.id.true_button);
        setContentView(R.layout.activity_main);


        if (savedInstanceState !=null) {
            mCurrentIndex = savedInstanceState.getInt("index", 0);
        }
        mFalseButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        R.string.correct_toast,
                        Toast.LENGTH_SHORT).show();

                mTrueButton = (Button) findViewById(R.id.true_button);
                mFalseButton = (Button) findViewById(R.id.false_button);

                mNextButton = (Button)findViewById(R.id.next_button);
                mNextButton.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        mCurrentIndex = (mCurrentIndex + 1) % mQuestionBank.length;
                        updateQuestion();




                        mTrueButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this,
                                R.string.incorrect_toast,
                                Toast.LENGTH_SHORT).show();

                    }
                });
                mFalseButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this,
                                R.string.correct_toast,
                                Toast.LENGTH_SHORT).show();
                    }
                });

            }

            @Override
            public void onSaveInstanceState(Bundle savedInstanceState) {
                super.onSaveInstanceState(savedInstanceState);
                savedInstanceState.putInt("index", mCurrentIndex);
            }


        });
    }
    }
}
}

        @Override
        protected void onCreate(Bundle savedInstanceState) {

        mTrueButton = (Button)findViewById(R.id.true_button);
        mTrueButton.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {
        checkAnswer(true);
        }
        });

        mFalseButton = (Button)findViewById(R.id.false_button);
        mFalseButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        }
        });
        mNextButton = (Button)findViewById(R.id.next_button);
        }
        }
}