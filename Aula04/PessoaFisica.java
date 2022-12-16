public class PessoaFisica extends Cliente {
  private String cpf;
  private int idade;
  private char sexo;

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public char getSexo() {
    return sexo;
  }

  public void setSexo(char sexo) {
    this.sexo = sexo;
  }

  /* Construtor da classe*/
  public PessoaFisica(String nome,String endereco, String cpf,int idade,char sexo){
    super(nome,endereco);
    setCpf(cpf);
    setIdade(idade);
    setSexo(sexo);
  }

  void imprimirDados(){
    System.out.println("\n#-------CLIENTE PF-------#");
    System.out.println("->nome:" + super.getNome());
    System.out.println("->endereço:" + super.getEndereco());
    System.out.println("->Cpf:" + getCpf());
    System.out.println("->idade:" + getIdade());
    System.out.println("->sexo" +  + getSexo() + "\n");
  }
}