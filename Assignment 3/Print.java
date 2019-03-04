
/**
 * Write a description of class Print here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Print extends Book
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Print
     */
  public void PrintInfo()
    {
        System.out.println("Author First Name: " + authorFirstName);
        System.out.println("Author Last Name: " + authorLastName);
        System.out.println("ISBN Number: " + ISBNNum);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Publication Date: " + pubDate);
        System.out.println("Number of Pages: " + numPages);
    }
}