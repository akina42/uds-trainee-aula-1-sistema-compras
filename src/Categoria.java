import java.util.UUID;

public class Categoria {


/*    private UUID idCategoria;*/
    private String nameCategoria;


    //TODO usar arrayList ou map
    private Produto produto1;
    private Produto produto2;
    private Produto produto3;
    private Produto produto4;
    private Produto produto5;

/*    public UUID getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(UUID idCategoria) {
        this.idCategoria = idCategoria;
    }*/

    public String getNameCategoria() {
        return nameCategoria;
    }

    public void setNameCategoria(String nameCategoria) {
        this.nameCategoria = nameCategoria;
    }

    public Produto getProduto1() {
        return produto1;
    }

    public void setProduto1(Produto produto1) {
        this.produto1 = produto1;
    }

    public Produto getProduto2() {
        return produto2;
    }

    public void setProduto2(Produto produto2) {
        this.produto2 = produto2;
    }

    public Produto getProduto3() {
        return produto3;
    }

    public void setProduto3(Produto produto3) {
        this.produto3 = produto3;
    }

    public Produto getProduto4() {
        return produto4;
    }

    public void setProduto4(Produto produto4) {
        this.produto4 = produto4;
    }

    public Produto getProduto5() {
        return produto5;
    }

    public void setProduto5(Produto produto5) {
        this.produto5 = produto5;
    }

    public void adicionarCincoProdutos(Produto produto1, Produto produto2, Produto produto3,
                                       Produto produto4, Produto produto5){
        this.setProduto1(produto1);
        this.setProduto2(produto2);
        this.setProduto3(produto3);
        this.setProduto4(produto4);
        this.setProduto5(produto5);
    }

}
