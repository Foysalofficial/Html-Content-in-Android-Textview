package com.foysaldev.htmlcontentinandroidtextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    String myText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.TextViewid);

        myText = "<h1> this is headline 1 </h1>\n" +
                "<h2> this is headline 2 </h2>\n" +
                "<h3> this is headline 3 </h3>\n" +
                "<p> this is a paragraph </p>\n" +
                "<p> <u> this is a an Underline </u> </p>\n" +
                "<p> <b> this is a Bold text </b> </p>\n" +
                "<p> <i> this is a Bold text </i> </p>\n" +
                "programming language order list \n" +
                "<ol>\n" +
                "<li> Java </li> \n " +
                "<li> Python </li> \n " +
                "<li> JavaScript </li> \n " +
                "</ol>\n\n" +
                "(a+b)<sup>2</sup> = a<sup>2</sup>+2ab+b<sup>2<sup>";

        textView.setText(Html.fromHtml(myText));
    }
}