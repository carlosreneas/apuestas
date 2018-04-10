
/**
 * Write a description of class Apuesta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apuesta
{
    // instance variables - replace the example below with your own
    private Cliente cliente;
    private Double valor;
    private Double cociente;
    private Boolean ganador = false;

    /**
     * Constructor for objects of class Apuesta
     */
    public Apuesta()
    {
        
    }
    
    public Apuesta(Double valor, Double cociente, Cliente cliente) {
        this.valor = valor;
        this.cociente = cociente;
        this.cliente = cliente;
    }
    
    public void setValor(Double valor){
        this.valor = valor;
    }
    
    public void setCociente(Double cociente) {
        this.cociente = cociente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void setGanador(Boolean ganador) {
        this.ganador = ganador;
    }
    
    public Double getValor() {
        return this.valor;
    }

    public Double getCociente() {
        return this.cociente;
    }
    
    public Boolean getGanador(){
        return this.ganador;
    }
    
    public Cliente getCliente() {
        return this.cliente;
    }

    public void registrarGanador(){
        this.ganador = true;
        this.cliente.ganancia(this.valor * this.cociente);
    }

}
