package com.openBootcamp;

    public class SmartDevice {
        String Maker;
        String name;
        String colour;
        double price;
        int year;

        public SmartDevice(){
        }

        @Override
        public String toString() {
            return "SmartDevice{" +
                    "Maker='" + Maker + '\'' +
                    ", name='" + name + '\'' +
                    ", colour='" + colour + '\'' +
                    ", price=" + price +
                    ", year=" + year +
                    '}';
        }

        public SmartDevice(String name, String colour, double price, int year) {
            this.name = name;
            this.colour = colour;
            this.price = price;
            this.year = year;
        }


        String getProp(){
            return ( Maker + " " + name + " " + colour + " " + price + " " + year);
        }

    }
