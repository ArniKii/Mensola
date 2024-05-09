public class Libro {
    private String titolo, autore;
    private int nPag;
    private static double cPag = 0.05;
    private final double C_FISSO = 5.5;
    public Libro(String titolo, String autore, int nPag) {
        this.titolo= titolo;
        this.autore = autore;
        this.setnPag(nPag);
    }
    public Libro(Libro l){
        titolo = l.titolo;
        autore = l.autore;
        nPag = l.nPag;
    }
    public Libro(){

    }
    public String getAutore() {
        return autore;
    }
    public void setAutore(String autore) {
        this.autore = autore;
    }
    public String getTitolo() {
        return titolo;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    public int getnPag() {
        return nPag;
    }
    public void setnPag(int nPag) {
        if (nPag<0) {
            System.out.println("nope");
        }else{
        this.nPag = nPag;
        }
    }
    public double Prezzo(){
        double p = C_FISSO + nPag*cPag;
        return p;
    }
    public static void setcPag(double cPag) {
        Libro.cPag = cPag;
    }
    public boolean equals(Libro l){
        boolean risultato = true;
        if (this != l){
            if(!autore.equals(l.autore) || nPag != l.nPag || !titolo.equals(l.titolo)){
                risultato = false;
            }
        }
        return risultato;
    }
    public String toString(){
        return "autore: "+autore+" titolo: "+titolo+" numero pagine: "+nPag;
    }

}
