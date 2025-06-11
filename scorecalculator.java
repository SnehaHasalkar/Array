public class scorecalculator {
    public static void main(String[] args) {
        
        int[] scores={ 90,80,700,85,75};
        int sum=0;
        for(int score : scores){
            sum+=score;
        }
        double average = (double)sum/scores.length;
        System.out.println("sum:"+average);
        System.out.println("Average:"+ average);
    }

}

int max = scores[0],min = scores[0];
for(int score:scores){
    if(score>max)max=score;
    if(score>min)min=score;
}