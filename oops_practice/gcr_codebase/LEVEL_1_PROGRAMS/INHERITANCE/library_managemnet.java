class Book {

    String title;
    int publicationYear;


    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }


    void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}



// Subclass
class Author extends Book {

    String name;
    String bio;


    Author(String title, int year, String name, String bio) {

        super(title, year);
        this.name = name;
        this.bio = bio;
    }


    @Override
    void displayInfo() {

        super.displayInfo();

        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}



// Main Class
public class library_managemnet {

    public static void main(String[] args) {

        Author book = new Author(
                "Java Programming",
                2024,
                "James Gosling",
                "Creator of Java Programming Language"
        );


        book.displayInfo();
    }
}