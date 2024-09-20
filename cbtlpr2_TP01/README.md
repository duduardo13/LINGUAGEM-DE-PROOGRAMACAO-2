Exercício 01 Uma classe chamada Author é desenhada para servir de modelo para autores de livros, veja abaixo:

3 atributos privados name (String), email (String), and gender (char contendo 'm' or 'f');

Um construtor para inicializar os atributos com base nos 3 parâmetros.

Não existe um construtor default para Author [Author()].

Criar métodos públicos: getName(), getEmail(), setEmail(), and getGender().

Não existe setter para name e gender, estes atributos não podem ser alterados.

Um método chamado toString() que retorna "Author[name=?,email=?,gender=?]", exemplo "Author[name=Wellington Tuler,email=tulermoraes@yahoo.com,gender=m]".

Escreva a classe Author e desenvolva uma de teste, com os seguintes itens:

Testar construtor.

Verificar o método toString().

Testar o Setter

Testar os Getters

Exercício 02 Um livro pode ser escrito por um ou muitos autores, por esta razão a classe Book deve ter um array de autores, conforme o modelo abaixo:

O construtor deve receber um array de autores
Uma vez que o livro é instanciado o seu autor não pode ser adicionado ou removido.
O método toString() deve retornar a seguinte resposta: "Book[name=?,authors={Author[name=?,email=?,gender=?],......},price=?,qty=?]". Você deve:
Escrever um código para a classe Book, você deve reutilizar o código do Author escrito no exercício 1
Escrever uma classe de teste, chamada TestBook, para testar a classe Book. Dicas: // Crie e aloque o array de autores. Author[] authors = new Author[2]; authors[0] = new Author("Autor 01", "autor01@somewhere.com.br", 'm'); authors[1] = new Author("Autor 02", "autor02@nowhere.com.br", 'm'); // Declarar e alocar a instância de um book. Book testeBook = new Book("Java for Dummy", authors, 19.99, 99); System.out.println(testeBook); // toString()
Exercício 03

Implemente o sistema representado pelo diagrama abaixo. Obrigatório implementar uma classe de testes para todos os métodos das classes Staff e Student.

Link para consultar exercicios com as imagens: https://drive.google.com/drive/folders/1Z9-WxjEX4WcGezL3AvnNe5sE9nJIr493
