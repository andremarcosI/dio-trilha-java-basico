import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //TODO:Conhecer e importar a classe Scanner
        //Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados no terminal
        // Exibir a mensagem conta criada
        
        //Declaração  das váriaveis
        int numero;
        String agencia, nomeCliente;
        double saldo= 100.000;
        var scanner = new Scanner(System.in);

        //Obter as informações do usuário para cadastro da conta
        System.out.println("Informe os dados para realizar o cadastro:");
        System.out.println("Digite o seu nome:\n");
        nomeCliente = scanner.nextLine();
        System.out.println("digite o numero da agência:");
        agencia =scanner.nextLine();
        System.out.println("Por fim informe o numero da conta:");
        numero = scanner.nextInt();
        //Apresenta ao usuário os dados cadastrados,e o status disponível da conta.
        System.out.println("======================");
        System.out.println();
        System.out.printf("Olá [%s], obrigado por criar uma conta em nosso banco!",nomeCliente);
        System.out.printf("Sua agência é:%s, e seu saldo %s, já está disponivel para saque ",agencia,saldo);

        


    }

     

        


}
