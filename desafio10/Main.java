package desafio10;


import javax.swing.JOptionPane;

//Classe de controle Main.java
public class Main {
 public static void main(String[] args) {
     // Instanciando a classe Area
     Area area = new Area();

     // Solicitando valores ao usuário
     double ladoQuadrado = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado do quadrado:"));
     double baseRetangulo = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do retângulo:"));
     double alturaRetangulo = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do retângulo:"));
     double baseMaiorTrapezio = Double.parseDouble(JOptionPane.showInputDialog("Digite a base maior do trapézio:"));
     double baseMenorTrapezio = Double.parseDouble(JOptionPane.showInputDialog("Digite a base menor do trapézio:"));
     double alturaTrapezio = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do trapézio:"));

     // Calculando áreas das figuras geométricas
     double areaQuadrado = area.calcularAreaQuadrado(ladoQuadrado);
     double areaRetangulo = area.calcularAreaRetangulo(baseRetangulo, alturaRetangulo);
     double areaTrapezio = area.calcularAreaTrapezio(baseMaiorTrapezio, baseMenorTrapezio, alturaTrapezio);

     // Exibindo resultados
     JOptionPane.showMessageDialog(null, "Área do quadrado: " + areaQuadrado);
     JOptionPane.showMessageDialog(null, "Área do retângulo: " + areaRetangulo);
     JOptionPane.showMessageDialog(null, "Área do trapézio: " + areaTrapezio);
 }
}