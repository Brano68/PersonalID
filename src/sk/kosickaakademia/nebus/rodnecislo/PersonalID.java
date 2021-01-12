package sk.kosickaakademia.nebus.rodnecislo;

public class PersonalID {

    public boolean checkID(String id){
        if(id.length()<9 || id.length()>11){
            return false;
        }

        int cdigits = 0;
        for(int i = 0; i < id.length(); i++){
            if(Character.isDigit(id.charAt(i))){
                cdigits++;
            }
        }
        if(cdigits < 9 || cdigits >10){
            return false;
        }
        if(id.length() == 11 && (cdigits != 10 || id.charAt(6) != '/')){
            return false;
        }
        if(id.length() == 10 && cdigits == 9 && id.charAt(6) != '/'){
            return false;
        }

        if(cdigits == 9){
            id = id + '0';
        }

        if (id.charAt(6) == '/') {
            id = id.substring(0,6) + id.substring(7,11);
        }

        //
        int month = Integer.valueOf(id.substring(2,4));
        int day = Integer.valueOf(id.substring(4,6));
        int year = Integer.valueOf(id.substring(0,2));

        if(year<22){
            year = year + 2000;
        }else {
            year = year + 1900;
        }

        if(id.charAt(2) == '5' || id.charAt(2) == '6'){
            month = month - 50;
        }

        System.out.println("rok " + year);
        System.out.println("mesiac " + month);
        System.out.println("den " + day);

        if(month > 12 || day > 31){
            System.out.println("Mesiac alebo den neexistuje!!!");
            System.out.println("Nespravny datum");
            return false;
        }

        //osetrit este den 31 pri mesiacoch januar, marec, maj, jul, august, oktober, december
        //31
        if((month == 1 || month == 3 || month == 5 || month == 7 || month == 8
                || month == 10 || month == 12) && day > 31){
            System.out.println("Nespravny datum");
            return false;
        }

        //30
        if((month == 4 || month == 6 || month == 9 || month == 11) && day > 30){
            System.out.println("Nespravny datum");
            return false;
        }

        //februar priestupny rok je delitelny 4
        if(year%4 == 0 && month == 2 && day > 29){
            System.out.println("Priestupny rok den vacsi ako 29!!!");
            System.out.println("Nespravny datum");
            return false;
        }

        if(year%4 != 0 && month == 2 && day > 28){
            System.out.println("Nie je to priestupny rok nemoze byt den vacsi ako 28!!!");
            System.out.println("Nespravny datum");
            return false;
        }

        //

        long num = Long.parseLong(id);
        if(num%11 == 0){
            return true;
        }else {
            System.out.println("Nie je delitelne 11");
            return false;
        }
    }

}
