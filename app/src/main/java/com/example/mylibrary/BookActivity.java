package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class BookActivity extends AppCompatActivity {

    private TextView txtBookName, txtAuthor, txtPages, txtDescription;
    private Button btnAddToWantToRead, btnAddToAlreadyRead, btnAddToCurrentlyReading, btnAddToFavorites;
    private ImageView bookImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        initViews();

        String longDescription = "This that something many things more description very long and repeat. This that something many things more description very long and repeat. " +
                "This that something many things more description very long and repeat. This that something many things more description very long and repeat. " +
                "This that something many things more description very long and repeat. This that something many things more description very long and repeat. " +
                "This that something many things more description very long and repeat. This that something many things more description very long and repeat. " +
                "This that something many things more description very long and repeat. This that something many things more description very long and repeat. " +
                "This that something many things more description very long and repeat. This that something many things more description very long and repeat. " +
                "This that something many things more description very long and repeat. This that something many things more description very long and repeat. " +
                "This that something many things more description very long and repeat.";

        //TODO: Get the data from the recycler view in here
        Book book = new Book(1, "The Myth of Sisyphus", "Albert Camus", 250, "https://pictures.abebooks.com/BOOKFEATHERSLLC/md/md10422277344.jpg",
                "One of the most influential works of this century, this is a crucial exposition of existentialist thought.", longDescription);
        setData(book);
    }

    private void initViews() {
        txtAuthor = findViewById(R.id.txtAuthorName);
        txtBookName = findViewById(R.id.txtBookName);
        txtPages = findViewById(R.id.txtPages);
        txtDescription = findViewById(R.id.txtDescription);

        btnAddToAlreadyRead = findViewById(R.id.btnAddToAlreadyRead);
        btnAddToCurrentlyReading = findViewById(R.id.btnAddToCurrentlyReading);
        btnAddToFavorites = findViewById(R.id.btnAddToFavorites);
        btnAddToWantToRead = findViewById(R.id.btnAddToWantToRead);

        bookImage = findViewById(R.id.imgBook);
    }

    private void setData(Book book) {
        txtBookName.setText(book.getName());
        txtAuthor.setText(book.getAuthor());
        txtPages.setText(String.valueOf(book.getPages()));
        txtDescription.setText(book.getLongDesc());
        Glide.with(this)
                .asBitmap().load(book.getImageUrl())
                .into(bookImage);
    }
}