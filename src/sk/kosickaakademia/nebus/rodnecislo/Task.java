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

    public double terminovanyVklad(int value, int years, double interest, boolean DPH){

        if(value < 1 || years < 1 || interest < 1){
            return 0;
        }

        double vysledok = 0;
        double urokZaRok = 0;
        double valuee = value;
        //bez DPH
        while (years > 0 && DPH == false){
            urokZaRok = valuee*(interest/100);
            //zaokruhlovanie
            urokZaRok = urokZaRok * 100;
            urokZaRok = Math.round(urokZaRok);
            urokZaRok = urokZaRok/100;

            vysledok = vysledok + urokZaRok;
            valuee = valuee + urokZaRok;
            years--;
        }

        //s DPH
        while (years > 0 && DPH){
            urokZaRok = valuee*(interest/100)*0.8;
            //zaokruhlovanie
            urokZaRok = urokZaRok * 100;
            urokZaRok = Math.round(urokZaRok);
            urokZaRok = urokZaRok/100;

            vysledok = vysledok + urokZaRok;
            valuee = valuee + urokZaRok;
            years--;
        }

        return vysledok + value;
    }


    public double priceForTransport(int distance, double consumption, double petrolPrice){
        if(distance <= 0 || consumption <= 0){
            return 0;
        }

        if(petrolPrice == 0){
            return 0;
        }

        double result;
        result = distance/100.00 * consumption * petrolPrice;
        result = result * 100;
        result = Math.round(result);
        result = result/100;
        return result;
    }

    public int max( int[ ] array ){
        int max = 0;
        if(array.length == 0){
            return 0;
        }
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }

        return max;
    }

    public boolean isPalindrom(int a){
        String retazcoveCislo = "";
        int zvysok;
        while (a>10){
            zvysok = a%10;
            a = a/10;
            retazcoveCislo = retazcoveCislo + String.valueOf(zvysok);
        }
        retazcoveCislo = retazcoveCislo + String.valueOf(a);

        int j = retazcoveCislo.length();
        int zistenie = 0;
        for(int i = 0; i < retazcoveCislo.length(); i++){
            if(retazcoveCislo.charAt(i) == retazcoveCislo.charAt(j-1)){
                zistenie++;
            }
            j--;
        }

        if(zistenie == retazcoveCislo.length()){
            return true;
        }else{
            return false;
        }
    }

    public String isPalindromm(int a){
        String retazcoveCislo = "";
        int zvysok;
        while (a>=10){
            zvysok = a%10;
            a = a/10;
            char znak = (char) (zvysok+'0');
            retazcoveCislo = retazcoveCislo + znak;
        }
        retazcoveCislo = retazcoveCislo + (char)(a + '0');

        //return retazcoveCislo;

        int j = retazcoveCislo.length();
        int zistenie = 0;
        for(int i = 0; i < retazcoveCislo.length(); i++){
            if(retazcoveCislo.charAt(i) == retazcoveCislo.charAt(j-1)){
                zistenie++;
            }
            j--;
        }

        if(zistenie == retazcoveCislo.length()){
            return retazcoveCislo;
        }else{
            return retazcoveCislo;
        }


    }


    public String slovoOdZadu(String slovo){
        String odZadu = "";
        for(int i = slovo.length()-1; i >= 0; i--){
            odZadu = odZadu + slovo.charAt(i);
        }
        return odZadu;
    }


    public double objemKuzela(int polomer, int vyska){
        if(polomer <= 0 || vyska <= 0){
            return 0;
        }

        double result = 0;
        result = 1/3.00*((Math.PI)*(Math.pow(polomer,2))*vyska);
        result *= 100;
        result = Math.round(result);
        result /= 100;
        return result;
    }

}
