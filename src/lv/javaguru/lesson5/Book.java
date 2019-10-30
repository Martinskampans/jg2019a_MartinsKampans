package lv.javaguru.lesson5;

import java.util.Objects;

public class Book {
    private String author;
    private String title;
    private int pageCount;


    public void setAuthor(String author){
        this.author = author;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setPageCount (int pageCount){
        this.pageCount = pageCount;
    }
    public String getAuthor(){
        return author;
    }
    public String title(){
        return title;
    }
    public int getPageCount(){
        return pageCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book that = (Book) o;
        return Objects.equals(author, that.author) &&
                Objects.equals(title, that.title) &&
                Objects.equals(pageCount, that.pageCount);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title ='" + title + '\'' +
                ", author ='" + author + '\'' +
                ", page count='" + pageCount + '\'' +
                '}';

    }


}


