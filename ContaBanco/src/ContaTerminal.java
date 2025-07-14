import java.util.Scanner;

public class ContaTerminal extends ContaOperacoes {
    public static void main(String[] args) throws Exception {
        
        //TODO:Conhecer e importar a classe Scanner
        //Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados no terminal
        // Exibir a mensagem conta criada
        
        //Declaração  das váriaveis
        int numero;
        String agencia, nomeCliente;
        double saldo= 865.65;
        var scanner = new Scanner(System.in);

        /*     =======  MENU DE REGISTRO   ====== */

        //Obter as informações do usuário para cadastro da conta
        System.out.println("Informe os dados para realizar o cadastro:");
        System.out.println("Digite o seu nome:\n");
        nomeCliente = scanner.nextLine();
        System.out.println("digite o numero da agência:");
        agencia =scanner.nextLine();
        System.out.println("Por fim informe o numero da conta:");
        numero = scanner.nextInt();
        //Apresenta ao usuário os dados cadastrados,e o status disponível da conta.
        System.out.println("========================");
        System.out.println();
        System.out.printf("Olá [%s], obrigado por criar uma conta em nosso banco!",nomeCliente);
        System.out.printf("Sua agência é:[%s], e seu saldo [%s], \n",agencia,saldo);
        System.out.printf("Já está disponivel para saque!");
        System.out.println();
        System.out.println("=========================");
        /*           ====  MENU OPERACIONAL   === */

           //Fornece as operações disponíveis para o Usuário 

       
        System.out.println("==========================");
        System.out.println("Informe a Operação que deseja realizar");
        System.out.println("Digite (1) => Sacar");
        System.out.println("Digite (2) => Depositar");
        System.out.println("Digite (3) => Consultar Saldo");
        System.out.println("==========================");
       

        Op = scanner.nextInt();

        if(Op==1){
            System.out.println("Informe o valor do saque:");
            valor = scanner.nextInt(); 
            saldo -=valor;
            System.out.printf("Saque realizado com sucesso!Saldo atual:%.2f",saldo);    
        }else if(Op == 2){
        System.out.println("Informe o valor do deposito:");
            valor = scanner.nextInt(); 
            saldo +=valor;   
            System.out.printf("Deposito realizado com sucesso!Saldo atual: %.2f",saldo);     
        }else if(Op==3){
            System.out.printf("O saldo atual  %.2f",saldo);   
        }else{
            System.out.println("Opção não está disponível...");
        }

    }

     

        


}
