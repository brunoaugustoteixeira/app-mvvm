package com.example.mvvm.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.mvvm.R;
import com.example.mvvm.viewmodel.HelloViewModel;

import io.reactivex.disposables.Disposable;

public class HelloActivity extends AppCompatActivity {

    private HelloViewModel model = new HelloViewModel();
    private Disposable helloLabelDisposable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView label = (TextView) findViewById(R.id.hello_label);
        helloLabelDisposable = model.helloLabelObservable.subscribe(label::setText);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onDestroy() {
        if( helloLabelDisposable != null && !helloLabelDisposable.isDisposed()){
            helloLabelDisposable.dispose();
        }
        super.onDestroy();
    }
}