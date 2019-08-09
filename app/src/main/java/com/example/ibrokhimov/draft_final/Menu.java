package com.example.ibrokhimov.draft_final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Menu extends AppCompatActivity {
    Button dsu, gsi, blog, chatroom, about, exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        blog=(Button)findViewById(R.id.blog);
        exit=(Button)findViewById(R.id.exit);
        dsu=(Button)findViewById(R.id.dsu);
        gsi=(Button)findViewById(R.id.gsi);
        chatroom=(Button)findViewById(R.id.chat);
        about=(Button)findViewById(R.id.about);

}

    public void changeAct(View view) {
        Intent bt;
        switch (view.getId()){

            case R.id.blog:
                bt = new Intent(this, MainActivity.class);
                startActivity(bt);break;
            case R.id.dsu:
                bt=new Intent(this, dsu.class);
                startActivity(bt);break;
            case R.id.gsi:
                bt=new Intent(this, gsi.class);
                startActivity(bt);break;
            case R.id.about:
                bt=new Intent(this, about.class);
                startActivity(bt);break;
            case R.id.chat:
                Intent i=getPackageManager().getLaunchIntentForPackage("com.example.ibrokhimov.unidormchatroom");
                try{
                    startActivity(i);
                }
                catch (Exception ex){
                    Toast.makeText(Menu.this,"Please install the UniDorm chatroom first", Toast.LENGTH_LONG).show();
                }break;

            case R.id.exit:
                this.finish();break;



            default:break;

        }

    }



}
