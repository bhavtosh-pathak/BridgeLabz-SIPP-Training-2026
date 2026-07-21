class GameCharacter {

    String characterName;


    GameCharacter(String name) {

        characterName = name;
    }


    void performAttack() {

        System.out.println("Character attacks");
    }

}



// Warrior Class
class Warrior extends GameCharacter {


    Warrior(String name) {

        super(name);
    }


    @Override
    void performAttack() {

        System.out.println(characterName
                + " attacks using Sword");
    }
}



// Mage Class
class Mage extends GameCharacter {


    Mage(String name) {

        super(name);
    }


    @Override
    void performAttack() {

        System.out.println(characterName
                + " attacks using Magic Spell");
    }
}



// Archer Class
class Archer extends GameCharacter {


    Archer(String name) {

        super(name);
    }


    @Override
    void performAttack() {

        System.out.println(characterName
                + " attacks using Bow");
    }
}



public class ADVENTURE_GAME {


    static void startBattle(GameCharacter characters[]) {


        int warriors = 0;
        int mages = 0;
        int archers = 0;



        for(GameCharacter c : characters) {


            c.performAttack();



            if(c instanceof Warrior)
                warriors++;


            else if(c instanceof Mage)
                mages++;


            else if(c instanceof Archer)
                archers++;
        }



        System.out.println("\nBattle Statistics");
        System.out.println("Warriors: " + warriors);
        System.out.println("Mages: " + mages);
        System.out.println("Archers: " + archers);

    }




    public static void main(String[] args) {


        GameCharacter characters[] = {

                new Warrior("Thor"),
                new Mage("Gandalf"),
                new Archer("Robin"),
                new Warrior("Leon")
        };


        startBattle(characters);

    }
}