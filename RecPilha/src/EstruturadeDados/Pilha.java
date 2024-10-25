
package EstruturadeDados;

import JavaBeans.Fundo;
import java.util.ArrayList;

public class Pilha {
    ArrayList dados;
    
    public Pilha(){
        dados = new ArrayList<>();
    }
    public void push(Fundo fundo){
        dados.add(fundo);
    }
    public Fundo pop(){
        int topo=dados.size()-1;
        Fundo temp=(Fundo) dados.get(topo);
        dados.remove(topo);
        return temp;
    }
    public boolean isEmpty(){
        if(dados.isEmpty())
            return true;
        else
            return false;
    }
    public int size(){
        return dados.size();
    }   
}
