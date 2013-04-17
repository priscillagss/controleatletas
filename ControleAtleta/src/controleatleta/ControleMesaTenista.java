package controleatleta;

import java.util.ArrayList;

public class ControleMesaTenista {

    private ArrayList<MesaTenista> listaMesaTenistas;

    public ControleMesaTenista () {
        this.listaMesaTenistas = new ArrayList<MesaTenista>();
    }
    
    public ArrayList<MesaTenista> getListaMesaTenistas () {
        return listaMesaTenistas ;
    }
    
    public void adicionar(MesaTenista  umMesaTenista) {
        listaMesaTenistas.add(umMesaTenista );
    }
    
    public void remover(MesaTenista  umMesaTenista) {
        listaMesaTenistas.remove(umMesaTenista );
    }
    
    public MesaTenista pesquisar(String nome) {
        for (MesaTenista  b: listaMesaTenistas) {
            if (b.getNome().equalsIgnoreCase(nome)) return b;
        }
        return null;
    }
}
