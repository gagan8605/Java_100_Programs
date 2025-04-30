package com.java.progarm100;
class P {
    String n;
    int a;

    P(String n, int a) {
        this.n = n;
        this.a = a;
    }

    void showInfo() {
        System.out.println("Name: " + n);
        System.out.println("Age: " + a);
    }
}

class S extends P {
    String s;

    S(String n, int a, String s) {
        super(n, a);
        this.s = s;
    }

    void showSchool() {
        System.out.println("College: " + s);
    }
}

class T extends P {
    String sub;

    T(String n, int a, String sub) {
        super(n, a);
        this.sub = sub;
    }

    void showSubject() {
        System.out.println("Subject: " + sub);
    }
}



public class MultipleClasses {

	public static void main(String[] args) {
		P p = new P("RajaRam", 30);
        p.showInfo();

        S s = new S("Rameshwar", 20, "Pdea College");
        s.showInfo();
        s.showSchool();

        T t = new T("Mr.sumed", 45, "Math");
        t.showInfo();
        t.showSubject();
	}

}
