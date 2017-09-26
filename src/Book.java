import javax.swing.*;
public class Book
{
    private String Title, ISBN;
    private int Pages;
    private float Price;

    public void setTitle(String title) {
        this.Title = title;
    }

    public void setPrice(float price) {
        this.Price = price;
    }

    public void setISBN(String ISBN) {

        this.ISBN = ISBN;
    }

    public void setPages(int pages) {
        this.Pages = pages;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return Title;
    }

    public int getPages() {
        return Pages;
    }

    public float getPrice() {
        return Price;
    }

    @Override
    public String toString() {
        return "Title: " + getTitle() + "\nPages: " + getPages() + "\nISBN: " + getISBN() + "\nPrice: " + getPrice();
    }

    public Book()
    {
        this("unknown","unknown",0,0.0f);
    }

    public Book(String title, String isbn, int pages, float price)
    {

        setTitle("Unknown");
        setISBN("Unknown ISBN.");
        setPrice(0.0f);
        setPages(0);

    }
}
