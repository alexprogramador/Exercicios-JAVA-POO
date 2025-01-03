package desafio10;

//import javax.swing.JOptionPane;

//Classe principal Area.java
public class Area {
 // Método para calcular área do quadrado
 public double calcularAreaQuadrado(double lado) {
     return lado * lado;
 }

 // Método para calcular área do retângulo
 public double calcularAreaRetangulo(double base, double altura) {
     return base * altura;
 }

 // Método para calcular área do trapézio
 public double calcularAreaTrapezio(double baseMaior, double baseMenor, double altura) {
     return ((baseMaior + baseMenor) * altura) / 2;
 }
}
