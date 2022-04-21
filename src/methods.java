import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.LinkedList;

public class methods {



    public static ArrayList<LinkedList< String>> RotateTeams(ArrayList<LinkedList<String>> teamGroups)
    {
        LinkedList<String> teamGroup1 = teamGroups.get(0);
        LinkedList<String> teamGroup2 = teamGroups.get(1);

        teamGroup2.addFirst(teamGroup1.get(1));
        teamGroup1.remove(1);
        teamGroup1.addLast(teamGroup2.getLast());
        teamGroup2.removeLast();
        ArrayList<LinkedList<String>> result = new ArrayList<>();
        result.add(0,teamGroup1);
        result.add(1,teamGroup2);
        return result;
    }

    public static void PrintMatches( ArrayList<LinkedList<String>> teamGroups){

        LinkedList<String> teamGroup1 = teamGroups.get(0);
        LinkedList<String> teamGroup2 = teamGroups.get(1);

        for (int i =0; i<=teamGroup1.size()-1;i++)
        {
            System.out.println(  (i+1) +". Match");
            System.out.println(teamGroup1.get(i)+ " vs "+teamGroup2.get(i) );
            System.out.println("-----------------------------");
    }


}
    public static void PrintAwayMatches( ArrayList<LinkedList<String>> teamGroups){

        LinkedList<String> teamGroup1 = teamGroups.get(0);
        LinkedList<String> teamGroup2 = teamGroups.get(1);

        for (int i =0; i<=teamGroup1.size()-1;i++)
        {
            System.out.println(  (i+1) +". Match");
            System.out.println(teamGroup2.get(i)+ " vs "+teamGroup1.get(i) );
            System.out.println("-----------------------------");
        }


    }
}
