
/**
 * Write a description of class Cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Date;

public class Cliente
{
    private String nombre;
    private String documento;
    private String email;
    private String celular;
    private Double saldo;
    private Date fechanacimiento;
    
    
    
    
    private Integer recargas;
    private Integer apuestas;
    private Double totalRecargas = new Double(0);
    private Double totalApuestas;
    private Integer ganancias;
    static Integer todosRecargas = 0;

    /**
     * Constructor for objects of class Cliente
     */
    public Cliente()
    {
        // initialise instance variables
        this.apuestas = 0;
        this.recargas = 0;
        this.saldo = new Double(0);
    }
    
    public Cliente(String nombre, String documento, String email, 
        String celular, Double saldo, Date fechanacimiento){
            this.nombre = nombre;
            this.documento = documento;
            this.email = email;
            this.celular = celular;
            this.saldo = saldo;
            this.fechanacimiento = fechanacimiento;
            this.apuestas = 0;
            this.recargas = 0;
    }
    
    
    public String getNombre() {
            return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDocumento() {
            return this.documento;
    }
    
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public String getEmail() {
            return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCelular() {
            return this.celular;
    }
    
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public Double getSaldo() {
            return this.saldo;
    }
    
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public Date getFechanacimiento() {
            return this.fechanacimiento;
    }
    
    public void setfechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }
    
    public void recargarSaldo(Double saldo) {
        
        this.saldo = this.saldo + saldo;
        this.totalRecargas = this.totalRecargas + saldo;
        this.recargas ++;
        this.todosRecargas ++;
    }
    
    /** En el metodo se valida que el endeudamiento no supere la 
     *  media de las recargas
     */
    public void apostar(Double saldo) {
        if(this.saldo - saldo >= this.saldo - mediaRecargas()) {
            this.saldo =- saldo;
            this.totalApuestas = this.totalApuestas + saldo;
            this.apuestas ++;
            
        }
    }
    
    public Double mediaRecargas() {
        if(recargas > 0 ){
            return totalRecargas / recargas;
        }
        return new Double(0);
        
    }
    
    public void ganancia(Double ganancia) {
        this.saldo = this.saldo + ganancia;
        this.ganancias ++;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
}
