package bad.robot.refactoring.chapter1;

public class RegularMovieState implements MovieState {
    @Override
    public double calculateAmount(int rentalDays) {
        double amount = 2;
        if (rentalDays > 2) {
            amount += (rentalDays - 2) * 1.5;
        }
        return amount;
    }

    @Override
    public boolean hasExpired(int rentedDays) {
        return false;
    }
}
