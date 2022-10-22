package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class AllBooksActivity extends AppCompatActivity {
    private RecyclerView booksRecyclerView;
    private BookRecViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_books);

        adapter = new BookRecViewAdapter(this);
        booksRecyclerView = findViewById(R.id.booksRecyclerView);

        booksRecyclerView.setAdapter(adapter);
        booksRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Dummy array list
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1, "1Q84", "Haruki Murakami", 1350, "https://jameskennedymonash.files.wordpress.com/2013/01/1q84-cover.jpg",
                "A work of maddening brilliance.", "Long description."));
        adapter.setBooks(books);

        books.add(new Book(2, "The Myth of Sisyphus", "Albert Camus", 250, "https://pictures.abebooks.com/BOOKFEATHERSLLC/md/md10422277344.jpg",
                "One of the most influential works of this century, this is a crucial exposition of existentialist thought.", "Long description."));
        adapter.setBooks(books);
    }
}