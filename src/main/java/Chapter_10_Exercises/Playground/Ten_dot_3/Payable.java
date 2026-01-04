package Chapter_10_Exercises.Playground.Ten_dot_3;

public interface Payable {

    public abstract double getPaymentAmount();
    default String getDescription() {
        return "No description provided";
    }
}
