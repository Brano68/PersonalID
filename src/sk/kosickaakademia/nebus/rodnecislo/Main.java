package sk.kosickaakademia.nebus.rodnecislo;

public class Main {
    public static void main(String[] args) {
        PersonalID personalID = new PersonalID("1111111111");

        //System.out.println(personalID.checkID());

        if (personalID.checkID()) {
            personalID.howOldAreYou();

            System.out.println("Den ked si sa narodil bol:");
            System.out.println(personalID.getDayofWeekNew());

            personalID.howManyDaysHaveYouBeenLiving();


            personalID.retaired();
        }else{
            System.out.println("ZLE ID!!!");
        }


        Task task = new Task();
        System.out.println(task.terminovanyVklad(1000,5,2,false));
        System.out.println(task.terminovanyVklad(1000,1,10,false));
        System.out.println(task.priceForTransport(550,7,1.3));
        int[] pole = {4,5};
        System.out.println(task.max(pole));
        System.out.println("---------------------");
        System.out.println(task.isPalindrom(5353));


        System.out.println(task.objemKuzela(2,5));
    }
}
