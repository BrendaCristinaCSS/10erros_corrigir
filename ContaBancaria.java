//O Exercicio começa a partir da linha 18
//Criar um arquivo com o nome ProgramaPrincipal.java


//Existem 10 erros
class ContaBancaria {
    // Atributos
    private int numeroConta;
    private String nomeTitular;
    private double saldoAtual;
    
    public void imprimirInformacoes() {
        System.out.println("Número da Conta: "+numeroConta);
        System.out.println("Nome Titular: "+nomeTitular);
        System.out.println("Saldo Atual: "+saldoAtual);
        }
   
        // Método Construtor
    
        public int getnumeroConta() {
            return numeroConta;
        }
        
        public String getnomeTitular() {
            return nomeTitular;
        }
        
         public ContaBancaria(int numeroConta, String nomeTitular) {
            this.numeroConta = numeroConta;
            this.nomeTitular = nomeTitular;
        }
       
        // Métodos
        private void depositar(double valorDeposito) {
            saldoAtual = saldoAtual + valorDeposito;
        }
       
        private void sacar(double valorSaque) {
            if (valorSaque > saldoAtual) {
                System.out.println("Saldo insuficiente");
            } else {
                saldoAtual = saldoAtual - valorSaque;
            }
        }	
        private double obterSaldo() {
            return saldoAtual;
        }
   
   
   
   //Esse código esta correto
   public static void main(String[] args) {
     ContaBancaria conta1 = new ContaBancaria(1234, "João da Silva");
     ContaBancaria conta2 = new ContaBancaria(5678, "Maria Souza");
   
     conta1.depositar(1000);
     conta2.depositar(500);
   
     conta1.sacar(300);
     conta2.sacar(700);
   
     System.out.println("Saldo da conta 1: " + conta1.obterSaldo());
     System.out.println("Saldo da conta 2: " + conta2.obterSaldo());
   }
   }