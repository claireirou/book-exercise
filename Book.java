/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Claire Iroudayassamy
 * @version Feb 4, 2019
 */
class Book
{
     // The fields.
    private String author;
    private String title;
    private int pages;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int numPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = numPages;
    }

    // Add the methods here ...
    /**
     * Provide access to the string holding the author's name
     * @return author
     */
    public String getAuthor()
    {
        return author;
    }
    
    /**
     * Provide access to the string holding the book's title
     * @return title
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Provide access to the int number of pages
     * @return pages
     */
    public int getPages()
    {
        return pages;
    }
    
    /**
     * Print author to the terminal window
     */
    public void printAuthor()
    {
        System.out.println("By: "+author);
    }
    
    /**
     * Print title to the terminal window
     */
    public void printTitle()
    {
        System.out.println(title);
    }
    
    /**
     * Print author, title, and pages to the terminal window
     */
    public void printDetails()
    {
       System.out.println("Title: "+title+"\nAuthor: "+author+"\nPages: "+pages); 
    }
}
