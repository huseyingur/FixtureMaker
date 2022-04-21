import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Ask and get team count
        System.out.println("How many teams will compete ? ");
        int totalTeams =   s.nextInt();
        s.nextLine();

        //ask team names and add to ArrayList
        ArrayList<String>  teamList = new ArrayList<>();
        for (int i = 1; i<= totalTeams;i++)
        {
            System.out.println("Enter Name for the team Number "+ i);
            teamList.add(s.nextLine());
        }

        /*
        Split teams into 2 parts and save first  member of the first array and remove from the array
         create 2 list  first one has N(Team number)/2 -1 , Second has N/2   members
         First List is LIFO  -   second one is FIFO
         */


        LinkedList  teamGroup1= new LinkedList<>();
        LinkedList  teamGroup2= new LinkedList<>();

        String fixedTeam = teamList.get(0);
        teamList.remove(0);


        // add first half of the teams  to first array except first team and second half of the teams to second array.
        for (int i = 0; i <= ((totalTeams/2)-2); i++) {
            teamGroup1.add(teamList.get(i));
            teamGroup2.add(teamList.get((totalTeams-2)-i));
        }
        //because second  array one more member add after the loop.
        teamGroup2.add(teamList.get((totalTeams/2)-1));
        // add fixedteam to first list as first member
        teamGroup1.add(0,fixedTeam);

       //Add Team Groups to an array- Rotate and print Methods takes Arrays as parameters
        ArrayList<LinkedList<String>>  TeamGroups = new ArrayList<>();
        TeamGroups.add(0,teamGroup1);
        TeamGroups.add(1,teamGroup2);


        //Print and Rotate matches
     for (int i =0; i<totalTeams-1;i++) {
         System.out.println("********* "+(i+1)+". Week Matches"+" ***************");
        methods.PrintMatches(TeamGroups);
         TeamGroups =methods.RotateTeams(TeamGroups);

     }
        for (int i =0; i<totalTeams-1;i++) {
            System.out.println("********* "+(i+8)+". Week Matches"+" ***************");
            methods.PrintAwayMatches(TeamGroups);
            TeamGroups =methods.RotateTeams(TeamGroups);

        }

























    }
}
