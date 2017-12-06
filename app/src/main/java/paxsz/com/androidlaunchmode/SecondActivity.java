package paxsz.com.androidlaunchmode;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends BaseActivity implements View.OnClickListener {

    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.e("SecondActivity", "Task id is" + getTaskId());
        initView();
    }

    private void initView() {
        button1 = (Button) findViewById(R.id.button1);

        button1.setOnClickListener(this);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                Intent button1 = new Intent(this, FirstActivity.class);
                startActivity(button1);
                break;
            case R.id.button2:
                Intent button2 = new Intent(this, ThirdActivity.class);
                startActivity(button2);
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("SecondActivity", "onDestroy");
    }
}
