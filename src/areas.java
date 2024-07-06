import java.util.Scanner;

public class areas {

        public static void main(String[] args) {

            Scanner areas = new Scanner(System.in);

            System.out.println("Escribe una opcion:");
            System.out.println("1. Círculo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Triangulo");

            int Numero =areas.nextInt();

            switch (Numero) {

                case 1 -> {
                    System.out.println("Ingrese el Radio del circulo: ");
                    double radio = areas.nextDouble();
                    double areaCirculo = Math.PI * Math.pow(radio,2);
                    System.out.println("El area del circulo es:"+areaCirculo);
                }

                case 2 -> {
                    System.out.println("Ingrese el Lado del cuadrado: ");
                    double Lado = areas.nextDouble();
                    double areaCuadrado =Math.pow(Lado,2);
                    System.out.println("El area del cuadrado es:"+areaCuadrado);
                }

                case 3 -> {
                    System.out.println("Ingrese la Base del triangulo: ");
                    double base = areas.nextDouble();
                    System.out.println("Ingrese la Altura del triangulo: ");
                    double altura = areas.nextDouble();
                    double areaTriangulo = (base * altura ) /2;
                    System.out.println("El area del Triangulo es:"+areaTriangulo);
                }

                default -> System.out.println("Valor invalido, ingrese un numero del 1 al 3");

            };

            areas.close();

        }
    }



