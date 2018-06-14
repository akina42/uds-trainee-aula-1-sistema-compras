public class Repositorio {

    private ArvoreCategorias arvoreCategorias;

    public ArvoreCategorias getArvoreCategorias() {
        return arvoreCategorias;
    }

    public void setArvoreCategorias(ArvoreCategorias arvoreCategorias) {
        this.arvoreCategorias = arvoreCategorias;
    }

    public void inicializarRepositorio(){


        //TODO melhorar - usar uma estrutura, add em um arrayList ou map

        this.arvoreCategorias = new ArvoreCategorias();

        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();
        Produto produto4 = new Produto();
        Produto produto5 = new Produto();

        Produto produto6 = new Produto();
        Produto produto7 = new Produto();
        Produto produto8 = new Produto();
        Produto produto9 = new Produto();
        Produto produto10 = new Produto();

        Produto produto11 = new Produto();
        Produto produto12 = new Produto();
        Produto produto13 = new Produto();
        Produto produto14 = new Produto();
        Produto produto15 = new Produto();

        Produto produto16 = new Produto();
        Produto produto17 = new Produto();
        Produto produto18 = new Produto();
        Produto produto19 = new Produto();
        Produto produto20 = new Produto();

        Produto produto21 = new Produto();
        Produto produto22 = new Produto();
        Produto produto23 = new Produto();
        Produto produto24 = new Produto();
        Produto produto25 = new Produto();

        produto1.setNomeProduto("Camiseta Star Wars");
        produto2.setNomeProduto("Camiseta O Guia");
        produto3.setNomeProduto("Camiseta The Last Of Us");
        produto4.setNomeProduto("Camiseta Senhor dos Anéis");
        produto5.setNomeProduto("Camiseta Matrix");

        produto6.setNomeProduto("Livro - O Guia do Mochileiro Das Galáxias");
        produto7.setNomeProduto("Livro - O Senhor Dos Anéis - Trilogia");
        produto8.setNomeProduto("Livro - Neuromancer");
        produto9.setNomeProduto("Livro - Fundação");
        produto10.setNomeProduto("Livro - O Caminho Jedi");

        produto11.setNomeProduto("Funko POP! Rorschach - Watchmen");
        produto12.setNomeProduto("Funko POP! Spike - Cowboy Bebop");
        produto13.setNomeProduto("Funko POP! Han Solo - Star Wars");
        produto14.setNomeProduto("Funko POP! Bilbo Baggins - Senhor dos Anéis");
        produto15.setNomeProduto("Funko POP! Sherlock Holmes");

        produto16.setNomeProduto("Quadro Breaking Bad");
        produto17.setNomeProduto("Quadro True Detective");
        produto18.setNomeProduto("Quadro Lost");
        produto19.setNomeProduto("Quadro Sherlock Holmes");
        produto20.setNomeProduto("Quadro Star Wars");

        produto21.setNomeProduto("Caneca Breaking Bad");
        produto22.setNomeProduto("Caneca Star Wars");
        produto23.setNomeProduto("Caneca Ocarina of Time");
        produto24.setNomeProduto("Caneca Monty Python");
        produto25.setNomeProduto("Caneca Senhor dos Anéis");


        produto1.setPrecoProduto(10.00);
        produto2.setPrecoProduto(11.00);
        produto3.setPrecoProduto(12.00);
        produto4.setPrecoProduto(13.00);
        produto5.setPrecoProduto(14.00);

        produto6.setPrecoProduto(20.00);
        produto7.setPrecoProduto(21.00);
        produto8.setPrecoProduto(22.00);
        produto9.setPrecoProduto(23.00);
        produto10.setPrecoProduto(24.00);

        produto11.setPrecoProduto(30.00);
        produto12.setPrecoProduto(31.00);
        produto13.setPrecoProduto(32.00);
        produto14.setPrecoProduto(33.00);
        produto15.setPrecoProduto(34.00);

        produto16.setPrecoProduto(40.00);
        produto17.setPrecoProduto(41.00);
        produto18.setPrecoProduto(42.00);
        produto19.setPrecoProduto(43.00);
        produto20.setPrecoProduto(44.00);

        produto21.setPrecoProduto(50.00);
        produto22.setPrecoProduto(51.00);
        produto23.setPrecoProduto(52.00);
        produto24.setPrecoProduto(53.00);
        produto25.setPrecoProduto(54.00);


        Categoria categoria1 = new Categoria();
        Categoria categoria2 = new Categoria();
        Categoria categoria3 = new Categoria();
        Categoria categoria4 = new Categoria();
        Categoria categoria5 = new Categoria();

        categoria1.setNameCategoria("Camisetas");
        categoria2.setNameCategoria("Livros");
        categoria3.setNameCategoria("Funko Toys");
        categoria4.setNameCategoria("Quadros");
        categoria5.setNameCategoria("Canecas");

        categoria1.adicionarCincoProdutos(produto1, produto2, produto3, produto4, produto5);
        categoria2.adicionarCincoProdutos(produto6, produto7, produto8, produto9, produto10);
        categoria3.adicionarCincoProdutos(produto11, produto12, produto13, produto14, produto15);
        categoria4.adicionarCincoProdutos(produto16, produto17, produto18, produto19, produto20);
        categoria5.adicionarCincoProdutos(produto21, produto22, produto23, produto24, produto25);

        arvoreCategorias.adicionar5Categorias(categoria1, categoria2, categoria3, categoria4, categoria5);

    }


}
