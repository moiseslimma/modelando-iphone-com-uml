import com.iphoneproject.model.Iphone;

public class Main {
    public static void main(String[] args) {

        Iphone fone = new Iphone("13 pro", "iOS");

        fone.exibirPagina("www.pag1.com.br");
        fone.exibirPagina("www.pag2.com.br");
        fone.exibirPagina("www.pag3.com.br");
        fone.voltarPagina();
        fone.voltarPagina();
        fone.ligar("99479575");
        fone.tocar();
        fone.avancarPagina();


    }
}