package bad.robot.refactoring.chapter1;

public class NewReleaseMovieState implements MovieState {

    @Override
    public double calculateAmount(int rentalDays) {
        return rentalDays* 3;
    }

    @Override
    public boolean hasExpired(int rentedDays) {
        return rentedDays > 1;
    }
}
