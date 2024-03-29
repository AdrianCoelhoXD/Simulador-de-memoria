package so;

import java.util.Random;
import java.util.UUID;

import memory.MemoryAddress;

public class Process {
	private String id;
	private int sizeInMemory;
	private MemoryAddress ma;

	public Process(int size) {
		this.id = UUID.randomUUID().toString();
		Random rand = new Random();
		// List<Integer> numbers = Arrays.asList(1,2,4,6,10,20,30,50,100);
		// Test line
		// List<Integer> numbers = Arrays.asList(1);
		// this.sizeInMemory = numbers.get(rand.nextInt(numbers.size()));
		this.sizeInMemory = size;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getSizeInMemory() {
		return sizeInMemory;
	}

	public void setSizeInMemory(int sizeInMemory) {
		this.sizeInMemory = sizeInMemory;
	}

	public MemoryAddress getMa() {
		return ma;
	}

	public void setMa(MemoryAddress ma) {
		this.ma = ma;
	}

}
