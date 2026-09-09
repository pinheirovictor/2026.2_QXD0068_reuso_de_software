import decorator.ComChocolate;
import decorator.ComLeite;
import model.Cafe;
import model.CafeSimples;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        // Café básico.
        Cafe cafe = new CafeSimples();

        System.out.println(
                cafe.getDescricao() +
                        " - R$ " + cafe.getPreco()
        );

        // Adiciona leite.
        cafe = new ComLeite(cafe);

        // Adiciona chocolate.
        cafe = new ComChocolate(cafe);

        System.out.println(
                cafe.getDescricao() +
                        " - R$ " + cafe.getPreco()
        );
    }
}