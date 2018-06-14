public class ArvoreCategorias {

    //TODO usar arrayList ou map
    private Categoria categoria1;
    private Categoria categoria2;
    private Categoria categoria3;
    private Categoria categoria4;
    private Categoria categoria5;

    public Categoria getCategoria1() {
        return categoria1;
    }

    public void setCategoria1(Categoria categoria1) {
        this.categoria1 = categoria1;
    }

    public Categoria getCategoria2() {
        return categoria2;
    }

    public void setCategoria2(Categoria categoria2) {
        this.categoria2 = categoria2;
    }

    public Categoria getCategoria3() {
        return categoria3;
    }

    public void setCategoria3(Categoria categoria3) {
        this.categoria3 = categoria3;
    }

    public Categoria getCategoria4() {
        return categoria4;
    }

    public void setCategoria4(Categoria categoria4) {
        this.categoria4 = categoria4;
    }

    public Categoria getCategoria5() {
        return categoria5;
    }

    public void setCategoria5(Categoria categoria5) {
        this.categoria5 = categoria5;
    }

    public void adicionar5Categorias(Categoria categoria1, Categoria categoria2, Categoria categoria3,
                                     Categoria categoria4, Categoria categoria5){
        this.setCategoria1(categoria1);
        this.setCategoria2(categoria2);
        this.setCategoria3(categoria3);
        this.setCategoria4(categoria4);
        this.setCategoria5(categoria5);
    }
}
