package bad.robot.refactoring.chapter1;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {


    @Test
    public void statementWithNoRental() {

        Customer me = new Customer("jeremie");

        String statement = me.StringStatement();

        assertEquals("Rental record for jeremie\nAmount owed is 0.0\nYou earned 0 frequent renter points", statement);

    }

    @Test
    public void statementWithOneRegularMovieRental() {

        Customer me = new Customer("jeremie");
        Movie backToTheFutur = new Movie("Back to the futur", new RegularMovieState());
        Rental rental = new Rental(backToTheFutur, 5);
        me.addRental(rental);

        String statement = me.StringStatement();

        assertEquals("Rental record for jeremie\n\tBack to the futur\t6.5\nAmount owed is 6.5\nYou earned 1 frequent renter points", statement);

    }

    @Test
    public void statementWithOneNewReleaseMovieRental() {

        Customer me = new Customer("jeremie");
        Movie starWars8 = new Movie("star wars 8", new NewReleaseMovieState());
        Rental rental = new Rental(starWars8, 5);
        me.addRental(rental);

        String statement = me.StringStatement();

        assertEquals("Rental record for jeremie\n\tstar wars 8\t15.0\nAmount owed is 15.0\nYou earned 2 frequent renter points", statement);

    }

    @Test
    public void statementWithOneChildreneMovieRental() {

        Customer me = new Customer("jeremie");
        Movie ouiOui = new Movie("oui oui", new ChildrenMovieState());
        Rental rental = new Rental(ouiOui, 5);
        me.addRental(rental);

        String statement = me.StringStatement();

        assertEquals("Rental record for jeremie\n\toui oui\t4.5\nAmount owed is 4.5\nYou earned 1 frequent renter points", statement);

    }
    @Test
    public void statementWithMovieRentalOfAllTypes() {

        Customer me = new Customer("jeremie");
        Movie backToTheFutur = new Movie("Back to the futur", new RegularMovieState());
        Movie starWars8 = new Movie("star wars 8", new NewReleaseMovieState());
        Movie ouiOui = new Movie("oui oui", new ChildrenMovieState());
        Rental rental1 = new Rental(backToTheFutur, 5);
        Rental rental2 = new Rental(starWars8, 5);
        Rental rental3 = new Rental(ouiOui, 5);
        me.addRental(rental1);
        me.addRental(rental2);
        me.addRental(rental3);

        String statement = me.StringStatement();

        assertEquals("Rental record for jeremie\n" +
                "\toui oui\t4.5\n" +
                "\tBack to the futur\t6.5\n" +
                "\tstar wars 8\t15.0\n" +
                "Amount owed is 26.0\n" +
                "You earned 4 frequent renter points", statement);

    }
}