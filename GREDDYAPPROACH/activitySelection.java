import java.util.*;
public class activitySelection {
    public static void main(String[] args) {
        int start[] = {5,1,3,0,5,8};
        int end[] = {9,2,4,6,7,9};

        int activities [][] = new int[start.length][3];
        for(int i =0; i<start.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        int maxAct = 0;
        ArrayList<Integer> actInd = new ArrayList<>();
        maxAct = 1;
        actInd.add(activities[0][0]);
        int lastEnd = activities[0][2];

        for(int i =1; i<start.length; i++){
            if(activities[i][1] >= lastEnd){
                maxAct++;
                actInd.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        System.out.println(maxAct);

        for(int i = 0; i<actInd.size(); i++){
            System.out.print("A" + actInd.get(i) + " ");
        }

    }
}
