package website.lizihanglove.twobuttondialog;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import website.lizihanglove.twobuttondialog.View.TwoButtonDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   public void click(View v){
       TwoButtonDialog.Builder builder = new TwoButtonDialog.Builder(MainActivity.this);
       builder.setTitle("标题")
               .setMessage("这是标题！")
               .setNegativeButton("左按钮", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialog, int which) {
                       dialog.dismiss();
                       Toast.makeText(MainActivity.this,"点击了左边按钮",Toast.LENGTH_SHORT).show();

                   }
               })
               .setPositiveButton("右按钮", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialog, int which) {
                       dialog.dismiss();
                       Toast.makeText(MainActivity.this,"点击了右边按钮",Toast.LENGTH_SHORT).show();
                   }
               })
               .create()
               .show();
   }
}
