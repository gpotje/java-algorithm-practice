package org.example.java.N9.modelagem_objetos_responsabilidade.ex04;

public class MediaContent {
    private String title;
    private ContentRating rating;

    public MediaContent(String title, ContentRating rating) {
        this.title = title;
        this.rating = rating;
    }

    public ContentRating getRating() {
        return rating;
    }
}
