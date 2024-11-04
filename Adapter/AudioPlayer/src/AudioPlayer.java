
public class AudioPlayer {
	
    public static void main(String[] args) {
        // criando um objeto WmaPlay
        WmaPlay wmaPlay = new WmaPlay();
        
        // criando o adaptador para que WmaPlay possa ser usado como FormatoAudio
        FormatoAudio adapter = new WmaAdapter(wmaPlay);

        // utilizando o adaptador para abrir, reproduzir e parar o arquivo wma
        adapter.abrir("arquivo.wma");
        adapter.reproduzir();
        adapter.parar();
    }
}
