public class Main {
    public static void main (String[] args){
        try{
            Repositorio repositorio = new Repositorio();
            repositorio.inicializarRepositorio();
            Compra compra = new Compra();
            Double valePresente = 1500.00;
            compra.inicializaSaldo(valePresente);
            ViewSistemaCompras view = new ViewSistemaCompras();
            view.MostrarTelaInicial(repositorio, compra);
        }
        catch(Exception e){
            System.out.println("Ocorreu um erro na aplicação.");
        }
    }
}
