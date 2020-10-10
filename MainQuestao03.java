public class Main {

  public static void main (String[] args){
    NomeDaDisciplina direito = new NomeDaDisciplina("Direito", 60, 100);
    
    NomeDaDisciplina administracao = new NomeDaDisciplina("Administração", 40, 120);
    
    NomeDaDisciplina engSoftware = new NomeDaDisciplina("Engenharia de Software", 25, 110);

    TurmaDireito disciplinaDireito = new TurmaDireito(15, 4);
    TurmaAdministracao disciplinaAdministracao = new TurmaAdministracao(28, 3);
    TurmaEngSoaftware disciplinaEngSoftware = new TurmaEngSoaftware(20, 2);
  
  }


}