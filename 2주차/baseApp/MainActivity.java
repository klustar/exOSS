package com.example.baseapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button; //버튼 기능과 관련된 클래스 추가
import android.widget.Toast; //Toast 메시지와 관련된 클래스

public class MainActivity extends AppCompatActivity {
    Button button1; //버튼 변수 button1을 생성

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button1); //findViewById()를 사용하여 'activity_main.xml 파일에서 만든 객체에 접근

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "누르지 마시오!", Toast.LENGTH_SHORT).show();
                //Toast는 Toast 형태의 메시지를 의미하며, 기기의 하단에 표시되는 메시지이다.
                //makeText(인자1, 인자2, 인자3)은 인자2를 인자3의 형태로 인자1에게 문자열 리소스ID를 넘겨주는 메소드
            }
        });
    }
}
