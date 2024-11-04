
public class WmaAdapter implements FormatoAudio {
    private WmaPlay wmaPlay;

    public WmaAdapter(WmaPlay wmaPlay) {
        this.wmaPlay = wmaPlay;
    }

    public void abrir(String arquivo) {
    	System.out.println("WmaAdapter >> abrir()");
        wmaPlay.setFile(arquivo);
        wmaPlay.open();
    }

    public void reproduzir() {
    	System.out.println("WmaAdapter >> reproduzir()");
        wmaPlay.play();
    }

    public void parar() {
    	System.out.println("WmaAdapter >> parar()");
        wmaPlay.stop();
    }
}
