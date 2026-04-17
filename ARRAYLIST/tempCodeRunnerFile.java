
            if(list.get(i) > list.get(i+1)){
                bp = list.get(i);
                break;
            }
        }
        int left = bp+1;
        int right = bp;
        while (left != right) {
            if(list.get(left) + list.get(right) == target){
                return true;
            }
             if(list.get(left) + list.get(right) < target){
               left = (left + 1) % n;