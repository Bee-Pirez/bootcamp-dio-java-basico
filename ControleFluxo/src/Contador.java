import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int firstParam = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int secondParam = terminal.nextInt();

        try {
            contar(firstParam,secondParam);
        }catch (ParametersInvalidException e) {
            e.printStackTrace();
        }

        terminal.close();
    }

    public static void contar(int firstParam,int  secondParam) throws ParametersInvalidException {
        if(firstParam > secondParam) {
            throw  new ParametersInvalidException("O segundo parâmetro deve ser maior que o primeiro");
        }else {
            int contagem = secondParam - firstParam;

            for(int i = 0; i < contagem; i+=1){
                System.out.println("Imprimindo o número "+(i+1));
            }
        }
    }
}