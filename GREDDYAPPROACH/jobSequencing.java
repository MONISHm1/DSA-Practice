import java.util.*;

public class jobSequencing {

    static class Job {
        int id, deadline, profit;

        Job(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    // Find with path compression
    static int find(int parent[], int x) {
        if (parent[x] == x)
            return x;
        return parent[x] = find(parent, parent[x]);
    }

    public static void main(String[] args) {

        int jobsinfo[][] = {{4,20},{1,10},{10,40},{1,30}};

        // Step 1: Create job objects
        ArrayList<Job> jobs = new ArrayList<>();
        for (int i = 0; i < jobsinfo.length; i++) {
            jobs.add(new Job(i, jobsinfo[i][0], jobsinfo[i][1]));
        }

        // Step 2: Sort by profit (descending)
        Collections.sort(jobs, (a, b) -> b.profit - a.profit);

        // Step 3: Find max deadline
        int maxDeadline = 0;
        for (Job j : jobs) {
            maxDeadline = Math.max(maxDeadline, j.deadline);
        }

        // Step 4: DSU initialization
        int parent[] = new int[maxDeadline + 1];
        for (int i = 0; i <= maxDeadline; i++) {
            parent[i] = i;
        }

        int totalProfit = 0;
        ArrayList<Integer> result = new ArrayList<>();

        // Step 5: Assign jobs
        for (Job j : jobs) {
            int availableSlot = find(parent, j.deadline);

            if (availableSlot > 0) {
                result.add(j.id);
                totalProfit += j.profit;

                // Mark slot as occupied
                parent[availableSlot] = find(parent, availableSlot - 1);
            }
        }

        // Output
        System.out.println("Max Jobs Done: " + result.size());
        System.out.println("Jobs selected: " + result);
        System.out.println("Total Profit: " + totalProfit);
    }
}