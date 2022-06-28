package com.kenzie.library.model;

//TODO: Complete LibraryBook class by extending Book and adding required elements

public class LibraryBook extends Book{

    private String isbn = "";
    private String subjectList = "";

    //constructors
    public LibraryBook(){
        super();
        isbn = getIsbn();
        subjectList = getSubjectList();
    }

    public LibraryBook(String title, String author){
        super(title, author);
        this.title = title;
        this.author = author;

    }

    //getter setter methods
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(String subjectList) {
        this.subjectList = subjectList;
    }
    @Override
    public String toString() {
        return "LibraryBook{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", subjectList='" + subjectList + '\'' +
                '}';
    }
    public void setBookInfo(String details){
        String[] detailSplit = details.split("\\|");
        setTitle(detailSplit[0]);
        setAuthor(detailSplit[1]);
        setIsbn(detailSplit[2]);
        setSubjectList(detailSplit[3]);

    }
}