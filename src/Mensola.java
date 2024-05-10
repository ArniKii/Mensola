public class Mensola {//classe aggregante
    private Libro[] volumi;
    private int nVol = 0;
    private int max = 15;

    public Mensola() {
        volumi = new Libro[max];
    }

    public Mensola(Mensola cp) {
        volumi = new Libro[cp.volumi.length];
        for (int i = 0; i < cp.volumi.length; i++) {
            if (cp.volumi[i] != null) {
                this.volumi[i] = new Libro(cp.volumi[i]);
                nVol++;
            }

        }
    }

    public int getMax() {
        return max;
    }

    public int getnVol() {
        return nVol;
    }

    public Libro getVolume(int ind) {
        return volumi[ind];
    }

    public int setVolume(int ind, Libro vol) {
        int d = -1;
        if (ind < max && ind >= 0) {
            if (volumi[ind] == null) {
                volumi[ind] = new Libro(vol);
                nVol++;
                d = ind;
            } else {
                d = -2;
            }
        }
        return d;
    }

    public int rVol(int ind) {
        int v = -1;
        if (ind >= 0 && ind < 15) {
            if (volumi[ind] != null) {
                v = ind;
                nVol--;
                volumi[ind] = null;
            } else {
                v = -2;
            }
        }
        return v;

    }

    public String toString() {
        String s = "";
        for (int i = 0; i < volumi.length; i++) {
            if (volumi[i] == null) {
                s += i + " posizione vuota\n";
            } else {
                s += i + " " + volumi[i].toString() + "\n";
            }
        }
        return s;
    }

    public int Cerca(String par) {
        int v = -1;
        int i = 0;
        while (v == -1 && i < volumi.length) {

            if (volumi[i] != null && volumi[i].getTitolo().toLowerCase().contains(par.toLowerCase())) {
                v = i;
            }

            i++;
        }
        return v;
    }
    public int Vocali(int lib){
        int c =-1;
        if(volumi[lib]!=null){
            for (int i = 0; i < volumi[i].getTitolo().length(); i++) {
                if(volumi[i].getTitolo().toLowerCase().charAt(i)=='a'||volumi[i].getTitolo().toLowerCase().charAt(i)=='e'||volumi[i].getTitolo().toLowerCase().charAt(i)=='i'||volumi[i].getTitolo().toLowerCase().charAt(i)=='o'||volumi[i].getTitolo().toLowerCase().charAt(i)=='u'){
                    if (c==-1) {
                        c++;
                    }
                    c++;
                }
            }
        }
        return c;
    }
    public int scambioPos(int pos1, int pos2){
        int c= -1;
        if (pos1>-1 && pos1<volumi.length && pos2>-1 && pos2<volumi.length) {
            if (volumi[pos1]==null || volumi[pos2]== null) {
                if (volumi[pos1]==null && volumi[pos2]!=null) {
                    volumi[pos1] = new Libro(volumi[pos2]);
                    volumi[pos2]=null;
                }else if (volumi[pos2]==null && volumi[pos1]!=null) {
                    volumi[pos2]= new Libro(volumi[pos1]);
                    volumi[pos1]=null;
                }
            }else{
                Libro t = new Libro(volumi[pos1]);
                volumi[pos1]= new Libro(volumi[pos2]);
                volumi[pos2]= new Libro(t);
            }
            c=pos1;
        }
        return c;
    }
    public int CercaInizio(String par) {
        int v = -1;
        int i = 0;
        while (v == -1 && i < volumi.length) {

            if (volumi[i] != null && volumi[i].getTitolo().toLowerCase().startsWith(par.toLowerCase())) {
                v = i;
            }

            i++;
        }
        return v;
    }
    

}
