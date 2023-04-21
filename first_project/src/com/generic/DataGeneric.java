package com.generic;

public class DataGener<T> {
	private T obj;
	
	public DataGener(T obj) {
		this.obj=obj;
	}
	
	
	public T getObj() {
		return obj;
	}


	@Override
	public String toString() {
		return "DataGener [obj=" + obj + ", getObj()=" + getObj() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	public class DataGeneric {
		
		public static void main(String[] args) {
			DataGener<String> obj1= new DataGener<String> ("hellow");
			String out =obj1.getObj();
			System.out.println(out);
	}
	
	
	
	}


	
	




	


