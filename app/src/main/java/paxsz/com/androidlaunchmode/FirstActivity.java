package paxsz.com.androidlaunchmode;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends BaseActivity implements View.OnClickListener {

    private Button standard;
    private Button singletop;
    private Button stSecond;
    private Button singleInstace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Log.e("FirstActivity", "Task id is" + getTaskId());
        initView();
    }

    private void initView() {
        standard = (Button) findViewById(R.id.standard);
        standard.setOnClickListener(this);
        singletop = (Button) findViewById(R.id.singletop);
        singletop.setOnClickListener(this);
        stSecond = (Button) findViewById(R.id.stSecond);
        stSecond.setOnClickListener(this);
        singleInstace = (Button) findViewById(R.id.singleInstace);
        singleInstace.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.standard:
                Intent standard = new Intent(this, FirstActivity.class);
                startActivity(standard);
                break;
            case R.id.singletop:
                Intent singleTop = new Intent(this, FirstActivity.class);
                startActivity(singleTop);
                break;
            case R.id.stSecond:
                Intent stSecond = new Intent(this, SecondActivity.class);
                startActivity(stSecond);
                break;

            case R.id.singleInstace:
                Intent singleInstace = new Intent(this, SecondActivity.class);
                startActivity(singleInstace);
                break;
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("FirstActivity", "onRestart");
    }
}
