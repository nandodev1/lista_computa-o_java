package q19;

class Lampada{
	  
	  private boolean acesa;

	  Lampada(){

	  }

	  public void setEstado(){
	    this.acesa = !this.acesa;
	  } 

	  public boolean getEstado(){
	    return this.acesa;
	  }

	  public void estadoLanpada(){
	    String estado;
	    if(this.getEstado()) estado = "acesa";
	    else estado = "apagada";
	    System.out.println("A lânpada está " + estado);
	  }

	}
