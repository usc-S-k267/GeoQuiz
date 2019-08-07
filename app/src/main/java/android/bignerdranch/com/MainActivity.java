package android.bignerdranch.com;
import android.support.V7.app.AppCompatactivity;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button mTrueButton;
    private Button mFalsebutton;


@Override
protected void onCreate (Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mTrueButton = (Button) findViewById(R.id.true_button);
    mFalseButton = (Button)findViewById(R.id.false_button);
    }
}

mTrueButton = (Button) findViewById (R.id. true_button);
mTrueButton.setOnClicklistener(new View.OnClickListener()
{
    @Override
    public void onClick(View v) {

    }
});
mFalsteButton = (Button) findViewById(R.id. false_button);
mFalseButton.setOnClicklistener(new View.OnClickListener)()
{
    @Override
    public void onClick (view v) {

    }
});

@Override
public void onSaveInstanceState (Bundle savedInstanceState) {
    super onSaveInstanceState (savedInstanceState);
        savedInstanceState.putInt("index", mCurrentIndex);

        }



mTrueButton.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        Toast.makeText(QuizActivity.this,
        R.string.incorrect_toast,
        Toast.LENGTH_SHORT).show();
        }
        });
        mFalseButton.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        Toast.makeText(QuizActivity.this,
        R.string.correct_toast,
        Toast.LENGTH_SHORT).show();
        }
        });
