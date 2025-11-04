package Smartv;

public class Usuario {
    public static void main(String[] args) {
        SmartTv tv = new SmartTv();

        tv.ligarTomada();
        System.out.println(tv.ligarTomada());

        System.out.println(tv.isTomadaLigada());
    }
}
