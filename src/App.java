import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> frutas1 = new ArrayList<> (Arrays.asList("Morango", "Uva", "Maca", "Laranja"));
        List<String> frutas2 = new ArrayList<> (Arrays.asList("Maca", "Limao", "Cereja", "Uva"));
        List<String> frutasDuplicadas = new ArrayList<>();

        for(int i = 0; i<frutas1.size(); i++) {
            if(frutas2.contains(frutas1.get(i))) {
                frutasDuplicadas.add(frutas1.get(i));
            }
        }

        System.out.println(frutasDuplicadas);
    }
}
