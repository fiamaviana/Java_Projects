import javax.swing.JOptionPane;
import java.util.Arrays;

public class RainfallApp{
	public static void main(String args[]){
		//declare variables
		int[][] nums = new int[2][3];
		double sum [] = new double [2];
		double avg [] = new double [2];
		int max [] = new int [2];
		int min [] = new int [2];

		//create objects
		Rainfall app = new Rainfall();

		//Input
		for(int j = 0; j <nums.length; j++){
			for(int i=0; i<nums[j].length;i++){
				nums[j][i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter the rainfall for week: " +(j+1) + " day " + (i+1)));
			}
		}
		app.setNums(nums);

		//process
		app.compute();
		app.computeMax();
		app.computeMin();

		sum = app.getSum();
		avg = app.getAvg();
		max = app.getMax();
		min = app.getMin();
		//output
		JOptionPane.showMessageDialog(null,"The sum rain for numbers " + Arrays.deepToString(nums) + ", are: " + Arrays.toString(sum));
		JOptionPane.showMessageDialog(null,"The average rain for numbers " + Arrays.deepToString(nums) + ", are: " + Arrays.toString(avg));
		JOptionPane.showMessageDialog(null,"The MAX rain for numbers " + Arrays.deepToString(nums) + ", are: " + Arrays.toString(max));
		JOptionPane.showMessageDialog(null,"The MIN rain for numbers " + Arrays.deepToString(nums) + ", are: " + Arrays.toString(min));
	}

}