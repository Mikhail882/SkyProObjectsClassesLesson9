package ru.skypro;

public class Main {


    public static void main(String[] args) {
        Author firstAuthor = new Author("��� ", "�������");
        System.out.println("����� ����� " + firstAuthor.getAuthorName());
        Book firstBook = new Book("����� � ������", firstAuthor, 2000);
        System.out.println("������ ��� ���������� " + firstBook.getPublishingYear());
        firstBook.setPublishingYear(2020);
        System.out.println("����� ��� ���������� " + firstBook.getPublishingYear());
        System.out.println(firstBook.getBookName() + " " + firstBook.getAuthorName().getAuthorName() + " " + firstBook.getPublishingYear());
    }
}
