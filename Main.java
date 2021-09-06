public class Main {

    public static void main(String[] args) {

        Funcionario luis = new Funcionario("LUIS","MASCULINO",2000);
        Funcionario camila = new Funcionario("CAMILA", "FEMININO", 2500);

        Gerente santos = new Gerente("SANTOS", "MASCULINO",5000);

        Vendedor luiza = new Vendedor("LUIZA","FEMININO",3000,60000);

        Desenvolvedor thiago = new Desenvolvedor("THIAGO","MASCULINO",6000,"thiago.luis@mercadolivre.com","123456");
        Cliente flavia = new Cliente("flavia.bernardes@gmail.com","654321");

        boolean autenticacaoDev = thiago.autentica("thiago.luis@mercadolibre.com","123456");
        boolean autenticaVendedor = flavia.autentica("flavia.bernardes@gmail.com","654321");

        System.out.println("Autenticação de desenvolvedor: "+autenticacaoDev);
        System.out.println("Autenticação de cliente: "+autenticaVendedor);

        Funcionario[] listaFuncionario = new Funcionario[5];
        listaFuncionario[0] = luis;
        listaFuncionario[1] = camila;
        listaFuncionario[2] = santos;
        listaFuncionario[3] = luiza;
        listaFuncionario[4] = thiago;

        CalculadoraFolha folhaDePagamento = new CalculadoraFolha();
        double total = folhaDePagamento.calcula(listaFuncionario);

        System.out.println("Folha de pagamento no valor de: " + total);
    }
}
