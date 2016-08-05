class Minmax{
	static void maxmin(int[] vetor,int n, int min, int max){
		int i;
		min = vetor[0];
		max = vetor[0];
		for(i = 1; i < n; i++){
			if(vetor[i] < min){
				min = vetor[i];
													 }

			if(vetor[i] > max) {
 				max = vetor[i];
														}

												  }
	System.out.println(max +" "+ min);
																														}
	public static void main(String args[]){
		int min,max;
		int[] vetor = new int[4];

		for(int i=0;i<4;i++)
			vetor[i]=i;

		min=max=vetor[0];

		Minmax objeto = new Minmax();
		objeto.maxmin(vetor,4,min,max);

																				}
}
