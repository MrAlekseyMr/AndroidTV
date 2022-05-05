package com.example.AndroidTV;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Item> items = new ArrayList<Item>();
    Boolean Chislitel = true;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recycleview);
        GetData();
        t = (TextView) findViewById(R.id.message);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items ));
    }

    public void chislitel(View view)
    {
        Chislitel = true;
        RecyclerView recyclerView = findViewById(R.id.recycleview);
        t.setText("Числитель");
        t.setTextColor(getResources().getColor(R.color.red));

        items.clear();
        GetData();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items ));
    }

    public void znamenatel(View view)
    {
        Chislitel = false;
        t.setText("Знаменатель");
        t.setTextColor(getResources().getColor(R.color.purple_500));
        RecyclerView recyclerView = findViewById(R.id.recycleview);
        items.clear();
        GetData();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items ));
    }

    private void GetData()
    {
        if(Chislitel == true) {
            items.add(new Item("Понедельник",
                    "Пара 1: - - - -", R.drawable.color1,
                    "Пара 2: Разработка мобильный приложений", R.drawable.color2,
                    "Пара 3: Разработка программных модулей", R.drawable.color1,
                    "Пара 4: Технология разработки и защиты баз данных", R.drawable.color2,
                    "Пара 5: Инструментальные средства разработки ПО", R.drawable.color1
            ));
            items.add(new Item("Вторник",
                    "Практика", R.drawable.color1,
                    "Практика", R.drawable.color1,
                    "Практика", R.drawable.color1,
                    "Практика", R.drawable.color1,
                    "Практика", R.drawable.color1
            ));
            items.add(new Item("Среда",
                    "Практика", R.drawable.color1,
                    "Практика", R.drawable.color1,
                    "Практика", R.drawable.color1,
                    "Практика", R.drawable.color1,
                    "Практика", R.drawable.color1
            ));
            items.add(new Item("Четверг",
                    "Пара 1: - - - -", R.drawable.color1,
                    "Пара 2: Иностранный язык в проф. деятельности", R.drawable.color1,
                    "Пара 3: Разработка мобильных приложений", R.drawable.color1,
                    "Пара 4: Технология разработки ПО", R.drawable.color1,
                    "Пара 5: Системное программирование", R.drawable.color1
            ));
            items.add(new Item("Пятница",
                    "Пара 1: Физическая культура", R.drawable.color1,
                    "Пара 2: Разработка программных модулей", R.drawable.color1,
                    "Пара 3: Технология разработки ПО", R.drawable.color2,
                    "Пара 4: Технология разработки и защиты баз данных", R.drawable.color1,
                    "Пара 5: - - - -", R.drawable.color1
            ));
        }
        else {
            items.add(new Item("Понедельник",
                    "Пара 1: - - - -", R.drawable.color1,
                    "Пара 2: Разработка программных модулей", R.drawable.color3,
                    "Пара 3: Разработка программных модулей", R.drawable.color1,
                    "Пара 4: Системное программирование", R.drawable.color3,
                    "Пара 5: Инструментальные средства разработки ПО", R.drawable.color1
            ));
            items.add(new Item("Вторник",
                    "Практика", R.drawable.color1,
                    "Практика", R.drawable.color1,
                    "Практика", R.drawable.color1,
                    "Практика", R.drawable.color1,
                    "Практика", R.drawable.color1
            ));
            items.add(new Item("Среда",
                    "Практика", R.drawable.color1,
                    "Практика", R.drawable.color1,
                    "Практика", R.drawable.color1,
                    "Практика", R.drawable.color1,
                    "Практика", R.drawable.color1
            ));
            items.add(new Item("Четверг",
                    "Пара 1: - - - -", R.drawable.color1,
                    "Пара 2: Иностранный язык в проф. деятельности", R.drawable.color1,
                    "Пара 3: Разработка мобильных приложений", R.drawable.color1,
                    "Пара 4: Технология разработки ПО", R.drawable.color1,
                    "Пара 5: Системное программирование", R.drawable.color1
            ));
            items.add(new Item("Пятница",
                    "Пара 1: Физическая культура", R.drawable.color1,
                    "Пара 2: Разработка программных модулей", R.drawable.color1,
                    "Пара 3: Инструментальные средства разработки ПО", R.drawable.color3,
                    "Пара 4: Технология разработки и защиты баз данных", R.drawable.color1,
                    "Пара 5: - - - -", R.drawable.color1
            ));
        }
    }
}