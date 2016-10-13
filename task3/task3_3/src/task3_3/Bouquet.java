package task3_3;

public class Bouquet {
	private final String TOTAL_MESSAGE = "Cost of bouquet is - ";
	private Flower[] arrOfFlowers;
	private double sum;
	private int position = 0;
	
	public Bouquet(){
		arrOfFlowers = new Flower[10];
	}
//----------------------------------------------------------------------------------------
	public void addFlower(Flower flower){
		if (position == arrOfFlowers.length){
			arrOfFlowers = resize(arrOfFlowers);
		}
			arrOfFlowers[position] = flower;
			position++;
	}
//----------------------------------------------------------------------------------------	
	public void getBouquet(){
		for(int i=0; i < arrOfFlowers.length;i++){
				if(arrOfFlowers[i] != null){
					StringBuilder sb = new StringBuilder();
					sb.append(i);
					sb.append(arrOfFlowers[i].getName());
					sb.append(arrOfFlowers[i].getColor());
					sb.append(arrOfFlowers[i].getPrice());
					String result = sb.toString();
					System.out.println(result);
				}
		}		
	} 
//----------------------------------------------------------------------------------------
	public void getSum(){
		this.sum = 0;
		for(int i=0; i < arrOfFlowers.length; i++){
				if(arrOfFlowers[i] != null){
					this.sum += arrOfFlowers[i].getPrice();
				}
		}
		System.out.print(TOTAL_MESSAGE + this.sum);
	}
//---------------------------------------------------------------------------------------
	public Flower[] resize(Flower[] oldArrOfFlowers){
		Flower[] arrOfFlowers = new Flower[oldArrOfFlowers.length*2];
		System.arraycopy(oldArrOfFlowers, 0, arrOfFlowers, 0, oldArrOfFlowers.length);
		return arrOfFlowers;
	}
}

