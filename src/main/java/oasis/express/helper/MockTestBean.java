package oasis.express.helper;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class MockTestBean {

    private double curD = 100.1;

    private float curF = 10000.2f;

    private int curInt = 1;

    private long curL = 1000;

    private int curS = 1;

    private static String[] rs = new String[] { "A", "C", "D", "E", "F", "J", "H", "I", "K", "L",
            "M", "N", "O", "P", "Q", "R",
            "S", "T", "U", "V", "W", "X", "Y", "Z", "a", "c", "d", "e", "f", "j", "h", "i", "k",
            "l", "m", "n", "o", "p", "q",
            "r", "s", "t", "u", "v", "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8",
            "9", "0", "f" };

    public <T> T getJavaBean(Class<T> c) {

        T object = null;
        List<Method> allMethods = new ArrayList<Method>();
        try {
            Method[] methods = c.getDeclaredMethods();
            allMethods.addAll(Arrays.asList(methods));
            Class<?> superClass = c.getSuperclass();
            while (superClass != null) {
                allMethods.addAll(Arrays.asList(superClass.getDeclaredMethods()));
                superClass = superClass.getSuperclass();
            }

            HashSet<String> getters = pickUpGetters(allMethods);

            object = c.newInstance();
            for (Method m : allMethods) {
                if (isPropertyMethod(m, getters)) {
                    Object[] pValues = mockParamValues(m);
                    m.invoke(object, pValues);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return object;
    }

    private Object[] mockParamValues(Method m) {
        Class<?>[] pTypes = m.getParameterTypes();
        Object[] pValues = new Object[pTypes.length];
        for (int i = 0; i < pTypes.length; i++) {
            pValues[i] = getValue(pTypes[i].getSimpleName());
        }
        return pValues;
    }

    private static HashSet<String> pickUpGetters(List<Method> allMethods) {
        HashSet<String> getters = new HashSet<String>(allMethods.size() / 2 + 1);
        for (Method m : allMethods) {
            String name = m.getName();
            if (name.startsWith("get")) {
                getters.add(name);
            }
        }
        return getters;
    }

    private static boolean isPropertyMethod(Method method, HashSet<String> getters) {
        String methodName = method.getName();
        return methodName.startsWith("set")
                && getters.contains(methodName.replaceFirst("set", "get"));
    }

    public static String getRand(int size) {
        Random random = new Random();
        String rvs = "";
        for (int i = 0; i < size; i++) {
            int status = random.nextInt(size);
            if (status < rs.length && status > 0) {
                rvs += rs[status];
            }
            else {
                rvs += "A";
            }

        }
        return rvs;
    }

    private Object getValue(String s) {
        Object temp = null;
        String st = s.toLowerCase();
        Random random = new Random(10010);
        if (st.equals("int") || st.equals("integer")) {
            temp = curInt;
            curInt++;
        }
        else if (st.equals("long")) {
            temp = curL;
            curL++;
        }
        else if (st.equals("string")) {
            temp = curS + getRand(6);
            curS++;
        }
        else if (st.equals("double")) {
            temp = curD;
            curD++;
        }
        else if (st.equals("float")) {
            temp = curF;
            curF++;
        }
        else if (st.equals("boolean")) {
            temp = random.nextBoolean();
        }
        else if (st.equals("date")) {
            temp = new Date();
        }
        return (temp == null) ? null : (temp);
    }
}