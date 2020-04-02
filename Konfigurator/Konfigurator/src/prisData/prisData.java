package prisData;
class ModellPris {
    public String merke;
    public String modell;
    public int pris;
    public ModellPris(String merke, String modell, int pris){
        this.merke = merke;
        this.modell = modell;
        this.pris = pris;
    }
}

public class prisData {
    public ModellPris[] liste = new ModellPris[14];
    public prisData() {
        //ALLE TILGJENGELIG AUDI MODELLER
        liste[0] = new ModellPris("Audi", "A3", 291023);
        liste[1]= new ModellPris("Audi", "A5", 349374  );
        liste[2]= new ModellPris("Audi", "A6", 679000);
        liste[3]= new ModellPris("Audi", "Q5", 452000 );
        liste[4]= new ModellPris("Audi", "Q7", 667215);
        liste[5]= new ModellPris("Audi", "Q8", 769407 );
        liste[6]= new ModellPris("Audi", "RS3",  950000);

        //ALLE TILGJENGLELIG VOLVO MODELLER
        liste[7]= new ModellPris("Volvo", "XC40", 650000 );
        liste[8]= new ModellPris("Volvo", "XC60", 769000 );
        liste[9]= new ModellPris("Volvo", "XC90", 799000);
        liste[10]= new ModellPris("Volvo", "S60", 659000);

        //ALLE TILGJENGLIG NISSAN MODELLER
        liste[11] = new ModellPris("Nissan", "Leaf" , 279000 );
        liste[12] = new ModellPris("Nissan", "Qashqai" , 349000 );

        liste[13] = new ModellPris("Nissan", "GTR" , 1299000 );
    }

    public int beregn(String merke, String modell) {
        int pris = 0 ;
        for (ModellPris enModell : liste) {
            if (enModell.merke == merke && enModell.modell == modell) {
                pris = enModell.pris;
            }
        }
        return pris;
    }
}

