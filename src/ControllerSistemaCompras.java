public class ControllerSistemaCompras {

    public void mostrarCategorias(Repositorio repositorio){
        System.out.println("[1] - " + repositorio.getArvoreCategorias().getCategoria1().getNameCategoria());
        System.out.println("[2] - " + repositorio.getArvoreCategorias().getCategoria2().getNameCategoria());
        System.out.println("[3] - " + repositorio.getArvoreCategorias().getCategoria3().getNameCategoria());
        System.out.println("[4] - " + repositorio.getArvoreCategorias().getCategoria4().getNameCategoria());
        System.out.println("[5] - " + repositorio.getArvoreCategorias().getCategoria5().getNameCategoria());
    }

    public Categoria mostrarProdutosCategoria(Integer numeroLido, Repositorio repositorio){
        Categoria categoria = new Categoria();
        switch(numeroLido){
            case 1:
                this.iterarProdutos(repositorio.getArvoreCategorias().getCategoria1());
                categoria = repositorio.getArvoreCategorias().getCategoria1();
                break;
            case 2:
                this.iterarProdutos(repositorio.getArvoreCategorias().getCategoria2());
                categoria = repositorio.getArvoreCategorias().getCategoria2();
                break;
            case 3:
                this.iterarProdutos(repositorio.getArvoreCategorias().getCategoria3());
                categoria = repositorio.getArvoreCategorias().getCategoria3();
                break;
            case 4:
                this.iterarProdutos(repositorio.getArvoreCategorias().getCategoria4());
                categoria = repositorio.getArvoreCategorias().getCategoria4();
                break;
            case 5:
                this.iterarProdutos(repositorio.getArvoreCategorias().getCategoria5());
                categoria = repositorio.getArvoreCategorias().getCategoria5();
                break;
            default:
                System.out.println("Opção inválida de categoria na apresentação do produto.");
                break;
        }
        return categoria;
    }

    public Produto buscarProdutoCategoria(Categoria categoria, Integer numeroLidoProduto){
        Produto produto = new Produto();
        switch (numeroLidoProduto){
            case 1:
                produto = categoria.getProduto1();
                break;
            case 2:
                produto = categoria.getProduto2();
                break;
            case 3:
                produto = categoria.getProduto3();
                break;
            case 4:
                produto = categoria.getProduto4();
                break;
            case 5:
                produto = categoria.getProduto5();
                break;
            default:
                System.out.println("Opção de produto inválida.");
                break;
        }
        return produto;
    }

    public Boolean autorizaCompraSubtraiValor(Produto produto, Compra compra){
        Boolean compraAutorizada = false;
        Double auxPrecoProduto = produto.getPrecoProduto();
        Double auxSaldo = compra.getSaldo();
        Double subtracao = auxSaldo - auxPrecoProduto;
        if (subtracao > 0){
            compra.setSaldo(subtracao);
            compraAutorizada = true;
        }
        return compraAutorizada;
    }


    private void iterarProdutos(Categoria categoria){

        System.out.println("[1] - " + categoria.getProduto1().getNomeProduto());
        System.out.println("Preço: " + categoria.getProduto1().getPrecoProduto());
        System.out.println("[2] - " + categoria.getProduto2().getNomeProduto());
        System.out.println("Preço: " + categoria.getProduto2().getPrecoProduto());
        System.out.println("[3] - " + categoria.getProduto3().getNomeProduto());
        System.out.println("Preço: " + categoria.getProduto3().getPrecoProduto());
        System.out.println("[4] - " + categoria.getProduto4().getNomeProduto());
        System.out.println("Preço: " + categoria.getProduto4().getPrecoProduto());
        System.out.println("[5] - " + categoria.getProduto5().getNomeProduto());
        System.out.println("Preço: " + categoria.getProduto5().getPrecoProduto());
    }

}
