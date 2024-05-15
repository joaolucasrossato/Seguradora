package Seguradora;

public class Seguradora {
    private Seguro[] seguros;

    public Seguradora(Seguro[] seguros) {
        this.seguros = seguros;
    }

    public Seguro[] getSeguros() {
        return seguros;
    }

    public void setSeguros(Seguro[] seguros) {
        this.seguros = seguros;
    }

    public void inserirSeguro(Seguro seguro) {
    	for(int i =0; i<seguros.length;i++) {
    		if(seguros[i] == null) {
    			seguros[i] = seguro;
    			return;
    		}
    	}
    }

   public boolean removerSeguro(int numeroApolice) {
	   if (seguros != null) {
		   for(int i = 0; i < seguros.length; i++) {
			   if(seguros[i].getNumeroApolice() == numeroApolice) {
				   seguros[i] = null;
				   return true;
			   }
		   }
	   }
	   return false;

   }

    public boolean alteraSeguro(int numeroApolice, Seguro seguro) {
    	if(seguros!=null) {
    		for(int i=0; i < seguros.length; i++) {
    			if(seguros[i].getNumeroApolice() == numeroApolice) {
    				seguros[i] = seguro;
    				return true;
    			}
    		}
    	}
    	return false;
    }

    public void mostraTodosSeguros() {
        if (seguros != null){
            for (int i = 0; i < seguros.length; i++) {
                System.out.println(seguros[i].toString());
            }
        }
    }

    public Seguro buscarSeguro(int numeroApolice) {
    	if(seguros != null) {
    		for(int i = 0; i < seguros.length; i++) {
    			if(seguros[i].getNumeroApolice()==numeroApolice) {
    				return seguros[i];
    			}
    		}
    	}
    	return null;
    }
}
