class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length <= 2)
            return true;

        int xDiff = coordinates[1][0] - coordinates[0][0];
        int yDiff = coordinates[1][1] - coordinates[0][1];
        
        for (int i = 1; i < coordinates.length; i++) {
            int currentXDiff = coordinates[i][0] - coordinates[i - 1][0];
            int currentYDiff = coordinates[i][1] - coordinates[i - 1][1];
            
            if (xDiff * currentYDiff != yDiff * currentXDiff)
                return false;
        }
        
        return true;
    }
}
