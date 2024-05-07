import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // 1
        ArrayList<String> listaString = new ArrayList<>();
        listaString.add("Vítor");
        listaString.add("Felix");
        listaString.add("Scooby");

        listaString.forEach(System.out::println);

        // 2 e 3
        Animal animal = new Cachorro();

        if (animal instanceof Cachorro cachorro) {
            cachorro = (Cachorro) animal;
        } else {
            System.out.println("O objeto não é um Cachorro.");
        }

        // 4
        Produto produto = new Produto();
        produto.setNome("Carro");
        produto.setPreco(35000.00);

        Produto camisa = new Produto();
        camisa.setNome("Camisa");
        camisa.setPreco(120);

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(camisa);
        produtos.add(produto);

        double sumProduto = 0;
        for (Produto p : produtos) {
            sumProduto += p.getPreco();
        }

        System.out.println("a média de preço dos produtos é:    R$" + (sumProduto / produtos.size()));

        // 5
        Circulo circulo = new Circulo(5);
        Quadrado quadrado = new Quadrado(4);

        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(circulo);
        formas.add(quadrado);

        for(Forma forma: formas){
            System.out.printf("A area dessa figura mede: %.2fm²\n", forma.calcularArea());
        }

        // 6
        ContaBancaria conta1 = new ContaBancaria(123456789, new Random().nextDouble(10000));
        ContaBancaria conta2 = new ContaBancaria(456789123, new Random().nextDouble(10000));
        ContaBancaria conta3 = new ContaBancaria(456789124, new Random().nextDouble(10000));
        ContaBancaria conta4 = new ContaBancaria(456789125, new Random().nextDouble(10000));
        ContaBancaria conta5 = new ContaBancaria(456789126, new Random().nextDouble(10000));
        ContaBancaria conta6 = new ContaBancaria(456789127, new Random().nextDouble(10000));

        ArrayList<ContaBancaria> contas = new ArrayList<>();
        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);
        contas.add(conta4);
        contas.add(conta5);
        contas.add(conta6);

        ContaBancaria contaMaiorSaldo = new ContaBancaria(123, 0);
        for(ContaBancaria conta: contas){
            if(conta.getSaldo() > contaMaiorSaldo.getSaldo()){
                contaMaiorSaldo = conta;
            }
        }

        System.out.println(contaMaiorSaldo);
    }
}