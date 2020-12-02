package controleremoto_trabalho;


public class ControleRemoto implements Controlador {

    private boolean ligar;
    private boolean desligar;
    private boolean configurar;
    private boolean acao;
    private boolean novela;
    private boolean esportes;
    private boolean aventura;
    private boolean romantico;
    private boolean comedia;
    private boolean play;
    private boolean stop;
    private boolean change;
    private int volume_up;
    private int volume_down;
    private boolean in_door;
    private boolean out_door;
    private boolean samba;
    private boolean metal;
    private boolean rock;
    private boolean classico;
    
    //
    private int volume;
    private boolean ligado;
    private boolean tocando;
    

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = true;
        this.tocando = true;
    }

    public boolean getLigar() {
        return ligar;
    }

    public void setLigar(boolean ligar) {
        this.ligar = ligar;
    }

    public boolean getDesligar() {
        return desligar;
    }

    public void setDesligar(boolean desligar) {
        this.desligar = desligar;
    }

    public boolean getConfigurar() {
        return configurar;
    }

    public void setConfigurar(boolean configurar) {
        this.configurar = configurar;
    }

    public boolean getAcao() {
        return acao;
    }

    public void setAcao(boolean acao) {
        this.acao = acao;
    }

    public boolean getNovela() {
        return novela;
    }

    public void setNovela(boolean novela) {
        this.novela = novela;
    }

    public boolean getEsportes() {
        return esportes;
    }

    public void setEsportes(boolean esportes) {
        this.esportes = esportes;
    }

    public boolean getAventura() {
        return aventura;
    }

    public void setAventura(boolean aventura) {
        this.aventura = aventura;
    }

    public boolean getRomantico() {
        return romantico;
    }

    public void setRomantico(boolean romantico) {
        this.romantico = romantico;
    }

    public boolean getComedia() {
        return comedia;
    }

    public void setComedia(boolean comedia) {
        this.comedia = comedia;
    }

    public boolean getPlay() {
        return play;
    }

    public void setPlay(boolean play) {
        this.play = play;
    }

    public boolean getStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    public boolean getChange() {
        return change;
    }

    public void setChange(boolean change) {
        this.change = change;
    }

    public int getVolume_up() {
        return volume_up;
    }

    public void setVolume_up(int volume_up) {
        this.volume_up = volume_up;
    }

    public int getVolume_down() {
        return volume_down;
    }

    public void setVolume_down(int volume_down) {
        this.volume_down = volume_down;
    }

    public boolean getIn_door() {
        return in_door;
    }

    public void setIn_door(boolean in_door) {
        this.in_door = in_door;
    }

    public boolean getOut_door() {
        return out_door;
    }

    public void setOut_door(boolean out_door) {
        this.out_door = out_door;
    }

    public boolean getSamba() {
        return samba;
    }

    public void setSamba(boolean samba) {
        this.samba = samba;
    }

    public boolean getMetal() {
        return metal;
    }

    public void setMetal(boolean metal) {
        this.metal = metal;
    }

    public boolean getRock() {
        return rock;
    }

    public void setRock(boolean rock) {
        this.rock = rock;
    }

    public boolean getClassico() {
        return classico;
    }

    public void setClassico(boolean classico) {
        this.classico = classico;
    }
    
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void configurar() {
    }

    @Override
    public void acao() {
    }

    @Override
    public void novela() {
    }

    @Override
    public void esportes() {
    }

    @Override
    public void aventura() {
    }

    @Override
    public void romantico() {
    }

    @Override
    public void comedia() {
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void stop() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
    }

    @Override
    public void change() {
    }

    @Override
    public void volume_up() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void volume_down() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() - 5);
        }
    }

    @Override
    public void in_door() {
    }

    @Override
    public void out_door() {
    }

    @Override
    public void samba() {
    }

    @Override
    public void metal() {
    }

    @Override
    public void rock() {
    }

    @Override
    public void classico() {
    }
    
     @Override
    public void display() {
        System.out.println("Está ligado?" + this.getLigado());
        System.out.println("Está tocando?" + this.getTocando());
        System.out.println("Volume: " + this.getVolume());
        for(int i=0; i<=this.getVolume(); i+=10){
            System.out.println("-");
        }
        
    }

    
}
