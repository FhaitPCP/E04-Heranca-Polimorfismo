public class PessoaJuridica extends Cliente {
  private String cnpj;
  private int num_funcionarios;
  private String setor;

/*getters e setters da classe*/  
  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public int getNum_funcionarios() {
    return num_funcionarios;
  }

  public void setNum_funcionarios(int num_funcionarios) {
    this.num_funcionarios = num_funcionarios;
  }

  public String getSetor() {
    return setor;
  }

  public void setSetor(String setor) {
    this.setor = setor;
  }
 /* Construtor da classe*/
  public PessoaJuridica(String nome,String endereco, String cnpj,int num_funcionarios, String setor){
    super(nome,endereco);
    setCnpj(cnpj);
    setNum_funcionarios(num_funcionarios);
    setSetor(setor);
  }

  void imprimirDados(){
    System.out.println("\n#-------CLIENTE PJ-------#");
    System.out.println("->nome:" + super.getNome());
    System.out.println("->endereço:" + super.getEndereco());
    System.out.println("->Cnpj:" + getCnpj());
    System.out.println("->numero de funcionarios:" + getNum_funcionarios());
    System.out.println("->setor:" +  getSetor() + "\n");
  }
  
}