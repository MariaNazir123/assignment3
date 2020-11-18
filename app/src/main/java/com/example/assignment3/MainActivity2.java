package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private TextView Email, Password;

    String u1[] = {"maria@gmail.com", "m123"};
    String u2[] = {"kainat@gmail.com", "k456"};
    String u3[] = {"ifra@gmail.com", "i789"};
    String u4[] = {"sidra@gmail.com", "s1011"};
    String u5[] = {"hira@gmail.com", "h1213"};
    String u6[] = {"anum@gmail.com", "a1415"};
    String u7[] = {"noreen@gmail.com", "n1617"};
    String u8[] = {"ayesha@gmail.com", "a1819"};
    String u9[] = {"kashaf9@gmail.com", "k2021"};
    String u10[] = {"tayyaba10@gmail.com", "t2223"};

    GridView grid;
    static final String[] gridViewValue=new String[]{
            "A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Email = (TextView) findViewById(R.id.email);
        Password= (TextView) findViewById(R.id.password);

        String email= getIntent().getStringExtra("mail");
        String password= getIntent().getStringExtra("pass");
        if((!email.equals(u1[0]) || !password.equals(u1[1])) && (!email.equals(u2[0]) || !password.equals(u2[1])) &&
                (!email.equals(u3[0]) || !password.equals(u3[1])) && (!email.equals(u4[0]) || !password.equals(u4[1])) &&
                        (!email.equals(u5[0]) || !password.equals(u5[1])) && (!email.equals(u6[0]) || !password.equals(u6[1])) &&
                                (!email.equals(u7[0]) || !password.equals(u7[1])) && (!email.equals(u8[0]) || !password.equals(u8[1])) &&
                                        (!email.equals(u9[0]) || !password.equals(u9[1])) &&
                                                (!email.equals(u10[0]) || !password.equals(u10[1]))) {
            Email.setText(email);
            Password.setText(password);
            Toast.makeText(MainActivity2.this, "Email or Password Invalid!", Toast.LENGTH_LONG).show();
        }else{
            grid= findViewById(R.id.grid);

            ArrayAdapter<String> adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,gridViewValue);
            grid.setAdapter(adapter);

            grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String item= ((TextView) view).getText().toString();
                   Intent in2= new Intent(MainActivity2.this, MainActivity3.class);
                    in2.putExtra("key",item);
                   startActivity(in2);
            }
            });
        }



    }
}