package in.fitsapp.sheliza.gocar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import in.fitsapp.sheliza.gocar.databinding.ActivityMainBinding;
import in.fitsapp.sheliza.gocar.databinding.ItemSkillsBinding;
import in.fitsapp.sheliza.gocar.databinding.ItemTimingsBinding;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
       binding.setListener(this);

    }
    public void onClick(View view){
        switch (view.getId()){
            case R.id.add_skills:{
                ItemSkillsBinding itemSkillsBinding=DataBindingUtil.inflate(LayoutInflater.from(getApplicationContext()),R.layout.item_skills,null,false);
                AlertDialog.Builder builder=new AlertDialog.Builder(this);
                AlertDialog dialog=builder.create();
                dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT,
                        WindowManager.LayoutParams.MATCH_PARENT);

dialog.setView(itemSkillsBinding.getRoot());

                dialog.show();
                break;
            }
            case R.id.timings:{
                ItemTimingsBinding itemTimingsBinding=DataBindingUtil.inflate(LayoutInflater.from(getApplicationContext()),R.layout.item_timings,null,false);

                AlertDialog.Builder builder=new AlertDialog.Builder(this);
                AlertDialog dialog=builder.create();
                dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT,
                        WindowManager.LayoutParams.MATCH_PARENT);

                dialog.setView(itemTimingsBinding.getRoot());

                dialog.show();
                break;
            }
        }
    }

}
