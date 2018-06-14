import java.util.Scanner;

public class ViewSistemaCompras {

    private ControllerSistemaCompras controllerSistemaCompras = new ControllerSistemaCompras();


    public void MostrarTelaInicial(Repositorio repositorio, Compra compra){

        System.out.println("-------------------------------------------------------");
        System.out.println("LOJA GEEK & CIA - SISTEMA DE COMPRAS");
        System.out.println("-------------------------------------------------------\n");

        System.out.println("SALDO PARA COMPRAS: " + compra.getSaldo() + " \n");

        System.out.println("Digite o número da categoria para compra:\n");
        System.out.println("> Categorias\n");

        this.controllerSistemaCompras.mostrarCategorias(repositorio);

        Scanner scanner = new Scanner(System.in);
        Integer numeroLidoCategoria = 0;
        try{
            numeroLidoCategoria = scanner.nextInt();
        }
        catch(Exception e){
            System.out.println("Valor inválido.");
        }

        System.out.println("\nDigite o número do produto para compra:\n");
        System.out.println("> Produtos da categoria selecionada:\n");

        Categoria categoria = this.controllerSistemaCompras.mostrarProdutosCategoria(numeroLidoCategoria, repositorio);

        Integer numeroLidoProduto = 0;
        try{
            numeroLidoProduto = scanner.nextInt();
        }
        catch(Exception e){
            System.out.println("Valor inválido.");
        }

        Produto produto = this.controllerSistemaCompras.buscarProdutoCategoria(categoria, numeroLidoProduto);

        Boolean compraAutorizada = this.controllerSistemaCompras.autorizaCompraSubtraiValor(produto, compra);

        if(compraAutorizada){
            System.out.println("\nCompra autorizada! Seu saldo atual é de: " + compra.getSaldo() + "\n");
            MostrarTelaInicial(repositorio, compra);
        }
        else{
            System.out.println("\nVocê não possui saldo suficiente para esta compra :(\n\nObrigado e volte sempre!");
        }

    }

}
