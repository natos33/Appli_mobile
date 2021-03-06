package com.adeneo.lab1.tp1_application.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.adeneo.lab1.tp1_application.objects.Category;
import com.adeneo.lab1.tp1_application.adapters.CategoryAdapter;
import com.adeneo.lab1.tp1_application.R;

import java.util.ArrayList;
import java.util.List;

public class CategoriesActivity extends AppCompatActivity implements View.OnClickListener{

    private RecyclerView categories_recyclerView;

    private ImageView btn_close;
    private LinearLayout btn_back;
    private Button categoryName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        btn_close = findViewById(R.id.btn_close);
        btn_close.setOnClickListener(this);

        btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(this);
/*
        categoryName = findViewById(R.id.categoryName);
        categoryName.setOnClickListener(this);
*/
        this.categories_recyclerView = findViewById(R.id.categories_recyclerView);

        List<Category> categories = new ArrayList<>();
        categories.add(new Category("Humour"));
        categories.add(new Category("Film d'horreur"));
        categories.add(new Category("Comédie"));
        categories.add(new Category("Action"));
        categories.add(new Category("Aventure"));
        categories.add(new Category("Humour"));
        categories.add(new Category("Documentaires"));
        categories.add(new Category("Policier"));
        categories.add(new Category("Amour"));
        categories.add(new Category("Comédies musicales"));
        categories.add(new Category("Dessins animés"));
        categories.add(new Category("Francais"));
        categories.add(new Category("Manga"));
        categories.add(new Category("Science fiction"));
        categories.add(new Category("Fantastique"));

        CategoryAdapter categoryAdapter = new CategoryAdapter();
        categoryAdapter.setCategories(categories);

        this.categories_recyclerView.setAdapter(categoryAdapter);
        this.categories_recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }

    @Override
    public void onClick(View v) {
        if (v.equals(btn_close) || v.equals(btn_back)) {
            CategoriesActivity.this.finish();
        }
/*
        if (v.equals(categoryName)) {
            Intent intent = new Intent(CategoriesActivity.this, CellsActivity.class);
            startActivity(intent);
        }
*/
    }
}
