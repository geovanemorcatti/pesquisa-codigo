package fatorial;
import java.util.LinkedList;
import java.util.List;
 
// Algoritmo de fatora��o 'divis�o por tentativa' (Trial Division)
public class TrialDivision {
     
    // Retorna uma lista de fatores primos de n
    // Se quiser, substitua 'int' por 'long'
    public static List<Integer> trialDivision(int n){
        // O fatores s�o armazenados numa lista ligada
        // Entretanto voc� pode usar a estrutura que quiser
        // Exemplos: Array, ArrayList, Stack (pilha)
        List<Integer> factors = new LinkedList<Integer>();
         
        // Verifica se 2 � fator
        while(n % 2 == 0){
            factors.add(2);
            n = n / 2;
        }
         
        // Agora verifica os poss�veis fatores �mpares
        // S� �mpares s�o poss�veis
        int d = 3; // Poss�veis fatores
        int d2 = 9; // d2 = d * d
        while(d2 <= n){
            // Se d � fator, faz a divis�o e armazena o fator
            if(n % d == 0){
                factors.add(d);
                n = n / d;
            }else{
                // Se d n�o � fator, verifica o pr�ximo
                d = d + 2;
                d2 = d * d; // d2 = d*d
            }
        }
        // Essa condi��o � necess�ria quando n for primo
        if(n > 1){
            factors.add(n);
        }
        return factors;
    }
     
    // Testes
    public static void main(String[] args) {
        System.out.println("Fatores de 10 = " + trialDivision(10));
        System.out.println("Fatores de 50 = " + trialDivision(50));
        System.out.println("Fatores de 24 = " + trialDivision(24));
        System.out.println("Fatores de 350 = " + trialDivision(350));
        System.out.println("Fatores de 107 = " + trialDivision(107));
        System.out.println("Fatores de 1025 = " + trialDivision(1025));
        System.out.println("Fatores de 3 * 5 * 7 * 11 * 13 * 17 = " +
                trialDivision(3 * 5 * 7 * 11 * 13 * 17));
    }    
}
