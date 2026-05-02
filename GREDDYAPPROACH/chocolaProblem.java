import java.util.Arrays;
import java.util.Collections;

public class chocolaProblem {
    public static void main(String[] args) {
        Integer costHori[] = {2,1,3,1,4};
        Integer costVerti[] = {4,1,2};

        Arrays.sort(costHori, Collections.reverseOrder());
        Arrays.sort(costVerti, Collections.reverseOrder());

        int v=0;
        int h =0;
        int vp = 1;
        int hp = 1;
        int cost = 0;

        while (h < costHori.length && v < costVerti.length) {
            if(costHori[h] <= costVerti[v]){
                cost += (costVerti[v] *hp);
                vp++;
                v++;
            }else{
                cost += (costHori[h] * vp);
                hp++;
                h++;
            }
        }
        while (h < costHori.length) {
            cost += (costHori[h] * vp);
            hp++;
            h++;
        }

        while (v < costVerti.length) {
            cost += (costVerti[v] * hp);
            vp++;
            v++;            
        }

        System.out.println(cost);
    }
}
