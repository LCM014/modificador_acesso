public class Contas
{   
    private int numero;
    private double saldo;

    public void setNumero(int numero)
    {
        this.numero = numero;
    }

    public void setSaldo(Double saldo)
    {
        this.saldo = saldo;
    }

    public double getSaldo()
    {
        return this.saldo;
    }

    public int getNumero()
    {
        return this.numero;
    }
}