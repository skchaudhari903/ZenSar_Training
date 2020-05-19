public class GenericsType<T> {

		private T t;
		
		public T get() {
			return t;
		}
		
		public void set(T t) {
			this.t = t;
	}

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		GenericsType type = new GenericsType();
		type.set("Shubham");		//valid
		
		String str = (String) type.get();
		System.out.println(str);
		/*
		GenericsType type1 = new GenericsType();
		type1.set("Shubham");		//valid
		type1.set(10);				//valid and autoboxing support
		
		String str1 = (String) type1.get();
		System.out.println(str1);
		*/
	}
}
