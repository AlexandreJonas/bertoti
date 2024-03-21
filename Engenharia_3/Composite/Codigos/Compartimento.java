
import java.util.ArrayList;
import java.util.List;

public class Compartimento implements Produto {

    private List<Produto> produtos;

    public Compartimento() {
        this.produtos = new ArrayList<>();
    }

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public double getPeso() {
        double t = 0;
        for (Produto produto : produtos) {
            t += produto.getPeso();
        }
        return t;
    }

}
