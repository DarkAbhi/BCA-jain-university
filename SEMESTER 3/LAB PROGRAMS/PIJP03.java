package com.bca;

class Constructor {
    int width, height, length;

    Constructor() {
        width = 10;
        height = 10;
        length = 10;
    }

    Constructor(int w, int h, int l) {
        width = w;
        height = h;
        length = l;
    }

    Constructor(Constructor c) {
        width = c.width;
        height = c.height;
        length = c.length;
    }

    float volume() {
        return (width * height * length);
    }
}

class PIJP03 {
    public static void main(String args[]) {
        Constructor c1 = new Constructor();
        Constructor c2 = new Constructor(20, 30, 40);
        Constructor c3 = new Constructor(c1);
        System.out.println(c1.volume());
        System.out.println(c2.volume());
        System.out.println(c3.volume());
    }
}
