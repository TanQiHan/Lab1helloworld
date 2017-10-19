package my.edu.tarc.lab1helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//global variables
    EditText editTextName,editTextAge;
    TextView textViewMessage;
    @Override
    //oncreate()=main() function in java
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setcontentview() = show UI
        //R = resources class
        setContentView(R.layout.activity_main);
        //link UI to program
        editTextName =(EditText)findViewById(R.id.editTextName);
        editTextAge=(EditText)findViewById(R.id.editTextAge);
        textViewMessage=(TextView)findViewById(R.id.textViewMessage);
    }

    public void displaymessage(View view){
        String name;
        name=editTextName.getText().toString();
        int age;
        age=Integer.parseInt(editTextAge.getText().toString())+1;
        textViewMessage.setText("Hi "+name+",you will be "+age+" in 2018.");
    }
    public void textreset(View view){
        editTextName.setText("");
        editTextAge.setText("");
        textViewMessage.setText("Hello World");

    }

}
