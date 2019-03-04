
/**
 * Write a description of class Book here.
 *
 * @author Kaz Cogswell
 * @version (a version number or a date)
 */

public class Book
{
    // instance variables - replace the example below with your own
    public String authorFirstName;
    public String authorLastName;
    public int ISBNNum;
    public String bookTitle;
    public String pubDate;
    public int numPages;
    
    
    public Book()
    {
        authorFirstName = "unknown";
        authorLastName = "unknown";
        ISBNNum = 0;
        bookTitle = "unknown";
        pubDate = "unknown";
        numPages = 0;
        
    }
    
        public void setFirstName(String firstName)
    {
        authorFirstName = firstName;
    }
    
    public void setLastName(String lastName)
    {
        authorLastName = lastName;
    }
    
    public void setISBNNum(int ISBN)
    {
        ISBNNum = ISBN;
    }
    
    public void setBookTitle(String title)
    {
        bookTitle = title;
    }
    
    public void setPubDate(String date)
    {
        pubDate = date;
    }
    
    public void setNumPages(int numOfPages)
    {  
        if (numPages < 10)
        {
            System.out.println("You have too few pages. Number of pages must be greater than 10.");
        } else {
            numPages = numOfPages;
        }
    }
    public String printBookTitle()
    {
        return bookTitle;
    }
}