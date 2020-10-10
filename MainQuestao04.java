public class Main {

  double valorDaCompra;
  double valorFinal;
  double novoValorFinal;

  public static void main (String[] args){}


  boolean serFiel(double qntdComprasDoClienteNaLoja){
    if(qntdComprasDoClienteNaLoja > 10) {
      return true;
    }
    else {
      return false;
    }
  }

  double precoDaCompra(double qntdItensComprados){
    valorFinal = valorDaCompra * 0.05;
    if(qntdItensComprados > 3){
      novoValorFinal = valorFinal * 0.05;
      return novoValorFinal;
    }
    else if( qntdItensComprados > 5){
      novoValorFinal = valorDaCompra * 0.10;
      return novoValorFinal;
    }
    return null;
  }
}