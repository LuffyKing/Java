class Frequencies{
	public static void main(final String[] args){
		try{
			if(args.length == 2){
				System.err.println("Only two inputs are accepted");	
			}
			int N = Integer.parseInt(args[0]);
			long T = Integer.parseInt(args[1]);
			int[][] freqArr = new int[N][1];
			for(int i; i<T; i++){
				int radInt = (int) Math.random()*N;
				freqArr[radInt][0] += 1;
			}
			for(int i = 0; i < freqArr.length; i++){
				int ans = freqArr[i][0];
				System.out.println(ans+ ": " + ans/(N*1.0));
			}
			
		} catch(final NumberFormatException e){
			System.err.println("Only numbers are allowed");
		} catch(final IllegalArgumentException e){
			System.err.println(e.getMessage());
		}
	}
}
