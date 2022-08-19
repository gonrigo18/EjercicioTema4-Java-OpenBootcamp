package com.openBootcamp;

    public class SmartWatch extends SmartDevice{

        String name;
        String colour;
        double price;
        int year;
        boolean waterResist;

        public SmartWatch(){
            super();
        }
        public SmartWatch(String Maker, String name, String colour, double price, int year,boolean waterResist){
            super(name, colour, price, year);
            this.Maker = Maker;
            this.name = name;
            this.colour = colour;
            this.price = price;
            this.year = year;
            this.waterResist = waterResist;
        }

        @Override
        public String toString() {
            return "SmartWatch{" +
                    "name='" + name + '\'' +
                    ", colour='" + colour + '\'' +
                    ", price=" + price +
                    ", year=" + year +
                    ", waterResist=" + waterResist +
                    ", Maker='" + Maker + '\'' +
                    '}';
        }
    }
