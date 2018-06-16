package bad.robot.refactoring.chapter1;

public interface MovieState {

    double calculateAmount(int rentalDays);

    boolean hasExpired(int rentedDays);
}
