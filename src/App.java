public class App {
    public static void main(String[] args) throws Exception {
        Libro hP = new Libro("harry potter", "j.k Rowling", 3000);
        Libro hP2 = new Libro(hP);
        Libro hP3 = hP2;
        Libro cucina = new Libro("la cucina americana", "tuo nonno", -5);
        if (hP3.equals(hP2)) {
            System.out.println("hey");
        }else{
            System.out.println("no");
        }
        System.out.println(hP);
        System.out.println(cucina);
        System.out.println(hP.Prezzo());
        System.out.println(cucina.Prezzo());
        Libro.setcPag(142.07);
        System.out.println(hP3.Prezzo());
        System.out.println(cucina.Prezzo());
        Mensola m1 = new Mensola();
        m1.setVolume(0, cucina);
        m1.setVolume(1, hP);
        m1.setVolume(2, hP2);
        Mensola m2 = new Mensola(m1);
        System.out.println(m1);
        m2.rVol(1);
        System.out.println(m1);
        System.out.println(m2);
        int c = m1.Cerca("giorgio");
        if (c!=-1) {
            System.out.println(c);
        }
        m2.scambioPos(8, 2);
        System.out.println(m2);
        c = m2.CercaInizio("potter");
        System.out.println(c);
    }
}
