import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        if (args.length != 1) {
            return;
        }

        String cadena = args[0];
        Pattern pat = Pattern.compile("^ISI\\d{4}-(1|2)\\.(txt|csv)$");
        Matcher mat = pat.matcher(cadena);

        if (mat.matches()) {
            System.out.println("El nombre asignado al archivo es valido");
        } else {
            System.out.println("El nombre asignado al archivo no es valido");
        }
    }
}