public class TestaFilme 
{
    public static void main(String[] args) 
    {
        Filme f=new Filme();
        f.setCod(1);
        f.setNome("Ta dando Onda");
        f.setVal(2);
        
        System.out.println("O código do filme é: "+f.getCod());

        f.setCod(2);
        f.setNome("A era do gelo");
        f.setVal(3);
        
        System.out.println("O código do filme é: "+f.getCod());

    }    
}
