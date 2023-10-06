class Solution {
    public double average(int[] salary) {
        int maxSalary = Integer.MIN_VALUE;
        int minSalary = Integer.MAX_VALUE;
        double sum = 0;
        for(int i = 0; i < salary.length; i++){
           sum += salary[i];
           if (salary[i] > maxSalary) maxSalary = salary[i];
           if (salary[i] < minSalary) minSalary = salary[i];
        }
        return (sum - maxSalary - minSalary) / (salary.length - 2);
    }
}