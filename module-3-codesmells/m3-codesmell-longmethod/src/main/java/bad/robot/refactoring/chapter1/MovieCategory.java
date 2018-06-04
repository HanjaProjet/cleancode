package bad.robot.refactoring.chapter1;

public enum MovieCategory {

    CHILDREN {
        double calculateAmount(Rental rental) {
            double amount = 1.5;
            if (rental.getDaysRented() > 3) {
                amount += (rental.getDaysRented() - 3) * 1.5;
            }
            return amount;
        }
    }, NEW_RELEASE {
        double calculateAmount(Rental rental) {
            return rental.getDaysRented() * 3;
        }
    }, REGULAR {
        double calculateAmount(Rental rental) {
            double amount = 2;
            if (rental.getDaysRented() > 2) {
                amount += (rental.getDaysRented() - 2) * 1.5;
            }
            return amount;
        }
    };

    abstract double calculateAmount(Rental rental);

}
