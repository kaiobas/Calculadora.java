
  import javax.swing.JOptionPane;

  public class Calculadora
          
  {
      public static void main( String[] args )
      {
          
          
          String chooseMethod =
                  JOptionPane.showInputDialog( "Escolha seu método de cálculo" );
         
          
          String firstNumber =
                   JOptionPane.showInputDialog( "Insira o primeiro numero" );
          String secondNumber =
                  JOptionPane.showInputDialog( "Insira o segundo numero" );
          
          
              int number1 = Integer.parseInt(firstNumber);
              int number2 = Integer.parseInt (secondNumber);
              
              int result = 0;
              
              switch (chooseMethod.toLowerCase()) {
                  case "soma":
                      result = number1 + number2;
                      break;
                  case "subtração":
                      result = number1 - number2;
                      break;
                  case "multiplicação":
                      result = number1 * number2;
                      break;
                  case "divisão":
                      result = number1 / number2;
                      break;
                  default:
                      JOptionPane.showMessageDialog(null, "Método de cálculo inválido", "Erro", JOptionPane.ERROR_MESSAGE);
                      System.exit(1);
              
               }
              
              JOptionPane.showMessageDialog(null, "O resultado é " +result,
                      "Resultado da operação", JOptionPane.PLAIN_MESSAGE);
                      
                      
                     
      }
     
  }
