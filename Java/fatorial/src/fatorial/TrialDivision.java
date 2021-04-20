package fatorial;
import java.util.LinkedList;
import java.util.List;
 
// Algoritmo de fatoração 'divisão por tentativa' (Trial Division)
public class TrialDivision {
     
    // Retorna uma lista de fatores primos de n
    // Se quiser, substitua 'int' por 'long'
    public static List<Integer> trialDivision(int n){
        // O fatores são armazenados numa lista ligada
        // Entretanto você pode usar a estrutura que quiser
        // Exemplos: Array, ArrayList, Stack (pilha)
        List<Integer> factors = new LinkedList<Integer>();
         
        // Verifica se 2 é fator
        while(n % 2 == 0){
            factors.add(2);
            n = n / 2;
        }
         
        // Agora verifica os possíveis fatores ímpares
        // Só ímpares são possíveis
        int d = 3; // Possíveis fatores
        int d2 = 9; // d2 = d * d
        while(d2 <= n){
            // Se d é fator, faz a divisão e armazena o fator
            if(n % d == 0){
                factors.add(d);
                n = n / d;
            }else{
                // Se d não é fator, verifica o próximo
                d = d + 2;
                d2 = d * d; // d2 = d*d
            }
        }
        // Essa condição é necessária quando n for primo
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
