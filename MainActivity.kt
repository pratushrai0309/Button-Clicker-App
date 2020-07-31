package com.codeChimpies.buttonclicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.NullPointerException

private const val TAG = "MainActivity"
private const val TEXT_CONTENTS = "TextContents"
class MainActivity : AppCompatActivity() {
    //Declaring The Variables So that android studio can make a link between the components we have used
    //This Is The place where we declare all our variables as private
    //And if we declare them in oncREATE fun will be marked as private and we cant use them in other functions
    //? refers to those only which are declared as null if havent declared a widget as null we can access their properties without ?
    private var textView: TextView? = null
    private var name = "Pratush Rai"



    override fun onCreate(savedInstanceState: Bundle?) {
            Log.d(TAG,"onCrete: called")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Assigning The Variables Which We Want In Our App
         val userInput: EditText = findViewById<EditText>(R.id.editText)
         val button: Button = findViewById<Button>(R.id.button)
         textView = findViewById<TextView>(R.id.textView)
         textView?.text = ""//.text is used add a text to the textview widget by replacing the previous one
         textView?.movementMethod = ScrollingMovementMethod()
         userInput.setText("")
            textView?.text = ""//.text is used add a text to the textview widget by replacing the previous one
            textView?.movementMethod = ScrollingMovementMethod()
            userInput.setText("")//It is used to set the text that we define in () -> And we have used it because setText is a function of editable class
            button.setOnClickListener(object: View.OnClickListener{

                 override fun onClick(p0: View?) {
                     Log.d(TAG,"onClick: called")
                     textView?.append(userInput.text)// Refers to the text we have wrote in userInput Text Box
                     //In the above code we have add the textView to the text which we have written in userInput text box
                     textView?.append("\n")
                     userInput.text.clear()//tHis is the clear property of editable which clear the txt in editText Widget

             }
        })
        }

   
}
