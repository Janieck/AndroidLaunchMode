package paxsz.com.androidlaunchmode;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends BaseActivity implements View.OnClickListener {

    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("ThirdActivity", "Task id is" + getTaskId());
        setContentView(R.layout.activity_third);
        initView();
    }

    private void initView() {
        button1 = (Button) findViewById(R.id.button1);

        button1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                ActivityCollector.finishAll();
                android.os.Process.killProcess(android.os.Process.myPid());
                break;
        }
    }
}
