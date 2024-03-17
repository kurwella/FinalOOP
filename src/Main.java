import Presenter.Presenter;
import View.UI;
import impl.ComplexNumber;
import impl.operations.ComplexOP;
import impl.operations.ComplexOP1;
import impl.operations.Summarize;

public class Main {
    public static void main(String[] args) {
        Presenter presenter = new Presenter(new UI(), new ComplexOP1());
        presenter.run();
    }
}