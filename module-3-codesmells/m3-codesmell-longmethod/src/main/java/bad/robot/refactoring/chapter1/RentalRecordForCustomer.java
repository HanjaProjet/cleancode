package bad.robot.refactoring.chapter1;

import io.vavr.Tuple;
import io.vavr.Tuple2;
import io.vavr.collection.HashMap;
import io.vavr.collection.Map;
import io.vavr.collection.Seq;

import java.util.Objects;


public class RentalRecordForCustomer {

    public static RentalRecordForCustomer NEW_RECORD = new RentalRecordForCustomer();

    public static RentalRecordForCustomer newRentalRecord(int frequentRenterPoints, String movie, double movieAmount) {

        return new RentalRecordForCustomer(movieAmount, frequentRenterPoints, HashMap.of(movie,movieAmount));
    }


    private final double totalAmount;
    private final int frequentRenterPoints;
    private final Map<String, Double> amountPerFilm;

    private RentalRecordForCustomer() {
        amountPerFilm = HashMap.empty();
        totalAmount = 0;
        frequentRenterPoints = 0;
    }

    private RentalRecordForCustomer(double totalAmount, int frequentRenterPoints, Map<String, Double> amountPerFilm) {
        this.totalAmount = totalAmount;
        this.frequentRenterPoints = frequentRenterPoints;
        this.amountPerFilm = amountPerFilm;
    }


    public RentalRecordForCustomer addition(RentalRecordForCustomer other) {
        if (this.equals(NEW_RECORD)) {
            return other;
        }
        if (other.equals(NEW_RECORD)) {
            return this;
        }

        return new RentalRecordForCustomer(this.totalAmount + other.totalAmount,
                this.frequentRenterPoints + other.frequentRenterPoints,
                this.amountPerFilm.merge(other.amountPerFilm));
    }


    public String getMessageRecordForCustomer(String customerName) {
        final StringBuilder result = new StringBuilder("Rental record for " + customerName + "\n");
        amountPerFilm.forEach((movie, amount) -> result.append("\t" + movie + "\t" + String.valueOf(amount) + "\n"));
        result.append("Amount owed is " + String.valueOf(totalAmount) + "\n");
        result.append("You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points");
        return result.toString();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RentalRecordForCustomer that = (RentalRecordForCustomer) o;
        return Double.compare(that.totalAmount, totalAmount) == 0 &&
                frequentRenterPoints == that.frequentRenterPoints &&
                Objects.equals(amountPerFilm, that.amountPerFilm);
    }

    @Override
    public int hashCode() {

        return Objects.hash(totalAmount, frequentRenterPoints, amountPerFilm);
    }
}
