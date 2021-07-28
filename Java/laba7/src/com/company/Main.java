package com.company;

public class Main {

    static abstract class Document {
        String title;
        String author;

        public Document(String title_, String author_){
            title = title_;
            author = author_;
        }

        public abstract void print();
    }

    static class Book extends Document {
        String coverMaterial;
        public Book(String title_, String author_, String coverMaterial_){
            super(title_, author_);
            coverMaterial = coverMaterial_;
        }

        public void print(){
            System.out.println("Title: "+ title+" Author: " + author+ " CoverMaterial: "+ coverMaterial);
        }

    }

    static class Article extends Document {
        int pagesNum;
        public Article(String title_, String author_, int pagesNum_){
            super(title_, author_);
            pagesNum = pagesNum_;
        }

        public void print(){
            System.out.println("Title: "+ title+" Author: " + author+ " Number of pages: "+ pagesNum);
        }
    }


    public static void main(String[] args) {
        Document[] doc = new Document[] {
                new Book("book1", "Bob1", "fairy pollen1"),
                new Article("article1", "Steve1", 50),
                new Book("book2", "Bob2", "fairy pollen2"),
                new Article("article2", "Steve2", 60)
        };

        for(int i = 0; i < 4; i++){
            doc[i].print();
        }
    }
}
