package heranca;
import heranca.empresa.engenheiro;
import heranca.empresa.gerente;

public class exec {
    public static void main(String[] args) {
        engenheiro eng1 = new engenheiro("joao","WEB", 24345, 1848272, 619908887);
        engenheiro eng2 = new engenheiro("pedro","Mobile", 54432, 3224445, 619908345);
        gerente g1 = new gerente("Cabral", 2, 135153, 15123533);

        System.out.println(eng1);
        System.out.println(eng2);
        System.out.println(g1);
    }
}
