public class Cliente{

  String cliente;
  double qntdItensComprados;
  double tipoDePagamento;
  double qntdComprasDoClienteNaLoja;

  public Cliente(String cliente, double qntdItensComprados, double tipoDePagamento, double qntdComprasDoClienteNaLoja){
    super();
    this.cliente = cliente;
    this.qntdItensComprados = qntdItensComprados;
    this.tipoDePagamento = tipoDePagamento;
    this.qntdComprasDoClienteNaLoja = qntdComprasDoClienteNaLoja;
  }

  public String getCliente(){
    return cliente;
  }
  public void setCliente(String cliente){
    this.cliente = cliente;
  }

  public double getQntdItensComprados(){
    return qntdItensComprados;
  }
  public void setQntdItensComprados(double qntdItensComprados){
    this.qntdItensComprados = qntdItensComprados;
  }

  public double getTipoDePagamento(){
    return tipoDePagamento;
  }
  public void setTipoDePagamento(double tipoDePagamento){
    this.tipoDePagamento = tipoDePagamento;
  }

  public double getQntdComprasDoClienteNaLoja(){
    return qntdComprasDoClienteNaLoja;
  }
  public void setQntdComprasDoClienteNaLoja(double qntdComprasDoClienteNaLoja){
    this.qntdComprasDoClienteNaLoja = qntdComprasDoClienteNaLoja;
  }

}