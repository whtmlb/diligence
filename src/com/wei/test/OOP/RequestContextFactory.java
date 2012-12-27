package com.wei.test.OOP;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RequestContextFactory {

    static final PairFactory factory = new PairFactory() {
        public Pair1 pair1() {
            return new Pair1();
        }
        public Pair2 pair2() {
            return new Pair2();
        }
    };
    
    static class Pair1 implements Pair{

        @Override
        public String add() {
            return "Pair1 add result";
        }

        @Override
        public String plus() {
            return "Pair1 plus result";
        }}
    
    static class Pair2 implements Pair{

        @Override
        public String add() {
            return "Pair2 add result";
        }

        @Override
        public String plus() {
            return "Pair2 plus result";
        }}
    
    public static interface PairFactory{
        Pair1 pair1() ;
        Pair2 pair2() ;
    }
    public RequestContextFactory() {
    }
    
    @SuppressWarnings("unchecked")
    public <T extends Pair> T get(Class<T> clazz) {
        
        String methodName = clazz.getSimpleName().substring(0, 1).toLowerCase() + clazz.getSimpleName().substring(1);
        T t = null;
        try {
            Method method = PairFactory.class.getMethod(methodName, new Class[]{});
            t = (T) method.invoke(factory, new Object[]{});
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return t;
    }
    
    public void eee() {
        Class[] d = new Class[]{this.getClass()};
//        Class[] d = this.getClass().getDeclaringClass();

        for(int i=0,j=d.length;i<j;i++)
        System.out.println(d[i]);
    }
    public static void main(String[] e) {
        RequestContextFactory f = new RequestContextFactory();
        System.out.println(f.get(Pair1.class).add());
        f.eee();
    }

}
