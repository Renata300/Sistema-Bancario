Seja a seguinte descrição de um sistema bancário: um banco possui um produto diferenciado chamada “conta mágica”. Nesta conta, quanto mais dinheiro o cliente tem depositado mais o banco valoriza seus depósitos. Todos as contas iniciam na categoria “Silver” e zeradas. Contas “Silver” não têm seus depósitos valorizados, ou seja, o valor creditado é exatamente o valor depositado pelo cliente. Quando o saldo da conta atinge ou ultrapassa R$ 50.000,00, a conta passa para a categoria “Gold”. Contas “Gold” têm seus depósitos valorizados em 1%. Neste caso se o cliente depositar R$ 1.000,00 o valor creditado será de R$ 1.010,00. Finalmente se o saldo da conta atinge ou supera os R$ 200.000,00, a conta passa para a categoria “Platinum”. Contas “Platinum” têm seus depósitos valorizados em 2,5%. A verificação de “upgrade” da conta se dá via operação de depósito, e não é possível que um cliente faça “upgrade” diretamente de “Silver” para “Platinum” em uma única operação.

Quando o saldo da conta diminui, em função de uma operação de retirada/saque, a categoria também pode retroceder. Os limites, porém, não são os mesmos que os verificados quando uma conta sofre “upgrade”. Uma conta só perde sua categoria “Platinum”, e passa para “Gold”, se o saldo cair abaixo de R$ 100.000,00. A conta só perde a categoria “Gold”, e passa para “Silver”, se o saldo cair para menos de R$ 25.000,00. Note que uma conta nunca perde duas categorias em uma única operação de retirada mesmo que o saldo caia abaixo de R$ 25.000,00. Se ele era “Platinum”, cai para “Gold”. Só poderá cair para “Silver” na próxima operação de retirada. Observação: as contas nunca podem ficar negativas.

O esqueleto da classe “ContaCorrente” está definido na sequência. Considere que o saldo inicial é zero e que o número da conta e o nome do correntista são informados por parâmetro no método construtor. Os métodos de depósito e retirada retornam “false” quando alguma coisa não permitir a operação (valor inválido, depósito insuficiente etc.).

Para a definição dos casos de teste, inicialmente use máquinas de estado. Depois complete os casos usando particionamento e valor limite. Em seguida use o JUnit para escrever o driver de teste. Crie sua própria implementação e utiliza seu driver de teste para verificar possíveis defeitos. 


enum Categoria {Silver, Gold, Platinum}

public class ContaCorrente{
  public String getNumeroConta(){}
  public String getNomeCorrentista(){}
  public double getSaldo(){}
  public Categoria getCategoria(){}
  public boolean deposito(double valor){}
  public boolean retirada(double valor){}
}
