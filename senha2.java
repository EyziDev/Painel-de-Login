import java.util.Scanner;

public class senha2 {
    public static int opcao;
    public static int senhaUsuario;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char repetir = 0;

        System.out.println("Seja Bem-vindo ao Painel de usuário");

        while((repetir != 'S') && (repetir != 's')){
            System.out.println("Digite 1 para criar uma senha:");
            System.out.println("Digite 2 para fazer login:");
            opcao = sc.nextInt();
            if(opcao == 1) {
                senha();
            } else {
                login();
            }
            System.out.println("Deseja encerrar o Programa? S/N");
            repetir = sc.next().charAt(0);
        }

        sc.close();
    }

    public static void senha(){
        Scanner sc = new Scanner(System.in);

        int confirmacao;

        while (opcao == 1){
            System.out.println("A senha não pode conter Letras");
            System.out.println("A senha deve conter 6 Dígitos e não deve começar com '0'");
            senhaUsuario = sc.nextInt();
            if (senhaUsuario <= 99999 || senhaUsuario >= 1000000){
                System.out.println("Senha não permitida. Tente novamente.");
                continue;
            } else {
                System.out.println("Senha Autprizada");
            }
            for (int i = 0; i <= 2; i++){
                System.out.println("Confirme a senha: ");
                confirmacao = sc.nextInt();
                if (confirmacao != senhaUsuario){
                    System.out.println("Senha incorreta. Tente novamente: ");
                    if (i == 2){
                        System.out.println("Você excedeu o limite de tentativas. Fechando o programa.");
                        System.exit(0);
                    }
                } else {
                    System.out.println("Senha Cadastrada com sucesso!");
                    return;
                }
            }
        }
        sc.close();
    }

    public static void login(){
        Scanner sc = new Scanner(System.in);

        int senhaLogin;
        while (opcao == 2){
            System.out.println("Faça login com sua senha: ");
            for (int i = 0; i <= 2; i++){
                senhaLogin = sc.nextInt();
                if (senhaLogin != senhaUsuario){
                    System.out.println("Login inválido. Tente novamente!");
                    if (i == 2){
                        System.out.println("Você excedeu o limite de tentativas. O programa será encerrado.");
                        System.exit(0);
                    }
                } else {
                    System.out.println("Login efetuado com sucesso!");
                    return;
                }
            }
        }

        sc.close();
    }
}
