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
    private String refNumber;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int numPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = numPages;
        refNumber = ("");
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
     * Provide access to the string holding the reference number
     * @return refNumber
     */
    public String getRefNumber()
    {
       return refNumber; 
    }
    
    /**
     * mutator for refNumber
     */
    public void setRefNumber(String ref)
    {
        if(ref.length() < 3)
        {
      System.out.println("Error! Reference number must be at least three characters.");
    }else
    {
        refNumber = ref;
    }
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
     * Print author, title, pages and reference number to the terminal window
     */
    public void printDetails()
    {
       System.out.println("Title: "+title+"\nAuthor: "+author+"\nPages: "+pages);
       if(refNumber == (""))
       {
           System.out.println("Reference Number: ZZZ"); 
        }else
        {
           System.out.println("Reference Number: "+refNumber);
        }
    }
}
