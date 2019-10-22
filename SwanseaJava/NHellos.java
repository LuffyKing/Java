class NHellos{
	public static void main(String[] args){
		try{
			if(args.length != 2){
				throw new IllegalArgumentException("Only two arguments are accepted!");
			}
			final int n = Integer.parseInt(args[0]);
			final int m = Integer.parseInt(args[1]);
			String s = "";
			for(int i = 0; i<m; i++){
				s += "!";
			}
			for(int i = 0; i<n; i++){
				System.out.println("Hello, World "+s);
			}
		
		} catch(NumberFormatException e){
			System.err.println(e.getMessage());
		} catch(IllegalArgumentException e){
		
			System.err.println(e.getMessage());
		}
	}
}
