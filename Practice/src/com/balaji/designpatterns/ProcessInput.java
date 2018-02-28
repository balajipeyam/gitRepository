// World.Continent.Country.0.State.0.City.name -- with name as bangalore
// World.Continent.name -- continent name

package com.balaji.designpatterns;

import java.lang.reflect.Field;

public class ProcessInput {

	public static void setFieldValue(Object object, String filedName, Object fieldValue) {
		Class objClass = object.getClass();
		try {
			Field field = objClass.getDeclaredField(filedName);
			field.setAccessible(true);
			field.set(object, fieldValue);
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}
	}

	public static Object getFieldValue(String fieldName, Object object) {
		Class objClass = object.getClass();
		Object obj = null;
		try {
			Field field = objClass.getDeclaredField(fieldName);
			field.setAccessible(true);
			obj = field.get(object);
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}
		return obj;
	}

	public static Class scoutClass(String className) {
		System.out.println("into class " + className);
		Object newObj = null;
		Class newClass = null;
		try {
			newClass = Class.forName(className);
			newObj = newClass.newInstance();
			Field[] fields = newClass.getDeclaredFields();
			for (Field f : fields) {
				System.out.println(f.getType());
				if (f.getType().equals(String.class)) {
					f.setAccessible(true);
					setFieldValue(newObj, f.getName(), "balaji");
					return newClass;
				} else if (!f.getType().isPrimitive()) {
					f.setAccessible(true);
					String[] s = f.getType().toString().split("[ ]");
					Object obj = scoutClass(s[1]);
				}
			}
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return newClass;
	}

	public static void main(String[] args) throws ClassNotFoundException {

		String s1 = "World.Continent.Country.0.State.0.City.Bangalore";
		String s2 = "World.Continent.Country.India";

		String[] allInputWords = s2.split("[.]");
		Class w = scoutClass("com.balaji.designpatterns." + allInputWords[0]);
		try {
			World a = (World) w.newInstance();
			System.out.println(a.getName());
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
