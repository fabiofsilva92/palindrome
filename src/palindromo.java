import javax.swing.*; 

public class palindrome {
    public static void main(String args [ ]) 
    { 

        String palindromo = JOptionPane.showInputDialog("Digite a palavra para verificação se é palíndromo: ");
        
        palindromo = palindromo.toLowerCase();
        
        char [] inverter = palindromo.toCharArray();
        char [] invertido = new char[inverter.length];
        
        char aux;

        //invertendo a String digitada
        for(int i = 0 ; i<inverter.length; i++)
        {
            invertido[i] = inverter[(inverter.length - 1) - i];
        }            
        
        //Criando o verificador para caso seja um palíndromo, a aplicação está Case Sensitive, sendo possível colocar as condições para aceitar mesmo uma das letras estando em maiúscula ou minúscula
        boolean verificador = true;
        
        for(int i = 0 ; i< inverter.length; i++)
        {
            verificador = invertido[i] == inverter[i];
        }
        //se verdadeiro 
        if (verificador == true)
        {
            System.out.println("True -> é um palíndromo");
        }
        else //se falso
        {
            System.out.println("False -> não é um palíndromo");
        }
    }
}
