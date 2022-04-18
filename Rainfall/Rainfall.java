public class Rainfall{
	private int nums[][];
	private	double sum[];
	private double avg[];
	private int max[], min[];

	public Rainfall(){
		nums = new int[2][3];
		sum = new double [2];
		avg = new double [2];
		max = new int [2];
		min = new int [2];
	}

	public void setNums(int nums[][]){
		this.nums = nums;
	}

	public void compute(){
		for(int j = 0; j < nums.length; j++){
			for(int i=0; i<nums[j].length;i++){
				sum[j] = sum[j] + nums[j][i];
			}
			avg[j] = Math.round(100*(sum[j]/nums[j].length)/100.0);
		}
	}
	public void computeMax(){
		for(int j = 0; j < nums.length; j++){
			max[j] = nums[j][0];
			for(int i=0; i<nums[j].length;i++){
				if(max[j] < nums[j][i]){
					max[j] = nums[j][i];
				}
			}
		}
	}

	public void computeMin(){
		for(int j = 0; j < nums.length; j++){
			min[j] = nums[j][0];
			for(int i=0; i<nums[j].length;i++){
				if(min[j] > nums[j][i]){
					min[j] = nums[j][i];
				}
			}
		}
	}
	public double[] getSum(){
		return sum;
	}

	public double[] getAvg(){
		return avg;
	}

	public int[] getMax(){
			return max;
	}
	public int[] getMin(){
		return min;
	}
}