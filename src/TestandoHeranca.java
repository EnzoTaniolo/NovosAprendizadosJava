import br.com.fiap.restaurante.model.Bebida;
import br.com.fiap.restaurante.model.PratoQuente;

public class TestandoHeranca {
    public static void main(String[] args){

        PratoQuente pratoQuente = new PratoQuente();
        Bebida bebida  = new Bebida("Suco de laranja", "Agua, gelo e laranja", 7.90, 500 );
        System.out.print("A bebida informada foi " + bebida.getNome());
        System.out.print(", é composta por " + bebida.getIngredientes());
        System.out.print(", custa R$" + bebida.getPreco());
        System.out.println(" e seu tamanho é de " + bebida.getTamanho() + "ml");

        System.out.println(bebida.getResumo());
        System.out.println(pratoQuente.getResumo());
    }
}
