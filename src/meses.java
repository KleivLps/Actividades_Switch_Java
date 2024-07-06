import java.util.Scanner;

public class meses{

public static void main(String[] args) {
    System.out.println("Escribe el mes:");
    Scanner mes = new Scanner(System.in);

    String meses = mes.nextLine();

    int numeroDeDias = switch (meses) {
        case "Febrero" -> 28;
        case "Abril", "junio", "Septiembre", "Noviembre" -> 30;
        case "Enero", "Marzo", "Mayo", "Julio", "Agosto", "Octubre", "Diciembre" ->

                31;

        default -> 0;
    };

    System.out.println(meses+" tiene "+numeroDeDias+" días.");
}
    }