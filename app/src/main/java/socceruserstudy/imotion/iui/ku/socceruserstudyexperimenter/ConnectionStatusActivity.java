package socceruserstudy.imotion.iui.ku.socceruserstudyexperimenter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.Socket;

public class ConnectionStatusActivity extends AppCompatActivity {
    final static int STATIONPORT = 3440;
    final static String STATIONIP = "";

    public static Socket client;
    public static OutputStream outToServer;
    public static DataOutputStream out;
    public static DataInputStream in;

    private boolean status;
    private CheckBox otherTablet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connection_status);
        status = false;
        otherTablet = (CheckBox) findViewById(R.id.otherTabletCheck);

        new SocketSubmissionTask(this).execute(STATIONIP,STATIONPORT);
    }

    public void bringSocket(Socket resultSocket) {
        this.client = resultSocket;

        try {
            outToServer = client.getOutputStream();
            out = new DataOutputStream(outToServer);
            in = new DataInputStream(client.getInputStream());

            otherTablet.setChecked(true);

            Toast.makeText(getApplicationContext(),"Kullanıcıya bağlanıldı",Toast.LENGTH_SHORT).show();

            if (otherTablet.isChecked()) {
                status = true;
            }
        } catch (Exception e) {
            //Log.e("StationConn",e.getMessage());
            outToServer = null;
            client = null;
            out = null;
            Toast.makeText(getApplicationContext(),"Bağlantı hatası!",Toast.LENGTH_LONG).show();
        }
    }

    public void thirdStep(View view) {
        if (status) {
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
            finish();
        }
        else {
            Toast.makeText(getApplicationContext(),"Diğer tablete bağlanılmadan kayda geçilemez!",Toast.LENGTH_LONG).show();
        }
    }
}
