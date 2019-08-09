package com.example.ibrokhimov.draft_final;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;



/**
 * Created by Ibrokhimov on 6/5/2018.
 */

public class Frag2 extends Fragment{
    Button send;
    EditText subject, content;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.frag2_layout, container, false);
        subject=(EditText)v.findViewById(R.id.topic);
        content=(EditText)v.findViewById(R.id.message);
        Button sendMessage=(Button)v.findViewById(R.id.sendMessage);
        sendMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String to=" sardor.dsu@gmail.com";
                String sub=subject.getText().toString();
                String con=content.getText().toString();
                Intent email=new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL,new String[]{ to});
                email.putExtra(Intent.EXTRA_SUBJECT,sub);
                email.putExtra(Intent.EXTRA_TEXT,con);
                email.setType("message/rfc822");
                startActivity(Intent.createChooser(email,"Choose app to send mail"));



            }
        });
    return v;
    }

}
