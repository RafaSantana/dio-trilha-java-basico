public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int canalEscolhido) {
        if((canalEscolhido <= 0) || (canalEscolhido > 50)) {
            canal = 1;           
            System.out.println("Canal Inválido, tente outro...");
        }else {
            canal = canalEscolhido;
        }
    }

    public void aumentarCanal() {
        if(canal >= 50) {
            canal = 1;
            System.out.println("Canal está no máximo");
        }else {
            canal++;
            System.out.println("Aumentando canal para: " + canal);
        }
    }

        public void diminuirCanal() {
            if(canal <= 1) {
                canal = 50;
                System.out.println("Canal está no mínimo");
            }else {
                canal--;
                System.out.println("Diminuindo canal para: " + canal);
            }
    }

    public void aumentarVolume() {
        if(volume >= 100) {
            volume = 100;
            System.out.println("Volume está no máximo");
        }else {
            volume++;
            System.out.println("Aumentando volume para: " + volume);
        }
    }

    public void diminuirVolume() {
        if(volume <= 0) {
            volume = 0;
            System.out.println("Volume está no mínimo");
        }else {
            volume--;
            System.out.println("Diminuindo volume para: " + volume);
        }
    }

    public void ligar() {
        ligada = true;
    }
    public void desligar() {
        ligada = false;
    }
}