package com.jdddata.dockermgr.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListTest {

    static List<Personal> personalList = new ArrayList<>();

    static {
        personalList.add(new Personal("erwt","asdfasdg"));
        personalList.add(new Personal("fengwertgsdfxuemei","asdfasdgasdfxvadsf"));
        personalList.add(new Personal("gezhisdfgsdfgwei","qwetwery"));
    }

    public static void main(String[] args) {
//        ArrayList<Personal> collect = personalList.stream().collect(
//                collectingAndThen(
//                        toCollection(() -> new TreeSet<>(Comparator.comparing(Personal::getSex))), ArrayList::new)
//        );
//        collect.forEach(c -> System.out.println(c.toString()));

        List<Personal> erwt = personalList.stream().filter(p -> p.getName().equalsIgnoreCase("erwt")).collect(Collectors.toList());
        erwt.forEach(e-> System.out.println(e.toString()));
    }

    private static class Personal {
        private String name;
        private String sex;

        public Personal(String cmj, String s) {
            this.name = cmj;
            this.sex = s;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        @Override
        public String toString() {
            return "Personal{" +
                    "name='" + name + '\'' +
                    ", sex='" + sex + '\'' +
                    '}';
        }
    }
}
