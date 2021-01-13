package sk.kosickaakademia.nebus.rodnecislo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class PersonalID {

    private String id;
    private int day;
    private int month;
    private int year;
    private LocalDate date;
    private int age;

    public PersonalID(String id){
        this.id = id;
    }

    public boolean checkID(){
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
        this.month = Integer.valueOf(id.substring(2,4));
        this.day = Integer.valueOf(id.substring(4,6));
        this.year = Integer.valueOf(id.substring(0,2));

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

    public void howOldAreYou(){
        LocalDate dateTime = LocalDate.now();
        System.out.println(dateTime);
        int dayNow = dateTime.getDayOfMonth();
        int monthNow = dateTime.getMonthValue();
        int yearNow = dateTime.getYear();

        //aktualny rok minus rok narodenia
        if(monthNow < month){
            age = yearNow-year-1;
            System.out.println("Si stary: " + age);
        } else if(monthNow == month && dayNow < day){
            age = yearNow-year-1;
            System.out.println("Si stary: " + age);
        }else{
            age = yearNow-year;
            System.out.println("Si stary: " + age);
        }

    }

    public DayOfWeek getDayofWeekNew() {
        date = LocalDate.of(year, Month.of(month), day);
        DayOfWeek day = date.getDayOfWeek();
        return day;
    }

    public void howManyDaysHaveYouBeenLiving(){
        date = LocalDate.of(year, Month.of(month), day);
        LocalDate dateTime = LocalDate.now();
        int yearNow = dateTime.getYear();
        int days = 0;

        //poriesene rok o jedna vacsi ako si sa narodil az po prislusny rok mensi o jeden
        for(int i = year+1; i < yearNow; i++){
            if(year%4 == 0){
                days = days + 366;
            }else{
                days = days + 365;
            }
        }

        //este osetrit rok narodenia a prislusny rok
        //prislusny rok kolko dni ubehlo od yaciatku roka
        int prislusnyRokDni = dateTime.getDayOfYear();
        //System.out.println("Dni" + prislusnyRokDni);


        //rok narodenia po koniec kolko dni ubehlo
        int prislusnyRokDni2 = date.getDayOfYear();
        int hodnota;
        //ak v priestupnom si sa narodil
        if(month%4 == 0){
            hodnota = 366 - prislusnyRokDni2;
            //System.out.println("Dni" + hodnota);
        }else{
            hodnota = 365 - prislusnyRokDni2;
            //System.out.println("Dni" + hodnota);
        }
        //System.out.println("Dni" + prislusnyRokDni2);

        int vysledok = days+prislusnyRokDni+hodnota;

        System.out.println("Zijes: " + vysledok + " dni.");
    }

    public void retaired(){
        if(age>=62){
            System.out.println("Uz si na dochodku");
            return;
        }

        int i = 62 - age;
            System.out.println("Do dochodku ostava " + i + " rokov");
    }

}
