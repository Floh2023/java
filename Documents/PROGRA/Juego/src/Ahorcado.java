import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdvinada = false;

        //arreglos

        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        while(!palabraAdvinada && intentos < intentosMaximos){
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas));
            System.out.println("introduce una letra");
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            for (int i = 0; i <palabraSecreta.length(); i++){
                if(palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true; 
                }
            }

            if(!letraCorrecta){
                intentos++;
                System.out.println("Incorrecto, te quedan " + (intentosMaximos-intentos)+"intentos.");

            }
            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdvinada = true;
                System.out.println("Felicidades haz adivinado" +(palabraSecreta));
            }

            

            
        }
        if(!palabraAdvinada){
            System.out.println("Que pena, GAME OVER");
        }

        scanner.close();

    }
}
