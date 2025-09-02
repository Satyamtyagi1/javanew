package incapsulation;

public class Library {
					private int borrowed_books;
					final private int MAX_BORROW=5;
					
					public void borrowBook()
					{
						if(borrowed_books<5) {
							borrowed_books++;
							System.out.println("The Book has Borrowed and total books are " + borrowed_books);
						}
						else
							
						{
							System.out.println("Can not borrow the book more than 5");
						}
					}
					
					public void returnBook() {
						if(borrowed_books>0) {
							borrowed_books--;
							System.out.println("The Book has been returned");
						}
						else
						{
							System.out.println("No book available to return");
						}
					
					}
					
					public int getborrowed_books()
					{
						return borrowed_books;
					}
					
						}
