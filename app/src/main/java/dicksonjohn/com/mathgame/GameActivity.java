package dicksonjohn.com.mathgame;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.id;

public class GameActivity extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);//loads our design
        //initialize all our variables	// parts of the question
        int partA = 2;
        int partB = 2;
// possible answers
        int correctAnswer = partA * partB;
        int wrongAnswer1 = correctAnswer - 1;
        int wrongAnswer2 = correctAnswer + 2;
// Link Objects to elements
        TextView textObjectPartA = (TextView) findViewById(R.id.TextpartA);
        TextView textObjectPartB = (TextView) findViewById(R.id.textPartB);
        Button buttonObjectChoice1 = (Button) findViewById(R.id.buttonChoice1);
        Button buttonObjectChoice2 = (Button) findViewById(R.id.buttonChoice2);
        Button buttonObjectChoice3 = (Button) findViewById(R.id.buttonChoice3);
/*Use setText() of the class on our objects, show our variable values on the UI elements.*/
        //put the variables for the question parts to the textView UI
        textObjectPartA.setText("" + partA);
        textObjectPartB.setText("" + partB);
//put the answers on the buttons, this should be random
        buttonObjectChoice1.setText("" + correctAnswer);
        buttonObjectChoice2.setText("" + wrongAnswer1);
        buttonObjectChoice3.setText("" + wrongAnswer2);
    }


        @Override
public void onClick(View view){
            Button buttonObjectChoice1 = (Button) findViewById(R.id.buttonChoice1);
            Button buttonObjectChoice2 = (Button) findViewById(R.id.buttonChoice2);
            Button buttonObjectChoice3 = (Button) findViewById(R.id.buttonChoice3);
            int partA = 2;
            int partB = 2;
            int correctAnswer = partA * partB;
//declare the int to be used in all cases
        int answerGiven = 0;
        switch(view.getId()){
        case R.id.buttonChoice1:
        //initialize new int with value in button
        answerGiven = Integer.parseInt(""+buttonObjectChoice1.getText());
        //is it correct?
        if(answerGiven == correctAnswer){
        Toast.makeText(getApplicationContext(),"Well done!",Toast.LENGTH_LONG).show();
        }
        else{
        Toast.makeText(getApplicationContext(),"Sorry, thats wrong",Toast.LENGTH_LONG).show();
        }
        break;

        case R.id.buttonChoice2:
        //initialize new int with value in button
        answerGiven = Integer.parseInt(""+buttonObjectChoice2.getText());
        //is it correct?
        if(answerGiven == correctAnswer){
        Toast.makeText(getApplicationContext(),"Well done!",Toast.LENGTH_LONG).show();
        }else{
        Toast.makeText(getApplicationContext(),"Sorry, thats wrong",Toast.LENGTH_LONG).show();
        }
        break;

        case R.id.buttonChoice3:
        //initialize new int with value in button
        answerGiven = Integer.parseInt(""+buttonObjectChoice3.getText());
        //is it correct?
        if(answerGiven == correctAnswer){
        Toast.makeText(getApplicationContext(),"Well done!",Toast.LENGTH_LONG).show();
        }else{
        Toast.makeText(getApplicationContext(),"Sorry, thats wrong",Toast.LENGTH_LONG).show();
        }
        break;
        }
        }}

