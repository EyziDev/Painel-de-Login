package login.painel.util;

public class Login {
    public String user;
    public String senha;

    public void createUser(String userName, String userSenha){
        this.user = userName;
        this.senha = userSenha;
    }

    public void loginUser(String userLogin, String senhaLogin){
        if(user.equals(userLogin) && senha.equals(senhaLogin)){
            System.out.printf("Login efetuado com sucesso, seja bem-vindo de volta, %s", user);
        } else {
            System.out.print("Senha incorreta, por favor, tente novamente.");
        }
    }
}
