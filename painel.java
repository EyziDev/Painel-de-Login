package login.painel;
import login.painel.util.Login;
import java.util.Scanner;

public class painel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int opcao;
        String painel;

        Login login;
        login = new Login();
        System.out.print("Bem-Vindo ao Painel de login 1.2!\n");

        do {
            System.out.print("Digite: \n1 para Criar Usuario \n2 para login com Usuario \n");
            opcao = sc.nextInt();

                if(opcao == 1){
                    System.out.print("Digite o nome de usuario: ");
                    sc.nextLine();
                    String usuario = sc.nextLine();

                    System.out.print("Digite a senha do usuario: ");
                    String senhaUser = sc.nextLine();
                    for(int i = 0; i<=2; i++){
                        System.out.print("\n confirme a senha de usuario: ");
                        String senhaUserConfirmation = sc.nextLine();
                        if(senhaUser.equals(senhaUserConfirmation)){
                            System.out.print("\nUsuario criado!\n");
                            break;
                        } else if (i == 2) {
                            System.exit(0);
                        } else {
                            System.out.print("Senha incorreta, tente novamente!");
                        };
                    };

                    login.createUser(usuario, senhaUser);
                } else if (opcao == 2) {
                    System.out.print("Digite o nome de usuario: ");
                    sc.nextLine();
                    String loginUserPainel = sc.nextLine();
                    System.out.print("\n Digite a senha de usuario: ");
                    String loginSenhaPainel = sc.nextLine();

                    login.loginUser(loginUserPainel, loginSenhaPainel);
                }
            System.out.print("\nDeseja Voltar a tela inicial? (S/N)");
            painel = sc.nextLine();
        } while (painel.equals("s") || painel.equals("S"));

        sc.close();
    }
}
