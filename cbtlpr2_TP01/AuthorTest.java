public class Author {
    // Atributos privados
    private String name;
    private String email;
    private char gender; // 'm' ou 'f'

    // Construtor para inicializar os atributos
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Métodos Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    // Setter para email
    public void setEmail(String email) {
        this.email = email;
    }

    // Método toString
    @Override
    public String toString() {
        return "Author[name=" + name + ",email=" + email + ",gender=" + gender + "]";
    }
}

public class AuthorTest {
    public static void main(String[] args) {
        // Testar construtor
        Author author = new Author("Wellington Tuler", "tulermoraes@yahoo.com", 'm');

        // Verificar o método toString()
        System.out.println(author.toString());  // Deve exibir: Author[name=Wellington Tuler,email=tulermoraes@yahoo.com,gender=m]

        // Testar o Getter
        System.out.println("Name: " + author.getName());  // Deve exibir: Name: Wellington Tuler
        System.out.println("Email: " + author.getEmail());  // Deve exibir: Email: tulermoraes@yahoo.com
        System.out.println("Gender: " + author.getGender());  // Deve exibir: Gender: m

        // Testar o Setter de email
        author.setEmail("newemail@example.com");
        System.out.println("Updated Email: " + author.getEmail());  // Deve exibir: Updated Email: newemail@example.com
    }
}