package sk.kosickaakademia.nebus.rodnecislo;

public class Task {

    public int scitaj(int a, int b){
        return a+b;
    }

    public boolean jePravouhly(int a, int b, int c){
        if(a*a == (b*b + c*c)){
            return  true;
        }
        if(b*b == (a*a + c*c)){
            return  true;
        }
        if(c*c == (b*b + a*a)){
            return  true;
        }
        return false;
    }

    public String reverz(String text){
        String retazec = "";
        for(int i = text.length()-1; i >= 0; i--){
            retazec = retazec + text.charAt(i);
        }
        return retazec;
    }


    //vymysliet 3 metody a testy k nim

    public int scitajCislaOd1Po10(){
        int sucet = 0;
        for(int i = 1; i <= 10; i++){
            sucet = sucet + i;
        }
        return sucet;
    }


    public int faktorial(int cislo){
        if(cislo==0){
            return 1;
        }

        int vysledok = 1;

        if(cislo>0){
            for(int i = 1; i <= cislo; i++){
                vysledok = vysledok * i;
            }
            return vysledok;
        }else{
            cislo = cislo * (-1);
            for(int i = 1; i <= cislo; i++){
                vysledok = vysledok * i;
            }
            return vysledok * (-1);
        }

    }

    public String zmenRetazecNaMalePismena(String retazec){
        String novyRetazec = "";
        for(int i = 0; i < retazec.length(); i++){
            char znak = (char)(retazec.charAt(i)+' ');
            novyRetazec += znak;
        }
        return novyRetazec;
    }

}
