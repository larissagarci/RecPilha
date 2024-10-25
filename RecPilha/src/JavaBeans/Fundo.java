package JavaBeans;

import java.awt.Color;

public class Fundo {
    private Color cor;
    
    public Fundo(Color cor){
        this.cor = cor;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }
      
}
