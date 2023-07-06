package com.example.prog5;
import static android.content.Intent.ACTION_DIAL;
import static android.content.Intent.ACTION_SEND;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
 Button sms,phone,mail;
 @SuppressLint("MissingInflatedId")
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 sms=findViewById(R.id.sms);
 phone=findViewById(R.id.call);
 mail=findViewById(R.id.mail);
 sms.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View v) {
 Intent in = new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms","7892094543",null));
 startActivity(in);
 }
 });
 phone.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View v) {
 Intent in = new Intent(ACTION_DIAL);
 startActivity(in);
 }
 });
 mail.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View v) {
 Intent in = new Intent(ACTION_SEND);
 in.setType("text/plain");
 startActivity(in);
 }
 });
 }
}
