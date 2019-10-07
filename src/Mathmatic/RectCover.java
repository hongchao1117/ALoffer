package Mathmatic;

public class RectCover {
    public int RectCoverHelper(int target) {
        if (target<=0)
            return 0;
        if (target==1)
            return 1;
        if (target==2)
            return 2;
        else{
            int count = RectCoverHelper(target-1)+RectCoverHelper(target-2);
            return count;
        }
    }
}
