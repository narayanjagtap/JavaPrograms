package JavaPrograms.COopsFandamental;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class Guesser
{
    int guessNum;
    int guessingNum(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Guesser! kindly guess the number :- ");
        guessNum= scan.nextInt();
        return guessNum;
    }
}


class Player
{
    int guessNum;
    int guessingNumber(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Player! kindly guess the number :- ");
        guessNum= scan.nextInt();
        return guessNum;
    }
}


class Umpire
{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser(){
        Guesser g=new Guesser();
        numFromGuesser=g.guessingNum();
    }
    void collectNumFromPlayers(){
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();
        numFromPlayer1=p1.guessingNumber();
        numFromPlayer2=p2.guessingNumber();
        numFromPlayer3=p3.guessingNumber();
    }
    
    void compare()
    {
        if(numFromGuesser==numFromPlayer1){
            if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
            {
                System.out.println("sab ne sahi answer diya! sab winner hai");
            }
            else if(numFromGuesser==numFromPlayer2)
            {
                System.out.println("Player 1 aur Player 2 jeet gaye");
            }
            else if(numFromGuesser==numFromPlayer3)
            {
                System.out.println("Player 1 aur Player 3 jeet gaye");
            }
            else
            {
                System.out.println("Player1 won the game");
            }
        }
        else if(numFromGuesser==numFromPlayer2){
            if(numFromGuesser==numFromPlayer3)
            {
                System.out.println("Player 2 aur Player 3 ne game jeet liya");
            }
            else
            {
                System.out.println("Player 2 won the game");
            }
        }
        else if(numFromGuesser==numFromPlayer3){
            System.out.println("Player3 won the game");
        }
        else
        {
            System.out.println("Sab ke sab galat hain, aap game har gaye!!");
        }

    }
}



public class GuesserGame {
    public static void main(String[] args) 
    {
        System.out.println("----------------");
        System.out.println("Game started");
        System.out.println("----------------");

        Umpire objUmpire=new Umpire();

        objUmpire.collectNumFromGuesser();
        objUmpire.collectNumFromPlayers();

        System.out.println("--------------------------------------------");
        objUmpire.compare();
        System.out.println("--------------------------------------------");
    }
}