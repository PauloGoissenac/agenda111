package agenda;

/**
 *
 * @author paulo.gois
 */
public class agenda1 {

    public static void main(String[] args) {
        Agenda agenda1 = new Agenda();
        Agenda agenda2 = new Agenda();

        agenda1.anotar(12, 10, "Dia das crianças");
        agenda2.anotar(12, 15, "Natal");

        agenda1.mostrarAnotacao();
        agenda2.mostrarAnotacao();

    }
}
