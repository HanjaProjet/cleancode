package bad.robot.refactoring.chapter1;

public class ChildrenMovieState implements MovieState {

    @Override
    public double calculateAmount(int rentalDays) {
        double amount = 1.5;
        if (rentalDays> 3) {
            amount += (rentalDays- 3) * 1.5;
        }
        return amount;
    }

    @Override
    public boolean hasExpired(int rentedDays) {
        return false;
    }
}
