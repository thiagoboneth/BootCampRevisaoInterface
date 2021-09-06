public class Cliente implements UsuarioAutenticavel{

    private DadosAutenticacao dadosAutenticacao;


    public Cliente(String login, String senha){
        dadosAutenticacao = new DadosAutenticacao(login, senha);
    }

    @Override
    public boolean autentica(String login, String senha) {
        return login.equals(dadosAutenticacao.getLogin()) && senha.equals(dadosAutenticacao.getSenha());
    }
}
