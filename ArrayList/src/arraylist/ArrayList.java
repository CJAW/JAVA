package arraylist;

public class ArrayList {

	Object[] value;
	int Size;

	public ArrayList() {
		value = new Object[16];
	}

	public ArrayList(int Size) {
		value = new Object[Size];
	}

	public void add(Object obj) {
		value[Size] = obj;
		Size++;
		if (Size >= value.length) {

			int newCapactity = value.length * 2;

			Object[] newlist = new Object[newCapactity];

			for (int i = 0; i < value.length; i++) {
				newlist[i] = value[i];
			}
			value = newlist;
		}
	}

	public Object get(int index) {
		if (index < 0 || index > Size - 1) {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();

			}
		}

		return value[index];
	}

	public static void main(String[] args) {

		ArrayList list = new ArrayList(2);
		list.add("8900");

		System.out.println(list.get(0));

	}
}
