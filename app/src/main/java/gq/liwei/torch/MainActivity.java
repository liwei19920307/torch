package gq.liwei.torch;

import android.content.Context;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import gq.liwei.torch.util.TorchUtil;

public class MainActivity extends AppCompatActivity {

    TorchUtil torchUtil;
    boolean isOn = false;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        context = this.getApplicationContext();
        torchUtil = new TorchUtil(context);

        findViewById(R.id.switch_torch).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOn) {
                    torchUtil.offTorch();
                    isOn = false;
                } else {
                    torchUtil.onTorch();
                    isOn = true;
                }

            }
        });
    }
}
