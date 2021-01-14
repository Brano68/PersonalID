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
        System.out.println(task.scitajCislaOd1Po10());

    }
}
