public class Main {
    public static void main(String[] args) {
        // Defina a temperatura em graus Celsius
        double temperaturaCelsius = 25.0;

        // Aplique a fórmula de conversão para Fahrenheit
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        // Exiba o valor convertido no console com uma casa decimal
        System.out.println("Temperatura em Fahrenheit: " + temperaturaFahrenheit);

        // Crie uma variável inteira para exibir a temperatura em Fahrenheit sem casas decimais
        int temperaturaFahrenheitInteira = (int) temperaturaFahrenheit;

        // Exiba o valor inteiro no console
        System.out.println("Temperatura em Fahrenheit (sem casas decimais): " + temperaturaFahrenheitInteira);
    }
}