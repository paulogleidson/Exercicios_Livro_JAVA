package questao8;
/*Implemente uma classe contendo apenas métodos estáticos capazes de
realizar todas as conversões de temperatura possíveis entre as unidades
Celsius, Fahrenheit e Kelvin. São conhecidas as relações de conversão
seguintes: F = 9*C/5 + 32 e K = C + 273. */

public class Temperatura {
    
    static double celsiusToFahrenheit(double celsius) {
        return 9 * celsius / 5 + 32;     
    }
    static double celsiusToKelvin(double celsius) {
        return celsius + 273;
    }

    static double kelvinToCelsius(double kelvin) {
        return kelvin - 273;
    }
    static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273) * 1.8 + 32;
    }

    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8; 
    }
    static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) / 1.8 + 273;
    }

    public static void main(String[] args) {
        System.out.println(celsiusToFahrenheit(30));
        System.out.println(celsiusToKelvin(50));
        System.out.println(kelvinToCelsius(400));
        System.out.println(kelvinToFahrenheit(500));
        System.out.println(fahrenheitToCelsius(40));
        System.out.println(fahrenheitToKelvin(600));
    }

}