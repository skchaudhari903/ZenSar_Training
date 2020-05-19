public class Before_GenericsType {

		private Object t;
		
		public Object get() {
			return t;
		}
		
		public void set(Object t) {
			this.t = t;
	}

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Before_GenericsType type = new Before_GenericsType();
		type.set("Pankaj");
		//type  asting, error prone and can cause ClassCastException
		String str = (String) type.get();
		System.out.println(str);
	}
}