public class First {

    public static void main(String[] args ) {

        System.out.println(" java program");
        System.out.println("i am prepare java demo class");
        System.out.println("i am git user");
        System.out.println("i am prepare programing ");
        // SYNTAX : Datatype variable_name = value
        // you can not declare same name variable again  but can reuse

        String name="Gorav";
        {
            System.out.println(name);
        }
           name="raj";{
               System.out.println(name);
        }
          int age=28;
        System.out.println("Printed age   " + age);
          /* SYNTAX: IF (condition){
                     code
                     }
                     else
                      { code
                      }
               */
        int price=550;
        if (price>500){
            System.out.println("Price are greater then");
        }
        else {
            System.out.println("Price are lower");


        }
    }

}
