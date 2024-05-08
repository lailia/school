package chap15.sec05.exam4;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit>{
	//FruitComparator를 비교자로 사용해서 가격 기준으로 Fruit 객체를 정렬
	@Override
	public int compare(Fruit o1, Fruit o2) {
		if(o1.price<o2.price) return -1;	//o1이 o2보다 작으면 음수
		else if(o1.price==o2.price) return 0;
		else return 1;
	}

}
