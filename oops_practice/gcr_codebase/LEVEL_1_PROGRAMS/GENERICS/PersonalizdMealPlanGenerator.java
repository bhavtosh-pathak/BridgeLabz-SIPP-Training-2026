interface MealPlan{

    void showPlan();

}



class VegetarianMeal implements MealPlan{

    public void showPlan(){

        System.out.println("Vegetarian Meal Plan");

    }

}



class VeganMeal implements MealPlan{


    public void showPlan(){

        System.out.println("Vegan Meal Plan");

    }

}



class KetoMeal implements MealPlan{


    public void showPlan(){

        System.out.println("Keto Meal Plan");

    }

}




class Meal<T extends MealPlan>{


    T plan;


    Meal(T plan){

        this.plan=plan;

    }


    void display(){

        plan.showPlan();

    }

}



public class PersonalizdMealPlanGenerator {



    static <T extends MealPlan> void generateMeal(T meal){

        meal.showPlan();

    }




    public static void main(String[] args){


        VegetarianMeal veg =
                new VegetarianMeal();


        VeganMeal vegan =
                new VeganMeal();



        Meal<VegetarianMeal> m1 =
                new Meal<>(veg);


        Meal<VeganMeal> m2 =
                new Meal<>(vegan);



        m1.display();

        m2.display();


        generateMeal(veg);

    }
}