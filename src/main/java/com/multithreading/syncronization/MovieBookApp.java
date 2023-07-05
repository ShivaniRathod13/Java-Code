package com.multithreading.syncronization;

class BookTheaterSeat{

    int total_seats=10;
    void bookSeat(int seats){
        if(total_seats>=seats){
            System.out.println(seats+"seats booked successfully");
            total_seats = total_seats-seats;
            System.out.println("Seats Left :"+total_seats);
        }
        else {
            System.out.println("Sorry seats cannot be booked...!!");
            System.out.println("Seats Left :"+total_seats);
        }
    }
}



public class MovieBookApp extends Thread {
    static  BookTheaterSeat theaterSeat;
   int seats;

    @Override
    public void run() {
       theaterSeat.bookSeat(seats);
    }

    public static void main(String[] args) {
        theaterSeat= new BookTheaterSeat();
        MovieBookApp amit = new MovieBookApp();
        amit.seats =7;
        amit.start();

        MovieBookApp suresh = new MovieBookApp();
        suresh.seats =6;
        suresh.start();



    }
}
