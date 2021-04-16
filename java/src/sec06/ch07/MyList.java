package sec06.ch07;

public interface MyList {
	/* public abstract */ void add(int value);
	void add(int index, int value);
	int size();
	int get(int index);
	int remove();
	int remove(int index);
}
