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

}
