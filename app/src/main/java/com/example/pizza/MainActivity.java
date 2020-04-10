package com.example.pizza;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<PizzaRecipeItem> pizzaRecipeItems = new ArrayList<>();
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza_1, Utils.TITLE1, Utils.DESCRIPTION1, Utils.RECIPE1));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza_2, Utils.TITLE2, Utils.DESCRIPTION2, Utils.RECIPE2));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza_3, Utils.TITLE3, Utils.DESCRIPTION3, Utils.RECIPE3));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza_4, Utils.TITLE4, Utils.DESCRIPTION4, Utils.RECIPE4));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza_5, Utils.TITLE5, Utils.DESCRIPTION5, Utils.RECIPE5));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza_6, Utils.TITLE6, Utils.DESCRIPTION6, Utils.RECIPE6));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza_7, Utils.TITLE7, Utils.DESCRIPTION7, Utils.RECIPE7));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza_8, Utils.TITLE8, Utils.DESCRIPTION8, Utils.RECIPE8));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza_9, Utils.TITLE9, Utils.DESCRIPTION9, Utils.RECIPE9));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza_10, Utils.TITLE10, Utils.DESCRIPTION10, Utils.RECIPE10));

        recyclerView =findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        adapter = new PizzaRecipeAdapter(pizzaRecipeItems, this);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}
