package Effendi.supercontact;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    TextView nama, email, nomor;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        nama = (TextView) findViewById(R.id.nama);
        email = (TextView) findViewById(R.id.Email);
        nomor = (TextView) findViewById(R.id.Telp);

        intent = getIntent();
        nama.setText(intent.getStringExtra("Nama.kontak"));
        email.setText(intent.getStringExtra("Email.kontak"));
        nomor.setText(intent.getStringExtra("Nomor.kontak"));
    }
    public void send_email(View view){
        String emails = intent.getStringExtra("Email.kontak");
        Intent sendEmail = new Intent(Intent.ACTION_VIEW);
        sendEmail.setData(Uri.parse("mailto:"+emails));
        startActivity(sendEmail);
    }
    public void send_sms(View view){
        int tlp = Integer.parseInt(intent.getStringExtra("Nomor.kontak"));
        Intent sendSMS = new Intent(Intent.ACTION_VIEW);
        sendSMS.setData(Uri.parse("sms:"+tlp));
        startActivity(sendSMS);
    }


    public void send_call(View view){
        int tlp = Integer.parseInt(intent.getStringExtra("Nomor.kontak"));
        Intent sendCall = new Intent(Intent.ACTION_DIAL);
        sendCall.setData(Uri.parse("tel:"+tlp));
        startActivity(sendCall);
    }
}
