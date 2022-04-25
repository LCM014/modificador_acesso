public class Filme 
{
    private int cod;
    private String nome;
    private double val;
    private boolean disp;

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public double getVal() {
        return val;
    }

    public void setVal(double val) 
    {
        this.val = val;
    }

    public void setDisp(boolean disp)
    {
        this.disp = disp ;
    }

    public boolean isDisp()
    {
        return disp;
    }

    public void setCod(int cod)
    {
        this.cod = cod;
    }

    public int getCod()
    {
        return this.cod;
    }

    
}
