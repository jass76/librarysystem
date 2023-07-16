package BookSystem;

public class LibrarySystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 {
		        // Create instances of different book types
		        Book book1 = new FictionBook("The Great Gatsby", "F. Scott Fitzgerald", 1925, "Classic");
		        Book book2 = new NonFictionBook("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", 2014, "Anthropology");
		        Book book3 = new ReferenceBook("Java: The Complete Reference", "Herbert Schildt", 2019, "Programming");

		        // Display details of each book
		        System.out.println("--- Fiction Book ---");
		        book1.displayDetails();

		        System.out.println("--- Non-Fiction Book ---");
		        book2.displayDetails();

		        System.out.println("--- Reference Book ---");
		        book3.displayDetails();
		    }
		}

	}