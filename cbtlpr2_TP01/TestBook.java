// Classe Author (reaproveitada do exercício anterior)
class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Author[name=" + name + ",email=" + email + ",gender=" + gender + "]";
    }
}

// Classe Book
class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    // Construtor com 3 parâmetros
    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    // Construtor com 4 parâmetros (incluindo quantidade)
    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    // Getters e Setters
    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    // Método toString da classe Book
    @Override
    public String toString() {
        StringBuilder authorsString = new StringBuilder();
        for (Author author : authors) {
            if (authorsString.length() > 0) {
                authorsString.append(",");
            }
            authorsString.append(author.toString());
        }
        return "Book[name=" + name + ",authors={" + authorsString + "},price=" + price + ",qty=" + qty + "]";
    }

    // Método que retorna os nomes dos autores
    public String getAuthorNames() {
        StringBuilder authorNames = new StringBuilder();
        for (Author author : authors) {
            if (authorNames.length() > 0) {
                authorNames.append(",");
            }
            authorNames.append(author.getName());
        }
        return authorNames.toString();
    }
}

// Classe de Teste
public class TestBook {
    public static void main(String[] args) {
        // Criar o array de autores
        Author author1 = new Author("Author 01", "author01@somewhere.com.br", 'm');
        Author author2 = new Author("Author 02", "author02@nowhere.com.br", 'f');
        Author[] authors = {author1, author2};

        // Declarar e instanciar um objeto Book
        Book testBook = new Book("Java for Dummies", authors, 19.99, 99);

        // Testar o método toString()
        System.out.println(testBook.toString());  // Deve exibir todas as informações do livro e autores

        // Testar o método getAuthorNames()
        System.out.println("Author names: " + testBook.getAuthorNames());  // Deve exibir os nomes dos autores separados por vírgula
    }
}
