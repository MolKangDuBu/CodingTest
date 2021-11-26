/**
 * test
 */
public class test {

    public static void main(String[] args) {
        int count=0;
		int num;
		for(int i ='A'; i<='Z';i++) {
		
			for(int j =i;j<='Z';j++) {
				System.out.printf("%-3c",(char)j);
				count++;
			}
			num = 26-count;
			for(int k ='A';num>0; num--) {
				System.out.printf("%-3c", (char)k++);
			}
			count =0;
			System.out.println();
		}
    }
}