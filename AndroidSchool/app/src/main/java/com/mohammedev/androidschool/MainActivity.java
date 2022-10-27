package com.mohammedev.androidschool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

     //Student s1 , s2 , s3 , s4
     //index 0 , 1 , 2 , 3
    ArrayList<Student> Students = new  ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
ListView Iron=findViewById(R.id.studentListView);
        TextView studentName, studentAge, StudentGrade;
        ImageView studentPhoto;
        Button changeStudentBtn;

//        TextView studentName = findViewById(R.id.studentName);
//        TextView studentAge = findViewById(R.id.studentAge);
//        TextView studentGrade = findViewById(R.id.studentGrade);
//        ImageView studentPhoto = findViewById(R.id.studentPhoto);
//        changeStudentBtn= findViewById(R.id.changeStudent);

        //string studentName,int studentAge ,int studentGrade ,int studentPhoto

        Student s1 = new Student("Youssef", 14, 12, R.drawable.boy1);
        Student s2 = new Student("Salman", 13, 10, R.drawable.boy2);
        Student s3 = new Student("majed", 15, 11, R.drawable.boy2);

        Students.add(s1);
        Students.add(s2);
        Students.add(s3);
        StudentAdapter studentAdapter = new StudentAdapter(this,0,Students);


        Iron.setAdapter(studentAdapter);

//        studentName.setText(students.get(cuurentStudent).getStudentName());
//        studentAge.setText(string.ValueOf(students.get(cuurentStudent).getStudentAge()));
//        studentGrade.setText(string.ValueOf(students.get(cuurentStudent).getStudentGrade()));
//        studentPhoto.setText(string.ValueOf(students.get(cuurentStudent).getStudentPhoto()));


//        changeStudentBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(view view) {
//
//
//                //int cuurentStudent = 0 =>1
//                cuurentStudent++;
//
//                if (Student == students.size) {
//                    int cuurentStudent = 0;
//                    studentName.setText(students.get(cuurentStudent).getStudentName());
//                    studentAge.setText(string.ValueOf(students.get(cuurentStudent).getStudentAge()));
//                    studentGrade.setText(string.ValueOf(students.get(cuurentStudent).getStudentGrade()));
//                }
//                 }
//); }}
    }}