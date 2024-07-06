import java.util.Scanner;

public class areaYPerimetro {

        public static void main(String[] args) {

            Scanner areas = new Scanner(System.in);

            System.out.println("Elige una opcion:");
            System.out.println("1. Círculo");
            System.out.println("2. Rectangulo");
         ;

            int Numero =areas.nextInt();

            switch (Numero) {

                case 1 -> {
                    System.out.println("Ingrese el Radio del circulo: ");
                    double radio = areas.nextDouble();

                    System.out.println("Elige una opcion:");
                    System.out.println("1.Área");
                    System.out.println("2.Perimetro");

                    int Casos = areas.nextInt();
                    switch (Casos) {

                        case 1 -> {
                            double areaCirculo = Math.PI * Math.pow(radio,2);
                            System.out.println("El area del circulo es: "+areaCirculo);
                        }
                        case 2 -> {
                            double perimetroCirculo = 2 * Math.PI * radio;
                            System.out.println("El perimetro del circulo es: "+perimetroCirculo);
                        }
                        default -> System.out.println("Valor invalido.");
                    }
                }

                case 2 -> {
                    System.out.println("Ingrese la Base del rectangulo: ");
                    double base = areas.nextDouble();
                    System.out.println("Ingrese la Altura del rectangulo: ");
                    double altura = areas.nextDouble();

                    System.out.println("Elige una opcion:");
                    System.out.println("1.Área");
                    System.out.println("2.Perimetro");

                    int casoRectangulo = areas.nextInt();
                    switch (casoRectangulo) {
                        case 1 -> {
                            double areaTriangulo = base * altura ;
                            System.out.println("El area del Rectangulo es: "+areaTriangulo);
                        }
                        case 2 -> {
                            double perimetroTriangulo = 2 * (base + altura);
                            System.out.println("El perimetro del Rectangulo es: "+perimetroTriangulo);
                        }
                    }

                }

                default -> System.out.println("Valor invalido, ingrese un numero del 1 al 2");

            };

            areas.close();

        }
    }

