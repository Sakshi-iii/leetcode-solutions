class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> pq=new PriorityQueue<>((a,b)->{
            double gainA =(a[0]+1)/(a[1]+1)-a[0]/a[1];
            double gainB =(b[0]+1)/(b[1]+1)-b[0]/b[1];

            return Double.compare(gainB,gainA);     
        });
        for(int[] cls:classes){
            pq.offer(new double[]{(double)cls[0],(double)cls[1]});
        }
        for(int i=0;i<extraStudents;i++){
            double[]currentClass =pq.poll();
            currentClass[0]++;
            currentClass[1]++;
            pq.offer(currentClass);
        }
        double totalRatio=0;
        while(!pq.isEmpty()){
            double[] cls=pq.poll();
            totalRatio+=cls[0]/cls[1];
        }
        return totalRatio/classes.length;
    }
}