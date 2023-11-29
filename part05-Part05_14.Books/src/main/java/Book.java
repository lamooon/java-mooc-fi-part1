
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean equals(Object compare) {

        if (this == compare) {
            return true;
        }

        if (getClass() != compare.getClass()) {
            return false;
        }

        Book compareBook = (Book) compare;
        if (compareBook.getName().equals(this.name) && compareBook.getPublicationYear() == this.getPublicationYear()) {
            return true;
        }

        return false;
    }
}
