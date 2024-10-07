import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.util.ArrayList;
import java.util.Map;

public class FigurApp {
    public static void main(String[] args) {
        ArrayList<Figur> list = new ArrayList<>();
        list.add(new Rektnagel(5, 8));
        list.add(new Punkt());
        list.add(new Cirkel(3));
        list.add(new Cirkel(7));
        list.add(new linje(5));

        for (Figur f : list) {
            System.out.println(f);
            System.out.println("\t areal="+f.beregnAreal());
            System.out.println("\t omkreds="+f.beregnOmkreds());
        }
    }
}

abstract class Figur {
    abstract double beregnAreal();
    abstract double beregnOmkreds();
}


class Punkt extends Figur {
    double beregnAreal(){
        return 0;
    }
    double beregnOmkreds(){
        return 0;
    }
}


class linje extends Figur {
    double l;       // l = længde af linjenStykket

    linje(double l){
        this.l=l;
    }


    double beregnAreal(){
        return 0;
    }
    double beregnOmkreds(){
        return 2 * l;
    }

    public String toString(){
        return "Rektangel ("+l+")";
    }
}


class Cirkel extends Figur {
    double r;    // r = radius

    Cirkel(double r){
        this.r=r;
    }
    double beregnAreal(){
        return Math.PI * r * r;
    }
    double beregnOmkreds(){
        return 2 * Math.PI * r;
    }

    public String toString(){
        return "Cirkel r="+r;
    }
}


class Rektnagel extends Figur {
    double h;       // h = Højde
    double b;       // b = Bredde

    Rektnagel(double h, double b){
        this.h = h;
        this.b = b;
    }

    double beregnAreal(){
        return h * b;
    }
    double beregnOmkreds(){
        return 2 * (h + b);
    }

    public String toString(){
        return "Rektangel ("+h+","+b+")";
    }
}