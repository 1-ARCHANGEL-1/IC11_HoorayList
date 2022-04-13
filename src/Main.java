public class Main
{
    public static void main(String[] args)
    {
        HoorayList<String> ourNames = new HoorayList<>();
        ourNames.add("christin");
        ourNames.add("Cory");
        ourNames.add("Mike");
        ourNames.add("Kayla");
        ourNames.add("Jordan");
        ourNames.add("Jc");
        System.out.println(ourNames);
        //Bye bye Paulding
        ourNames.remove(3);
        //ourNames.remove("Paulding");
        //Print
        System.out.println(ourNames);


    }
}
