package Exercice_3;


public enum Especializacion {
    NETWORKING(35), PROGRRAMMING(50), SYSADMIN(40);

    private int duration;

    private Especializacion(int duration){
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}

