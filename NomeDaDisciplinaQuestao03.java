public class NomeDasDisciplinas {
  
    
  String nome;
  double numAlunos;
  double numeroDeAulasTotal;

  public nomeDasDisciplinas(String nome, double numAlunos, double numeroDeAulasTotal){
    super();
    this.nome = nome;
    this.numAlunos = numAlunos;
    this.numeroDeAulasTotal = numeroDeAulasTotal;
  }


  public String getNome() {
    return nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }

  public double getNumAlunos(){
    return numAlunos;
  }
  public void setNumAlunos(double numAlunos){
    this.numAlunos = numAlunos;
  }

  public double getNumeroDeAulasTotal(){
    return numeroDeAulasTotal;
  }
  public void setNumeroDeAulasTotal(double numeroDeAulasTotal){
    this.numeroDeAulasTotal = numeroDeAulasTotal;
  }
}